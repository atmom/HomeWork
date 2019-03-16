package lesson6;


public class Main {

    public static void main(String[] args) {
	Cat cat1 = new Cat("Мурзик", "слабый" );
	Cat cat2 = new Cat("Пушок",  "сильный");

	Dog dog1 = new Dog("Дружок",  "сильный");
	Dog dog2= new Dog("Боец", "слабый");

	cat1.run(300);
	dog1.run(500);

    }
}
