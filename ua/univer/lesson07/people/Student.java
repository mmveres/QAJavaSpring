package ua.univer.lesson07.people;

public class Student extends Person{
    private int groupId;

    public Student(String name, int groupId, int age) {
        super(name,age);
        this.groupId = groupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public void setAge(int age) {
        if (15<age && age<25)
            super.setAge(age);
    }

    @Override
    public double getDiscount() {
        return 0.75;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", groupId=" + groupId +
                ", age=" + super.getAge() +
                '}';
    }
}
