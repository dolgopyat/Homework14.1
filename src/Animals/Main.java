package Animals;

public class Main {
    public static void main(String[] args) {

        Herbivores gazel = new Herbivores("Газель", 2, "горы", 60, "травой");
        gazel.data();
        gazel.go();
        gazel.eat();
        gazel.sleep();

        Herbivores girafe = new Herbivores("Жираф", 2, "саванна", 20, "травой");
        girafe.data();
        girafe.go();
        girafe.eat();
        girafe.sleep();

        Herbivores horse = new Herbivores("Лошадь", 2, "степи", 50, "травой");
        horse.data();
        horse.go();
        horse.eat();
        horse.sleep();
        System.out.println("Повтор животных - " + gazel.equals(girafe));
        System.out.println("Повтор животных - " + gazel.equals(horse));
        System.out.println("Повтор животных - " + horse.equals(girafe));

        Predators hyena = new Predators("Гиена", 2, "саванна", 30, "мясом");
        hyena.data();
        hyena.go();
        hyena.eat();
        hyena.sleep();

        Predators tiger = new Predators("Тигр", 2, "тайга", 40, "мясом");
        tiger.data();
        tiger.go();
        tiger.eat();
        tiger.sleep();

        Predators bear = new Predators("Медведь", 2, "тайга", 20, "мясом");
        bear.data();
        bear.go();
        bear.eat();
        bear.sleep();
        System.out.println("Повтор животных - " + hyena.equals(tiger));
        System.out.println("Повтор животных - " + hyena.equals(bear));
        System.out.println("Повтор животных - " + bear.equals(tiger));

        Amphibians frog = new Amphibians("Лягушка", 2, "водоём");
        frog.data();
        frog.go();
        frog.eat();
        frog.sleep();

        Amphibians grassSnake = new Amphibians("Уж пресноводный", 2, "водоём");
        grassSnake.data();
        grassSnake.go();
        grassSnake.eat();
        grassSnake.sleep();
        System.out.println("Повтор животных - " + frog.equals(grassSnake));

        FlightlessBirds peacock = new FlightlessBirds("Павлин", 2, "где-то там", "летать не умеет");
        peacock.data();
        peacock.go();
        peacock.eat();
        peacock.sleep();

        FlightlessBirds penguin = new FlightlessBirds("Пингвин", 2, "там где холодно", "летать не умеет");
        penguin.data();
        penguin.go();
        penguin.eat();
        penguin.sleep();

        FlightlessBirds dodo = new FlightlessBirds("Птица Додо", 2, "да хрен его знает", "летать не умеет");
        dodo.data();
        dodo.go();
        dodo.eat();
        dodo.sleep();
        System.out.println("Повтор животных - " + peacock.equals(penguin));
        System.out.println("Повтор животных - " + peacock.equals(dodo));
        System.out.println("Повтор животных - " + penguin.equals(dodo));

        FlyingBirds seagull = new FlyingBirds("Чайка", 2, "на море", "умеет летать");
        seagull.data();
        seagull.go();
        seagull.eat();
        seagull.sleep();

        FlyingBirds albatros = new FlyingBirds("Альбатрос", 2, "на море", "умеет летать");
        albatros.data();
        albatros.go();
        albatros.eat();
        albatros.sleep();

        FlyingBirds falcon = new FlyingBirds("Сокол", 2, "степи", "умеет летать");
        falcon.data();
        falcon.go();
        falcon.eat();
        falcon.sleep();
        System.out.println("Повтор животных - " + seagull.equals(albatros));
        System.out.println("Повтор животных - " + seagull.equals(falcon));
        System.out.println("Повтор животных - " + albatros.equals(falcon));

    }
}
