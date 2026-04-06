Ejercitario

Ejercicio 1

Preguntas de apoyo / repaso:
• ¿Qué archivo contiene el método main de arranque?
• ¿Qué diferencia existe entre Group y Artifact al crear el proyecto?
• ¿Qué función cumple Maven en este proyecto?

Desarrollo

1. Lo contiene el archivo que lleva el nombre del artifact, es la que tiene la anotación @SpringBootApplication
2. Group contiene el dominio/información de la institución/empresa encargada del desarrollo  artifact es el identificador único de un artefacto/archivo dentro del  del grupo
3. Maven cumple con la funcíon de automatizar la gestión de dependencias(descargar e implementar automáticamente según la importación de las mismas dentro del proyecto)

Ejercicio 2

Preguntas de apoyo / repaso:
• ¿Qué significa que la aplicación esté corriendo en localhost?
• ¿Qué información útil brinda la consola al ejecutar una aplicación Spring Boot?

Desarrollo

1. Que la aplicación esté corriendo en [localhost](http://localhost) significa que esta corriendo en un entorno local, en el caso de spring utiliza como servidor embebido tomcat
2. Brinda datos como estado de la aplicacion, podemos verificar si se encuentra corriendo correctamente o si encontró algún problema y se cayó, brinda información sobre errores y podemos visualizar peticiones en caso de que se requiera

Ejercicio 3

Preguntas de apoyo / repaso:
• ¿Qué diferencia hay entre @Controller y @RestController?
• ¿Por qué el método retorna texto directamente al navegador?

Desarrollo

[1.La](http://1.La) diferencia entre @Controller y @RestController es que, @Controller es una anotación que hace referencia a un controlador, y @RestController también es un controlador pero significa que tiene la capacidad de retornar valores en formato json o xml

Ejercicio 4

Preguntas de apoyo / repaso:
• ¿Qué ocurre si el parámetro no se envía?
• ¿Cuál es la diferencia entre una ruta fija y un parámetro de consulta?

Desarrollo

1. Si el parametro no se envía retorna un estado 400 perteneciente a bad request, en caso de no preparar un dato por defecto para evitar este problema
2. La diferencia entre la ruta fija y un parametro de consulta es:

La ruta fija consulta información especifica de un recurso especifico mediante la ruta, en el caso de un paráetro es más util para filtrar ordenar, modificar los resultados de una petición

Ejercicio 5

Preguntas de apoyo / repaso:
• ¿Por qué conviene separar responsabilidades en paquetes?
• ¿Qué problemas puede generar una mala organización del proyecto?

Desarrollo

1. Conviene separar responsabilidades del proyecto desde una fase temprana de desarrollo para favorecer la organización, la escalabilidad y la facilidad de lectura del proyecto.
2. Una mala organización del proyecto puede dificultar el mantenimiento, mejora y lectura del proyecto.

Ejercicio 6

Preguntas de apoyo / repaso:
• ¿Qué es un DTO?
• ¿Por qué no siempre conviene exponer directamente una entidad?

Desarrollo

1. Un DTO es el archivo donde se definen los tipos de datos de la clase y el acceso a los mismos.
2. Para evitar acoplamiento, seguridad, mantenibilidad y lógica de transformación.

Ejercicio 7

Preguntas de apoyo / repaso:
• ¿Qué diferencia existe entre @RequestParam y @RequestBody?
• ¿Qué formato de datos suele enviarse en un POST REST?

Desarrollo

1. La diferencia entre @RequestParam y @RequestBody reside en que el @RequestParam solicita solo el valor de una variable, en cambio el @RequestBody lee el cuerpo de la petición y lo convierte en objeto.
2. El formato de datos que suele enviarse en una petición POST REST suele ser del tipo json.

Ejercicio 8

Preguntas de apoyo / repaso:
• ¿Para qué sirve @Valid?
• ¿Qué ventajas aporta validar desde el backend?

Desarrollo

1. Sirve para aplicar las validaciones hechas con las anotaciones utilizadas en el DTO.
2. Sirve para que en el caso de que el frontend sea manipulado y se salte la validación del frontend, se vuelva a validar en el backend añadiendo otra capa de seguridad.

Ejercicio 9

Preguntas de apoyo / repaso:
• ¿Qué beneficio tiene centralizar el manejo de errores?
• ¿Por qué es importante devolver mensajes comprensibles al cliente?

Desarrollo

1.Centralizar el manejor de errores tiene como beneficio la capacidad de gestionar los errores en un solo archivo, es decir no hay necesidad de ir creando funciones  en cada  archivo para gestionar los errores.

2. Es importante devolver mensajes compresibles al cliente para que puede saber cual es su error y pueda corregirlo y mandar peticiones correctas a la api.

Ejercicio 10

Preguntas de apoyo / repaso:
• ¿Qué responsabilidad debería tener la capa service?
• ¿Por qué no conviene escribir toda la lógica en el controller?

Desarrollo

1. La capa service debe tener la responsabilidad de manejar la lógica del negocio.
2. Por que el controller solo debe encargarse de gestionar las peticiones y respuestas http, evita duplicación de  código y mejora la escalabilidad.

Ejercicio 11

Preguntas de apoyo / repaso:
• ¿Qué representa una entidad JPA?
• ¿Cuál es la función de @Id y @GeneratedValue?

Desarrollo

1. Una entidad JPA es un objeto, el cual se ve en la tabla en la base de datos.
2. @Id es para referenciar la primary key del objeto/ tabla, y @GeneratedValue es para generar automaticamente un valor para un campo o propiedad.

Ejercicio 12.

Preguntas de apoyo / repaso:
• ¿Qué ventajas ofrece JpaRepository?
• ¿Por qué una interfaz puede brindar operaciones CRUD sin código extra?

Desarrollo

1. JPARepository es ventajoso por que ofrece la capacidad de evitar codigo repetitivo en las operaciones crud, implementando código y eliminando el acoplamiento a los distintos motores de bases de datos
2. Por  que utiliza programación visual y componentes prediseñados

Ejercicio 13

Preguntas de apoyo / repaso:
• ¿Qué diferencia existe entre trabajar en memoria y persistir en base de datos?
• ¿Por qué la capa service suele encargarse del mapeo entre DTO y entidad?

Desarrollo

1. Persistir en memoria significa que una vez termine de ejecutarse la aplicación los dato serán borrados, y persistir en base de datos es ineherente al tiempo de ejecución de la aplicación, mientras el servidor/servicio de bases de datos esté en linea los datos también.
2. La capa service se encarga del mapeo entre dto y entidad para evitar acumular lineas de codigo en el controlador, hace que el código sea más fácil de mantener y evita el acoplamiento excesivo utilizando la separación de responsabilidades mediante capas.

Ejercicio 14

Preguntas de apoyo / repaso:
• ¿Qué retorna findAll()?
• ¿Por qué es importante contar con una operación de consulta además de guardar?

Desarrollo

1. findAll() retorna todos los registros encontrados
2. Para poder listar los registros guardados previamente

Ejercicio 15

Preguntas de apoyo / repaso:
• ¿Qué diferencia existe entre @RequestParam y @PathVariable?
• ¿Qué debería devolver una API cuando el recurso solicitado no existe?

Desarrollo

1. La diferencia es que @RequestParam solicita un parámetro, mientras que @PathVariable Pega un valor o variable
2. Cuando se solicita un recurso que no existe la API debe mendar un mensaje de error

Ejercicio 16

Preguntas de apoyo / repaso:
• ¿Qué verbo HTTP se utiliza comúnmente para actualizar?
• ¿Por qué primero se debe buscar el registro antes de modificarlo?

Desarrollo.

1. El verbo HTTP utilizado para actualizar es PUT.
2. Primero se debe buscar el registro antes de modificarlo para identificar cual es el registro que queremos cambiar y que es lo que queremos cambiar

Ejercicio 17

Preguntas de apoyo / repaso:
• ¿Qué cuidados deben tomarse antes de eliminar información?
• ¿Qué verbo HTTP corresponde para borrado?

Desarrollo

1. Verificar que es el item correcto
2. El verbo correspondiente al borrado es DELETE

Ejercicio 18

Preguntas de apoyo / repaso:
• ¿Para qué sirve H2 en un entorno de práctica?
• ¿Qué ventajas tiene una base embebida para las primeras clases?

Desarrollo

1. H2 en un entorno de práctica sirve para poder configuar una bd de manera rápida, es útil por que persiste en memoria , una vez detenida la aplicación se vuelven a borrar los datos, entonces las tablas quedan limpias para poder seguir realizando pruebas.
2. Permite que el desarrollo y prácticas sea más rápido al omitir configuraciones e instalaciones extra.

Ejercicio 19

Preguntas de apoyo / repaso:
• ¿Qué significa probar de extremo a extremo un CRUD?
• ¿Por qué conviene probar cada endpoint antes de pasar al siguiente tema?

Desarrollo

1. Significa realizar pruebas que validen el flujo copleto de inicio a fin.
2. Conviene probar cada endpoint antes de pasar al siguiente tema para verificar que se logró el objetivo de la tarea anterior y poder avanzar correctamente

Ejercicio 20

Preguntas de apoyo / repaso:
• ¿Qué mejora resulta más valiosa para una API usada en un sistema real?
• ¿Qué cambio haría su proyecto más profesional o mantenible?

Desarrollo

1. Entre las mejoras más valiosas podrian estar mejorar como:
    1. Búsqueda por nombre
    2. Validación de email como único para evitar duplicación
    3. Guardar fecha y hora de los movimientos de los registros
2. La implementación de apis versionadas para facilitar el uso, y mantenibilidad del código mediante la nomenclatura utilizada : /api/v1/etc
