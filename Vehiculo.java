class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void estacionar() {
        System.out.println("El vehículo con placa " + placa + " está estacionado.");
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie placa*/
    public String getPlaca(){
        return this.placa;
    }//end method getPlaca

    /**SET Method Propertie placa*/
    public void setPlaca(String placa){
        this.placa = placa;
    }//end method setPlaca

    /**GET Method Propertie marca*/
    public String getMarca(){
        return this.marca;
    }//end method getMarca

    /**SET Method Propertie marca*/
    public void setMarca(String marca){
        this.marca = marca;
    }//end method setMarca

    /**GET Method Propertie modelo*/
    public String getModelo(){
        return this.modelo;
    }//end method getModelo

    /**SET Method Propertie modelo*/
    public void setModelo(String modelo){
        this.modelo = modelo;
    }//end method setModelo

//End GetterSetterExtension Source Code


}//End class