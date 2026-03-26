## Descripción de la Actividad
Este repositorio contiene el desarrollo de la actividad práctica enfocada en expandir la arquitectura de microservicios de nuestro sistema del "Club Deportivo". 

Hasta el momento, el sistema contaba con los servicios independientes de **Canchas** y **Reservas**. Sin embargo, teníamos una limitación importante: no teníamos cómo saber o registrar quién era la persona que estaba realizando la reserva. 

El objetivo principal de este taller fue resolver ese problema construyendo desde cero un nuevo **Microservicio de Usuarios** para gestionar la información de los clientes, y lograr que se comunique con el resto de nuestra arquitectura.

## ¿Qué se implementó?
Para cumplir con los requerimientos de la actividad, se desarrolló lo siguiente:

* **Nuevo Microservicio:** Se creó un proyecto independiente en Spring Boot conectado a su propia base de datos MySQL (`club_deportivo3`), manteniendo el aislamiento de los datos.
* **Desarrollo del CRUD:** Se implementó el modelo `Usuario` (id, nombre, email, teléfono), junto con su flujo completo: Repositorio (JPA), capa de Servicio y Controlador.
* **Integración con API Gateway:** Este fue el paso clave de la actividad. El servicio de usuarios (puerto 8083) se registró en el API Gateway existente. De esta forma, el cliente final no necesita saber los puertos internos, sino que hace todas las peticiones al puerto central (9090).

## Rutas para probar en Postman (vía API Gateway)
Todas las pruebas de integración se realizan apuntando al `localhost:9090` / `http://localhost:9090/api/usuarios`:

* `GET /api/usuarios` -> Obtiene la lista completa de usuarios.
* `GET /api/usuarios/{id}` -> Busca un usuario específico por su ID.
* `POST /api/usuarios` -> Permite registrar un nuevo usuario (enviando nombre, email y teléfono en formato JSON).
* `DELETE /api/usuarios/{id}` -> Elimina un usuario del registro.
