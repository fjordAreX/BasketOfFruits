public class Apple extends Fruit{
   private final int weight = 1;
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "weight{" + weight + '}';
    }
}
