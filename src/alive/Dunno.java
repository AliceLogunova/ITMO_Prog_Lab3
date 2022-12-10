package alive;

public class Dunno extends Lilliputian implements IWashable{
    public Dunno(String name, String friendName, double a, double b) {
        super(name, friendName, a, b);
    }

    @Override
    public String moveHands(Lilliputian n) {
        return n.getName() + " turned the faucet in different positions and kicked it, but it didn't help";
    }
    @Override
    public String walk(Lilliputian n, String place) {
        return null;
    }

    @Override
    public String help(Lilliputian n, Lilliputian k) {
        return null;
    }

    @Override
    public String askForHelp(Lilliputian n, Lilliputian k) {
        return "Then " + n.getName() + " started calling for help to " + getFriendName();
    }
    @Override
    public String wash(Lilliputian n, Lilliputian k) {
        return n.getName() + " started to wash his face " + Adverb.AFTER + " " + k.getFriendName();
    }
}
