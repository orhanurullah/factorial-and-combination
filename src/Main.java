import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyel Hesaplama Programı : ");
        System.out.print("Bir Sayı Girin : ");
        int num = scanner.nextInt();
        Main main = new Main();
        int factoriyel = main.factorial(num);
        System.out.println(factoriyel);

        /**
         * Kombinasyon Hesaplama
         */

        main.kombinasyon();
    }

    public int factorial(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
    public void kombinasyon(){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Kombinasyon Hesaplama Programı");
        int n, r;
        System.out.print("Kümenin Eleman Sayısını Girin : ");
        n = scanner.nextInt();
        System.out.print("Kaç Elemanlı Grup Oluşturulacak : ");
        r = scanner.nextInt();

        int result = factorial(n) / (factorial(r) * factorial(n-r));

        System.out.println("Girdiğiniz " + n + " elemanlı kümenin "
                + r + " elemanlı farklı grupların sayısı\n => " + result);
    }
}
