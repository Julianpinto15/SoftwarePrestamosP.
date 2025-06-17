package com.gestion.prestamos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails admin = User
				.withUsername("admin")
				.password(passwordEncoder().encode("admin"))
				.roles("ADMIN")
				.build();

		UserDetails contador = User
				.withUsername("cobrador1")
				.password(passwordEncoder().encode("cobrador1"))
				.roles("COBRADOR1")
				.build();

		UserDetails analista = User
				.withUsername("cobrador2")
				.password(passwordEncoder().encode("cobrador2"))
				.roles("COBRADOR2")
				.build();

		return new InMemoryUserDetailsManager(admin, contador, analista);
	}

	public String formatearPago(Double valor, String periodo) {
		if (valor == null) {
			return "N/A";
		}

		try {
			// Configurar formato personalizado
			DecimalFormat formatter = new DecimalFormat("$ #,##0.00");

			// Si se proporciona un periodo, agregarlo
			String resultado = formatter.format(valor);
			return periodo != null && !periodo.isEmpty() ? resultado + " " + periodo : resultado;
		} catch (Exception e) {
			return "N/A";
		}
	}

	// Sobrecarga para BigDecimal si es necesario
	public String formatearPago(BigDecimal valor, String periodo) {
		if (valor == null) {
			return "N/A";
		}

		try {
			// Configurar formato personalizado
			DecimalFormat formatter = new DecimalFormat("$ #,##0.00");

			// Si se proporciona un periodo, agregarlo
			String resultado = formatter.format(valor);
			return periodo != null && !periodo.isEmpty() ? resultado + " " + periodo : resultado;
		} catch (Exception e) {
			return "N/A";
		}
	}



	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/", "/login").permitAll()
				.antMatchers("/form/*", "/eliminar/*").hasAnyRole("ADMIN", "CONTADOR")
				.antMatchers("/ver/*").hasAnyRole("ADMIN", "CONTADOR", "ANALISTA")
				.antMatchers("/editar/*").hasAnyRole("ADMIN", "CONTADOR")
				.antMatchers("/agregar").hasAnyRole("ADMIN", "CONTADOR")
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
				.logout().permitAll();
	}
}