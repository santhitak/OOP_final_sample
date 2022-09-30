public abstract class Bird extends Animal implements Flyable {
    public Bird(String name, int age){
        setName(name);
        setAge(age);
        setPower(150);
    }

    public abstract void wingAttack(Animal a);

    public void fly() {}

    public void eat(Food f){}
}
