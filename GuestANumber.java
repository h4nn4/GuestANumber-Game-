import java.util.Random;
import java.util.Scanner;

public class GuestANumber {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        int rdNum = rnd.nextInt(100) + 1;
        int guess=0, n=0;
        //System.out.println("");
        System.out.println(") Key in your guess : ");
        
        while(guess!=rdNum){
            guess=scan.nextInt();
            if(guess <rdNum){
                System.out.println("Try Higher!");
            }else if(guess>rdNum){
                System.out.println("Try Lower!");
            }
            n++;
        }
        System.out.println("You Got it in " +n +" trials");
    }

}
