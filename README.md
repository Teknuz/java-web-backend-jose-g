# Java Web Backend Jose

Backend desarrollado con Spring Boot como parte de práctica y aprendizaje en Java web.  
El proyecto está orientado a la construcción de una API REST básica, con controladores iniciales, objetos DTO y configuración base para seguir escalando el backend.

## Estado del proyecto
En desarrollo.  
Actualmente contiene la estructura base de una aplicación Spring Boot, clases de controladores y DTOs para pruebas iniciales.

## Tecnologías utilizadas
- Java
- Spring Boot
- Maven
- REST API

## Estructura general
- `controllers/` → controladores del backend
- `dto/` → objetos para transferencia de datos
- `application.properties` → configuración básica de la aplicación

## Objetivo
Este repositorio fue creado para practicar el desarrollo de backends en Java, aplicando conceptos de:
- Spring Boot
- creación de endpoints REST
- organización por capas
- uso de DTOs
- pruebas básicas

## Cómo ejecutar el proyecto
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/Teknuz/java-web-backend-jose-g.git
2.Entrar al proyecto
   ```bash
   cd java-web-backend-jose-g
   ```
3.Ejecutar con Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
o
   ```bash
   mvn spring-boot:run
   ```


## Endpoints
Saludo Genérico
```
localhost:8080/backend/api/saludo
```
<img width="1920" height="1080" alt="saudoApi" src="https://github.com/user-attachments/assets/8d7fc64d-0168-4465-8c72-a707a0f22385" />

Saludo Personalizado
```
localhost:8080/backend/api/saludo-personalizado?nombre=Jose
```
<img width="1920" height="1080" alt="saludoPersonalizado" src="https://github.com/user-attachments/assets/25a74cd2-1bb4-4ff5-ab56-6b8d48f4ad52" />

Application Properties
Generic
```
localhost:8080/backend/api/v1/backend/data/full
```
<img width="1920" height="1080" alt="backendDataFull" src="https://github.com/user-attachments/assets/550c1582-5a26-465e-b011-1f28628b833a" />

Class

```
localhost:8080/backend/api/v1/backend/data/class
```
<img width="1920" height="1080" alt="backendDataClass" src="https://github.com/user-attachments/assets/cd86a0a6-bc3e-409e-b123-a7cc6b4d451b" />

Record

```
localhost:8080/backend/api/v1/backend/data/record
```
<img width="1920" height="1080" alt="backendDataRecord" src="https://github.com/user-attachments/assets/76507f00-4e67-4393-83f2-e7020cf4128f" />

