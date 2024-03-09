public class Ogrenci {
    private String isim;
    private String soyisim;
    private int okulNo;
    private int dogumYili;

    //yapıcı metotlar nedir ?
    //nesnenin oluşum sırasında çalışacak işlev parçası
    //oluşturulduğu anda çalışır ve biter peki nasıl tanımlanır ?
    //get ve set metod üstüne yazılır ve önemli nokta class ile aynı isimde olması gerekmektedir.
//    public Ogrenci(){
//        //metot çalıştığı anda varsayılan değerlerin atamasını gerçekleştirelim.
//        this.isim = "Girilmedi";
//        this.soyisim = "Girilmedi";
//        this.okulNo = 0000;
//        this.dogumYili = 2000;
//    }

    //parametreli constructor ise nesnemi oluştururken belirli parametre istemesi
    //nesneyi oluşturabilmem için bana ilgili paremetreleri girmem şartı var yoksa oluşturmam
    //parametreli constructor sayesinde nesne oluşturken ilk değer atamasını gerçekleştirebiliriz.
    public Ogrenci(String isim, String soyisim, int okulNo, int dogumYili){
        this.isim = isim;
        this.soyisim = soyisim;
        this.okulNo = okulNo;
        this.dogumYili = dogumYili;
        System.out.println("Değerler aktarıldı");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }


}
