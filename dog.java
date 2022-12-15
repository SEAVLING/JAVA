package animal;

public class dog  extends main_animal{
    public dog(String name, String color, String breed, int age){
        this.name = name;
        this.color = color;
        this.breed = breed;

    }
    public void bark(){
        System.out.println("Woof Woof...");
    }
}
