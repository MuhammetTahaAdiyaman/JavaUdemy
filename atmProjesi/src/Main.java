import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Atm atm = new Atm();
        int islem;
        int para;
        String kullaniciAdi;
        String sifre;

        while (true) {
            System.out.println("Lutfen kullanici adinizi giriniz");
            kullaniciAdi = input.nextLine();

            System.out.println("Lutfen şifenizi giriniz");
            sifre = input.nextLine();

            if (kullaniciAdi.equals(atm.kullaniciAdi) && sifre.equals(atm.sifre)) {
                System.out.println("Giriş Başarılı");

                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:\n1-bakiye göster\n2-para yatır\n3-para cek\n4-çıkış");
                    islem = input.nextInt();

                    switch (islem) {
                        case 1:
                            atm.bakiyeSorgulama();
                            break;
                        case 2:
                            System.out.println("Lütfen yatirmak istediğiniz tutari giriniz:");
                            para = input.nextInt();
                            atm.paraYatir(para);
                            break;
                        case 3:
                            System.out.println("Lütfen çekmek istediğiniz tutari giriniz:");
                            para = input.nextInt();
                            atm.paraCek(para);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;
                        default:
                            System.out.println("1-4 arasında işlem seçiniz");
                            break;
                    }
                } while (islem != 4);

                break; // Kullanıcı çıkış yaparsa döngüden çık
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyin.");
            }
        }

        // Scanner kapatılır
        input.close();
    }
}
