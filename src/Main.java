import java.util.Scanner;

public class Main {

    static void plus(){
        Scanner input = new Scanner(System.in);
        int result = 0;
        while(true){
            System.out.print("Sayınızı giriniz : ");
            int number = input.nextInt();
            if(number == 0){
                break;
            }
            result += number;
            System.out.println("Toplam : " + result);
        }
        System.out.println("Toplam : " + result);
    }

    static void minus(){
        Scanner input = new Scanner(System.in);
        int result = 0, counter = 0;
        while(true){
            System.out.print("Kaç sayı gireceksiniz : ");
            counter = input.nextInt();
            for(int i = 1; i <= counter; i++){
                System.out.print(i + ". sayınız : ");
                int number = input.nextInt();
                if(i == 1){
                    result += number;
                    continue;
                }
                result -= number;
            }
            System.out.println("Fark : " + result);
            break;
        }
    }

    static void times(){
        Scanner input = new Scanner(System.in);
        int result = 1, i=1;
        System.out.println("İşlem sonucunu görmek için 1'i tuşlayın!");
        while(true){
            System.out.print(i++ + ".sayı : ");
            int number = input.nextInt();

            if(number == 1){
                break;
            }
            if(number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Çarpım : " + result);
    }

    static void divide(){
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz : ");
        int counter = input.nextInt();
        for(int i = 1; i <= counter; i++){
            System.out.print(i + ". sayınız : " );
            int number = input.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
            if(number == 0){
                System.out.println("Bölen sıfır olamaz!");
                continue;
            }
            result /= number;
        }
        System.out.println("Bölüm sonucu : " + result);
    }

    static void power(){
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("Hangi sayının üssünü almak istersiniz : ");
        int number = input.nextInt();
        System.out.print("Kaçıncı dereceden üs alacaksınız : ");
        int us = input.nextInt();

        if(number == 0){
            result = 0;
        }
        for(int i=1; i <= us; i++){
            if(us == 0){
                result = 1;
            }
            result *= number;
        }
        System.out.println(number + " sayısının " + us +" dereceden üssü : " + result);
    }

    static void factoriel(){
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("Hangi sayının faktöriyelini almak istersiniz : ");
        int number = input.nextInt();
        int temp = number;
        if(number == 0){
            result = 0;
        }
        for(int i= 1; i <= number; i++){
            result *= temp;
            temp--;
        }
        System.out.println(number + " sayısının faktöriyeli : " + result);
    }

    static void mod(){
        Scanner input = new Scanner(System.in);
        String result = "";
        System.out.print("Sayınızı giriniz : ");
        int number = input.nextInt();

        if(number % 2 == 0){
            result = "Sayınız çift sayıdır";
        }else{
            result = "Sayınız tektir.";
        }
        System.out.println(result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);

        System.out.print("Dikdörtgenin ilk kenar değerini giriniz : ");
        int number1 = input.nextInt();

        System.out.print("Dikdörtgenin ikinci kenar değerini giriniz :");
        int number2 = input.nextInt();

        int area = number1 * number2;
        System.out.println(number1 + " ve " + number2 + " değerli dikdörtgenin alanı " + area);

        int perimeter = 2*(number1 + number2);
        System.out.println(number1 + " ve " + number2 + " değerli dikdörtgenin çevresi " + perimeter);
    }

    public static void main(String[] args) {
        String menu = "1 - Toplama işlemi\n"
                + "2 - Çıkarma işlemi\n"
                + "3 - Çarpma işlemi\n"
                + "4 - Bölme işlemi\n"
                + "5 - Üslü sayı hesaplama\n"
                + "6 - Faktöriyel hesaplama\n"
                + "7 - Mod alma\n"
                + "8 - Dikdörtgen alan ve çevre hesabı\n"
                + "0 - Çıkış yap";

        System.out.println("==============================");
        System.out.println(menu);
        System.out.println("==============================");

        int select;
        Scanner scan = new Scanner(System.in);
        System.out.print("Hangi işlemi yapmak istiyorsunuz : ");
        select = scan.nextInt();

        do{
            switch(select){
                case 1:
                    plus();
                    break;
                case 2 :
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factoriel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz, tekrar deneyiniz!");
            }
        }while(select !=0);


    }
}
