import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void buyukSayi(int sayi1, int sayi2){
        if(sayi1 > sayi2){
            System.out.println("Büyük sayi: "+sayi1);
        }else{
            System.out.println("Büyük sayi: "+ sayi2);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1 = input.nextInt();

        System.out.println("İkinci sayiyi giriniz: ");
        int sayi2 = input.nextInt();

        buyukSayi(sayi1,sayi2);
    }
}