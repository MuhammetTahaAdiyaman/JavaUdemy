//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(Math.abs(-47)); //mutlak değer almak için kullanırız
        System.out.println(Math.sqrt(16)); //bir sayının karakökünü almak için kullanırız
        System.out.println(Math.pow(2,3)); //iki parametre alır ve üs almak için kullanırız

        //hangi sayının büyük olduğunu bulmak için;
        System.out.println(Math.max(70,10));
        //hangi sayının küçük olduğunu bulmak için
        System.out.println(Math.min(70,10));

        //ondalıklı sayıyı bir üstteki sayıya yuvarlamak için;
        System.out.println(Math.ceil(4.3));

        //alt sayıya yuvarlamak için de
        System.out.println(Math.floor(3.8));

        //normal yuvarlama işlemi için
        System.out.println(Math.round(2.6));

        //rastgele 0 ile 1 arasındaki sayı oluşturmak için
        System.out.println(Math.random());
    }
}