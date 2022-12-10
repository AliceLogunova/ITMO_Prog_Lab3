package communalka;

import alive.Lilliputian;

public class Light extends CommunalServices{

    public Light(String serviceName){
        super(serviceName);
    }
    @Override
    public String turnOn(CommunalServices light){
        return "The " + light.getName() + " turned on and all room became bright";
    }
    @Override
    public String turnOff(CommunalServices light){
        return ", but just at this time the " + light.getName() + " turned off and the room plunged into darkness again";
    }
}
