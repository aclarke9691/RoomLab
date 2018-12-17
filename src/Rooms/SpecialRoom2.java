package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;


public class SpecialRoom2 extends Room {
  public Tool Tools[]; //does this work
    public int i;

    public SpecialRoom2(int xx, int yy) {
        super(xx, yy);
        this.Tools = Tools;
    }

    public void enterRoom(Person p) {
        Scanner input = new Scanner(System.in);
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";
        System.out.println("You arrive upon a messy bedroom and out of the corner of your eye, you see something sparkling in the back of the room. Should you walk over there to go see what it is?");
        if (response.equals("yes") || response.equals("Yes")) {
            System.out.println("You walk over there and notice it is a key that says 'masterkey' on the back. This must be able to open every door! You put it into your pocket and exit the room.");
            Tools[i].name= "masterkey";
            i=i+1;
        }
        else {
            if (response.equals("no") || response.equals("No")) {
               System.out.println("Okay, let's leave the room.");}
            //} else {
               // System.out.println("Please say yes or no.");
           // }
            System.out.println("Move anywhere to leave the room.");
        }
    }
}
