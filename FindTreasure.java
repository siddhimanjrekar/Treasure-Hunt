//Find Treasure Game
import java.util.Scanner;
public class FindTreasure{
	public static void main(String[] args){
		System.out.println("Welcome to Treasue Island. Your mission is to find treasue.");
		Scanner sc= new Scanner(System.in);
		System.out.println("Left or right");
		String leftRight = sc.nextLine();
		if (leftRight.equalsIgnoreCase("right")){
			System.out.println("Fall into a hole. Game over");
		}
		else if (leftRight.equalsIgnoreCase("left")){
			System.out.println("swim or wait");
			String swimWait = sc.nextLine();
			if (swimWait.equalsIgnoreCase("Swim")){
				System.out.println("Attacked by trout. Game over");
			}
			else if (swimWait.equalsIgnoreCase("wait")){
				System.out.println("Which door: red, blue, yellow?");
				String whichDoor = sc.nextLine();
				if (whichDoor.equalsIgnoreCase("red")){
					System.out.println("Burnt by fire. Game over");
				}
				if (whichDoor.equalsIgnoreCase("blue")){
					System.out.println("Eaten by beasts. Game over");
				}
				if (whichDoor.equalsIgnoreCase("yellow")){
					System.out.println("You Win!");
				}
				else{
					System.out.println("Game over!");
				}
				
			}
				
		}
	}
}
			
			
		