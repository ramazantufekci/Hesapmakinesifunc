import java.awt.*;
import java.util.Scanner;

public class Main {

    static int sum(int a, int b){
        int result = a+b;
        System.out.println("Toplam : "+result);
        return result;
    }

    static int minus(int a, int b){
        int result = a-b;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int a, int b){
        int result = a*b;
        System.out.println("Çarpma : "+result);
        return result;
    }

    static int divided(int a,int b){
        int result = a/b;
        System.out.println("Bölüm : "+result);
        return result;
    }

    static int power(int a, int b){
        int result = 1;
        for (int i = 1;i<=b;i++){
            result *=a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a%b;
    }

    static void calc(int a, int b){
        System.out.println("Çevresi :" + (2*(a+b)));
        System.out.println("Alanı : "+ (a*b));
    }

    static void factorial(int a){
        int result = 1;
        for (int i = 1;i<=a;i++){
            result *=i;
        }
        System.out.println("Faktoriyel işlemi : "+result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int select;

        String menu = "1- Toplama İşlemi\n"
                +"2- Çıkarma İşlemi\n"
                +"3- Çarpma İşlemi\n"
                +"4- Bölme İşlemi\n"
                +"5- Üslü Sayı Hesaplama\n"
                +"6- Mod Alma\n"
                +"7- Dikdörtgen Alan ve Çevre Hesabı\n"
                +"8- Faktoriyel Hesaplama\n"
                +"0- Çıkış Yap";

        while(true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();
            int a=0,b = 0;
            if(select==0){
                break;
            }
            else if(select == 8){
                System.out.print("İlk Sayı : ");
                a = scan.nextInt();
            }else {
                System.out.print("İlk Sayı : ");
                 a = scan.nextInt();
                System.out.print("İkinci Sayı : ");
                b = scan.nextInt();
            }

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if(divided(a,b)==0){
                        System.out.println("İkinci sayı 0 dan farklı olmalı");
                    }
                    break;
                case 5:
                    System.out.println("Üs hesabı : "+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod işlemi : "+mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                case 8:
                    factorial(a);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz");
                    break;
            }
        }
        System.out.println("Güle Güle");
    }
}
