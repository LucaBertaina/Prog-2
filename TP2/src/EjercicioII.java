import java.util.Scanner;

public class EjercicioII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Intoduce 3 numeros aleatorios para determinar el mayor de los 3:");
        int numUno = scanner.nextInt();
        int numDos = scanner.nextInt();
        int numTres = scanner.nextInt();
        if(numUno > numDos){
            if(numUno > numTres){
                System.out.println("El mayor de los 3 es el: " + numUno);
            }else {
                System.out.println("El mayor de los 3 es el: " + numTres);
            }
        }else {
            if(numDos > numTres){
                System.out.println("El mayor de los 3 es el: " + numDos);
            } else {
                System.out.println("El mayor de los 3 es el: " + numTres);
            }
        }
    }
}
