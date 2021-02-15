Proyecto: Chocair test Automatización
El proyecto de Automatización Chocair test se elabora con la finalidad de evaluar los conocimientos en el área de Automatización de Hernan José Malave Montero, el cual se encuentra interesado ser parte de la compañia Chocair testing.

Este proyecto cuenta con las siguientes características:

Lenguaje de programación: Java
Framework de Automatización: Serenity
Patrón de diseño: Screenplay
Framework de soporte BDD (Behavior development driver): Cucumber
Lenguaje de BDD (Behavior development driver): Gherkin
Constructor de proyecto: Gradle

Nota: El proyecto esta diseñado para ser ejecutado en maquinas Windows y navegador Chrome.

El proyecto posee la siguiente estructura:


Documentation: En esta carpeta se van encontrar los siguientes archivos:


 Respuestas Reto Técnico ChocairTesting - Hernan Malave: El cual posee las respuestas de la prueba teórica


 Test Case - Hernan Malave: El cual posee los test case solicitados en la prueba teórica.


Carpeta Choucairtest:


 src/main/java/Choucairtest/iteractions: Este paquete maneja todas las funciones de iteraciones con elementos web, por ejemplo, realizar click en un elemento web, escribir sobre un elemento web, entre otros


 src/main/java/Choucairtest/models: Este paquete maneja toda la data necesaria para ejecutar las pruebas automatizadas


 src/main/java/Choucairtest/tasks: Este paquete maneja las tareas que va realizar el usuario para cumplir con lo esperado en la prueba automatizada, asi cumpliendo con el Patrón de diseño Screenplay


 src/main/java/Choucairtest/userinterface: En este paquete referenciamos los elementos de las vistas con las que vamos interactuar, asi garantizando la reusabilidad de código.


 src/main/java/Choucairtest/utils: En este paquete tenemos los archivos para reutilización de palabras claves de la automatización con el fin de evitar dejar código estático en nuestra automatización


 src/test/java/Choucairtest/Runner: Este paquete contiene nuestro archivo runner el cual es encargado de ejecutar nuestra prueba


 src/test/java/Choucairtest/stepDefinitions: Este paquete contiene nuestros archivos de steps los cuales definen el paso a paso del lado de lógica de programación


 src/test/resources/Features: Este paquete contiene nuestros archivos feature los cuales definen el escenario a evaluar del lado del BDD


 gitignore: El archivo encargado de bloquear subir archivos no necesarios en nuestro repositorio


 serenity.properties: Es el archivo que nos ayuda a setear propiedades del Framework de Serenity



Datos adicionales del proyecto:

Se implemento la anotación "@share" de serenity para compartir data entre diferentes contextos
Se implemento tags para todos los diferentes escenarios automatizados
Se implemento tag generico llamado "@RegressionTest" para poder ejecutar toda la suite de pruebas


Pasos para obtener el proyecto de automation:

Clonar el repositorio en la ubicación deseada, usando el comando: git clone https://github.com/hmalave17/chocairtesting.git

Ingresar a la carpeta Choucairtest


Pasos para ejecutar el proyecto

Se debe primero realizar los pasos de la sección "Pasos para obtener el proyecto de automation"
Opción 1: Abrir el proyecto en el IDE de su preferencia que soporte Java, ejecutar el archivo TestRunner, este runner por defecto esta configurado con el tag @RegressionTest para ejecutar todas las pruebas
Opcion 2: Abrir desde la consola de windows la carpeta donde esta clonado el proyecto, la consola debe tener permisos de administrador, ejecutar el comando "gradlew test aggregate" 
Opcion 3: Si desea ejecutar algún tag en particular se debe ejecutar el siguiente comando desde la consola en la carpeta "Choucairtest", comando: gradlew test -Dcucumber.options="--tags @xxxx" aggregate, donde "xxxx" es el tag deseado


Generación de reporte del framework

El reporte se generará en la carpeta /target/site/serenity abriendo el archivo index.html
