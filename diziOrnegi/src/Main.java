import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sayilar = new int[10];
        int tumToplam = 0;
        int ilkSonToplam = 0;

        for(int i=0; i<10; i++){
            System.out.println("Sayi giriniz:");
            sayilar[i] = input.nextInt();
            tumToplam = tumToplam + sayilar[i];
        }

        ilkSonToplam = sayilar[0]+sayilar[9];

        double oran = ilkSonToplam / tumToplam;
        System.out.println("Dizi elemanları: ");
        for(int sayi:sayilar){
            System.out.println(sayi);
        }
        System.out.println("--------------------------------");
        System.out.println("dizinin toplamı: "+tumToplam);
        System.out.println("--------------------------------");
        System.out.println("ilk ve son değerlerin toplamı:"+ilkSonToplam);
        System.out.println("--------------------------------");
        System.out.println("ilk ve son değerlerin toplamının tüm sayıların toplamına oranı:"+oran);
    }
}