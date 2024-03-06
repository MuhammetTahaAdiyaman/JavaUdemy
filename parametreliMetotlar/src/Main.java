import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void ortalamaAl(int sayi1, int sayi2){
        int toplam;
        toplam = sayi1+sayi2;
        double ortalama = toplam /2;
        System.out.println("ortalama: "+ortalama);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1.sayiyi giriniz: ");
        int sayi1 = input.nextInt();

        System.out.println("2.sayiyi giriniz:");
        int sayi2 = input.nextInt();

        ortalamaAl(sayi1,sayi2);
    }
}