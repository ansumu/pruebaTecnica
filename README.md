# pruebaTecnica

Dificultades: me falta algún fuente. Desde el figma (que yo sepa no los puedo obtener). A veces no es fácil de conseguir, porque aun encontrando existen variantes. Con los fuentes que correspondan al diseño pues estaria perfecto (o casi). Oswal y open_sans los encontré bien. En concreto en fonts.google.com.

Es la primera vez que pongo la barra de estado transparente extendiendo una imagen. Fue interesante hacerlo, ya me sirve para otras ocasiones.

Comentar que he utilizado para todo jetpack compose, retrofit, MVVM.

He hecho pruebas en 2 emuladores distintos: Pixel 7 Pro API 34. Y en 3 modelos de movil android: motorola g30, huawei antiguo (con poca resolución) y un Samsung A53

Para ser más rápido he utilizado variables globales para pasar datos del listado a la ficha y poco más (número de registros y evitar que lea del servidor).

Soy consciente que existen tambien otras formas (como viewmodels compartidos, etc). Ya llevaba bastantes horas con el diseño y lo resolví rapidamente de esa manera.Soy partidario de pasar parametros. Pero al necesitar hacerlo via navController de momento el jetpack no permite pasar objetos, sino datos simples standard (string, int, etc). Las variables publicas no hay que abusar pero en alguna ocasión tambien pueden ser utiles.

El proyecto lo tengo de la siguiente manera: 

  1º) Para cada pantalla hago una carpeta, dentro de ella estaria el composable principal, su viewmodel en caso de ser necesario y una carpeta de componentes llamados del composable principal.
  2º) La lista de pantallas lo tengo en la clase sellada -> Pantallas (dentro de la carpeta ui.theme).
  3º) En la carpeta Model pongo las data class utilizadas
  4º) En Network pongo el objeto Retrofit y su interface. Tambien incluyo una comprobación de internet, que me parece interesante. Ultimamente lo suelo hacer para evitar crash en caso de perdida de conexion a internet. 
