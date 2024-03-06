import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi, ciftToplam=0, tekToplam = 0;

        for(int i=1; i<=10; i++){
            System.out.print(i+".sayiyi giriniz:");
            sayi = input.nextInt();

            if(sayi %2 == 0){
                ciftToplam += sayi;
            }else if(sayi % 2 == 1){
                tekToplam += sayi;
            }
        }

        System.out.println("Çift sayilar toplami:"+ciftToplam);
        System.out.println("Tek sayilar toplami:"+tekToplam);

    }
}