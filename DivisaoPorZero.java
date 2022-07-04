
import java.util.Scanner;
import java.io.*;

class DivisaoPorZero {
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);

        int a;
        System.out.println("Digite o numerador");
        a = ler.nextInt();
        int b;
        System.out.println("Digite o denominador");
        b = ler.nextInt();
        try {
            System.out.println(a / b); 
        }
        catch (ArithmeticException e) {
            
            System.out.println("Nao he possivel dividir por Zero.");
        }
    }
}