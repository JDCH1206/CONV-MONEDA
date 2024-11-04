# Proyecto Conversor de Moneda 

## Introducción

Este proyecto se desarrolla con la guía de la plataforma **Alura Latam** en colaboración con **Oracle** dentro de la convocatoria **Oracle Next Education G7**. Su objetivo es crear un conversor de moneda en tiempo real que utilice la API **ExchangeRate-API - Free & Pro Currency Converter API**. Para más información sobre la API, consulta el siguiente enlace: [URL API USADA](https://www.exchangerate-api.com/).

## Pasos del desarrollo

Para este proyecto, se llevaron a cabo las siguientes etapas:

1. **Diseño conceptual**: Definición de los objetivos del proyecto y el alcance de sus funcionalidades.
2. **Esquema de Programación Orientada a Objetos (POO)**: Estructura de clases, interfaces y métodos.
4. **Exploración de la API**: Análisis de los puntos finales y datos ofrecidos por la API.
5. **Pruebas preliminares con Postman**: Verificación de la API usando [Postman](https://www.postman.com/).
6. **Selección de paquetes necesarios**: Elección de bibliotecas y dependencias como `HttpClient` y `Gson`.
7. **Desarrollo del proyecto**:
   - **Configuración del entorno**: Configuración en IntelliJ IDEA con las bibliotecas y dependencias necesarias.
   - **Implementación de la comunicación con la API**: Programación de las solicitudes HTTP para obtener las tasas de cambio.
   - **Lógica de conversión de moneda**: Desarrollo de métodos para el cálculo de las conversiones.
   - **Interfaz de usuario en consola**: Creación de una interfaz simple en consola.
   - **Registro de conversiones**: Funcionalidad para almacenar el historial de conversiones.
   - **Pruebas y depuración**: Verificación y ajustes de precisión y errores.
8. **Estructuración del proyecto**: Creación de paquetes, clases, interfaces y records.

## Estructura del proyecto

Para una mejor organización, el proyecto se estructura en los siguientes paquetes:

### Paquetes

- **[calculos](https://github.com/JDCH1206/CONV-MONEDA/tree/master/src/com/JDCH/conversorMoneda/calculos)**: Contiene las clases y lógica para realizar las conversiones de monedas.
- **[modulos](https://github.com/JDCH1206/CONV-MONEDA/tree/master/src/com/JDCH/conversorMoneda/modulos)**: Maneja la interacción con la API, la entrada y salida de datos y la comunicación con el usuario.
- **[principal](https://github.com/JDCH1206/CONV-MONEDA/tree/master/src/com/JDCH/conversorMoneda/principal)**: Contiene la clase principal y el flujo principal del programa.

### Interfaces

Se generaron varias interfaces para definir las operaciones necesarias en cada módulo, siguiendo los principios de POO:

- **[IBuscarEnApi](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/IBuscarEnApi.java)**: Define métodos para realizar solicitudes a la API.
- **[IComunicacionAppUsuario](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/IComunicacionAppUsuario.java)**: Interfaz para la comunicación de la app hacia el usuario.
- **[IComunicacionUsuarioApp](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/IComunicacionUsuarioApp.java)**: Interfaz para la comunicación del usuario hacia la app.
- **[ICrearArchivo](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/ICrearArchivo.java)**: Define métodos para la creación y escritura de archivos.
- **[ICalculosConversion](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/calculos/ICalculosConversion.java)**: Define las operaciones necesarias para realizar conversiones.

### Clases

Cada clase se diseñó para implementar una interfaz o manejar una funcionalidad específica:

- **[SolicitarDatosApi](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/SolicitarDatosApi.java)**: Implementa `IBuscarEnApi` y maneja las solicitudes a la API.
- **[ComunicacionAppAUsuario](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/ComunicacionAppAUsuario.java)**: Implementa `IComunicacionAppUsuario` y maneja los mensajes y la comunicación hacia el usuario.
- **[ComunicacionUsuarioAApp](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/ComunicacionUsuarioAApp.java)**: Implementa `IComunicacionUsuarioApp` y Controla las interacciones de entrada del usuario hacia la app.
- **[CrearEscribirArchivo](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/CrearEscribirArchivo.java)**: Implementa `ICrearArchivo` y maneja la creación y escritura de archivos de registro.
- **[Calculo](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/calculos/Calculo.java)**: Implementa `ICalculosConversion` y contiene la lógica de cálculo para la conversión de moneda.
- **[Principal](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/principal/Principal.java)**: Clase principal que inicia el flujo de la aplicación.
- **[PrincipalOptimizada](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/principal/PrincipalOptimizada.java)**: Variante de la clase principal, optimizada para pruebas adicionales o funcionalidad ampliada.

### Record `Monedas`

Este record se diseñó para obtener los datos de la API y darle una estructura de objeto en Java. Esto facilita el manejo de los datos obtenidos de la API, permitiendo acceder a ellos de manera organizada y orientada a objetos.

- **[Monedas](https://github.com/JDCH1206/CONV-MONEDA/blob/master/src/com/JDCH/conversorMoneda/modulos/Monedas.java)**: Este record define la estructura de los datos de tipo `Monedas`, que representan las tasas de cambio obtenidas de la API. Incluye atributos para cada moneda y sus tasas de conversión, permitiendo una fácil integración y manipulación dentro de la aplicación.

## Modo de Uso

Este conversor de monedas permite realizar conversiones entre las siguientes opciones:

1. Peso colombiano a Dólar
2. Dólar a Peso colombiano
3. Peso colombiano a Euro
4. Euro a Peso colombiano
5. Peso colombiano a Yen
6. Yen a Peso colombiano
7. Yen a Dólar
8. Dólar a Yen
9. Euro a Dólar
10. Dólar a Euro
11. Yen a Euro
12. Euro a Yen

### Instrucciones de Uso

1. **Seleccionar Conversión**: El usuario elige la conversión de moneda que desea realizar del menú de opciones.
2. **Ingresar Monto**: Luego, se debe indicar el monto a convertir en la divisa seleccionada.
3. **Decidir Continuación**:
   - Después de la conversión, el programa pregunta si el usuario desea realizar otra conversión o salir del programa.
   - Si el usuario selecciona "continuar", vuelve al menú principal para realizar una nueva conversión.
   - Si el usuario elige "salir" (opción 13), el programa muestra un mensaje de despedida.
4. **Guardar Resultados**:
   - Al salir, el programa solicita un nombre para guardar los datos de las conversiones en un archivo de tipo JSON.
   - El usuario ingresa el nombre del archivo, y el programa guarda todos los datos de las conversiones realizadas en esa sesión.

## Pruebas

El funcionamiento del conversor fue verificado mediante diversas pruebas, cuyo proceso se describe a continuación:

1. **Inicio del Programa y Selección de Conversión**:
   - Se muestra un menú inicial donde el usuario puede seleccionar el tipo de conversión.  
   ![Imagen de entrada](https://github.com/JDCH1206/CONV-MONEDA/blob/master/Imagenes%20Prueba/Archivo%201.png)

2. **Interfaz del Menú de Conversión**:
   - Ejemplo de menú que muestra las opciones de conversión de divisas.  
   ![Imagen del menú](https://github.com/JDCH1206/CONV-MONEDA/blob/master/Imagenes%20Prueba/Archivos%202.png)

3. **Ejemplo de Conversión de Moneda**:
   - Muestra la conversión de un monto específico en la divisa seleccionada.  
   ![Prueba conversión](https://github.com/JDCH1206/CONV-MONEDA/blob/master/Imagenes%20Prueba/Archivo%203.png)
   ![Prueba Conversión 2](https://github.com/JDCH1206/CONV-MONEDA/blob/master/Imagenes%20Prueba/Archivo%204.png)

4. **Selección de Salida y Creación de Archivo**:
   - El usuario decide salir del programa, y se le solicita el nombre para el archivo de resultados.  
   ![Menú salida y creación de archivo](https://github.com/JDCH1206/CONV-MONEDA/blob/master/Imagenes%20Prueba/Archivo%205.png)

5. **Asignación del Nombre del Archivo**:
   - El usuario proporciona el nombre con el cual se guardará el archivo de conversiones.  
   ![Asignación nombre archivo](https://github.com/JDCH1206/CONV-MONEDA/blob/master/Imagenes%20Prueba/Archivo%206.png)

6. **Archivo JSON Resultante**:
   - Archivo JSON generado con el registro de todas las conversiones realizadas durante la sesión.  
   ![Archivo resultante de las conversiones](https://github.com/JDCH1206/CONV-MONEDA/blob/master/Imagenes%20Prueba/Archivo%207.png)


## Uso e instalación

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/JDCH1206/CONV-MONEDA.git

