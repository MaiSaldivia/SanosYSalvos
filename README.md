# Sanos y Salvos

Proyecto académico con backend Spring Boot, microservicios, API Gateway, BFF y frontend en React.

## Criterio solicitado por el profesor

**API REST minimalista con endpoints básicos. Desplegable en AWS EC2 con Docker Compose.**

Estado en este proyecto:

- API REST minimalista: implementada en el microservicio de mascotas.
- Endpoints básicos REST: crear, listar, obtener por id, actualizar estado.
- Despliegue en AWS EC2 con Docker Compose: documentado en [DEPLOY_EC2.md](DEPLOY_EC2.md).

## Arquitectura

- Microservicios Spring Boot
- API Gateway con Spring Cloud Gateway
- BFF para adaptar respuestas al frontend
- Persistencia con Spring Data JPA
- Base de datos MySQL local o AWS RDS
- Frontend React simple y funcional

## Patrones usados

- Controller
- Service
- Repository
- DTO
- Manejo centralizado de errores con `ResponseStatusException`

## Flujo de ramas sugerido

- `main`: estable, lista para entrega
- `develop`: integración continua
- `feature/*`: cambios pequeños por funcionalidad
- `release/*`: preparación de entrega
- `hotfix/*`: correcciones urgentes

## Spring Initializr

Cuando generes un módulo nuevo usa:

- Project: Gradle
- Language: Java
- Spring Boot: 3.x
- Java: 17
- Dependencias: Spring Web, Spring Data JPA, Validation, MySQL Driver, Actuator

## Base de datos AWS RDS

Usar variables de entorno:

- `SPRING_DATASOURCE_URL`
- `SPRING_DATASOURCE_USERNAME`
- `SPRING_DATASOURCE_PASSWORD`

## Frontend

El frontend se ejecuta con Vite y consume el backend mediante `VITE_API_URL`.

## Endpoints mínimos (API REST)

Microservicio: gestión de mascotas

- `POST /api/mascotas/reportar`
- `GET /api/mascotas/busqueda`
- `GET /api/mascotas/{id}`
- `PUT /api/mascotas/{id}/estado/{estado}`

Referencia: [MascotaController.java](ms-gestion-mascotas/src/main/java/com/sanosysalvos/ms/gestion/mascotas/controller/MascotaController.java).
