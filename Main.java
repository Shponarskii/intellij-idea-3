import java.util.Scanner;

public class Main
{
    static Cities cities = new Cities();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyFrame frame = new MyFrame();

        System.out.println("Input the name to search for: ");
        String q1=sc.nextLine();
        cities.search1(q1);
        System.out.println("Input the population to search for: ");
        int q2=sc.nextInt();
        cities.search2(q2);
        System.out.println("Input the square to search for: ");
        int q3=sc.nextInt();
        cities.search3(q3);
        String l=sc.nextLine();

        System.out.println("Input the name to delete the city: ");
        String q4=sc.nextLine();
        cities.del(q4);
        cities.print();

        System.out.println("sort by name:");
        cities.sortByName();
        cities.print();

        System.out.println("sort by population: ");
        cities.sortByPopulation();
        cities.print();

        System.out.println("sort by square: ");
        cities.sortBySquare();
        cities.print();

        System.out.println("Close the window to finish the program");
    }
}