import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int k;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        k=input.nextInt();

        for (int i=1; i <= k; i*=4){
            System.out.print(i+",");


        }

        for (int j=1; j<=k; j*=5){
            System.out.println(j+",");

        }
    }

}
