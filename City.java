import java.util.Comparator;

public class City
{
    private String name;
    private int population;
    private int square;

    public City(String name, int population, int square) {
        this.name = name;
        this.population = population;
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getSquare() {
        return square;
    }

    public static Comparator<City> NameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

    public static Comparator<City> PopulationComparator = (o1, o2) -> o1.getPopulation()-o2.getPopulation();

    public static Comparator<City> SquareComparator = (o1, o2) -> o1.getSquare()-o2.getSquare();

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", square=" + square +
                '}';
    }
}
