import java.util.Random;
/** 
 * creating a die that can output a random number 1-6 when it it called/rolled
 * @author khushipatel
 *
 */
public class Die {
	//declared class and instance variable
	private Random dice;
	//constructor 
	public Die() {
		this.dice = new Random();
	}
	//roll method
	public int roll() {
		//random number between 1-6 will roll
		int result = dice.nextInt(6) + 1;
		return result;
	}

}



