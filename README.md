# 💰 Sistema de Gestión de Préstamos - Spring Boot

> Sistema completo de gestión de préstamos empresariales desarrollado en **Spring Boot** con arquitectura MVC para instituciones financieras y empresas de microcréditos.

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0+-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17+-blue.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.8+-red.svg)](https://maven.apache.org/)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.0+-green.svg)](https://www.thymeleaf.org/)
[![License](https://img.shields.io/badge/License-MIT-brightgreen.svg)](LICENSE)

## 🌟 Características Principales

### 💼 **Gestión Integral de Préstamos**
- **Control de préstamos** con seguimiento completo
- **Gestión de pagos** con recordatorios automáticos
- **Reportes financieros** detallados y exportables

### 👥 **Administración de Usuarios**
- **Sistema de autenticación** con Spring Security
- **Control de accesos** por roles y permisos
- **Gestión de empleados** con perfiles completos


### 📊 **Módulos Especializados**
- **Control de Caja** con movimientos diarios
- **Gestión de Clientes** con informacion detallada
- **Exportación de datos** a Excel y PDF

### 🎨 **Interfaz Moderna**
- **Diseño responsive** con Bootstrap
- **Dashboard ejecutivo** con métricas clave
- **Navegación intuitiva** y accesible
- **Notificaciones** en tiempo real

## 🚀 Tecnologías Utilizadas

### **Backend**
- **Spring Boot 3.0+** - Framework principal
- **Spring Security** - Autenticación y autorización
- **Spring Data JPA** - Persistencia de datos
- **Maven** - Gestión de dependencias

### **Frontend**
- **Thymeleaf** - Motor de plantillas
- **Bootstrap 5** - Framework CSS
- **JavaScript ES6+** - Interactividad del cliente

### **Base de Datos**
- **H2 Database** - Base de datos en memoria (desarrollo)
- **MySQL/PostgreSQL** - Producción
- **JPA/Hibernate** - ORM

### **Librerías Integradas**
- **Apache POI** - Exportación a Excel
- **iText PDF** - Generación de reportes PDF
- **Spring Boot DevTools** - Desarrollo ágil

## 📁 Arquitectura del Sistema

```
julianpinto15-software-prestamos/
├── 📄 README.md                    # Documentación principal
└── 💰 mini-control-empleados/      # Aplicación principal
    ├── 🔧 mvnw                     # Maven wrapper (Unix)
    ├── 🔧 mvnw.cmd                 # Maven wrapper (Windows)
    ├── 📋 pom.xml                  # Configuración Maven
    ├── 🚫 .gitignore               # Archivos ignorados por Git
    ├── 📂 src/
    │   ├── 🎯 main/
    │   │   ├── ☕ java/
    │   │   │   └── 📦 com/gestion/prestamos/
    │   │   │       ├── 🚀 MiniControlEmpleadosApplication.java
    │   │   │       ├── ⚙️ MvcConfig.java
    │   │   │       ├── 🔐 PasswordGenerator.java
    │   │   │       ├── 🛡️ WebSecurityConfig.java
    │   │   │       ├── 🎮 controlador/
    │   │   │       │   ├── 💰 CajaController.java
    │   │   │       │   └── 📊 PrestamoController.java
    │   │   │       ├── 🏗️ entidades/
    │   │   │       │   ├── 💵 Caja.java
    │   │   │       │   ├── 💳 Prestamo.java
    │   │   │       │   └── 👤 Usuario.java
    │   │   │       ├── 🗄️ repositorios/
    │   │   │       │   ├── 💰 CajaRepository.java
    │   │   │       │   ├── 📊 PrestamoRepository.java
    │   │   │       │   └── 👥 UsuarioRepositorio.java
    │   │   │       ├── 🔧 servicio/
    │   │   │       │   ├── 💰 CajaService.java
    │   │   │       │   ├── 📊 PrestamoService.java
    │   │   │       │   └── 🔄 PrestamoServiceImpl.java
    │   │   │       └── 🛠️ util/
    │   │   │           ├── 📄 paginacion/
    │   │   │           │   ├── 📃 PageItem.java
    │   │   │           │   └── 🔢 PageRender.java
    │   │   │           └── 📈 reportes/
    │   │   │               ├── 📊 PrestamoExporterExcel.java
    │   │   │               └── 📋 PrestamoExporterPDF.java
    │   │   └── 📁 resources/
    │   │       ├── ⚙️ application.properties
    │   │       ├── 🌐 messages.properties
    │   │       ├── 📂 META-INF/
    │   │       │   └── 📋 MANIFEST.MF
    │   │       └── 🎨 templates/
    │   │           ├── 💰 agregarDinero.html
    │   │           ├── ✏️ editarCaja.html
    │   │           ├── 📝 form.html
    │   │           ├── 📊 listar.html
    │   │           ├── 🔐 login.html
    │   │           ├── 📄 paginator-nav.html
    │   │           └── 🎭 layout/
    │   │               └── 🏗️ layout.html
    │   └── 🧪 test/
    │       └── ☕ java/
    │           └── 📦 com/gestion/prestamos/
    │               └── 🔬 MiniControlEmpleadosApplicationTests.java
    └── 📂 .mvn/
        └── 🔧 wrapper/
            └── ⚙️ maven-wrapper.properties
```

## ⚡ Funcionalidades Destacadas

### 💰 **Sistema de Préstamos Avanzado**
- ✅ **Solicitudes de préstamo** con evaluación automática
- ✅ **Cálculo de intereses** configurables
- ✅ **Cronograma de pagos** personalizable
- ✅ **Seguimiento de mora** con alertas


### 📈 **Gestión de Caja y Finanzas**
- 💵 **Control de efectivo** en tiempo real
- 📊 **Movimientos diarios** detallados
- 💰 **Balance general** automático
- 📋 **Reportes de flujo de caja**

### 🔐 **Seguridad Empresarial**
- 🛡️ **Spring Security** integrado
- 🔒 **Autenticación robusta** con roles
- 👤 **Control de sesiones** seguras
- 🚫 **Protección CSRF** habilitada

## 🛠 Instalación y Configuración

### Prerrequisitos
- **Java 17+** con JDK completo
- **Maven 3.8+** para gestión de dependencias
- **IDE recomendado**: IntelliJ IDEA / Eclipse / VS Code
- **Git** para control de versiones

### Pasos de Instalación

1. **📥 Clonar el repositorio**
   ```bash
   git clone https://github.com/Julianpinto15/SoftwarePrestamosP..git
   cd SoftwarePrestamosP/mini-control-empleados
   ```

2. **⚙️ Configurar base de datos**
   ```properties
   # Editar src/main/resources/application.properties
   
   # Para desarrollo (H2)
   spring.datasource.url=jdbc:h2:mem:prestamistas
   spring.h2.console.enabled=true
   
   # Para producción (MySQL)
   spring.datasource.url=jdbc:mysql://localhost:3306/prestamistas
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_password
   ```

3. **🏗️ Compilar y ejecutar**
   ```bash
   # Compilar proyecto
   ./mvnw clean compile
   
   # Ejecutar aplicación
   ./mvnw spring-boot:run
   
   # O usar Maven instalado
   mvn spring-boot:run
   ```

4. **🌐 Acceder a la aplicación**
   - **URL:** http://localhost:8080
   - **Usuario:** admin
   - **Contraseña:** admin
   - **H2 Console:** http://localhost:8080/h2-console

## 🎯 Casos de Uso Perfectos

### 🏦 **Instituciones Financieras**
- ✅ Microempresas de prestamos

### 💼 **Empresas de Servicios**
- ✅ Préstamos a empleados
- ✅ Financiamiento interno

## 📸 Capturas del Sistema

### 🛡️Login
![Login](https://github.com/user-attachments/assets/2e0c95bb-054f-43f9-862c-be8537e68b14)

### 🎛️ Dashboard Ejecutivo
![Dashboard](https://github.com/user-attachments/assets/49a2e311-dca3-431e-b841-48f3632ba452)

### 💰 Gestión de Préstamos
![Prestamos](https://github.com/user-attachments/assets/22f7a507-7e25-4ac4-a2b5-ef6ca4d2db71)

### 💰 Edicion de Préstamos
![EdiccionPrestamo](https://github.com/user-attachments/assets/f39642a0-9074-4bb7-b58d-da1b4ca1d508)

### 📊 Informacion Prestamo
![Iformacion](https://github.com/user-attachments/assets/dbfbbe0a-ef59-4303-87ee-df5607952264)

### 📈 Registrar Abono
![Abono](https://github.com/user-attachments/assets/e7973260-c37a-4b57-b90d-e441e6a5b5dd)

### 📈 Agregar dinero
![Agregar](https://github.com/user-attachments/assets/b417397a-3071-47bd-8bbf-e354e545a565)


## 🔄 Características Spring Boot

### ⚡ **Funcionalidades Modernas**
- 🚀 **Auto-configuración** inteligente
- 🔄 **Hot reload** con DevTools
- 📊 **Actuators** para monitoreo
- 🏗️ **Inyección de dependencias** automática
- 🔧 **Profiles** para diferentes entornos

## 📋 Módulos del Sistema

| Módulo | Descripción | Tecnología | Estado |
|--------|-------------|------------|--------|
| 🔐 **Autenticación** | Login y gestión de sesiones | Spring Security | ✅ |
| 💰 **Préstamos** | Gestión completa de créditos | Spring Data JPA | ✅ |
| 💵 **Caja** | Control de efectivo y movimientos | Thymeleaf + JPA | ✅ |
| 👥 **Usuarios** | Administración de empleados | Spring Security | ✅ |
| 📊 **Reportes** | Excel y PDF exportables | Apache POI + iText | ✅ |
| 🎨 **Templates** | Interfaz responsive | Thymeleaf + Bootstrap | ✅ |
| 🧪 **Testing** | Pruebas unitarias | JUnit 5 + Mockito | ✅ |

## 🎉 Roadmap de Desarrollo

### 🔮 **Próximas Características**
- [ ] 📱 **API REST** para aplicaciones móviles
- [ ] 🌐 **Multi-tenancy** para múltiples empresas
- [ ] 💳 **Integración con pasarelas de pago**
- [ ] 📊 **Dashboard BI** con análisis predictivo
- [ ] 🔔 **Notificaciones push** automáticas
- [ ] 🌍 **Internacionalización** completa

### 🛠️ **Mejoras Técnicas**
- [ ] ⚗️ **Migración a Spring Boot actualizado**
- [ ] 🐳 **Dockerización** completa
- [ ] ☁️ **Despliegue en la nube** (AWS/Azure)
- [ ] 📈 **Métricas avanzadas** con Micrometer
- [ ] 🔍 **Logging estructurado** con Logback

## 🏗️ Arquitectura Técnica

### **Patrón MVC Implementado**
```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   📱 Vista      │────│  🎮 Controlador │────│  🏗️ Modelo      │
│  (Thymeleaf)    │    │  (Controllers)  │    │  (Entidades)    │
└─────────────────┘    └─────────────────┘    └─────────────────┘
                                │
                        ┌─────────────────┐
                        │  🔧 Servicios   │
                        │  (Business)     │
                        └─────────────────┘
                                │
                        ┌─────────────────┐
                        │  🗄️ Repositorio │
                        │  (Data Access)  │
                        └─────────────────┘
```

## 📄 Licencia

Este proyecto está bajo la **Licencia MIT** - ver [LICENSE](LICENSE) para más detalles.

## 👨‍💻 Desarrolladores

**Julián Pinto** - Software Developer
- 🌐 **GitHub:** [@julianpinto15](https://github.com/Julianpinto15)
- 💼 **LinkedIn:** [Julián Pinto](https://www.linkedin.com/in/julian-pinto15/)
- 📧 **Email:** julianpinto700@gmail.com

---

**Santiago Barbosa** - Software Developer
- 🌐 **GitHub:** [@BARBOSA191919](https://github.com/BARBOSA191919)
- 💼 **LinkedIn:** [Santiago Barbosa](https://www.linkedin.com/in/santiago-barbosa-903641209/)
- 📧 **Email:** sbarbosarivas@gmail.com

---

<div align="center">

### 💡 ¿Te gusta el proyecto?

Si este sistema te ha sido útil, ¡considera darle una ⭐ en GitHub!

**[⭐ Star en GitHub](https://github.com/Julianpinto15/SoftwarePrestamosP.)**

</div>

---

<div align="center">
  <strong>Desarrollado con ❤️ para instituciones financieras modernas</strong><br>
  <em>Sistema de Gestión de Préstamos - Spring Boot Professional</em>
</div>
