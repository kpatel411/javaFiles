import java.util.Scanner;
import java.util.Random;
/** 
 * the second slot machine is to ask the user if they want to play again
 * after running at least one attempt of the game
 * until the user enters no
 * every attempt returns that results of that attempt and 
 * the entire game when the user exits the game 
 * @author khushipatel
 *
 */
public class SlotMachineTwo {
		private Random generator;
		private int wheel1;
		private int wheel2;
		private int wheel3;
		private int wheel4;
		private int coins;
		private int totalCoins;
		
		public SlotMachineTwo() {
			generator = new Random();
			wheel1 = generator.nextInt(5) + 0;
			wheel2 = generator.nextInt(5) + 0;
			wheel3 = generator.nextInt(5) + 0;
			wheel4 = generator.nextInt(5) + 0;
			this.coins = 0;
			this.totalCoins = 0;
		}
		/**
		 * create a method slot machine that generates random output for every wheel
		 * @param floowing methods create string name for every wheel
		 */
		//Methods
		public String wheel1Names() { //assign each wheel with numbers and names
			String name;
			if (this.wheel1 == 0) {
				name = "Mushroom";
			}
			else if (this.wheel1 == 1) {
				name = "Acorn";
			}
			else if (this.wheel1 == 2) {
				name = "Fire Flower";
			}
			else if (this.wheel1 == 3) {
				name = "Ice Flower";
			}
			else {
				name = "Leaf";
			}
			return name;
		}
		
		public String wheel2Names() { //assign each wheel with numbers and names
			String name;
			if (this.wheel2 == 0) {
				name = "Mushroom";
			}
			else if (this.wheel2 == 1) {
				name = "Acorn";
			}
			else if (this.wheel2 == 2) {
				name = "Fire Flower";
			}
			else if (this.wheel2 == 3) {
				name = "Ice Flower";
			}
			else {
				name = "Leaf";
			}
			return name;
		}
		public String wheel3Names() { //assign each wheel with numbers and names
			String name;
			if (this.wheel3 == 0) {
				name = "Mushroom";
			}
			else if (this.wheel3 == 1) {
				name = "Acorn";
			}
			else if (this.wheel3 == 2) {
				name = "Fire Flower";
			}
			else if (this.wheel3 == 3) {
				name = "Ice Flower";
			}
			else {
				name = "Leaf";
			}
			return name;
		}
		
		public String wheel4Names() { //assign each wheel with numbers and names
			String name;
			if (this.wheel4 == 0) {
				name = "Mushroom";
			}
			else if (this.wheel4 == 1) {
				name = "Acorn";
			}
			else if (this.wheel4 == 2) {
				name = "Fire Flower";
			}
			else if (this.wheel4 == 3) {
				name = "Ice Flower";
			}
			else {
				name = "Leaf";
			}
			return name;
		}
		/**
		 * @param method loops through the amount of times the user inputs 
		 * @see for loop returns every wheel pull
		 */
		
		public void play() {
			System.out.println("Welcome to slot machine. How many times do you want to pull?");
			Scanner scan = new Scanner(System.in);
			int userPull = scan.nextInt(); 
			for (int i = 0; i < userPull; i++) { //prints out user entered amount of wheels and generates
				System.out.println(wheel1Names() + "   " + wheel2Names() + "   " + wheel3Names() + "   " + wheel4Names());
				wheel1 = generator.nextInt(5) + 0;
				wheel2 = generator.nextInt(5) + 0;
				wheel3 = generator.nextInt(5) + 0;
				wheel4 = generator.nextInt(5) + 0;
				
				countCoins();
			}
		}
		/**
		 * @param returns the incremented coins based on how many wheels have matching result 
		 * @see countCoins()
		 */
		
		public void countCoins() {
			String var1 = wheel1Names();
			String var2 = wheel2Names();
			String var3 = wheel3Names();
			String var4 = wheel4Names();
			//boolean check = var1.equals(var2);
			//System.out.print(check); 
			if ((var1.equals(var2)) && (var3.equals(var4)) && (var2.equals(var3))) {//when all names are same
				if (var2.equals(var3)) {
					System.out.println(this.coins += 600);
				}
				else if (var2.equals(var3) && (var1.equals(var2))) {//when two names are same
					System.out.println(this.coins += 100);
				}
				else if ((var1.equals(var3) && (! var2.equals(var4)))) {//when three names are same
					System.out.println(this.coins += 300);
				}
				else {//when no names are same
					System.out.println(this.coins);
				}
			}	
			else {
				//totalCoins = coins;
			
				System.out.println("You have " + this.coins + " coins."); 
			}
		}
		/**
		 * @param loop returns so user can play again based on input 1=yes and 2=no
		 * @see playAgain 
		 */
		
		public void playAgain() {
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter 1 if you want to play again. Enter 2 if you want to exit.");
			int askToPlay = scnr.nextInt();
			do {
				play();
				countCoins();
				//playAgain();
			} while (askToPlay == 2);
					//take all the coins earned and save them to a total and return/print
					System.out.println("Enter 1 if you want to play again. Enter 2 if you want to exit.");
					askToPlay = scnr.nextInt();
					this.totalCoins += coins;
					System.out.println("Total coins: " + this.totalCoins);
		}
		
		public static void main(String[] args) { 
			SlotMachineTwo playGame = new SlotMachineTwo();
			playGame.play();
			playGame.playAgain();
				
			}
		}



