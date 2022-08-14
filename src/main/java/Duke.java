import java.util.LinkedList;
import java.util.Scanner;

public class Duke {

    public static void dukeGreet() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);

        System.out.println("Hello there! I'm Duke and I am you personal task tracking assistant!\nWhat can I do for you today?\n");

    }

    public static void dukeExit() {
       System.out.println("Bye. Hope to see you again soon!");
    }

    public static void echo() {
        LinkedList<String> storedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String userCommand = scanner.nextLine();

        while (!"bye".equals(userCommand)) {
            if ("list".equals(userCommand)) {
                for (int i = 0; i < storedList.size(); i++) {
                    int index = i + 1;
                    System.out.println(index + ". " + storedList.get(i));
                }
                System.out.println("\n");
            } else {
                storedList.add(userCommand);
                System.out.println("added: " + userCommand + "\n");
            }
            userCommand = scanner.nextLine();
        }
        dukeExit();
    }

    public static void main(String[] args) {
        dukeGreet();
        echo();
    }
}
