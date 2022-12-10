package room;

import alive.*;

public class Soap extends PremisesObject{
    public Soap(String obj, String place){
        super(obj, place);
    }

    @Override
    public String beInRoom(PremisesObject soap, String place){
        return soap.getName() + " layed on the " + place;
    }

    public String hurt(Soap soap, Lilliputian lilliputian){
        return soap.getName() + " " + Adverb.UNBEARABLE + " stinged " + lilliputian.getName() + "'s eyes, and there was nothing to wash off";
    }
}
