public class Main {
    public static void main(String[] args) {
        Basket<Apple> apples = new Basket<>();
        Apple apple = new Apple();
        apples.add(apple);
        apples.add(new Apple());

        Basket<Apple> apples2 = new Basket<>();
        apples2.add(new Apple());

        Basket<Orange> oranges = new Basket<>();
        Orange orange = new Orange();
        Orange orange1 = new Orange();
        oranges.add(orange);
        oranges.add(new Orange());
        oranges.add(orange1);

        Basket<Fruit> fruits = new Basket<>();
        fruits.add(orange);
        fruits.add(apple);


        System.out.println(apples.getWeight());
        System.out.println(fruits.getWeight());
        System.out.println(oranges.getWeight());

        System.out.println(apples.compare(oranges));
        System.out.println(apples.compare(fruits));

        Basket.transfer(apples,apples2);
        Basket.transfer(apples,fruits);


/*
            (Will not work)
        Fruit fruit = new Fruit();
        apples.add(orange);
        oranges.add(apple);
        apples.add(fruit);
        oranges.add(fruit);

        Basket.transfer(apples,oranges);
        Basket.transfer(oranges,apples);
        Basket.transfer(fruits,apples);

*/

    }
}
