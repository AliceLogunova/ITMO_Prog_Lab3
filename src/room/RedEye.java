package room;

import alive.Adverb;

public class RedEye extends PremisesObject{
    public RedEye(String obj, String place){
        super(obj, place);
    }

    @Override
    public String beInRoom(PremisesObject redEye, String place){
        return redEye.getName() + " hanging on the " + place;
    }
    public String shine(RedEye redEye){
        return "The only thing that could be seen in the darkness was the" + Adverb.PERSISTENTLY + " blinking " + redEye.getName();
    }
}
