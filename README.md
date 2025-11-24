Es un archivo Java que carga información de centros de cultivo desde un archivo `centros.txt`,
crea objetos con esos datos y los gestiona mediante colecciones.
Se gestiona información de centros de cultivo y productos de inventario, utilizando colecciones, validaciones y carga desde archivos

model = Clases principales (CentroCultivo, Productos)
data = Lectura de archivos (.txt)
Validaciones =  Validación de RUT, precio y cantidad
Libreria = Módulos reutilizables (Buscador, Estadísticas)
ui = Clases Main para mostrar resultados por consola
resources = Archivos `Centros.txt` e `Inventario.txt`


realiza lo siguiente:

Carga de datos desde archivos `.txt`
Validación básica de entradas
Búsqueda de productos y centros
Filtrado por producción (toneladas > 1000)
Impresión en consola de todos los centros y de los filtrados

Semana N°6

En esta semana trabajamos en proyecto en Java de la empresa Salmontt donde usando herencia y poliformismo.

Las clases están organizadas en sus respectivos paquetes: `model`, `data` y `ui`.  
`GestorUnidades` crea centros de cultivo y plantas de proceso.  
`MainUnidades` imprime todas las unidades en consola.  
Ejecutar `ui.MainUnidades` para ver el resultado.

Andrés Quintero – Duoc UC