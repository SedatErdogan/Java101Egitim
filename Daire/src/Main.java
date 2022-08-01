import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        int r;
        int a;
        double alan;
        double pi=3.14;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen YarıÇapı Giriniz:");
        r=input.nextInt();
        System.out.println("Lütfen Merkez Açının Ölçüsünü Giriniz:");
        a=input.nextInt();

        alan=(pi*r*r*a)/360;

        System.out.println("Daire diliminin alanı=" +alan);




    }

}
