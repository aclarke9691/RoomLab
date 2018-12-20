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
        System.out.println(ghostAttack("chips"));
        System.out.println(p.checkHealth());
    }

    public String ghostAttack(String term) //will ghostattack automatically run
    {
        if (Tools[0]!=null) {

            int a = -1;
            for (int j = 0; j < 5; j++) {

                if (Tools[j]!=null &&Tools[j].toString().equals(term)){
                    a = 0;
                    break;
                }

            }
            {
                if (a == 0) {
                    return "You used chips to feed a ghost! You didn't get hurt at all.";
                } else {
                    health = health - 25;
                   // System.out.println("Your current health is" + health);
                    return "You got attacked by a hungry ghost! Your health has decreased by 25 points.";

                }

                //People.Person.checkHealth(health);
            }
        } else {
            return "You got attacked by a hungry ghost! Your health has decreased by 25 points.";
        }


    }
}
