# Programación Orientada a objetos

Deﬁna las clases (nombre, superclase, atributos y métodos) para implementar una solución orientada a objetos para el siguiente problema e implemente en Java.

Se desea implementar un sistema para la planiﬁcación del control de gastos de una organización. El sistema debe permitir almacenar los gastos, con su descripción, la fecha, su monto y demás características que se le desee incorporar. Asimismo es
posible incluir un detalle pormenorizado sobre un gasto, de esta forma el usuario puede detallar como se compone originalmente el gasto. Por ejemplo, gasto “construcción ediﬁcio”: se basa en gastos en cimientos, gastos en ediﬁcaciób y gastos en pintura, el total del gasto es la suma de cada una de las partes que lo componen.
Siempre se pueden agregar caracteristicas a un gasto acorde a lo deseado por el usuario, por ejemplo gastos de “pintura l" del 02/06/2008: color rojo, calidad media, monto 400; gastos de “pintura 2” del 03/06/2008: categoria arreglo, tipo anti-hongos,
monto 900 y rugosidad alta.

Se deben proveer servicios que permitan obtener:
El total de dinero gastado en una fecha dada
El total de dinero que se gasto en el rubro: Alimentos
Un listado con todos los gastos de una fecha dada
Un listado con todos los gastos de calidad media que se hicieron.
El total de dinero que se gasto en pintura, en una fecha dada.
Un listado de todos los gastos que superen los 1556 Pesos
Cualquier posible combinación de los anteriores.


Aclaración sobre los listados de gastos: Cuando se trabaja con un gasto que esta detallado con otros menores se debe proceder de la siguiente forma, por ejemplo, si se solicitan los productos de calidad alta, y el gasto (que esta detallado) posee una calidad alta, éste es incluido en el listado; ahora si el mismo NO posee calidad alta pero dentro del detalle hay gastos que si poseen calidad alta, estos últimos deben ser incluidos en el listado. Nunca pueden pertenecer a los listados el gasto detallado y uno o varios detalles del mismo; siempre es uno o el otro.
Se hace necesario agregar una nueva forma de control de gastos, mediante la cual se impone un control sobre los detalles de un gasto (solo para algunos casos de gastos detallados), esta nueva funcionalidad no permite agregar un detalle si el mismo viola
una restricción del negocio, por ejemplo: que sea de origen chino, que sea de color blanco, que el monto sea superior a 753, o cualquier combinación que el usuario quiera establecer para el gasto particular. Si la restricción se cumple el detalle NO debe
agregarse.

Tener en cuenta los conceptos básicos de la programación orientada a objetos.