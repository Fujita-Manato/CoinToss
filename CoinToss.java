import java.util.Random;
import java.util.Scanner;
class CoinToss{
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int count1=0;
        int count2=0;
        System.out.println("Who are you?");
        String name = sc.next();
        System.out.println("Hello, "+name+"!");
        System.out.println("Tossing a coin...");
        for(int i=0;i<3;i++) {
            if(rand.nextInt(2)==0) {
                System.out.println("Round "+i+": Heads");
                count1++;
            }
            else{
                System.out.println("Round "+i+": Tails");
                count2++;
            }
            
        }
        System.out.println("Heads: "+count1+", Tails: "+count2);
       /* if(count1>count2) {
            System.out.println("You won");
        }
        else {
            System.out.println("You lost");
        }*/
    }
}