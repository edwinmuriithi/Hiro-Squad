import java.util.ArrayList;
import java.util.List;

public class Squad {
    private int max_size;
    private String name;
    private String cause;
    private static List<Squad> instances = new ArrayList<Squad>();
    private int id;
    private List<Hero> heroes;

    public Squad(int max_size, String name, String cause) {
        this.max_size = max_size;
        this.name = name;
        this.cause = cause;
        instances.add(this);
        id = instances.size();
        heroes = new ArrayList<Hero>();
    }

    public int getMax_size() {
        return max_size;
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }
    public static List<Squad> all() {
        return instances;
    }
    public static void clear() {
        instances.clear();
    }

    public int getId()
    {
        return id;
    }

    public static Squad find(int id) {
        return instances.get(id - 1);
    }
    public List<Hero> getHeroes()
    {
        return heroes;
    }
    public void addHero(Hero hero) {
        heroes.add(hero);
    }
}