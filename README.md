# Java Web Backend Jose - Ejercitario 2

Proyecto backend desarrollado con **Spring Boot** como parte de práctica del curso de **Java Web**.  
En esta rama se implementa un **CRUD completo de contactos**, aplicando arquitectura por capas, validaciones, persistencia con **JPA** y base de datos en memoria **H2**.

---

## Objetivo del proyecto

El objetivo de este ejercitario es practicar el desarrollo de una **API REST** con operaciones **CRUD** reales, utilizando buenas prácticas básicas de organización del proyecto.

Las operaciones implementadas son:

- Crear un contacto
- Listar todos los contactos
- Obtener un contacto por ID
- Buscar un contacto por email
- Actualizar un contacto
- Eliminar un contacto

---

## Tecnologías utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Spring Security**
- **Spring Validation**
- **H2 Database**
- **Maven**

---

## Estructura del proyecto

```text
src/main/java/py/edu/ucsa/demo
├── config/         # Configuración de seguridad
├── controller/     # Controladores REST
├── Dto/            # DTOs para recepción y validación de datos
├── entity/         # Entidades JPA
├── repository/     # Repositorios
└── service/        # Lógica de negocio
```

## Funcionalidades implementadas
1. Crear contacto

Permite registrar un nuevo contacto enviando nombre, email y número.

2. Listar contactos

Devuelve todos los contactos almacenados en la base de datos.

3. Obtener contacto por ID

Permite consultar un contacto específico según su identificador.

4. Buscar contacto por email

Permite localizar un contacto utilizando su dirección de correo electrónico.

5. Actualizar contacto

Permite modificar los datos de un contacto existente.

6. Eliminar contacto

Permite borrar un contacto de la base de datos por su ID.

## Validaciones implementadas

El proyecto utiliza validaciones sobre el DTO de entrada para asegurar que los datos sean correctos antes de procesarlos.

Campos validados

name

No puede estar vacío

email

No puede estar vacío

Debe tener formato de correo válido

number

Debe tener entre 5 y 15 caracteres

## Endpoints disponibles

URL base

http://localhost:8080

Crear contacto

POST /contacts

Body de ejemplo

{
  "name": "Jose",

  "email": "jose@gmail.com",
  
  "number": "0981123456"
}
## Listar todos los contactos
GET /contacts
## Obtener contacto por ID
GET /contacts/{id}
Ejemplo
GET /contacts/1
## Buscar contacto por email
GET /contacts/email/{email}
Ejemplo
GET /contacts/email/jose@gmail.com
## Actualizar contacto
PUT /contacts/{id}
Ejemplo
PUT /contacts/1

Body de ejemplo
{
  "name": "Jose Actualizado",
  "email": "joseactualizado@gmail.com",
  "number": "0981765432"
}
## Eliminar contacto
DELETE /contacts/{id}

Ejemplo

DELETE /contacts/1

Base de datos

El proyecto utiliza H2 Database en memoria, lo cual facilita las pruebas y el desarrollo sin necesidad de instalar una base de datos externa.

Características
Base de datos temporal en memoria
Ideal para pruebas
Se reinicia al volver a ejecutar la aplicación
Compatible con Spring Data JPA
Consola H2

La consola H2 se encuentra habilitada para inspeccionar las tablas y datos durante el desarrollo.

Acceso
http://localhost:8080/h2-console
Seguridad

El proyecto incluye una configuración básica de Spring Security para permitir el acceso a los endpoints necesarios durante el desarrollo.

Rutas habilitadas
/contacts/**
/h2-console/**

Esto permite probar el CRUD y acceder a la consola H2 sin bloquear las peticiones básicas del ejercicio.

Cómo ejecutar el proyecto
1. Clonar el repositorio
git clone https://github.com/Teknuz/java-web-backend-jose-g.git
2. Entrar al proyecto
cd java-web-backend-jose-g
3. Cambiar a la rama del ejercitario
git checkout ejercitario2
4. Ejecutar la aplicación
En Linux
./mvnw spring-boot:run
En Windows
mvnw.cmd spring-boot:run
O usando Maven instalado globalmente
mvn spring-boot:run
Ejecutar tests

# Para ejecutar las pruebas del proyecto:

En Linux
./mvnw test
En Windows
mvnw.cmd test
Cómo probar la API

Puedes probar los endpoints utilizando herramientas como:

Postman
Insomnia
cURL
Navegador web para los métodos GET
## Ejemplos de uso con cURL
## Crear contacto
curl -X POST http://localhost:8080/contacts \
-H "Content-Type: application/json" \
-d '{
  "name": "Jose",
  "email": "jose@gmail.com",
  "number": "0981123456"
}'
## Listar contactos
curl http://localhost:8080/contacts
## Obtener contacto por ID
curl http://localhost:8080/contacts/1
## Buscar contacto por email
curl http://localhost:8080/contacts/email/jose@gmail.com
## Actualizar contacto
curl -X PUT http://localhost:8080/contacts/1 \
-H "Content-Type: application/json" \
-d '{
  "name": "Jose Actualizado",
  "email": "joseactualizado@gmail.com",
  "number": "0981765432"
}'
## Eliminar contacto
curl -X DELETE http://localhost:8080/contacts/1
# Conceptos practicados en este ejercitario

 En este proyecto se aplican los siguientes conceptos:

Creación de API REST con Spring Boot
Arquitectura por capas
Operaciones CRUD
Uso de DTOs
Validación de datos
Persistencia con JPA
Repositorios con Spring Data
Configuración básica de seguridad
Uso de base de datos en memoria H2
Pruebas y ejecución con Maven
Estado del proyecto

Ejercitario funcional orientado al aprendizaje y práctica de backend con Java y Spring Boot.


# Capturas del Ejercitario
## Inserción de tres registros y listar todos los contactos
<img width="1920" height="1080" alt="tresRegistros" src="https://github.com/user-attachments/assets/53eed259-db51-40c4-8558-b13aa6ba02b3" />
## Busqueda por id
<img width="1920" height="1080" alt="serachById" src="https://github.com/user-attachments/assets/0a153c62-a8a5-47ff-9e39-0b8a9af5343a" />
## Actualizar
<img width="1920" height="1080" alt="userUpdated" src="https://github.com/user-attachments/assets/61514bc5-45cd-4e53-9520-5241bba4493b" />
## Eliminar
<img width="1920" height="1080" alt="usertDeleted" src="https://github.com/user-attachments/assets/21d583a2-3ed6-4cf0-90aa-42fd9a7dea0a" />

