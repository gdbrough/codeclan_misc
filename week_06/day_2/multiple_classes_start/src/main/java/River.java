import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> stock;

    public River(){
        this.stock = new ArrayList<>();
    }

    public void addFish(Salmon salmon){
        this.stock.add(salmon);
    }

    public int getFishCount(){
        return this.stock.size();
    }

    public Salmon removeFish(){
        return this.stock.remove(0);
    }


}
