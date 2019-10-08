package atm;

import java.util.Scanner;

public class CommandLineAtm {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            CommandRouter commandRouter = new CommandRouter();
            while (scanner.hasNextLine()) {
                commandRouter.route(scanner.nextLine());
            }
        }

    }

}
