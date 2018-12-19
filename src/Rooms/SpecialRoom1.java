package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;
import Rooms.Room;

public class SpecialRoom1 extends Room {
public Tool[] Tools;
public int i;
public String totalInventory;


    public SpecialRoom1(int xx, int yy)
    {
        super(xx,yy);
        this.Tools= Tools;
    }

    public void enterRoom(Person p, Tool Tools[]) {
        Scanner input = new Scanner(System.in);
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";

        System.out.println("You are now in a room that seems to be a little girl's bedroom. You spot a raggedy teddy bear on the ground. Would you like to pick it up?");
        response = input.nextLine();
        if (response.equals("yes") || response.equals("Yes")) {
            System.out.println("You pick up the teddy bear and notice that there is a hole in the back of the bear. You reach into it and find a pair of keys that say 'poolhouse' on the back. You put them into your pocket and exit the room.");
            Tools[i]=new Tool("keys");
            i=i+1;
            System.out.println("You now have the following item(s) in your bag: " + totalInventory);
        } else {
            //if (response.equals("no") || response.equals("No")) {
                System.out.println("Okay, let's leave the room.");
            //}
        }


        System.out.println("Move anywhere to leave the room.");
    }

    }
