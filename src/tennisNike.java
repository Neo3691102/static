public class tennisNike {
    int medida; 
    String nombreModelo; 
    public static int contadorTennis = 0; //ESTA VARIABLE PODRÁ SER USADA EN CUALQUIER LUGAR COMO VARIABLE DE CLASE

    public tennisNike(int medida, String nombreModelo){
        this.medida = medida;
        this.nombreModelo = nombreModelo;
        contadorTennis++;
    }

    public static int getCantTennis(){
        return contadorTennis;
    }
}
