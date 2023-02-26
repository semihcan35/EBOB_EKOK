import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,ebob=1,ekok=1;


        System.out.println("İlk sayıyı giriniz:");
        num1=input.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        num2= input.nextInt();

        if(num1<num2){
        for(int i=1 ; i<=num1 ; i++){
            if(num1%i==0 && num2%i==0){
                ebob=i;
            }
        }
        }else if(num2<num1){
            for(int i=1 ; i<=num2 ; i++){
                if(num1%i==0 && num2%i==0){
                    ebob=i;
                }
            }
        }

        ekok = (num1*num2)/ebob;
        System.out.println("EBOB= "+ ebob);
        System.out.println("EKOK= "+ ekok);

    }
}