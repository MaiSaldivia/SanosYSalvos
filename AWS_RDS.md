# Guía rápida para AWS RDS

## 1. Crear la base de datos

1. Entra a AWS Console.
2. Busca **RDS**.
3. Pulsa **Create database**.
4. Elige un motor como **MySQL**.
5. Selecciona una plantilla simple o free tier si aplica.
6. Define nombre de la base, usuario maestro y contraseña.

## 2. Configurar red

1. Usa una VPC/subredes disponibles o crea una nueva.
2. En el Security Group permite entrada al puerto **3306**.
3. Limita el origen a tu IP o a la IP de la app que se conectará.

## 3. Obtener el endpoint

Cuando la instancia quede lista, copia el endpoint tipo:

`mydb.xxxxxx.us-east-1.rds.amazonaws.com`

## 4. Conectar Spring Boot

Usa variables de entorno:

```bash
SPRING_DATASOURCE_URL=jdbc:mysql://mydb.xxxxxx.us-east-1.rds.amazonaws.com:3306/mascotas_db
SPRING_DATASOURCE_USERNAME=admin
SPRING_DATASOURCE_PASSWORD=tu_clave
```

## 5. Recomendación

- No pongas credenciales en código.
- En desarrollo usa `.env` o variables de entorno.
- En despliegue usa Secrets Manager o parámetros de entorno del contenedor.
