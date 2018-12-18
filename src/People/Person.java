package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int i=0;        //is this where i should put, i am not sure if i need i
	Tool Tools[]= new Tool[5];
	int health;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	//public int getHealth { return health;}

	public Person (String firstName, String familyName, int xLoc, int yLoc, int health)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.health=health;
	}

	public static void checkHealth(int health)
	{
		if (health<=0)
		{
			System.out.println("Your health has reached 0 and you died. Play again!");
			Game.Runner.gameOff();
		}

	}


}
