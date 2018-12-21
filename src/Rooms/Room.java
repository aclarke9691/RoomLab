package Rooms;

import People.Person;

public class Room {
	Person occupant;
	int xLoc,yLoc;

	
	public Room(int x, int y) //Location of specific room
	{
		xLoc = x;
		yLoc = y;
	}

	public String toString() //The characters for the main house
	{
		if(occupant!=null) {
			return "P"; //Represents the player
		} else{
			return "?"; //Represents the rooms
		}

	}

	public String toString(String name) //The characters for the pool house
	{
		if(occupant!=null) {
			return "P"; //Represents the player
		} else{
			return "x"; //Represents the rooms
		}

	}

	/**
	 * Method controls the results when a person enters this room.
	 * @param x the Person entering
	 */
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}

	/**
	 * Removes the player from the room.
	 * @param x
	 */
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
