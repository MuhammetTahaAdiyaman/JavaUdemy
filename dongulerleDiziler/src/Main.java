//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = {12,6,4,47,124};

        for(int i=0; i<sayilar.length; i++){
            System.out.println(sayilar[i]);
        }

        System.out.println("----------------------------");
        //bir de diziler için özel oluşturulmuş döngü çeşidimiz var foreach adında

        for (int sayi : sayilar){
            System.out.println(sayi);
        }
    }
}