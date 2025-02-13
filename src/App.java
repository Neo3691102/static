public class App {
    public static void main(String[] args) throws Exception {
        tennisNike tennis = new tennisNike(28, "Airforce-1");
        System.out.println("Nuevos tennis Nike creados! son unos " + tennis.nombreModelo + " del numero: " + tennis.medida);
        System.out.println("Stock: " + tennisNike.getCantTennis());//ACCEDIENDO AL METODO DE LA CLASE tennisNike
    }
}
