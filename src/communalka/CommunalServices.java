package communalka;

public abstract class CommunalServices{
    protected String serviceName;

    public abstract String turnOn(CommunalServices n);
    public abstract String turnOff(CommunalServices n);

    public CommunalServices(String serviceName){
        this.serviceName = serviceName;
    }
    public String getName(){
        return this.serviceName;
    }
}
