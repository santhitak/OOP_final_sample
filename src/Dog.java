public class Dog extends Animal{
    public Dog(String name, int age){
        setName(name);
        setAge(age);
        setPower(200);
    }

    public void eat(Food f){
        setPower(f.getPower() * 2);
    }

    public void kick(Animal a){
        a.setPower(a.getPower() - 10);
    }
}
