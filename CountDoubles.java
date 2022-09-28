import java.util.Scanner; 
/**
 * counts the number of double die for a given amount of times rolled by user
 * @author khushipatel
 *
 */
public class CountDoubles { //class declaration
	Die one; //data fields/IVs
	Die two;
	
	//constructor
	CountDoubles () {
		this.one = new Die();
		this.two = new Die();
	}//end constructor
	/** 
	 * @param play asks for user to select amount of times to roll the die 
	 * then count how many doubles are landed during the number of iterations 
	 */
	//Methods:
	public void play() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please guess the amount of times the dice will be rolled.");
			int numTimesRoll = scan.nextInt();
			//looking to return numTimesRoll
			//lines above should ask the user for a guess amount of times dice rolled and returned
		System.out.print("Please enter the amount of doubles will be rolled.");
			int userDouble = scan.nextInt();
			int countDouble = 0; //need a count variable to say that x doubles were rolled
			int count1 = 0;
			int count2 = 0;
		for (int i = 0; i < numTimesRoll; i++) {//loop through each roll and count the amount of doubles
			count1 = one.roll();
			count2 = two.roll();
			if (count1 == count2) {
				countDouble += 1;
			}
		}
			//print message with user specified amount and message about if doubles was rolled 
			System.out.println(countDouble + " doubles were rolled.");
		
	}
	
	public static void main(String[] args) {
		CountDoubles playDouble = new CountDoubles();
		playDouble.play();
	
	}

}
