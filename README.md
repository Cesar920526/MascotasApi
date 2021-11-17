# Mascotas API REST

En este proyecto se utilizaron las siguientes tecnologías:
- Java 8
- Maven
- Lombok
- Spring Boot
  * Jpa
  * Web
- PostgreSQL


## Requirements
- Java 8
- Maven
- PostgreSQL
  * Es necesario tener creada la base de datos
  * Para configurar el acceso a la base de datos, debe modificar el archivo _application.properties_ en el directorio de recursos

## Servicios
A Continuación se presentan los servicios expuestos

##### Consultar todas las mascotas
##### GET
```bash
/api/prueba/mascotas/all
```

##### Consultar todas las mascotas en adopcion
##### GET
```bash
/api/prueba/mascotas/adopcion
```