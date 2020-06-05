public class Bin {
    public int capacity = 10;   // 총 용량
    public int currentCapacity = 0;        // 현재 용량
    public int remainCapacity = 10; // 남은 용량

    public boolean check(Item item) {
        if (remainCapacity >= item.size) return true;
        else return false;
    }

    public void add(Item item) {
        currentCapacity += item.size;
        remainCapacity = capacity - currentCapacity;
    }

    @Override
    public String toString() {
        return "Bin{" +
                "capacity=" + capacity +
                ", currentCapacity=" + currentCapacity +
                ", remainCapacity=" + remainCapacity +
                '}';
    }
}