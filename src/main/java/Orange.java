public class Orange extends Fruit{
    private final double weight = 1.5;
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "weight{" + weight + '}';
    }
}
