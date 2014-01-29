package bootcamp;

/**
 * Created by christopher on 1/29/14.
 */
public class Breed extends Cat
{

    String description;

    public Breed(String description)
    {
        this.description=description;
    }

    public Breed(String description, int age, int weight, int lives, String animalName, String ownerName)
    {
        super(age, weight, lives, animalName, ownerName);
        this.description=description;
    }
    public String getBreedDescription()
    {
        return this.description;
    }

    public String getTotalInfo()
    {

            String a = "DESCRIPTION: \n\nThe domestic cat is a small, usually furry, domesticated, and carnivorous mammal.\nIt is often called the housecat when kept as an indoor pet,\nor simply the cat when there is no need to distinguish\nit from other felids and felines.\n\n" + "CAT INFORMATION\n\n" + getCatFullInfo() + "\n";
            return a;

    }
}
