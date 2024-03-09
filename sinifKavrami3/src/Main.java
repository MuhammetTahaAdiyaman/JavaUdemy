import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Insan Ali = new Insan();
        Ali.boy = 180;
        Ali.cinsiyet = "erkek";
        Ali.gozRengi = "Kahverengi";
        Ali.kilo = 85;
        Ali.sacRengi = "Siyah";

        System.out.println(Ali.boy);

        Ali.yemekYe("makarna");
        Ali.uyu();
        Ali.kos();
        Scanner input = new Scanner(System.in);
        Insan Buse = new Insan();
        System.out.println("Busenin boyu kaçtır?");
        Buse.boy = input.nextInt();
        Buse.kilo = 60;
        Buse.cinsiyet = "Kadın";
        Buse.gozRengi = "Yeşil";
        Buse.sacRengi = "Sarı";

        Buse.uyu();
        Buse.kos();
        Buse.yemekYe("mantı");
    }
}