public class Flute extends Instrument{
    String type = "Wind";
    int uses;
    public Flute(int p, String m){
        super(p,m);
        System.out.println("A flute that is worth " + p + " and made of " + m + " was made");
    }
    public Flute(){
        System.out.println("There is nothing here");
    }
    public int getPrice(){
        return price;
    }
}
