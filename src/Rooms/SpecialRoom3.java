package Rooms;

import Game.Runner;
import People.Person;
import People.Tool;
import java.util.Scanner;
public class SpecialRoom3 extends Room {
    Scanner input = new Scanner(System.in);
    public Tool Tools[];
    public int health;

    public SpecialRoom3(int xx, int yy) {
        super(xx, yy);
    }

    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        String response = "";
        health=p.getHealth();
        System.out.println("You are now in the bathroom. You notice that there is something in the toilet. Reaching into the toilet will decrease your health by some, but may end up helping you in the long run. Should you go see what it is?");
        response = input.nextLine();
        if (response.equals("yes") || response.equals("Yes")) {
            health=health-10;
            System.out.println("You reach into the toilet and find a can of ghost repellent spray...huh?!!");
            Tool spray= new Tool("spray");
            p.addTool(spray);
            System.out.println("Your bag contains: " +p.checkBag());
        } else {
            if (response.equals("no") || response.equals("No")) {
                System.out.println("Okay, let's leave the room.");
            }
            System.out.println("Move anywhere to leave the kitchen.");

        }

    }
}
