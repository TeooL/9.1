public class Instrument {
    int price;
    String material;
    public Instrument(int p,String m){
        price = p;
        material = m;
    }
    public Instrument(){
        price = 0;
        System.out.println("No flute was made as no material was provided to be made with.");
    }
    public void play(int hours){
        System.out.println("Playing Music");
        System.out.println("Playing for " + hours + " hours.");
        price--;
    }
}
