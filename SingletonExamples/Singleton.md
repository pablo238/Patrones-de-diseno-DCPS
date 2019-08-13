# Patron de diseño Singleton

 El objetivo de este patrón es el de garantizar que una clase solo tenga una instancia y proporcionar un punto de acceso global a ella.

<img src="http://www.c-jump.com/CIS75/Week11/const_images/SingletonClass.png" />

### ¿Cómo se implementa? 🚀

1) hacer privado el constructor de la clase ( De esa forma ningúna otra clase será capaz de construir objetos de este tipo)
2) Crear una variable estatica privada que almacene una referencia al objeto que vamos a crear a traves del constructor.
3) crear un método estatico publico que crea una instancia del objeto si este no existe. y retorna la instancia(sin importar si ya existia o se acaba de crear).

Tambien puede tener una variacion y es que la variable estatica privada puede ser inicializada desde el principio sin necesidad de llamar a metodo estatico. dentro de este metodo ya no sera necesario establecer la condicion de si la instancia existe, este simplemente retornara la instancia.


### Consideraciones 📋

Tomando como ejemplo Java es recomendable poner a el metodo estatico la propiedad "synchronized" esto con el fin de que si se estan utilizando varios hilos y el llamado a este metodo se realice al mismo momento, efectivamente nos garantice, que no se van a crear dos instancias del mismo objeto, por lo que un hilo tendra que esperar que el otro termine.

```
public static synchronized ElPapa getInstance() {
		if (elPapa == null) {
			elPapa=new ElPapa();
		}
		return elPapa;
	}
```
