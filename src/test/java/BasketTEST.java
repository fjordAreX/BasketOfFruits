import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTEST {
    Basket<Fruit> fruits = new Basket<>();
    Basket<Apple> apples = new Basket<>();
    Basket<Orange> oranges = new Basket<>();
    Apple apple = new Apple();
    Orange orange = new Orange();

    public void addToAll(){
        apples.add(new Apple());
        apples.add(apple);
        apples.add(new Apple());

        oranges.add(orange);
        oranges.add(new Orange());
        oranges.add(new Orange());

        fruits.add(orange);
        fruits.add(apple);

    }

    @Test
    public void testAppleBasket(){
        addToAll();
        assertEquals(3,apples.getWeight(),0.01);
    }

    @Test
    public void testOrangeBasket(){
        addToAll();
        assertEquals(4.5,oranges.getWeight(),0.01);
    }

    @Test
    public void testFruitBasket(){
        addToAll();
        assertEquals(2.5,fruits.getWeight(),0.01);
    }

    @Test
    public void testComparing(){
        addToAll();
        assertEquals(-1,apples.compare(oranges), 0.01);
        assertEquals(1, apples.compare(fruits),0.01);
    }

    @Test
    public void testTransfer(){
        addToAll();
        Basket<Apple> apples2 = new Basket<>();
        apples2.add(new Apple());
        apples2.add(new Apple());

        Basket.transfer(apples2,apples);
        assertEquals(5.0,apples.getWeight(),0.01);

        Basket.transfer(apples,fruits);
        assertEquals(7.5,fruits.getWeight(),0.01);
    }

}
