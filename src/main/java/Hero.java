import java.util.ArrayList;
import java.util.List;

public class Hero {

        private String name;
        private int age;
        private String specialPower;
        private  String weakness;
        private static List<Hero> instances = new ArrayList<Hero>();
        private int Id;

        public Hero(String name, int age, String special_power, String weakness) {
            this.name = name;
            this.age = age;
            this.specialPower = special_power;
            this.weakness = weakness;
            instances.add(this);
            Id = instances.size();
        }

        public String getName() {
            return name;
        }

    public int getAge() {
        return age;
    }

    public String getSpecial_power() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }
    public static List<Hero> all() {
        return instances;
    }
}