import java.util.*;

public class blackjack {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Alex's blackjack program!");
		System.out.println("you and the dealer will be given two cards,\n the player with the score closest to 21 will win\n but if you get over 21 you automatically lose.");
		System.out.print("type begin to start: ");
		String ans = scan.next();
		if(ans.equals("begin"))
			game();
	}
	
	
	public static void game(){
		int dealertot=0;
		int usertot=0;
		Scanner scan = new Scanner(System.in);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10)+2;
		int randomInt1 = randomGenerator.nextInt(10)+2;
		int randomuser = randomGenerator.nextInt(10)+2;
		int randomuser1 = randomGenerator.nextInt(10)+2;
		usertot+=randomuser1+randomuser;
		dealertot+=randomInt+randomInt1;
		System.out.println("your total is "+ usertot+"\n");
		System.out.println("the dealer has a "+ randomInt+" showing, and a hidden card");
		System.out.println("his total is also hidden\n");
		int counter=0;
		while(usertot<=21){
			System.out.println("would you like to hit or stay?");
			String ans = scan.nextLine();
			if(ans.equals("hit")){
				randomInt = randomGenerator.nextInt(10)+2;
				usertot+=randomInt;
				System.out.println("you drew a "+ randomInt);
				System.out.println("your total is "+usertot);
				continue;
			}
			if(ans.equals("stay")){
				System.out.println("dealers turn");
				System.out.println("his hidden card was "+ randomInt1);
				System.out.println("his total was "+dealertot);
				while(dealertot<16){
					System.out.println("Dealer chooses to hit");
					randomInt1 = randomGenerator.nextInt(10)+2;
					System.out.println("he draws a " +randomInt1);
					dealertot+=randomInt1;
					System.out.println("his total is "+dealertot);
				}
				if(dealertot>=usertot&&dealertot<=21){
					System.out.println("Sorry you lose");
					counter++;
					break;
					
				}else{
					System.out.println("you win!");
					counter++;
					break;
					
				}
			}
		}
		if(counter==0)
			System.out.println("you went over 21, sorry you lose");
	}
	
}
