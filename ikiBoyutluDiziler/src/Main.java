//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //iki boyutlu diziler matrise benzer diyebiliriz
        //tablo gibi verileri gruplamamızı sağlıyor.

        //int[][] dizi =  new int[satır][sütun];

//        int[][] dizi = new int[3][3];
//
//        dizi[0][0] = 5;
//        dizi[0][1] = 6;
//        dizi[0][2] = 3;
//        dizi[1][0] = 4;
//        dizi[1][1] = 5;
//        dizi[1][2] = 23;
//        dizi[2][0] = 34;
//        dizi[2][1] = 56;
//        dizi[2][2] = 76;

        //bu şekilde tanımlamak yerine şu şekilde de tanımlayabiliriz.

        int[][] dizi = {{5,6,3},{4,5,23},{34,56,76}};

        //süslü parantezler satırları temsil ederken içindeki elemanlar sütunları temsil etmektedir.
        //iki boyutlu dizilerde tüm elemnalarına ulaşmak istersek eğer;
        for(int i=0; i<dizi.length;i++){
            for(int j=0; j<dizi[i].length; j++){
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }




    }
}