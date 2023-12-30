# pruebaTecnica

Dificultades: me faltan los fuentes. Desde el figma (que yo sepa no los puedo obtener). A veces no es fácil de conseguir, porque aun encontrando existen variantes. Con los fuentes que correspondan el diseño estaria perfecto (o casi).

Es la primera vez que pongo la barra de estado transparente extendiendo una imagen. Fue interesante hacerlo, ya me sirve para otras ocasiones.

Comentar que he utilizado para todo jetpack compose, retrofit, MVVM. 

He hecho pruebas en 3 emuladores distintos: Pixel 7 Pro API 34, 

Para ser más rápido he utilizado variables globales para pasar datos de la ficha y poco más (número de registros y evitar que lea).

Soy consciente que existen tambien otras formas (como viewmodels compartidos, etc). Ya llevaba bastantes horas con el diseño y lo resolví rapidamente de esa manera.

Soy partidario de pasar por parametros. Pero de momento el jetpack no permite pasar objetos, sino datos tipicos standar (string, int, etc). Las variables publicas no hay que abusar pero en alguna ocasión tambien puede ser utiles.

