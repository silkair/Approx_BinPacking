import java.util.ArrayList;

public class FirstFit implements Fit {
    @Override
    public void fit(ArrayList<Bin> arr, Item item) {
        for (int i=0; i<arr.size(); i++) {
            Bin bin = arr.get(i);
            if(bin.check(item)) {
                bin.add(item);
                return;
            }
        }

        Bin b = new Bin();
        b.add(item);
        arr.add(b);
    }
}