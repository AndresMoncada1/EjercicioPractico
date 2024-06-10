class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String placa, String marca, String modelo, String tipo) {
        super(placa, marca, modelo);
        this.tipo = tipo;
    }

    @Override
    public void estacionar() {
        System.out.println("La bicicleta con placa " + super.placa + " está estacionada en un espacio de bicicleta.");
    }

    public void bloquear() {
        System.out.println("La bicicleta con placa " + super.placa + " está bloqueada.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }
}