//Ad Soyad:Yusuf Tuğra Deveci
//Öğrenci No:250541095
//Tarih:09.11.2025
//Açıklama: Görev 3-E Sipariş Sepet Hesaplayıcı
//Bu Java programı, kullanıcıdan aldığı 3 ürünün fiyat ve adet bilgileri ile satış toplamlarını, ara toplamı, indirim tutarını, indirimli toplamı, KDV tutarını ve genel toplamı hesaplayan bir sepet hesaplama uygulamasıdır.
//Program, kullanıcıdan her ürün için fiyat ve adetleri alır, ardından girilen indirim oranına göre indirim tutarını hesaplar ve ara toplamdan düşerek indirimli toplamı bulur.
//Daha sonra sabit KDV oranı (VAT_RATE) üzerinden KDV tutarını hesaplar ve sabit kargo ücreti (SHIPPING_FEE) ile birlikte genel toplamı ekrana yazdırır.
//Tüm hesaplamalar metotlar aracılığıyla modüler bir şekilde yapılır ve sonuçlar printf kullanılarak 2 ondalık basamakla biçimlendirilmiş olarak kullanıcıya sunulur.
//Program, kullanıcı dostu yapısı sayesinde farklı ürün fiyatları ve indirim oranları ile kolayca kullanılabilir.

import java.util.Scanner;
public class sepetHesaplama {
public static final double VAT_RATE = 0.18;
public static final double SHIPPINF_FEE =29.99;
public static double hesaplaSatisToplam1(double fiyat1,double adet1){
    return fiyat1*adet1;
}
public static double hesaplaSatisToplam2(double fiyat2,double adet2){
    return fiyat2*adet2;
}
public static double hesaplaSatisToplam3(double fiyat3,double adet3){
    return fiyat3*adet3;
}
public static double ürünToplami(double satisToplam1, double satisToplam2, double satisToplam3 ){
    return satisToplam1+satisToplam2+satisToplam3;
}
public static double indirimTutari(double araToplam,double indirimOrani){
    return araToplam*indirimOrani/100;
}
public static double hesaplaindirimliToplam(double araToplam,double indirimTutari){
    return araToplam-indirimTutari;
}
public static double hesaplaKdv(double indirimToplami){
    return indirimToplami*VAT_RATE;
}
public static double hesaplaGenelToplam(double indirimTutari, double kdvTutari){
    return indirimTutari+kdvTutari+SHIPPINF_FEE;
}
//Satış Toplamı
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("1. ürünün fiyatını giriniz:");
 double fiyat1 = input.nextDouble();
 System.out.println("1.ürünün adetini giriniz:");
 int adet1 = input.nextInt();
 System.out.println("2.ürünün fiyatını giriniz:");
 double fiyat2 = input.nextDouble();
 System.out.println("2.ürünün adetini giriniz:");
 int adet2 = input.nextInt();
 System.out.println("3.ürünün fiyatını giriniz:");
 double fiyat3 = input.nextDouble();
 System.out.println("3.ürünün adetini giriniz:");
 int adet3 = input.nextInt();
 double satisToplam1 = hesaplaSatisToplam1(fiyat1,adet1);
 System.out.printf("1.ürünün satış toplamı: %.2f%n",satisToplam1);
 double satisToplam2 = hesaplaSatisToplam2(fiyat2,adet2);
 System.out.printf("2.ürünün satış toplamı:%.2f%n",satisToplam2);
 double satisToplam3 = hesaplaSatisToplam3(fiyat3,adet3);
 System.out.printf("3.ürünün satış toplamı:%.2f%n",satisToplam3);

//Ara Toplam
 double araToplam= ürünToplami(satisToplam1,satisToplam2,satisToplam3);
 System.out.printf("3 ürünün toplamı:%.2f%n",araToplam);
// İndirim Tutari
System.out.println("İndirim oranını giriniz (% olarak): ");
double indirimOrani = input.nextDouble();
double indirimTutar=indirimTutari(araToplam,indirimOrani);
System.out.printf("İndirim Tutarı=%.2f%n",indirimTutar);
//İndirimli Ara Toplam
double indirimToplami=hesaplaindirimliToplam(araToplam,indirimTutar);
System.out.printf("İndirimli Toplam=%.2f%n",indirimToplami);
//KDV Tutarı
 double kdvTutari=hesaplaKdv(indirimToplami);
 System.out.printf("KDV Tutarı:%.2f%n",kdvTutari);
//Genel Toplam
double genelToplam=hesaplaGenelToplam(indirimToplami,kdvTutari);
System.out.printf("Genel Toplam:%.2f%n",genelToplam);



}
}


//ÇIKTILAR:
//1. ürünün fiyatını giriniz:
//120,50
//1.ürünün adetini giriniz:
//2
//2.ürünün fiyatını giriniz:
//75,00
//2.ürünün adetini giriniz:
//3
//3.ürünün fiyatını giriniz:
//50,00
//3.ürünün adetini giriniz:
//1
//1.ürünün satış toplamı: 241,00
//2.ürünün satış toplamı:225,00
//3.ürünün satış toplamı:50,00
//3 ürünün toplamı:516,00
//İndirim oranını giriniz (% olarak): 
//10,00
//İndirim Tutarı=51,60
//İndirimli Toplam=464,40
//KDV Tutarı:83,59
//Genel Toplam:577,98

//Process finished with exit code 0
