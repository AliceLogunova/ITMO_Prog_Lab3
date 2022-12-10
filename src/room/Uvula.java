package room;

import alive.Gerunds;
import alive.Lilliputian;
import communalka.CommunalServices;

public class Uvula extends PremisesObject{
    public Uvula(String obj, String place){
        super(obj, place);
    }

    @Override
    public String beInRoom(PremisesObject uvula, String place){
        return " and a metal " + uvula.getName() + " gleaming " + place;
    }
    public String leanOut(Uvula uvula, CommunalServices l, CommunalServices w, Lilliputian k, String place){
        return Gerunds.HAVINGSETUP + " business with the " + l.getName() + ", " + k.getName() + " ran up to the "+ place + " and saw that here, too, an " + uvula.getName() + " was sticking out, demanding payment for " + w.getName();
    }
    public String lickOff(Uvula uvula, String money, String place, CommunalServices x){
        return Gerunds.HAVINGLICKED + " a " + money + " in an instant, " + uvula.getName() + " disappeared into the " + place + " and the " + x.getName() + " turned on";
    }
}
