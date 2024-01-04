Comentarios de la Prueba Técnica:

Dificultades Encontradas:

    Uno de los retos encontrados fue la obtención de las fuentes tipográficas adecuadas directamente desde Figma, lo cual, hasta donde sé, no es posible.
    Aunque identifiqué un par de fuentes similares, las variantes específicas pueden ser esquivas.
    Con las fuentes correctas, el diseño sería aún más fiel al concepto original.

    Durante el desarrollo de la prueba técnica, me encontré con un problema específico al ejecutar la aplicación en dispositivos con Android 7. 
    El inconveniente estaba relacionado con las fuentes personalizadas utilizadas en la aplicación, las cuales no eran completamente compatibles
    con esta versión del sistema operativo.
    
    Tras intentar varias soluciones y evaluar las opciones disponibles, decidí enfocar el desarrollo y las pruebas de la aplicación para sistemas 
    operativos Android 8 en adelante. Esta decisión se tomó para asegurar una experiencia de usuario totalmente estable y coherente, dado que la 
    corrección de estos problemas en Android 7 requeriría un tiempo y recursos que excedían el alcance de esta prueba técnica.
    
    Esta decisión también se alinea con las estadísticas de uso actuales, donde la mayoría de los usuarios se encuentran en versiones más recientes
    de Android. Sin embargo, soy consciente de la importancia de la compatibilidad con versiones anteriores y estaría dispuesto a explorar soluciones
    alternativas en un contexto de proyecto a mayor escala.

Aspectos Destacados:

    Barra de Estado Transparente: Implementé por primera vez una barra de estado transparente que extiende una imagen en el fondo.
    Este fue un aprendizaje valioso que aplicaré en proyectos futuros.
    Tecnologías Utilizadas: El proyecto fue desarrollado integralmente con Jetpack Compose, Retrofit y el patrón MVVM.

Pruebas Realizadas:

    Emuladores: Se realizaron pruebas en tres emuladores diferentes, enfocándome principalmente en Pixel 7 Pro API 30 y Small Phone API 26. 
    Un PDF adjunto muestra las capturas de pantalla de estos emuladores.
    Dispositivos Físicos: Validé la aplicación en cuatro dispositivos móviles: dos modelos de Samsung (incluyendo el A53), un Huawei antiguo con Android 8, y mi Motorola G30.

Estrategias de Desarrollo:

    Manejo de Datos: Para mayor eficiencia, utilicé variables globales para pasar datos entre pantallas. Aunque reconozco que existen alternativas como ViewModels compartidos,
    opté por esta solución rápida dadas las limitaciones actuales de pasar objetos complejos a través del NavController de Jetpack Compose.

Organización del Proyecto:

    UI: Las pantallas se alojan en el archivo Pantallas dentro de ui.theme.
    Estructura de Carpetas: Cada pantalla (Home, Listado, Ficha) tiene su propia carpeta que incluye tanto la vista principal como su ViewModel.
    Los componentes adicionales se organizan en una subcarpeta components. Las clases de datos se encuentran en model, y network contiene el objeto y la interfaz para Retrofit.
    Optimización de la Red: Implementé una verificación de conectividad para prevenir errores por desconexión y un sistema para evitar llamadas innecesarias al servidor, lo cual mejora la experiencia del usuario.
    Filtrado de Datos: Se realiza un filtrado de datos duplicados en el ListViewModel. La configuración del servidor se puede ajustar a través de la variable config=publico(false,50).
    Funcionalidad de Búsqueda: La pantalla de Listado cuenta con un menú de búsqueda integrado. Al activarse, se muestra una ventana emergente donde el usuario puede escribir para filtrar resultados por nombre y correo.

Detalles de Interfaz y Navegación:

    Menú Hamburguesa: La interactividad del menú hamburguesa se ha implementado únicamente en la pantalla de Listado.
    Elementos Decorativos: Es importante señalar que ciertos elementos visuales, como el icono del menú, la imagen de perfil y los iconos de edición,
    están presentes como parte del diseño de la interfaz, pero no tienen funcionalidad asignada en la versión actual de la aplicación. 
    Estos elementos se incluyeron para cumplir con las expectativas visuales establecidas en el diseño de la última pantalla.

Entregables:

    Incluiré capturas de pantalla en PDF de los dos emuladores mencionados previamente en el correo electrónico de seguimiento.
    Y un enlace de descarga apk a un servidor privado que tengo en la nube.

Para concluir, quiero destacar mi compromiso con la transparencia y la honestidad en el proceso de desarrollo. Como habrán notado, no he ocultado 
los desafíos encontrados, sea para bien o para mal. Creo firmemente que reconocer y comunicar abiertamente los problemas es crucial para el crecimiento
profesional y la mejora continua. Espero que esta prueba refleje no solo mis habilidades técnicas, sino también mi enfoque hacia un desarrollo 
de software responsable y abierto.
