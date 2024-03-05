public class Instrument {
    int price;
    public Instrument(int p){
        price = p;
    }
    public Instrument(){
        price = 0;
    }
    public void play(int hours){
        System.out.println("Playing Music");
        System.out.println("Playing for " + hours + " hours.");
        price--;
    }
}
