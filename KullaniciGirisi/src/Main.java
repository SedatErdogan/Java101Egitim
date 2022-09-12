import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nick, password, answer, newPassword;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen Kullanıcı Adınızı Giriniz:");
        nick=input.nextLine();
        System.out.println("Lütfen Şifrenizi Giriniz:");
        password=input.nextLine();

        if(nick.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yapıldı.");

        } else if(nick.equals("patika")){
            System.out.println("Şifreniz Yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? Evet/Hayır");
            answer=input.nextLine();

            if(answer.equals("Evet")){
                System.out.println("Yeni şifrenizi giriniz:");
                newPassword=input.nextLine();

                if(newPassword.equals("java123")){
                    System.out.println("Şifreniz oluşturulamadı. Lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Yeni Şifreniz oluşturuldu.");
                }

            }
            else{
                System.out.println("İşlem sonlandırıldı.");

            }
        }

    }

}
