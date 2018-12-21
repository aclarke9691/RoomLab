package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;


public class SpecialRoom2 extends Room {
    Scanner input = new Scanner(System.in);
  public Tool Tools[];

    public SpecialRoom2(int xx, int yy) {
        super(xx, yy);
        this.Tools = Tools;
    }

    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";
        System.out.println("You arrive upon a messy bedroom and out of the corner of your eye, you see something sparkling in the back of the room. Should you walk over there to go see what it is?");
        response=input.nextLine();
        if (response.equals("yes") || response.equals("Yes")) {//If the player decides yes, then the master key gets added into their inventory. This key is necessary in order to get to the pool house and to eventually win the game. If they decide no, the player just gets the option to leave the room.
            System.out.println("You walk over there and notice it is a key that says 'master key' on the back. This must be able to open every door! You put it into your pocket and exit the room.");
            Tool mk= new Tool("master key", "room[4][4]");
            p.addTool(mk);
            System.out.println("Your bag contains: " +p.checkBag()); //Prints items in inventory
            System.out.println("Use the master key in " + mk.function); //Prints the purpose of the master key so that the player knows where they should try to go
        }
        else {
            if (response.equals("no") || response.equals("No")) {
               System.out.println("Okay, let's leave the room.");}
            System.out.println("Move anywhere to leave the room.");
        }
    }
}
