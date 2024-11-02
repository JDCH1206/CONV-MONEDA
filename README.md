# Proyecto Conversor de Moneda 

## Introducción

Este proyecto se desarrolla con la guía de la plataforma **Alura Latam** en colaboración con **Oracle** dentro de la convocatoria **Oracle Next Education G7**. Su objetivo es crear un conversor de moneda en tiempo real que utilice la API **ExchangeRate-API - Free & Pro Currency Converter API**. Para más información sobre la API, consulta el siguiente enlace: [URL API USADA](https://www.exchangerate-api.com/).

## Pasos del desarrollo

Para este proyecto, se llevaron a cabo las siguientes etapas:

1. **Diseño conceptual**: Definición de los objetivos del proyecto y el alcance de sus funcionalidades.
2. **Esquema de Programación Orientada a Objetos (POO)**: Estructura de clases, interfaces y métodos.
3. **Diagrama de flujo**: Creación de un flujo lógico para el funcionamiento del conversor.
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

- **calculos**: Contiene las clases y lógica para realizar las conversiones de monedas.
- **modulos**: Maneja la interacción con la API, la entrada y salida de datos y la comunicación con el usuario.
- **principal**: Contiene la clase principal y el flujo principal del programa.

### Interfaces

Se generaron varias interfaces para definir las operaciones necesarias en cada módulo, siguiendo los principios de POO:

- **IBuscarEnApi**: Define métodos para realizar solicitudes a la API.
- **IComunicacionAppUsuario**: Interfaz para la comunicación de la app hacia el usuario.
- **IComunicacionUsuarioApp**: Interfaz para la comunicación del usuario hacia la app.
- **ICrearArchivo**: Define métodos para la creación y escritura de archivos.
- **ICalculosConversion**: Define las operaciones necesarias para realizar conversiones.

### Clases

Cada clase se diseñó para implementar una interfaz o manejar una funcionalidad específica:

- **SolicitarDatosApi**: Implementa `IBuscarEnApi` y maneja las solicitudes a la API.
- **ComunicacionAppAUsuario**: Maneja los mensajes y la comunicación hacia el usuario.
- **ComunicacionUsuarioAApp**: Controla las interacciones de entrada del usuario hacia la app.
- **CrearEscribirArchivo**: Implementa `ICrearArchivo` y maneja la creación y escritura de archivos de registro.
- **Calculo**: Implementa `ICalculosConversion` y contiene la lógica de cálculo para la conversión de moneda.
- **Principal**: Clase principal que inicia el flujo de la aplicación.
- **PrincipalOptimizada**: Variante de la clase principal, optimizada para pruebas adicionales o funcionalidad ampliada.
