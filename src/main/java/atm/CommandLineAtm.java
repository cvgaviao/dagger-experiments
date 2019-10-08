package atm;

import java.util.Scanner;

import atm.dagger.CommandRouterFactory;
import atm.dagger.DaggerCommandRouterFactory;

public class CommandLineAtm {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            CommandRouterFactory routerFactory = DaggerCommandRouterFactory.create();
            CommandRouter commandRouter = routerFactory.router();

            while (scanner.hasNextLine()) {
                commandRouter.route(scanner.nextLine());
            }
        }

    }

}
