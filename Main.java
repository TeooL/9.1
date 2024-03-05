
public class Main {
    public static void main(String[] args) {
        Flute flute = new Flute(50,"Silver");
        Flute flute2 = new Flute();
        Instrument triangle = new Instrument();
        triangle.play();
        flute2.play();
        System.out.println(triangle.returnUses());
        System.out.println(flute2.returnUsed());
    }
}