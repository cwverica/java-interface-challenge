package info.caseyverica;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int HP;
    private int Str;
    private String weapon;


    public Player(String name, int HP, int str) {
        this.name = name;
        this.HP = HP;
        this.Str = str;
        this.weapon = "Pike";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getStr() {
        return Str;
    }

    public void setStr(int str) {
        Str = str;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", Str=" + Str +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() >0) {
            this.name = savedValues.get(0);
            this.HP = Integer.parseInt(savedValues.get(1));
            this.Str = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, ""+this.HP);
        values.add(2, "" + this.Str);
        values.add(3, this.weapon);
        return values;
    }







}
