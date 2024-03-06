import javax.xml.parsers.SAXParser;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean asalMi(int sayi){
        boolean asalMi = true;
        for(int i=2; i<sayi; i++){
            if(sayi%i == 0){
                asalMi = false;
                break;
            }
        }
        if(asalMi == true){
            System.out.println(sayi + " sayisi asaldir.");
        }else{
            System.out.println(sayi + " sayisi asal değildir.");

        }

        return asalMi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi1 = input.nextInt();

        asalMi(sayi1);
    }
}