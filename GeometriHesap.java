//Ad Soyad:Yusuf Tuğra Deveci
//Öğrenci No:250541095
//Tarih:09.11.2025
//Açıklama:Görev 1-Geometrik Şekil Hesaplayıcı
//Bu Java programı, kullanıcıdan aldığı ölçülerle kare, dikdörtgen, daire ve üçgen gibi temel geometrik şekillerin alan ve çevrelerini hesaplayan bir uygulamadır.
//Program, her şekil için gerekli değerleri (double tipinde) kullanıcıdan alır; örneğin kare için bir kenar, dikdörtgen için genişlik ve yükseklik, daire için yarıçap, üçgen için taban ve diğer iki kenar uzunlukları girilir.
//Daha sonra program, her şeklin alanını ve çevresini ilgili metodlar aracılığıyla hesaplayıp printf ile biçimlendirilmiş şekilde ekrana yazdırır
//Modüler yapısı sayesinde yeni geometrik şekiller veya farklı hesaplamalar kolayca eklenebilir ve program kullanıcıya anlaşılır sonuçlar sunar.


import java.util.Scanner;

public class formuller {

    public static double calculateSquareArea(double side){
        return side * side;
    }

    public static double calculateSquarePerimeter(double side){
        return 4 * side;
    }

    public static double calculateRectangleArea(double width, double height){
        return width * height;
    }

    public static double calculateRectanglePerimeter(double width, double height){
        return 2 * (width + height);
    }

    public static double calculateCircleArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double calculateCirclePerimeter(double radius){
        return 2 * Math.PI * radius;
    }

    public static double calculateTriangleArea(double height, double base){
        return height * base / 2;
    }

    public static double calculateTrianglePerimeter(double A , double B , double base){
        return A + B + base;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kare
        System.out.print("Karenin bir kenarını giriniz: ");
        double side = input.nextDouble();
        double squareArea = calculateSquareArea(side);
        double squarePerimeter = calculateSquarePerimeter(side);
        System.out.printf("Karenin Alanı = %.2f%n", squareArea);
        System.out.printf("Karenin Çevresi = %.2f%n", squarePerimeter);

        // Dikdörtgen
        System.out.print("Dikdörtgenin genişliğini giriniz: ");
        double width = input.nextDouble();
        System.out.print("Dikdörtgenin yüksekliğini giriniz: ");
        double height = input.nextDouble();
        double rectangleArea = calculateRectangleArea(width, height);
        double rectanglePerimeter = calculateRectanglePerimeter(width, height);
        System.out.printf("Dikdörtgenin Alanı = %.2f%n", rectangleArea);
        System.out.printf("Dikdörtgenin Çevresi = %.2f%n", rectanglePerimeter);

        // Daire
        System.out.print("Dairenin yarıçapını giriniz: ");
        double radius = input.nextDouble();
        double circleArea = calculateCircleArea(radius);
        double circlePerimeter = calculateCirclePerimeter(radius);
        System.out.printf("Dairenin Alanı = %.2f%n", circleArea);
        System.out.printf("Dairenin Çevresi = %.2f%n", circlePerimeter);

        // Üçgen
        System.out.print("Üçgenin yüksekliğini giriniz: ");
        double triangleHeight = input.nextDouble();
        System.out.print("Üçgenin tabanını giriniz: ");
        double base = input.nextDouble();
        double triangleArea = calculateTriangleArea(triangleHeight, base);
        System.out.printf("Üçgenin Alanı = %.2f%n", triangleArea);

        System.out.print("Üçgenin diğer kenar uzunluklarını giriniz (A ve B): ");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double trianglePerimeter = calculateTrianglePerimeter(A, B, base);
        System.out.printf("Üçgenin Çevresi = %.2f%n", trianglePerimeter);
    }
}


//ÇIKTILAR:
//Karenin bir kenarını giriniz: 5,0
//Karenin Alanı = 25,00
//Karenin Çevresi = 20,00
//Dikdörtgenin genişliğini giriniz: 4,0
//Dikdörtgenin yüksekliğini giriniz: 6,0
//Dikdörtgenin Alanı = 24,00
//Dikdörtgenin Çevresi = 20,00
//Dairenin yarıçapını giriniz: 3,0
//Dairenin Alanı = 28,27
//Dairenin Çevresi = 18,85
//Üçgenin yüksekliğini giriniz: 5,0
//Üçgenin tabanını giriniz: 10,0
//Üçgenin Alanı = 25,00
//Üçgenin diğer kenar uzunluklarını giriniz (A ve B): 6,0
//8,0
//Üçgenin Çevresi = 24,00

//Process finished with exit code 0
