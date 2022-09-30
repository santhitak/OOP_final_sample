public abstract class Animal {
    private String name;
    private int power, age;

    public Animal(){
        this.name = "";
        this.power = 0;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int power, int age){
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public boolean equals(Animal a){
        return a.name.equals(a.age);
    }

    public String toString(){
        return "Animal : name = " + this.name + ", power = " + this.power + ", age = " + age;
    }

    public abstract void eat(Food f);
}
