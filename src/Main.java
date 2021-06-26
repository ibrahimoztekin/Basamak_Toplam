import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number,totNumber=0;

        Scanner input =new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number=input.nextInt();

        while (number!=0){
            totNumber+=number % 10;
            number/=10;
        }

        System.out.println("Basamak Toplamı: "+totNumber);
    }
}
