# Seba Mangas

## 📌 Explicación del sistema

En este sistema simula una pequea tienda de mangas. Se Permite:
- Mostrar mangas disponibles el cual se utiliza el patron de diseño iterator
- Realizar comrpas con distintos metodos de envio y en este se utiliza Brigde
- Usar una unica instancia para la tienda, en este se utiliza el patron singleton 
- El proceso de los pagos conn un sistema externo que se adapta con el patron de diseño Adapter



##  🧠 El problema que se resuelve 

Se requiere una estructura modular y extensible para este sea más facil de manejar:
-Una unica instancia de la tienda (esta se instancia con Singleton)
-Comunicación con sistema de pagon externos (esta se instancia con adapter ) 
-Diversas manera de realizar pagos (esta se instancia con Brigde)
-La navegacion senciall por catalogo de los mangas (esta se instancia con Iterator)

---


### 💡 Pequeña justificacion

### 1. Porque se utiliza Singleton
- **Por qué**: Porque al final de la cosas como la tienda de manga es una unica instancia tome la decision de usar el singleton y era la mas rapida y facil.
- **Dónde**: En el lugar donde se utiliza este es en Singleton hay esta definido la instancia.

### 2. Porque se utilizo Adapter 
- **Dónde**: Se utiliza en PAdapter y en PagoExterno ya que se crea en PAdapter pero se lleva a cabo en PagoExterno.
- **Por qué**: Porque no siempre se va a poder pagar de una forma un ejemplo claro es si pagas en efectivo o pago con tarjeta.


### 3. Porque se utilizo Iterator
- **Por qué**: Este se utilizo porque era perfecto para recorrer una lista de mangas sin exponer la estructura internas de estos.
- **Dónde**: MangaIterator se llevo a cabo la funciones para recorrer los mangas uno a uno.


### 4. Porque se utilizo Bridge
- **Dónde**: En cliente y MetodoEnvio y en MetodoEnvio salieron 2 clases extras como las cuales son EnvioFisico y EnvioCorreo
- **Por qué**: Separar el cliente de las diferentes formas de envío (físico o electrónico).


### Aca se adjunta una Imagen del Funcionamiento de la tienda 

![Image Alt](https://github.com/TheSebita122/Evaluacion-3-de-Patrones/blob/a78ff89babd08e1e4c2eca333331ee01a1bcd45b/Funcionamiento%20de%20La%20Tienda%20de%20Mangas.png)

