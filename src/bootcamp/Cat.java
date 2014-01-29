package bootcamp;
/**
 * Created by christopher on 1/29/14.
 */

public class Cat extends Animal {
    int age;
    int weight;
    int lives;

    public Cat()
    {
    }

    public Cat(int age, int weight, int lives)
    {
        this.age = age;
        this.weight = weight;
        this.lives = lives;
    }

    public Cat(int age, int weight, int lives, String animalName, String ownerName)
    {
        super(animalName,ownerName);
        this.age = age;
        this.weight = weight;
        this.lives = lives;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getAge(int age) {
        return age;
    }

    public int getWeight(int weight) {
        return weight;
    }

    public int getLives(int lives) {
        return lives;
    }

    public String getCatOnlyInfo()
    {
        String text1 = "Age of cat: " + this.age;
        String text2 = "Weight of cat: " + this.weight;
        String text3 = "Lives of cat: " + this.lives;
        return text1 + "\n" + text2 + "\n" + text3;
    }

    public String getCatFullInfo()
    {
        String text1 = "Age of cat: " + this.age;
        String text2 = "Weight of cat: " + this.weight;
        String text3 = "Lives of cat: " + this.lives;
        // String text4 = "Name of cat: " + this.animalName;
        //String text5 = "Name of owner: " + this.ownerName;
        //return text5 + "\n" + text4 + "\n" + text1 + "\n" + text2 + "\n" + text3;
        return displayPetInfo() + "\n" + text1 + "\n" + text2 + "\n" + text3;
    }
}
