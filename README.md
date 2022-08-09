# Sofka-CanteraII-Taller4
Agustín Hernández Serpa
Ejercicio #2
¿Es posible ejecutar un programa en java que contenga varias clases con métodos main? En caso positivo, ¿cómo se determina el punto de entrada a un programa?

R// Si es posible que hayan diferentes métodos main en diferentes clases dentro de Java. Lo que no se puede hacer es definir varíos métodos main dentro de una misma clase de por sí.
Sin embargo, al momento de hacer un programa que tiene varíos main dentro de la aplicación, hay que definir de por sí cual es el método main que se va a ejecutar primero.

En diferentes IDE como IntelliJ o Netbeans la configuración se puede hacer dentro de un GUI integrado al mismo IDE. Sin embargo, cuando se desea buscar el primer método de arranque de la aplicación, tenemos que entrar al CMD e ingresar el comando

 java nombreClase.java

Para poder ejecutarlo de primero.
