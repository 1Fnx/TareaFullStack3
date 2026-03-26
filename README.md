# 🧑‍🤝‍🧑 Microservicio de Usuarios - Club Deportivo

Este repositorio contiene la implementación correspondiente al **Taller: Actividad Práctica - Nuevo Microservicio de Usuarios**. El objetivo de esta actividad es expandir la arquitectura del sistema del "Club Deportivo" agregando la gestión de clientes (usuarios) e integrándola con el API Gateway existente.

## 🎯 Objetivos Cumplidos (Requerimientos del Taller)

Se ha completado el flujo completo de desarrollo Backend solicitado en la rúbrica:

1. **Paso 1 - Configuración Inicial:** Creación del proyecto Spring Boot (Java 21) con dependencias Web, JPA y conector MySQL. Se configuró la conexión a la base de datos independiente `club_usuarios`.
2. **Paso 2 - Modelo de Datos:** Creación de la Entidad `Usuario` con los atributos solicitados: `id` (autoincrementable), `nombre`, `email` y `telefono`.
3. **Paso 3 - Capa de Lógica y Datos:** Implementación de `UsuarioRepository` (extendiéndolo de JpaRepository) y la creación de la interfaz `UsuarioService` junto con su implementación `UsuarioServiceImpl`, inyectando correctamente el repositorio.
4. **Paso 4 - Capa de Exposición (Controlador):** Implementación de `UsuarioController` mapeado en la ruta base `/api/users` con los endpoints correspondientes.
5. **Paso 5 - API Gateway:** Registro exitoso del microservicio (Puerto `8083`) en el proyecto central de API Gateway (Puerto `9090`).

## 🔌 Endpoints Implementados

El microservicio expone las siguientes operaciones REST, las cuales deben ser consumidas preferentemente a través del **API Gateway (Puerto 9090)** para respetar la arquitectura del sistema:

| Petición | Ruta | Descripción |
| :--- | :--- | :--- |
| **GET** | `/api/usuarios` | Listar todos los usuarios registrados. |
| **GET** | `/api/usuarios/{id}` | Obtener el detalle de un usuario específico por medio de su ID. |
| **POST** | `/api/usuarios` | Crear y registrar un nuevo usuario en la base de datos. |
| **DELETE** | `/api/usuarios/{id}` | Eliminar un usuario del sistema mediante su ID. |

---
