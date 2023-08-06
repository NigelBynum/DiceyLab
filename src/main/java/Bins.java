import java.util.HashMap;


public class Bins {


    HashMap<Integer, Integer> Bin;
    Dice dice;


    public Bins(int low, int high) {
        Bin = new HashMap<>();
        for(int i=low; i<=high; i++) {
            Bin.put(i,0);
        }
    }
    public Integer getBin(int binName) {
        return Bin.get(binName);
    }

    public void incrementBin(Integer binName) {
        if(Bin.containsKey(binName)) {
            Bin.put(binName, (Bin.get(binName)+1));
        }

    }
}
