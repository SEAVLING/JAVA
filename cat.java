package animal;

public class cat extends main_animal{
    public cat(String name, String color, String breed, int age){
        this.name = name;
        this.color = color;
        this.breed = breed;

    }
    public void bark(){
        System.out.println("Meov Meov...");
    }
}
