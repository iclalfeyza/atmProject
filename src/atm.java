import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner project = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 10000;
        int price;

        while (right > 0) {
            System.out.print("Kullanici adinizi giriniz: ");
            userName = project.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = project.nextLine();

            if (userName.equals("iclal") && password.equals("yazilimci")) {
                System.out.println(" HANDKERCHIEF BANKASINA HOSGELDINIZ! ");
                int select;
                do {
                    System.out.println("1. Para Cekme\n" +
                                    "2. Para yatirma\n" +
                                    "3. Bakiye sorgulama\n" +
                                    "4. Kart iadesi");
                    System.out.print("Yapmak istediginiz islemi seciniz: ");
                    select = project.nextInt();
                    if ((select <= 0) || (select >= 5)) {
                        System.out.println("Seceneklerden 1, 2, 3 veya 4'u tuslayiniz.");
                    } else if (select == 1) {
                        System.out.print("Miktar giriniz: ");
                        price = project.nextInt();
                        if (price > balance) {
                            System.out.println("Talebiniz mevcut bakiyenin uzerinde.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 2) {
                        System.out.print("Miktar giriniz: ");
                        price = project.nextInt();
                        balance += price;
                    } else if (select == 3) {
                        System.out.println("Mevcut bakiyeniz: " + balance);
                    } else if (select == 4) {
                        System.out.println("Iyi gunler diler, yine bekleriz :).");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                if (right < 1) {
                    System.out.println("Kalan deneme hakkiniz: " + right + "Hesabiniz bloke edilmistir.");
                } else {
                    System.out.println("Kalan deneme hakkiniz: " + right + "\n(ipucu: kullanici adi: iclal\nsifreniz: yazilimci)");
                }
            }
        }
    }
}
