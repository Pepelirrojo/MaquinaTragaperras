# MaquinaTragaperras
Programa para recrear la funcionalidad de una maquina tragaperras.

Descripcion del codigo:
Creada la clase MaquinaTragaperras, le añadiremos los siguientes atributos de tipo String:
simb1, simb2, simb3 y mensaje.
Crearemos los metodos get de los atributos para poder utilizarlos en nuestra interfaz grafica.
Ahora creamos un metodo principal Tirar con la siguiente funcionalidad: 
Primero declaramos un ArrayDeque compuesto por Strings
Añadimos los elementos que se deseen, en este caso he añadido 4 posibles iconos: Trebol, Pica, Corazon y Rombo.
Clonamos en otros dos ArrayDeque distintos el ArrayDeque original.
Declaramos una variable boolean en false.
Hacemos un bucle While con la condicion de que se repita hasta que nuestro boolean sea true
Dentro del bucle declaramos una variable de tipo int (tirada) que nos generara un numero aleatorio, en este caso entre 24 y 1
Por cada rosco haremos un bucle for y para que no sean todos iguales aplicaremos condiciones distintas, en este caso
    el primer rosco ira hacia delante tirada+2 utilizando los metodos pollFirst y addLast, en el segundo rosco irá hacia atras
    tirada-3 utilizando pollLast y addFirst y en el tercero igual que el primero lo unico que tirada+5.
Imprimiremos los resultados de los roscos y nuestro contador se incrementara
Comprobamos por cada iteracion del bucle si son iguales, si lo son nuestra condicion cambiara a true y nos imprimira un mensaje 
    diciendo que hemos ganado más el dinero gastado(contador).
Si no es asi comprobamos que nuestro contador no sea igual que el dinero introducido y que nuestra condicion sigue en false, si
    si es asi la condicion boolean sera true y nos imprimira un mensaje de que hemos perdido.
