public class Ogrenci {
    private String isim;
    private String soyisim;
    private int okulNo;
    private int dogumYili;
//getter ve setter yazalım
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) { //isim ve soyisim değerlerinin boş değer girilmesini istemiyoruz
        if(isim.isEmpty()){
            System.out.println("Lutfen öğrenci adını giriniz");
        }else{
            this.isim = isim;
        }
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        if(soyisim.isEmpty()){
            System.out.println("Lütfen öğrenci soyadını giriniz");
        }else{
            this.soyisim = soyisim;
        }
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) { //okul numarası 1000 den büyük olmasını istiyoruz.
        if(okulNo > 1000){
            this.okulNo = okulNo;
        }else{
            System.out.println("Lütfen okul no'yu 1000'den büyük değer giriniz");
        }
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) { //dogum yili da 1900 ile 2020 arası olsun
        if(dogumYili > 1900 && dogumYili < 2020){
            this.dogumYili = dogumYili;
        }else{
            System.out.println("Doğum yılını 1900 ile 2020 arasında bir değer giriniz");
        }
    }
}
