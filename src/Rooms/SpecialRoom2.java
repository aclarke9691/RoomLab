package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;

public class SpecialRoom2 extends Room {
    public SpecialRoom2(int xx, int yy)
    {
        super(xx,yy);
    } {super Toola[]}
    public void enterRoom(Person p) {
        Scanner input = new Scanner(System.in);
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";
        System.out.println("You arrive upon a messy bedroom and out of the corner of your eye, you see something sparkling in the back of the room. Should you walk over there to go see what it is?");
        if (response.equals("yes") || response.equals("Yes")) {
            System.out.println("You pick up the teddy bear and notice that there is a hole in the back of the bear. You reach into it and find a pair of keys. You put them into your pocket and exit the room.");
             Tools[];
        } else {
            if (response.equals("no") || response.equals("No")) {
                System.out.println("Okay, let's leave the room.");
            }
            else {
                System.out.println("Please say yes or no.");
            }
            System.out.println("Move anywhere to leave the room.");
        }
}
