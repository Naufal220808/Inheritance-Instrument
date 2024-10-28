package UlanganBuPasha;

public class Guitar extends stringInstruments {
    boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar() {
        super();
        isElectric = true;
    }

    public Guitar(String name, double price, int numString, boolean isElectric) {
        super(name, price, numString);
        this.isElectric = isElectric;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Gitarnya: " +isElectric);
    }

}
