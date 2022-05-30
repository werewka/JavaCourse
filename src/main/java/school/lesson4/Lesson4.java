package school.lesson4;

public class Lesson4 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[10];
        animals[0] = new Cat("Scotish Fold", "Marry", 0, 0, 5000, 200, 20);
        animals[1] = new Cat("Scotish straight", "Alice", 0, 6, 4000, 250, 10);
        animals[5] = new Dog("Shnauzer", "Нагry", 0, 55, 10000, 1000, 200);
        animals[6] = new Dog("Shpiz ", "Lui", 0, 25, 5000, 500, 50);


        try {
            animals[2] = (Cat) animals[0].clone();
            animals[3] = (Cat) animals[1].clone();
            animals[4] = (Cat) ((Cat) animals[1]).clone("mutate");
            animals[7] = (Dog) animals[5].clone();
            animals[8] = (Dog) animals[6].clone();
            animals[9] = (Dog) ((Dog) animals[6]).clone("mutate");
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            System.out.println("Clonning is not successful");
        }
        System.out.println("Characteristics");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------");



        System.out.println("Cats total: " + (Cat.getCount() + Cat.getCountClone()));
        System.out.println("Clonned Cats: " + Cat.getCountClone());
        System.out.println("Dogs total: " + (Dog.getCount() + Dog.getCountClone()));
        System.out.println("Clonned dogs: " + Dog.getCountClone());
        System.out.println("Overall dogs created: " + Dog.getCountClone());
        System.out.println("Overal animals created: " + Animal.getCount());
        System.out.println();
        System.out.println("Stamina: ");
        System.out.println("Run: ");
        System.out.println("---------------------------------------------------------------------------------------");


        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Swimming: ");
        System.out.println("---------------------------------------------------------------------------------------");


        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(50);
        }

    }
}