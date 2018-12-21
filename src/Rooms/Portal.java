package Rooms;
import People.Person;
import People.Tool;


public class Portal extends Room{
    public Tool Tools[];

    public Portal (int xx, int yy)
    {
        super(xx, yy);
    }
    @Override
    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        Tools = p.getTools();
        System.out.println(portalCheck("master key"));
        if (portalCheck("master key")==true) //Checks to see if the player has the master key so that they can enter the portal and move on to the pool house
        {
            Game.Runner.gameOne=false;
            Game.Runner.gameTwo=true;
        }
    }
        public boolean portalCheck(String term) //Checks to see if the player's inventory contains master key, so that they can get into the portal
        {
            if (Tools[0]!=null) {

                int a = -1;
                for (int j = 0; j < 5; j++) {

                    if (Tools[j]!=null &&Tools[j].toString().equals(term)){
                        a = 0;
                        break;
                    }

                }

                    if (a == 0) {

                        System.out.println("You unlocked the portal! You have now been casted to the poolhouse!");
                        return true;

                    } else {
                        System.out.println("You need a master key in order to unlock this door");
                        return false;

                    }
            }
            else
            {
                System.out.println("You need a master key in order to unlock this door.");
                return false;
            }


}}
