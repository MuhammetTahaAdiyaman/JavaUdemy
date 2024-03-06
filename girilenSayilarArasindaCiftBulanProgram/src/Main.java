import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1.Sayiyi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("2.Sayiyi giriniz");
        int sayi2 = input.nextInt();

//        for(int i=sayi1; i<=sayi2; i++){
//            if(i%2==0){
//                System.out.println("Aralıkta bulunan çift sayılar: ");
//                System.out.println(i);
//            }
        int i = sayi1;
        if(sayi1 > sayi2){
            System.out.println("Lütfen 1.sayiyi küçük giriniz");
        }else{
            while(i<=sayi2){
                if(i%2==0){
                    System.out.println(i);

                }
                i++;
            }
        }
    }
}