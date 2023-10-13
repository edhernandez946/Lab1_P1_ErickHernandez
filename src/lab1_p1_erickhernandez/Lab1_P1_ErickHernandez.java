package lab1_p1_erickhernandez;
import java.util.Scanner;
public class Lab1_P1_ErickHernandez {
    
    public static void main(String[] args) {
        
        System.out.println("Elija una opcion");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        
        if (numero == 1) {
            
            int num1 = 15;
            int num2 = 30;
            int resultado;
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
            
        } else if (numero == 2) {
            
            System.out.println("Ingrese 3 numeros");
            int numeroUsuario1 = scanner.nextInt();
            int numeroUsuario2 = scanner.nextInt();
            int numeroUsuario3 = scanner.nextInt();
            
            double promedio = (numeroUsuario1 + numeroUsuario2 + numeroUsuario3) / (3);
            System.out.println("El promedio de los 3 numeros es " + promedio);
            
        } else {
            System.out.println("Opcion invalida");
        }
    }  
}