class Carro extends Vehiculo {
    private int numPuertas;

    public Carro(String placa, String marca, String modelo, int numPuertas) {
        super(placa, marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override
    public void estacionar() {
        System.out.println("El carro con placa " + super.placa + " está estacionado en un espacio de carro.");
    }

    public void abrirMaletero() {
        System.out.println("El maletero del carro con placa " + super.placa + " está abierto.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numPuertas);
    }
}