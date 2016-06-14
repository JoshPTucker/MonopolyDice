/*
 * Joshua Tucker
 * Monopoly dice program
 */
import java.util.Random;
public class MonopolyDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d1 = 0;
		int d2=0;
		int rollcount =1;
		int sum=d1+d2;
		int diceNum=0;
		
		if (d1==d2){
			d1= rollDice(0);
			d2=rollDice(0);
			System.out.println("Roll 1"
					+ "\nDice 1: " + d1 +" Dice 2: "+d2);
			
			if (d1==d2){
				d1= rollDice(0);
				d2=rollDice(0);
				System.out.println("Roll 2"
						+ "\nDice 1: " + d1 +" Dice 2: "+d2);
				if (d1==d2){
					d1= rollDice(0);
					d2=rollDice(0);
					System.out.println("Roll 3"
							+ "\nDice 1: " + d1 +" Dice 2: "+d2);	
				}
				else{ 
					System.out.println("Move "+sum+" spaces and stop");
			 }
			}
			else{ 
				System.out.println("Move "+sum+" spaces and stop");
			}
			
		}
			
	}
	public static int rollDice(int diceNum){
		Random rnd = new Random();
		 diceNum = 1+rnd.nextInt(5);
		
		return  diceNum;
	}

}
