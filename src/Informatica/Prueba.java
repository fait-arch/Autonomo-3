package Informatica;
/**
 *
 *  -Se crea un objeto de la clase "Tableta" llamado "tableta" y se
 *      le asigna la marca "Dell".
 *  -Se llama al método "mostrarMarca()" del objeto "tableta" para
 *      mostrar la marca de la tableta.
 *  -Se llama al método "mostrarMarcaDispositivo()" del objeto "tableta"
 *      para mostrar la marca del dispositivo informático.
 *
 *      @Version 1.3/2022
 *          Jub1101
 */

public class Prueba {
    public static void main(String[] args) {
        Tableta tableta = new Tableta("Dell");
        tableta.mostrarMarca();
        tableta.mostrarMarcaDispositivo();
    }
}

