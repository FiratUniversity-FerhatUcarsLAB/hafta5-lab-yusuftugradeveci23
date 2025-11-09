//Ad Soyad:Yusuf Tuğra Deveci
//Öğrenci No:250541095
//Tarih:09.11.2025
//Açıklama: Görev-2 Fizik Formülü Asistanı
//Bu Java programı, kullanıcıdan aldığı değerlerle temel fizik hesaplamalarını gerçekleştiren bir uygulamadır.
//Program, hız (v = s / t), ivme (a = (v_final - v_initial) / t), kuvvet (F = m * a), iş (W = F * d), güç (P = W / t), kinetik enerji (KE = 1/2 * m * v^2), potansiyel enerji (PE = m * g * h) ve momentum (p = m * v) hesaplamalarını yapar.
//Kullanıcı, tüm gerekli değerleri Scanner aracılığıyla girer ve program, girdilere göre ilgili büyüklüğü hesaplayıp printf ile biçimlendirilmiş sonuçları ekrana yazar.
//Yerçekimi sabiti GRAVITY = 9.8 m/s² olarak alınmış olup, tüm girişler double tipindedir ve çıktılar 2 ondalık basamak ile gösterilmektedir.
//Program, fonksiyonlar aracılığıyla modüler bir yapıya sahiptir ve yeni fiziksel büyüklükler kolayca eklenebilir.

import java.util.Scanner;
public class fizikHesaplama {

    public static final double GRAVITY = 9.8;
    public static double speed (double s, double t){
        return s/t;
    }
    public static double acceleration (double vfinally,double vfirst,double timeOne){
        return vfinally-vfirst/timeOne;
    }
    public static double force (double mass,double accelaration){
        return mass*accelaration;
    }
    public static double work (double force,double distance){
        return distance*force;
    }
    public static double power (double work,double time){
        return work/time;
    }
    public static double kineticEnergy (double massTwo,double speed){
        return 1/2*massTwo*Math.pow(speed,2);
    }
    public static double potantialEnergy (double massThree,double GRAVITY,double height){
        return massThree*GRAVITY*height;
    }
    public static double momentum (double massFour,double sppedTwo){
        return massFour*sppedTwo;
    }
    //Hız için
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Yolu(metre) giriniz:");
    double s =input.nextDouble();
    System.out.println("Zamanı(saniye) giriniz:");
    double t = input.nextDouble();
    double hız = speed(s,t);
    System.out.printf("Sonuç:%.2fm/s%n",hız);
   // İvme için
    System.out.println("Son hızı giriniz(m/s):");
    double vfinally = input.nextDouble();
    System.out.println("İlk hızı giriniz;");
    double vfirst = input.nextDouble();
    System.out.println("Zamanı giriniz:");
    double timeOne = input.nextDouble();5,0
    double ivme = acceleration(vfinally,vfirst,t);
    System.out.printf("Sonuç:%.2fm/s^2%n",ivme);
    //Kuvvet için
    System.out.println("Kütleyi giriniz:");
    double mass = input.nextDouble();
    System.out.println("İvmeyi giriniz:");
    double accelaration = input.nextDouble();
    double kuvvet = force (mass,accelaration);
    System.out.printf("Sonuç:%.2fN%n",kuvvet);
    //İş için
    System.out.println("Kuvveti giriniz:");
    double force = input.nextDouble();
    System.out.println("Uzaklığı giriniz:");
    double distance = input.nextDouble();
    double is= work(force,distance);
    System.out.printf("%.2fN.m%n",is);
    //Güç için
    System.out.println("Yapılan işi giriniz:");
    double work = input.nextDouble();
    System.out.println("Zamanı giriniz:");
    double time = input.nextDouble();
    double guc= power(work,time);
    System.out.printf("Sonuç:%.2fWatt%n",guc);
    //Kinetik Enerji için
     System.out.println("Kütleyi giriniz:");
     double massTwo =input.nextDouble();
     System.out.println("Hızı giriniz:");
     double speed=input.nextDouble();
     double kinetikEnerji=kineticEnergy(mass,speed);
     System.out.printf("Sonuç:%.2fJ%n",kinetikEnerji);
     //Potansiyel Enerji için
        System.out.println("Kütleyi giriniz:");
        double massThree = input.nextDouble();
        System.out.println("Yüksekliği giriniz:");
        double height = input.nextDouble();
        System.out.printf("Sonuç:%.2fj%n",height);
        //Momentum için
       System.out.println("Kütleyi giriniz:");
       double massFour = input.nextDouble();
       System.out.println("Hızı giriniz:");
       double speedTwo = input.nextDouble();
       double momentum=momentum(massFour,speedTwo);
       System.out.printf("%.2fkg.m/s%n",momentum);







    }
}


//ÇIKTILAR:
//Yolu(metre) giriniz:
//100,0
//Zamanı(saniye) giriniz:
//10,0
//Sonuç:10,00m/s
//Son hızı giriniz(m/s):
//20,0
//İlk hızı giriniz;
//0,0
//Zamanı giriniz:
//5,0
//Sonuç:20,00m/s^2
//Kütleyi giriniz:
//50,0
//İvmeyi giriniz:
//10,0
//Sonuç:500,00N
//Kuvveti giriniz:
//50,0
//Uzaklığı giriniz:
//20,0
//1000,00N.m
//Yapılan işi giriniz:
//1000,0
//Zamanı giriniz:
//50,0
//Sonuç:20,00Watt
//Kütleyi giriniz:
//50,0
//Hızı giriniz:
//20,0
//Sonuç:0,00J
//Kütleyi giriniz:
//50,0
//Yüksekliği giriniz:
//10,0
//Sonuç:10,00j
//Kütleyi giriniz:
//50,0
//Hızı giriniz:
//20,0
//1000,00kg.m/s

//Process finished with exit code 0
