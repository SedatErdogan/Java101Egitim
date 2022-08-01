import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        int a,b,c;
        double cevre;
        double u;
        double alan;


        Scanner input=new Scanner(System.in);


        System.out.println("Lütfen a kenarının uzunluğunu giriniz:");
        a=input.nextInt();
        System.out.println("Lütfen b kenarının uzunluğunu giriniz:");
        b=input.nextInt();
        System.out.println("Lütfen c kenarının uzunluğunu giriniz:");
        c=input.nextInt();


        u=(a+b+c)/2;

        cevre=2*u;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı="+alan);







    }

}
