Asegúrate de estar en el directorio donde se encuentra tu Dockerfile.

Construye la imagen de Docker con el siguiente comando:


docker build -t nombre-de-tu-imagen .
Reemplaza nombre-de-tu-imagen con el nombre que desees darle a tu imagen de Docker. El punto al final del comando indica que Docker debe buscar el Dockerfile en el directorio actual.

Una vez que la imagen se haya construido correctamente, puedes ejecutarla con el siguiente comando:


docker run -p 8080:8080 nombre-de-tu-imagen
Este comando mapea el puerto 8080 de tu máquina local al puerto 8080 del contenedor de Docker. Asegúrate de que el puerto 8080 esté disponible en tu máquina local.

Abre un navegador web y visita http://localhost:8080 para ver tu aplicación Spring Boot en funcionamiento.
