import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String kullaniciAdi, sifre;
        int yeniSifre, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin: ");
        kullaniciAdi = input.nextLine();
        System.out.print("Şifrenizi girin: ");
        sifre = input.nextLine();

        boolean kullanici = kullaniciAdi.equals("patikadev");
        boolean sifresi = sifre.equals("123456");

        if (kullanici && sifresi)
            System.out.println("Giriş yapıldı.");

        else if (!kullanici) {
            System.out.println("Kullanıcı bulunamadı.");
        }

        else {
            System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak istiyorsanız 1'e basın.\nCıkış yapmak istiyorsanız 0'a basın.\nSeçiminiz: ");
            secim = input.nextInt();

            switch (secim) {
                case 0 -> {
                    System.out.println("Sistemden çıkıldı.");
                    System.exit(0);
                }
                case 1 -> {
                    Scanner inp = new Scanner(System.in);
                    System.out.print("Yeni şifrenizi girin: ");
                    yeniSifre = inp.nextInt();

                    if (yeniSifre == 123456) {
                        System.out.print("Yeni şifreniz eski şifrenizden farklı olmalıdır.\nTekrar yeni şifrenizi girin: ");
                        yeniSifre = inp.nextInt();
                        System.out.println("Şifreniz değiştirildi. Yeni şifreniz: " + yeniSifre);
                    } else {
                        System.out.println("Şifreniz değiştirildi. Yeni şifreniz: " + yeniSifre);
                    }
                }
            }
        }
    }
}
