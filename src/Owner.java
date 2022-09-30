public class Owner extends Animal {
    protected final String name;
    protected Animal animal;

    public String getName() {
        return name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Owner(){
        this.name = "";
        this.animal = null;
    }

    public Owner(String name){
        this.name = name;
        this.animal = null;
    }

    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }

    public void feedFood(Food f){
        eat(f);
    }

    public String toString(){
        return "Owner : name = " + this.name + ", Animal : name = " + this.animal.getName() + ", power =  "
                + this.animal.getPower() + ", age = " + this.animal.getAge();
    }

    @Override
    public void eat(Food f) {
        this.animal.setPower(animal.getPower() + f.getPower());
    }

    public void protectOwnerFrom(Animal a){
        new Dog(getName(), getAge()).kick(a);
        new Pigeous(getName(),getAge()).wingAttack(a);
    }
}
