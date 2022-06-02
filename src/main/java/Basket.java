import java.util.ArrayList;

public class Basket <T extends Fruit> {
  private ArrayList<T> basket;

    public Basket() {
        basket = new ArrayList<>();
    }

    public void add(T obj){
      basket.add(obj);
  }
  public double getWeight(){
      double weight =0;
      for (T t : basket){
          weight += t.getWeight();
      }
      return weight;
  }

  public int compare (Basket<?> list1){
      return (Double.compare(this.getWeight(), list1.getWeight()));
  }

  public static <U extends Fruit> void transfer (Basket<? extends U> source, Basket<? super U>  destination){
      destination.basket.addAll(source.basket);
      source.basket.clear();
  }

    @Override
    public String toString() {
        return "basket={" + basket +
                '}';
    }
}
