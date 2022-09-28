import java.util.Scanner; 
import java.util.Random;
/** 
 * This program asks user for a number and compares to a 
 * randomly generated number that then decides if the user guessed
 * correctly or not; if not it tells the user to go either higher or lower
 * @author khushipatel
 *
 */
public class HighLow { //instance values
	private Random guess;
	//constructor
	public HighLow() {
		this.guess = new Random();
	}//end constructor
	
	/**
	 * @param method that asks user for a number and loops until the user guesses
	 * correctly or quits 
	 */
	
	//Method
	public void play() {
		Scanner scan = new Scanner(System.in);
		
		boolean matchingNum = false;
		while (matchingNum != true) {
			System.out.println("Enter a number 1-1000; enter 0 to exit"); //ask for random number 1-1000
			int userNum = scan.nextInt();
			if (userNum != 0) {//0 to exit(if else) prints message
				if (userNum < randomNum()) {
					System.out.println("Your number is too low");//return to user keep guessing
				}
				else if (userNum > randomNum()){
					System.out.println("Your number is too high");//return to user keep guessing
				}
				else {
					matchingNum = true;
					System.out.println("The random number is: " + randomNum()); //return generated number
					System.out.println("You win");
				}
			}
			else {//exit the loop and return random number
				matchingNum = true;
				System.out.println("You have left the game. The random number is " + randomNum());
			}
		}
			
		
	}
	/**
	 * generate a random number w/o telling the user
	 * @return
	 */
	private int randomNum() {
		int result = guess.nextInt(1000) + 1;
		return result;
	}
	
	public static void main(String[] args) {
		//HighLow object 
		HighLow number = new HighLow();
		number.play();
	}
	
	
}
