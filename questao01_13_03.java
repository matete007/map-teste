import java.util.Scanner;

public class questao01_13_03 {
    public static boolean impar_par(int numero){
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();
        if(impar_par(num)){
            System.out.println(STR."O número \{num} é par.");
        }else{
            System.out.println(STR."O número \{num} é impar.");
        }

        sc.close();


    }
}
