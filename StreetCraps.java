import java.util.Scanner; 
/** 
 * this program creates two dice and rolls them until a seven is landed 
 * @author khushipatel
 *
 */
public class StreetCraps {
	Die one; //data fields/IVs
	Die two;
	
	//constructor
	StreetCraps () {
		this.one = new Die();
		this.two = new Die();
	}//end constructor
	/**
	 * @param loops until 7 is landed (sum of both die)
	 */
	//Methods
	private void play() {
		//create two die 
		int diceOne = 0;
		int diceTwo = 0;
		int diceTotal = 0;
		//ask for a number 1-12
		System.out.println("Enter a number 2-12");  //asciiz "Enter a number 2-12"
		Scanner scan = new Scanner(System.in);
		int diceNum = scan.nextInt();
		//while loop condition if die = guess before 7
		boolean diceIsSeven = false;
		//while loop until sum = 7
		while(diceIsSeven != true) {
			diceOne = one.roll();
			System.out.println("Dice One: " + diceOne);
			diceTwo = two.roll();
			System.out.println("Dice Two: " + diceTwo);
			diceTotal = diceOne + diceTwo;
			//if die = guess then print that they win
			if (diceNum == diceTotal) {
				System.out.println("You won");
				diceIsSeven = true;
			}
			//if die != guess before 7 continue rolling
			else if (diceTotal == 7) {//otherwise print that they lost
				System.out.println("7 was rolled user loses");
				diceIsSeven = true;
			}
			diceTotal = 0;
		}
	}
	
	public static void main(String[] args) {
		StreetCraps playStreetCraps = new StreetCraps();
		playStreetCraps.play(); 
	}
}
