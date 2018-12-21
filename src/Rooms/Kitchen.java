package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;

public class Kitchen extends Room {
    Scanner input = new Scanner(System.in);
    public Tool Tools[];

    public Kitchen(int xx, int yy) {
        super(xx, yy);
    }

    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";
        System.out.println("You are now in the kitchen. You see there is a small bottle filled with a liquid on the counter. Should you go see what it is?");
        response = input.nextLine(); //Player's response
        if (response.equals("yes") || response.equals("Yes")) { //If the player decides yes, then holy water gets added into their inventory. If they decide no, the player just gets the option to leave the room.
            System.out.println("You take the bottle and see that it is holy water and is able to fight off ghosts...GHOSTS?!");
            Tool hw= new Tool("holy water");
            p.addTool(hw);
            System.out.println("Your bag contains: " +p.checkBag()); //Prints items in inventory
        } else {
            if (response.equals("no") || response.equals("No")) {
                System.out.println("Okay, let's leave the room.");
            }
            System.out.println("Move anywhere to leave the kitchen.");

        }

    }
}
