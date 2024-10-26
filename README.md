Asegúrate de estar en el directorio donde se encuentra tu Dockerfile.

Construye la imagen de Docker con el siguiente comando:


docker build -t nombre-de-tu-imagen .


Reemplaza nombre-de-tu-imagen con el nombre que desees darle a tu imagen de Docker. El punto al final del comando indica que Docker debe buscar el Dockerfile en el directorio actual.

Una vez que la imagen se haya construido correctamente, puedes ejecutarla con el siguiente comando:


docker run -p 8080:8080 nombre-de-tu-imagen
Este comando mapea el puerto 8080 de tu máquina local al puerto 8080 del contenedor de Docker. Asegúrate de que el puerto 8080 esté disponible en tu máquina local.

Abre un navegador web y visita http://localhost:8080 para ver tu aplicación Spring Boot en funcionamiento.


Para instalar Redis en Docker, puedes utilizar la imagen oficial de Redis desde Docker Hub. Aquí está el comando que debes ejecutar:


docker run --name some-redis -d -p 6379:6379 redis
En este comando:

--name some-redis: Esto le da un nombre al contenedor de Redis. Puedes cambiar some-redis por el nombre que desees.
-d: Ejecuta el contenedor en segundo plano.
-p 6379:6379: Mapea el puerto 6379 del contenedor al puerto 6379 de tu máquina local.
redis: Es la imagen de Redis que se descargará desde Docker Hub.
Una vez que ejecutes este comando, Docker descargará la imagen de Redis y la ejecutará en un contenedor. Puedes verificar que el contenedor se está ejecutando con el comando docker ps.

Para conectarte a Redis desde tu aplicación Spring Boot, puedes usar la dirección localhost y el puerto 6379.
