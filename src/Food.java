public abstract class Food {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(){
        this.name = "";
    }

    public abstract int getPower();
}
