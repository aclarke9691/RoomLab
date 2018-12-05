package Rooms;
import Game.Runner;
import People.Person;
import java.util.Scanner;

public class SpecialRoom1 extends Room {
    Scanner input = new Scanner(System.in);
}
    public SpecialRoom1(int xx, int yy)
    {
        super(xx,yy);
    }

    public void enterRoom(Person p)
    {
        occupant=p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response= "";
        System.out.println("You are now in a room that seems to be a little girl's bedroom. You spot a raggedy teddy bear on the ground. Would you like to pick it up?");
        response=input.nextLine();
        if (response.equals("yes") || response.equals("Yes"))
        {

        }

    }
