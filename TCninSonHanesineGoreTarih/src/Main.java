//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String tc = "12345678902";
        char sonKarakter = tc.charAt(tc.length()-1);
        switch(sonKarakter){
            case '0':
                System.out.println("01.01.2024");
                break;
            case '2':
                System.out.println("02.01.2024");
                break;
            case '4':
                System.out.println("03.01.2024");
                break;
            case '6':
                System.out.println("04.01.2024");
                break;
            case '8':
                System.out.println("05.01.2024");
                break;
            default:
                System.out.println("Bir hata oluştu");
                break;
        }
    }
}