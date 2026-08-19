import java.util.Scanner;

public class RecursividadeEProgramacaoDnmc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Declare o numero de degraus: ");
        int nDegrau = scanner.nextInt();
        int resultado = contarManeiras(nDegrau);
        System.out.println("Há " + resultado + " maneiras distintas de subir até o topo.");

    }

    public static int contarManeiras(int n){
        if (n == 1 || n == 2){
            return n;
        }
        return contarManeiras(n - 1) + contarManeiras(n - 2);
    }
}
