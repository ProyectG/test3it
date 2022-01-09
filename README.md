# test3it
Prueba tecnica - java
Proyecto realizado con Springboot, jpa, hibernate.
BD H2.

**Puerto del aplicativo : 8080**

## Observacion.
El aplicativo es funcional por si solo pero esta atado al proyecto. **https://github.com/ProyectG/test3it**
para su completo funcionamiento.

## Ejecucion.

Compilar el proyecto y ejecutar **java -jar ${nombre_aplicativo}.war**

bajar precompilado del release en el git y ejecutar el comando mencionado anteriormente.

## Metodos.


## BD H2

Ubicacion: localhost:8080/h2-console

- Driver Class : org.h2.Driver
- JDBC URL : jdbc:h2:mem:3it
- User Name : sa
- Password :

## Documentacion metodos.

Al ejecutar el aplicativo ingresar a **http://localhost:8080/apidoc.html**

Definiciones:
```
PUT
- /api/v1/formulario/add 
  - *Metodo que permite insertar valores segun la documentacion*
GET
- /api/v1/formulario/list 
  - *Metodo que permite listar los datos en su version inicial*
GET
- /api/v1/formulario/get 
  - *Metodo que permite listar datos en formato para grafico*
```
