import java.util.ArrayList;

public class Cities
{
    ArrayList<City> a;

    public Cities() {
        a = new ArrayList<>();
    }

    void add(City s)
    {
        a.add(s);
    }

    void del(String name)
    {
        int p=-1;
        for (int i=0;i<a.size();i++)
            if (name.equalsIgnoreCase(a.get(i).getName()))
                p=i;
        if (p>-1)
        {
            a.remove(p);
            System.out.println("City was removed "+name);
        }
        else System.out.println("City with that name doesn't exist");
    }

    void print()
    {
        for(int i=0;i<a.size();i++)
            System.out.println(a.get(i).toString());
    }

    void sortByName()
    {
        a.sort(City.NameComparator);
    }

    void sortByPopulation()
    {
        a.sort(City.PopulationComparator);
    }

    void sortBySquare()
    {
        a.sort(City.SquareComparator);
    }

    void search1(String name)
    {
        int p=-1;
        for (int i=0;i<a.size();i++)
            if (name.equalsIgnoreCase(a.get(i).getName()))
            {
                p=i;
                System.out.println(a.get(i).toString());
            }
        if (p==-1) System.out.println("City with that name doesn't exist");
    }

    void search2(int population)
    {
        int p=-1;
        for (int i=0;i<a.size();i++)
            if (population==a.get(i).getPopulation())
            {
                p=i;
                System.out.println(a.get(i).toString());
            }
        if (p==-1) System.out.println("City with that population doesn't exist");
    }

    void search3(int square)
    {
        int p=-1;
        for (int i=0;i<a.size();i++)
            if (square==a.get(i).getSquare())
            {
                p=i;
                System.out.println(a.get(i).toString());
            }
        if (p==-1) System.out.println("City with that square doesn't exist");
    }
}
