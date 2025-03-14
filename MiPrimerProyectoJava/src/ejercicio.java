import java.util.Scanner;

public class ejercicio

{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ingresa numero :");
        int num = input.nextInt();
        System.out.print("el numero es :" + num);
        if (num > 0) {
            System.out.println(" el numero es positivo");
            for (int k = 1; k <= num; k++) {
                for (int j = 1; j <= k; j++) {
                    if (j % 2 == 1) {
                        System.out.print(k);
                    } else {
                        System.out.print(k * -1);
                    }
                    if(j<k){
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
            input.close();
        } else {
            System.out.println(" numero no valido");
            input.close();
            return;
        }
    }
}