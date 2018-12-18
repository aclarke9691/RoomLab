package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;

public class Kitchen extends Room {
    Scanner input = new Scanner(System.in);
    public Tool Tools[];
    public int i;

    public Kitchen(int xx, int yy) {
        super(xx, yy);
    }

    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";
        System.out.println("You are now in the kitchen. You see there is a small bottle filled with a liquid on the counter. Should you go see what it is?");
        response = input.nextLine();
        if (response.equals("yes") || response.equals("Yes")) {
            System.out.println("You take the bottle and see that it is holy water and is able to fight off ghosts...GHOSTS?!");
            Tool hw= new Tool("holy water");
            p.addTool(hw);
            System.out.println(p.checkBag());
        } else {
            if (response.equals("no") || response.equals("No")) {
                System.out.println("Okay, let's leave the room.");
            }
            System.out.println("Move anywhere to leave the kitchen.");

        }

    }
}
