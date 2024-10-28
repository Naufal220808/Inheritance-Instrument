package UlanganBuPasha;

public class piano extends instrument{
    protected String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public piano() {
        pianoType = "Yamaha";
    }

    public piano(String name, double price, String pianoType) {
        super(name, price);
        this.pianoType = pianoType;
    }
    @Override
    public void print() {
        super.print();
        System.out.println();
        System.out.println("pianotype: " +pianoType);
        System.out.println();
    }

}
