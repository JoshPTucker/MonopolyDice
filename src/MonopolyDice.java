/*
 * Joshua Tucker
 * Monopoly dice program
 */
import java.util.Random;
public class MonopolyDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int d1 = 0;
		int d2=0;
		int rollcount =1;
		int sum;
		d1= 1+rnd.nextInt(5);
		d2=1+rnd.nextInt(5);
		sum=d1+d2;
		
		if (d1==d2){
			System.out.println("DOUBLES!"
					+ "\n User rolls "+d1+" & "+d2);
			System.out.println("Move "+sum+" spaces and roll again");
			while (rollcount<3){
				if (d1==d2){
				d1= 1+rnd.nextInt(5);
				d2=1+rnd.nextInt(5);
				sum=d1+d2;
				System.out.println(" User rolls "+d1+" & "+d2);
		System.out.println("Move "+sum+" spaces and roll stop");
		rollcount++;
			}
				if (rollcount==4){
					System.out.println("go to jail");
				}
		  }
		}
		else {
			System.out.println("User rolls " +d1+" & "+d2);
			System.out.println("Move "+sum+" spaces and stop");
		}
		
		
	}

}
