import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi,toplam=0;
        while(true){

            System.out.println("Sayi giriniz: ");
            sayi = input.nextInt();
            if(sayi == 0){
                break;
            }
            toplam += sayi;
        }

        /*
            do{
                System.out.println("Sayi giriniz: ");
                sayi = input.nextInt();
                toplam = toplam + sayi
            }while(sayi!=0)
                System.out.println("toplam:"+toplam)
         */


        System.out.println("Toplam: "+toplam);
    }
}