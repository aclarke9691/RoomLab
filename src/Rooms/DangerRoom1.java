package Rooms;
import People.Person;
import People.Tool;
import Game.Runner;

public class DangerRoom1 extends Room implements DangerRoom {
    public DangerRoom1(int xx, int yy)
    {
        super(xx, yy);
    }
    public Tool[] Tools;
    public int health;
    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        Tools= p.getTools();
        health=p.getHealth();
        System.out.println("Uh oh! You have come upon a room with a hungry ghost in it!");
        System.out.println(ghostAttack("chips",occupant));
        System.out.println(p.checkHealth()); //Checks if player has died
    }

    public String ghostAttack(String term, Person p) //
    {
        if (Tools[0]!=null) { //If the list is not empty, checks for required item in order to defeat the ghost

            int a = -1;
            for (int j = 0; j < 5; j++) {

                if (Tools[j]!=null &&Tools[j].toString().equals(term)){
                    a = 0;
                    break;
                }

            }
            {
                if (a == 0) {
                    return "You used chips to feed a ghost! You didn't get hurt at all."; //If the player has the required item, they do not get attacked
                } else {
                    System.out.println("You got attacked by a hungry ghost! Your health has decreased by 25 points."); //If the player doesn't have the required item in their inventory, then they get attacked by the ghost
                    p.addHealth(25);
                    return "Your health is now " + p.getHealth();

                }

            }
        } else {
            return "You got attacked by a hungry ghost! Your health has decreased by 25 points."; //If the player doesn't have anything in their inventory, they get attacked by the ghost
        }


    }
}
