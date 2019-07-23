package pl.javastart.app;
import pl.javastart.model.NamesUtils;

import java.util.Scanner;

public class NamesTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NamesUtils nameutil = new NamesUtils();
        String[] names = nameutil.getNames(scanner);

        nameutil.sayHello(names);

        scanner.close();
    }
}
