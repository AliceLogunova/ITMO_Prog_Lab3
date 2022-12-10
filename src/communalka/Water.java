package communalka;

public class Water extends CommunalServices{
    public Water(String serviceName){
        super(serviceName);
    }
    @Override
    public String turnOn(CommunalServices water){
        return "The " + water.getName() + " was on";
    }
    @Override
    public String turnOff(CommunalServices water){
        return "But as soon as he lathered his face, something clicked and " + water.getName() + " turned off";
    }
}
