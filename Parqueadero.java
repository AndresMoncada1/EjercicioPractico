public class Parqueadero {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC123", "Toyota", "Corolla", 4);
        Moto moto = new Moto("XYZ789", "Yamaha", "R3", 300);
        Bicicleta bicicleta = new Bicicleta("BIC001", "Giant", "Mountain", "Montaña");

        carro.estacionar();
        carro.mostrarInformacion();
        carro.abrirMaletero();

        moto.estacionar();
        moto.mostrarInformacion();
        moto.ponerCasco();

        bicicleta.estacionar();
        bicicleta.mostrarInformacion();
        bicicleta.bloquear();
    }
}