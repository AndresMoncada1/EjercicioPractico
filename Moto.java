class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String placa, String marca, String modelo, int cilindraje) {
        super(placa, marca, modelo);
        this.cilindraje = cilindraje;
    }

    @Override
    public void estacionar() {
        System.out.println("La moto con placa " + super.placa + " está estacionada en un espacio de moto.");
    }

    public void ponerCasco() {
        System.out.println("El casco para la moto con placa " + super.placa + " está puesto.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cilindraje: " + cilindraje);
    }
}