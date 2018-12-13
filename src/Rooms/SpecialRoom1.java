package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;

public class SpecialRoom1 extends Room {
private Tool[] Tools;
private int space;

    public SpecialRoom1(int xx, int yy)
    {
        super(xx,yy);
        this.Tools= Tools;
        this.space=space;
    }

    public void enterRoom(Person p) {
        Scanner input = new Scanner(System.in);
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";
        if(enteredRoom=true)
        {
        System.out.println("You are now in a room that seems to be a little girl's bedroom. You spot a raggedy teddy bear on the ground. Would you like to pick it up?");
        response = input.nextLine();
        if (response.equals("yes") || response.equals("Yes")) {
            System.out.println("You pick up the teddy bear and notice that there is a hole in the back of the bear. You reach into it and find a pair of keys. You put them into your pocket and exit the room.");
            Tools[space]=new Tool("keys");
            space=space+1;
            enteredRoom=false;
        } else {
            //if (response.equals("no") || response.equals("No")) {
                System.out.println("Okay, let's leave the room.");
            //}
        }
        }
           else
            {
                System.out.println("You have already been to this bedroom.");
            }
            System.out.println("Move anywhere to leave the room.");

    }

    }
