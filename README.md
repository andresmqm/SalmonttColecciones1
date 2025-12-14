Proyecto Salmontt – Java

Proyecto en Java que gestiona centros de cultivo, plantas de proceso y productos de la empresa Salmontt, aplicando Programación Orientada a Objetos.

El sistema carga información desde archivos .txt, crea objetos del modelo y los administra mediante colecciones (ArrayList, HashMap).
Incluye validaciones, búsqueda de productos, estadísticas y salida por consola.

Se implementan herencia, interfaces y polimorfismo, permitiendo recorrer distintas unidades operativas desde una referencia común y mostrar su información usando métodos sobrescritos.

Las clases están organizadas en paquetes model, data, libreria, validaciones, resources, excepciones y ui.

model:

Productos: representa productos del inventario (id, nombre, cantidad, precio).

UnidadOperativa: clase base que representa una unidad de la empresa.

CentroCultivo2: hereda de UnidadOperativa y representa centros de cultivo.

PlantaProceso: hereda de UnidadOperativa y representa plantas de proceso.

Registrable (interface): define el método mostrarResumen() para aplicar polimorfismo.

data:

GestorDatos: lectura de archivos .txt y carga de datos en colecciones.

GestorUnidades: administra una colección List<Registrable> aplicando herencia y polimorfismo.

Librería:

Buscador: métodos estáticos para búsqueda de productos y centros.

Estadisticas: cálculos como valor total de inventario.

Validaciones

ValidadorProducto: valida precios, cantidades y existencia.

ValidadorRut: valida formato de RUT chileno.

Funcionalidades implementadas:

Carga de datos desde archivos .txt.

Uso de ArrayList y HashMap.

ui: La ejecución principal se realiza desde:

ui.Main (inventario)

ui.MainCentros (centros)

ui.MainUnidades (unidades operativas)

Andrés Quintero
Duoc UC
