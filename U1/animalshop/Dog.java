package animalshop;

public class Dog extends Animal{
    private String name;
    private String barkNoise = "Woof";
    private Double weight;
    
    public Dog(String name, String breed, double weight, String colour){
        super(breed,colour);
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, String breed, String noise, double weight, String colour){
        super(breed,colour);
        this.name = name;
        barkNoise = noise;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(){
        this.weight = weight;
    }

    public void bark(){
        System.out.println(barkNoise);
    }
    public void bark(String barkNoise){
        System.out.println(barkNoise);
    }
}
