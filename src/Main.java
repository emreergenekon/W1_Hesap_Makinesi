import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;

        //kullanıcılardan inputlar istenir.
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("0-Yanlış Giriş\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        //switch üzerinden 4 opsiyona ait formüller oluşturulur
        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Hata! Bir sayı sıfıra bölünemez.");
                        break;
                    default:
                        System.out.println("Bölme: " + ((double) n1 / n2));
                        break;

                }
        }
    }
}