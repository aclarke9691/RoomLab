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

	public void addTool(Tool tool)
	{
		for (int i=0; i<Tools.length; i++)
		{
			if (Tools[i]==null)
			{
				Tools[i]= tool;
				break;
			}

		}
	}


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

	public String checkBag()
	{
		String totalInventory="";
		boolean empty ;

		if (Tools[0] == null) {
			empty = true;
		} else {
			empty = false;
		}
        if (!empty) {
			for (int b = 0; b < Tools.length; b++) {
				if (Tools[b] != null) {
					totalInventory = totalInventory + " " + Tools[i].toString() + " ";
				}
			}
			return totalInventory;
		}
		else {
			return "Your bag is empty.";}

			//if (empty=true)
			//{
			//System.out.println("You have nothing in your inventory.");
			//}
			//else
			//{
			//if (empty=false)
			//{
			//System.out.println("You now have the following items in your bag: " + totalInventory);
			//}
			//}
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
