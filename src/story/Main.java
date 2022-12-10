package story;

import alive.*;
import communalka.*;
import room.*;

public class Main {
    public static void main(String[] args) {
        Goat goat = new Goat("Kozlik", "Neznayka", 666, 666);
        Dunno dunno = new Dunno("Neznayka", "Kozlik", 333, 342);
        Light light = new Light("light");
        Water water = new Water("water");
        RedEye redEye = new RedEye("red eye", "wall");
        Soap soap = new Soap("soap", "sink");
        Uvula uvula = new Uvula("uvula", "wall");
        System.out.println(dunno.wash(dunno, goat));
        System.out.println(water.turnOff(water));
        System.out.println(dunno.moveHands(dunno));
        System.out.println(soap.hurt(soap, dunno));
        System.out.println(dunno.askForHelp(dunno, goat));
        System.out.println(goat.walk(goat, "sink") + light.turnOff(light));
        System.out.println(redEye.shine(redEye) + redEye.beInRoom(redEye,"wall") + uvula.beInRoom(uvula, "under it"));
        System.out.println(goat.pay(goat, light, "santik"));
        System.out.println(uvula.lickOff(uvula, "santik", "wall", light));
        System.out.println(goat.pay(goat, light, "santik"));
        System.out.println(uvula.leanOut(uvula, light, water, goat, "sink"));
    }
}