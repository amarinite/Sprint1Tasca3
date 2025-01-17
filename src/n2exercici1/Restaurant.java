package n2exercici1;

public class Restaurant {
    private String name;
    private int points;

    public Restaurant(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public boolean isEqual(Restaurant res)
    {
        return (res.getPoints() == this.points) && (res.getName().equalsIgnoreCase(this.name));
    }
}
