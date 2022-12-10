package alive;

import communalka.CommunalServices;

public class Goat extends Lilliputian implements IPaidable, IWashable{

    public Goat(String name, String friendName, double a, double b){
        super(name, friendName, a, b);
    }
    @Override
    public String moveHands(Lilliputian n){
        return  n.getName() + " gave the santik to uvula";
    }
    @Override
    public String walk(Lilliputian n, String place){
        return Gerunds.SEEINGSOMETHINGWRONG + ", " + n.getName() + " ran to " + place;
    }
    @Override
    public String help(Lilliputian n, Lilliputian k){
        return n.getName() + " helped " + k.getFriendName();
    }
    @Override
    public String askForHelp(Lilliputian n, Lilliputian k){
        return null;
    }
    @Override
    public String pay(Lilliputian n, CommunalServices serviceName, String money) {
        return Gerunds.REALIZING + " that the payment for the " + serviceName.getName() + " is again required, " + n.getName() + " ran to the uvula " + Gerunds.PULLINGOUT + " of pocket " + money;
    }
    @Override
    public String wash(Lilliputian n, Lilliputian k) {
        return n.getName() + " washed himself";
    }
}
