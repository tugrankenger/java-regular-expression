import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExEmailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Email adresi: ");

            Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]{2,6}+$");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean uygun= false;
            while (matcher.find()){
                System.out.println("Girilen mail adresi : "+matcher.group()+" , tanimli mail adresi formatina uygundur.");
                uygun=true;
            }
            if(!uygun){
                System.err.println("Girilen mail adresi tanımli formata uygun degildir. Lutfen(user@mail.com) formatinda bir deger giriniz.");
            }
        }
    }
}
