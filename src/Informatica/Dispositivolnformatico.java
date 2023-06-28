package Informatica;

    /**
     *  -La clase tiene un atributo privado llamado "marca" que representa
     *      la marca del dispositivo informático. Por defecto, se inicializa
     *      con el valor "Acer".
     *  -La clase tiene un método público llamado "mostrarMarca()" que imprime
     *      en pantalla la marca del dispositivo informático.
     *
     *  @Version 1.3/2022
     *      Jub1101
     **/
    public class Dispositivolnformatico {
        private String marca = "Acer";

        public void mostrarMarca() {
            System.out.println("Marca = " + marca);
        }

    }

