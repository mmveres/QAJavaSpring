package ua.univer.lesson07.people;

public class Doctor extends Person{
    private int licenceId;

    public Doctor(String name, int licenceId, int age) {
        super(name, age);
        this.licenceId = licenceId;
    }


    public int getLicenceId() {
        return licenceId;
    }

    public void setLicenceId(int licenceId) {
        this.licenceId = licenceId;
    }

    public void setAge(int age) {
        if (30 < age && age<70)
            super.setAge(age);
    }

    @Override
    public double getDiscount() {
        return 0.5;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "licenceId=" + licenceId +
                "} " + super.toString();
    }
}
