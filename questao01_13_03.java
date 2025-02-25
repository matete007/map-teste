import java.util.Scanner;

public class questao01_13_03 {
    public static int impar_par(int numero){
        if(numero % 2 == 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um nmero: ");
        num = sc.nextInt();
        if(impar_par(num) == 1){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é impar.");
        }

        sc.close();
    }
}
