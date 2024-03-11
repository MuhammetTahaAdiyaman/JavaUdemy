//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //heap ve stack adında 2 alan var. primitive int vs. olanlar stack alanında tutulur ancak class ve diziler new dediğimiz anda heap alanında referanslanır.
        //bir örnek yapalım.
        Insan insan1 = new Insan(); //heap alanında insan1 alanı referanslandı
        Insan insan2 = insan1; //insan2'de insan1in tutulduğu yere referanslansın diyooruz
        insan1.name = "Taha"; //insan1 in ismini taha yaptım
        System.out.println(insan2.name); //insan2 nin ismini çağırınca Taha geldi işte biz insan2 heap alanında insan1 alanına eşitledik ya orada tutulan değeri bize getirmektedir.

    }
}