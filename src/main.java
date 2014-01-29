import java.util.Scanner;
import java.io.*;
import bootcamp.Animal;
import bootcamp.Cat;
import bootcamp.Breed;

/**
 * Created by christopher on 1/29/14.
 */
public class main
{
    public static void main(String[] args)
    {
        Scanner scanIn = new Scanner(System.in);

        String nameOfAnimal;
        String nameOfOwner;
        String nameOfBreed;
        int ageOfAnimal;
        int weightOfAnimal;
        int livesLeftOfAnimal;


        System.out.print("Welcome to the Cat's Registry!! ");
        System.out.print("\n\tPlease enter name of Cat: ");
        nameOfAnimal = scanIn.nextLine();

        System.out.print("\n\tPlease enter name of Owner: ");
        nameOfOwner = scanIn.nextLine();

        System.out.print("\n\tPlease enter name of Breed: ");
        nameOfBreed = scanIn.nextLine();

        System.out.print("\n\tPlease enter age of Cat: ");
        ageOfAnimal = scanIn.nextInt();

        System.out.print("\n\tPlease enter weight of Cat: ");
        weightOfAnimal = scanIn.nextInt();

        System.out.print("\n\tPlease enter lives(<3) of Cat: ");
        livesLeftOfAnimal = scanIn.nextInt();

        choices(nameOfBreed,ageOfAnimal,weightOfAnimal,livesLeftOfAnimal,nameOfAnimal,nameOfOwner);

    }

    public static void choices(String nameOfBreed, int ageOfAnimal,int weightOfAnimal,int livesLeftOfAnimal, String nameOfAnimal,String nameOfOwner){
        Scanner scanIn = new Scanner(System.in);
        int ChoiceOfMan;

        System.out.print("\nCHOICES OF DIRECTORY: \n\t[1] Animal Info\n\t[2] Cat Info\n\t[3] Breed Info\n\t[4] SUch Exit\n\n Enter Choice here: ");
        ChoiceOfMan =  scanIn.nextInt();

        switch(ChoiceOfMan){
            case 1:
                System.out.println("\n\nCHOICE 1: Animal Info");
                classAnimal(nameOfAnimal,nameOfOwner);
                break;

            case 2:
                System.out.println("\n\nCHOICE 2: Cat Info");
                classCat(ageOfAnimal,weightOfAnimal,livesLeftOfAnimal,nameOfAnimal,nameOfOwner);
                break;

            case 3:
                System.out.println("\n\nCHOICE 3: Breed Info");
                classBreed(nameOfBreed,ageOfAnimal,weightOfAnimal,livesLeftOfAnimal,nameOfAnimal,nameOfOwner);
                break;

            case 4:
                System.out.println("\n\nBYE!!: ");
                break;

            default:
                System.out.println("\n\nInvalid Choice");
                break;
        }
    }
    public static void classAnimal(String nameOfAnimal, String nameOfOwner){
        Animal cat1 = new Animal(nameOfAnimal, nameOfOwner);
        System.out.println(cat1.displayPetInfo());
    }

    public static void classCat(int ageOfAnimal,int weightOfAnimal,int livesLeftOfAnimal, String nameOfAnimal,String nameOfOwner){
        Cat cat2= new Cat(ageOfAnimal, weightOfAnimal, livesLeftOfAnimal, nameOfAnimal, nameOfOwner);
        System.out.println("\n" + cat2.getCatFullInfo());
    }

    public static void classBreed(String nameOfBreed, int ageOfAnimal,int weightOfAnimal,int livesLeftOfAnimal, String nameOfAnimal,String nameOfOwner){
        Breed cat3=new Breed(nameOfBreed, ageOfAnimal, weightOfAnimal, livesLeftOfAnimal, nameOfAnimal, nameOfOwner);
        System.out.println("\n" + cat3.getTotalInfo());
    }
}
