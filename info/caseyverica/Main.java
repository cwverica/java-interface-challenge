package info.caseyverica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player casey = new Player("Casey", 25, 7);
        casey.toString();
        saveObject(casey);

        casey.setHP(99);
        System.out.println(casey);
        casey.setWeapon("mJolner");
        saveObject(casey);
//        loadObject(casey);
        System.out.println(casey);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Check out this code! (Displays HP): " + ((Monster) werewolf).getHP());
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1. to enter a string\n" +
                "2. to quit.");

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 2:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String strInput = scanner.nextLine();
                    values.add(index, strInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }



}
