package info.caseyverica;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String type;
    private int HP;
    private int Str;

    public Monster(String type, int HP, int str) {
        this.type = type;
        this.HP = HP;
        Str = str;
    }

    public String getType() {
        return type;
    }

    public int getHP() {
        return HP;
    }

    public int getStr() {
        return Str;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "type='" + type + '\'' +
                ", HP=" + HP +
                ", Str=" + Str +
                '}';
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.type = savedValues.get(0);
            this.HP = Integer.parseInt(savedValues.get(1));
            this.Str = Integer.parseInt(savedValues.get(2));
        }

    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.type);
        values.add(1, "" + this.HP);
        values.add(2, "" + this.Str);
        return values;
    }
}
