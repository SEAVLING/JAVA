package constructor;

public class Student {    
    public int id;
    public String name;
    public int age;
    public String gender;
    public String dateofbirth;
    static int counter = 0;
    Object A2;

    public Student(int i, String string, int j, String string2, String string3) {
        
    }

    public Student() {
        this.A2 = new Student(7, "Chhengngor", 15 ,"Female", "14/05/2005");
    }

    public static void main(String[] args) {
        Student A1 = new Student();
        A1.id = 4343;
        A1.name = "Kimseak";
        A1.age = 20;
        A1.gender = "Female";
        A1.dateofbirth = "23/01/2002";
        counter ++;

        A1.setName("Seakngim");

        System.out.println("Name: " + A1.name);
        System.out.println("Class: " + Student.getCounter());
    }
    public static int getCounter() {
        return counter;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getDateofbirth() {
        return dateofbirth;
    }
    public void setName(String name) {
        this.name = name;
    }
}

