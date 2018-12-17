package Rooms;
import Game.Runner;
import People.Person;
import java.util.Scanner;

public class Kitchen extends Room {
    Scanner input = new Scanner(System.in);

    public Kitchen(int xx, int yy)
    {
        super(xx,yy);
    }

    public void enterRoom(Person p)
    {
        occupant=p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response="";
        System.out.println("You are now in the kitchen. You see there is a small bottle filled with a liquid on the counter. Should you go see what it is?";
        response=input.nextLine();
        if
        System.out.println("Move anywhere to leave the kitchen.");

    }

}
