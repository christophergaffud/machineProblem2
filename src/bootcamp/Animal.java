package bootcamp;

/**
 * Created by christopher on 1/29/14.
 */
public class Animal {
    String animalName;
    String ownerName;

    public Animal(String animalName, String ownerName)
    {
        this.animalName = animalName;
        this.ownerName = ownerName;
    }

    public Animal()
    {
    }

    public void setAnimalName(String animalName)
    {
        this.animalName=animalName;
    }

    public String getAnimalName(String animalName)
    {
        return animalName;
    }


    public void setOwnerName(String ownerName)
    {
        this.ownerName=ownerName;
    }

    public String getOwnerName(String ownerName)
    {
        return ownerName;
    }
    public String displayPetInfo()
    {
        String animalNameText = "Animal name: " + this.animalName;
        String ownerNameText = "Owner name: " + this.ownerName;

        return animalNameText + "\n" + ownerNameText;
    }
}
