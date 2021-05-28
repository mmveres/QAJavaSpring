package ua.univer.lesson14;
import java.io.Serializable;

public class Droid implements Serializable {
    private String name;
    private int armorAmount;
    private int weaponsAmount;
 //   private transient Army army;
    private int weaponsPower;

    public Droid(String name, int armorAmount, int weaponsAmount, int weaponsPower) {
        this.name = name;
        this.armorAmount = armorAmount;
        this.weaponsAmount = weaponsAmount;
        this.weaponsPower = weaponsPower;
    }

    public Droid(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorAmount() {
        return armorAmount;
    }

    public void setArmorAmount(int armorAmount) {
        this.armorAmount = armorAmount;
    }

    public int getWeaponsAmount() {
        return weaponsAmount;
    }

    public void setWeaponsAmount(int weaponsAmount) {
        this.weaponsAmount = weaponsAmount;
    }

    public int getWeaponsPower() {
        return weaponsPower;
    }

    public void setWeaponsPower(int weaponsPower) {
        this.weaponsPower = weaponsPower;
    }

    public String toStringCSV() {
        return name + ";" +
                armorAmount + ";" +
                weaponsAmount + ";" +
                weaponsPower;
    }
    public String toStringTSV() {
        return name + " " +
                armorAmount + " " +
                weaponsAmount + " " +
                weaponsPower;
    }
    @Override
    public String toString() {
        return name + ";" +
                armorAmount + ";" +
                weaponsAmount + ";" +
                weaponsPower;
    }
}
