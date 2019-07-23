package pl.javastart.model;

import java.util.Scanner;

public class NamesUtils {

    public String[] getNames(Scanner scanner){
        System.out.println("Wprowadź pięć imion");
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++){
            names[i] = scanner.nextLine();
        }
        return names;
    }

    public void sayHello(String[] names){

        int i = names.length - 1;
        while (i >= 0) {
            System.out.println("Cześć " + names[i]);
            i--;
        }
    }
}
