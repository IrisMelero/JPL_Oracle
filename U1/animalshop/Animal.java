package animalshop;

public class Animal{
    private String breed, colour;

    public Animal(String breed, String colour){
        this.breed = breed;
        this.colour = colour;
    }
    
    public String getBreed(){
        return breed;
    }
    public void setBreed(){
        this.breed = breed;
    }

    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
}
