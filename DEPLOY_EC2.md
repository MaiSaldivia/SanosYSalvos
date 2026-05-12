# Despliegue en AWS EC2 con Docker Compose

Esta guía deja el backend desplegable en una instancia EC2 Linux.

## 1) Crear y preparar la instancia

1. Lanzar EC2 (Ubuntu 22.04 o Amazon Linux 2023).
2. Security Group (entrada):
   - `22` (SSH) desde tu IP
   - `8080-8085` (API Gateway/BFF/ms) según necesidad
   - opcional `80/443` si usarás Nginx
3. Conectarte por SSH.

## 2) Instalar Docker y Docker Compose plugin

Ubuntu:

```bash
sudo apt-get update
sudo apt-get install -y docker.io docker-compose-plugin
sudo systemctl enable docker
sudo systemctl start docker
sudo usermod -aG docker $USER
```

Cerrar y volver a abrir sesión SSH después de agregar el usuario al grupo docker.

## 3) Subir el backend a EC2

Opciones:

- `git clone` del repo backend en la EC2.
- o copiar carpeta con `scp/rsync`.

Luego entrar al directorio raíz del backend:

```bash
cd sanos-y-salvos-backend-main
```

## 4) Configurar variables de entorno

Crear archivo `.env` en el mismo nivel de `docker-compose.yml`:

```bash
MYSQL_ROOT_PASSWORD=tu_password

MASCOTAS_DB_URL=jdbc:mysql://mascotas-db:3306/mascotas_db
MASCOTAS_DB_USERNAME=root
MASCOTAS_DB_PASSWORD=tu_password

GEO_DB_URL=jdbc:mysql://geo-db:3306/geo_db
GEO_DB_USERNAME=root
GEO_DB_PASSWORD=tu_password

MATCH_DB_URL=jdbc:mysql://match-db:3306/match_db
MATCH_DB_USERNAME=root
MATCH_DB_PASSWORD=tu_password

USERS_DB_URL=jdbc:mysql://users-db:3306/users_db
USERS_DB_USERNAME=root
USERS_DB_PASSWORD=tu_password
```

Si usas RDS en vez de MySQL local por contenedor, reemplaza `*_DB_URL` por endpoints RDS.

## 5) Levantar servicios

```bash
docker compose up -d --build
docker compose ps
```

## 6) Verificar estado

```bash
curl http://localhost:8081/api/mascotas/busqueda
curl http://localhost:8080/actuator/health
```

## 7) Operación básica

```bash
docker compose logs -f
docker compose restart
docker compose down
```

## API REST minimalista (endpoints básicos)

- `POST /api/mascotas/reportar`
- `GET /api/mascotas/busqueda`
- `GET /api/mascotas/{id}`
- `PUT /api/mascotas/{id}/estado/{estado}`
