public class Main{

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = 3;
        if (esPar(numero)) {
            System.out.println("Sí es par");
        } else {
            System.out.println("No es par");
        }
    }

}
