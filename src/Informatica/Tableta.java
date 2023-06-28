package Informatica;

    /**
     *
     *  -Esta clase es una subclase de la clase "DispositivoInformatico".
     *      Esto se indica mediante la palabra clave "extends" seguida
     *      del nombre de la clase base.
     *  -La clase "Tableta" tiene un atributo privado llamado "marca" que
     *      representa la marca de la tableta.
     *
     *
     *      @Version 1.3/2022
     *          Jub1101
     **/

    public class Tableta extends Dispositivolnformatico {
        private String marca;

        public Tableta(String marca) {
            super(); // Llamada al constructor de la clase base Dispositivolnformatico
            this.marca = marca;
        }

        public void mostrarMarca() {
            System.out.println("Marca = " + marca);
        }

        public void mostrarMarcaDispositivo() {
            super.mostrarMarca();
        }
    }


