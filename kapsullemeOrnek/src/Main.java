import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        //şimdi nesnemizi oluşturduk özelliklere atama yapalım get ve set methodlarınnı kullanarak.
        Scanner input = new Scanner(System.in);

        System.out.print("Öğrenci adı: ");
        String ad = input.nextLine();

        System.out.print("Öğrenci soyadı: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci okul no: ");
        int no = input.nextInt();

        System.out.print("Öğrenci dogum yili: ");
        int dogumYili = input.nextInt();

        ogrenci.setIsim(ad);
        ogrenci.setSoyisim(soyad);
        ogrenci.setOkulNo(no);
        ogrenci.setDogumYili(dogumYili);



    }
}