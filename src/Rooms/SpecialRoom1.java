package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;
import Rooms.Room;

public class SpecialRoom1 extends Room {
public Tool[] Tools;
    Scanner input = new Scanner(System.in);


    public SpecialRoom1(int xx, int yy)
    {
        super(xx,yy);
    }

    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";

        System.out.println("You are now in a room that seems to be a little girl's bedroom. You spot a raggedy teddy bear on the ground. Would you like to pick it up?");
        response = input.nextLine();
        if (response.equals("yes") || response.equals("Yes")) { //If the player decides yes, then chips gets added into their inventory. If they decide no, the player just gets the option to leave the room.
            System.out.println("You pick up the teddy bear and notice that there is a hole in the back of the bear. You reach into it and find a bag of chips. You are confused but put it into your pocket and exit the room.");
            Tool chips= new Tool("chips");
            p.addTool(chips);
            System.out.println("Your bag contains: " + p.checkBag()); //Prints items in inventory
        } else {
                System.out.println("Okay, let's leave the room.");

        }


        System.out.println("Move anywhere to leave the room.");
    }

    }
