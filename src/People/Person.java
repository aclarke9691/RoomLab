package People;
import People.Tool;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int i=0;
	Tool[] Tools= new Tool[5]; //Creates an inventory and as the player travels around the house, tools will be added to this list

	int health=50; //The amount of health the player has. Maximum 50. For some reason I cannot get the health to decrease. I tried everything I could think of.

	public void addTool(Tool tool) //Adds a tool that the player finds to the list
	{
		for (int i=0; i<Tools.length; i++) //Looks for an empty space in the list to add the tool to
		{
			//if (Tools[i].name.equals(""))
			if(Tools[i]==null)
			{
				Tools[i]= tool;
				break;

			}


		}
	}
	public void addHealth(int amount) //Decreases the player's health by a given amount
	{
		health= health - amount;
	}
	public Tool[] getTools()
	{
		return this.Tools;
	} //Returns list of tools
	public int getHealth()
	{
		return health;
	} //Returns the player's health


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


	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}

	public String checkBag() //Prints what the player's inventory contains
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
					totalInventory = totalInventory + " " + Tools[b].toString() + " ";
				}
			}
			return totalInventory;
		}
		else {
			return "Your bag is empty.";}

		}

	public String checkHealth() //Checks to see if health has reached or went below zero. If it has, the player has lost the game and they have to restart.
	{
		if (health<=0)
		{
			System.out.println("Your health has reached 0 and you died. Play again!");
			Game.Runner.gameOff();
			return "";
		}
		else
		{
			return "";
		}

	}


}
