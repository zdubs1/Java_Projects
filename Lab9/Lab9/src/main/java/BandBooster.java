public class BandBooster {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBoxesSold() {
        return boxesSold;
    }

    public void setBoxesSold(int boxesSold) {
        this.boxesSold = boxesSold;
    }

    public BandBooster(String name) {
        this.name = name;
        this.boxesSold = 0;
    }

    private String name;
    private int boxesSold;

    public void updateSales(int additionalboxesSold){
        boxesSold += additionalboxesSold;
    }
    public String toString(){
        return this.name + " sold " + boxesSold + " boxes ";
    }
}
