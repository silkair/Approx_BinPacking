import java.util.ArrayList;
public class WorstFit implements Fit{

    @Override
    public void fit(ArrayList<Bin> arr, Item item) {

        int N = -1;
        int highest = -9999;

        for (int i=0; i<arr.size(); i++) {
            Bin bin = arr.get(i);

            if(bin.check(item)) {
                if(bin.remainCapacity - item.size >= 0)
                    if(highest<bin.remainCapacity - item.size) {
                        highest = bin.remainCapacity - item.size;
                        N=i;
                    }
            }
        }
        Bin b;
        if (N == -1) {
            b = new Bin();
            if(b.check(item))
                b.add(item);
            arr.add(b);
        }
        else {
            b = arr.get(N);
            b.add(item);
        }
    }
}