# pruebaTecnica

Dificultades: Me falta algún fuente. Desde el figma (que yo sepa no los puedo obtener). A veces no es fácil de conseguir, porque aun encontrando existen variantes. Con los fuentes que correspondan al diseño pues estaria perfecto (o casi). Oswal y open_sans los encontré bien. En concreto en fonts.google.com. Tuve problemas con android 7 por culpa de los fuentes, me pasa en la última pantalla. La app funciona a partir de la versión 8 de android (api 26).  Es curioso que pase eso con los fuentes, bueno no pude averiguar porqué motivo pasa éso. Pero para bien o para mal me gusta comentarlo.

Es la primera vez que pongo la barra de estado transparente extendiendo una imagen. Fue interesante hacerlo, ya me sirve para otras ocasiones.

He utilizado para todo jetpack compose, retrofit, MVVM.

He hecho pruebas en 2 emuladores distintos: Pixel 7 Pro API 34 y Small Phone API 26. Y en 3 modelos de movil android: motorola g30, huawei antiguo (con poca resolución) y un Samsung A53 (tambien otro modelo más de samsung).

Para ser más rápido he utilizado variables globales para pasar datos del listado a la ficha y poco más (número de registros y evitar que lea del servidor). Soy consciente que existen tambien otras formas (como viewmodels compartidos, etc). Ya llevaba bastantes horas con el diseño y lo resolví rapidamente de esa manera.Soy partidario de pasar parametros. Pero al necesitar hacerlo via navController de momento el jetpack no permite pasar objetos, sino datos simples standard (string, int, etc). Las variables publicas no hay que abusar pero en alguna ocasión tambien pueden ser utiles.

El proyecto lo tengo de la siguiente manera: 

  1º) Para cada pantalla hago una carpeta, dentro de ella estaria el composable principal, su viewmodel en caso de ser necesario y una carpeta de componentes llamados del composable principal.
  2º) La lista de pantallas lo tengo en la clase sellada -> Pantallas (dentro de la carpeta ui.theme).
  3º) En la carpeta Model pongo las data class utilizadas
  4º) En Network pongo el objeto Retrofit y su interface. Tambien incluyo una comprobación de internet, que me parece interesante. Ultimamente lo suelo hacer para evitar crash en caso de perdida de conexion a internet. 
  5º) Hice una barra de menu abajo, que solo lo tengo en la primera pantalla. Puse 3 iconos (casa, listado y cerrar). Por adornar un poco la pantalla inicial.Casa se llama a sí mismo pero era por completar un poco.
  6º) Hago una petición al servidor y traigo 50 registros. En MainActivity.kt que lo configuro inicialmente -> config.numRegistros. La lecturaServidor pongo a false para que la transición de la pantalla final (ficha) a la anterior no realice lecturas imnecesarias.
  7º) En el viewmodel hago filtrado de usuarios duplicados basándome en el name y email. En la función cargarListadoUsuarios del viewmodel -> ListViewModel
  8º) Solo tengo activo el menú del listado para que salga una ventana emergente y hacer busqueda en nombre y email. Pensé en éso para mantener el diseño del figma igual. El menu, camara y lapiz de la ficha solo estan para adornar.
  9º) En la pantalla de lectura  por parte del viewmodel en el listado. Hago una comprobación en esa pantalla de conexion a internet para evitar problemas en la petición al servidor y evitar problemas. Se estaria reintentando hasta que se tenga conexión pero no se bloquea ni nada y el usuario puede tranquilamente darle para atrás tranquilamente o conectarse a una red sin problema.
  10º) Os mando en el correo pantallazos de los dos emuladores utilizados en un pdf en el correo.

  
