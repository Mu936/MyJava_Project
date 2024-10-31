import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        String command;

        System.out.println("Welcome to your Todo List Application!");

        do {
            System.out.println("\nAvailable commands: add, remove, list, exit");
            System.out.print("Enter a command: ");
            command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    todoList.addTask(new Task(description));
                    break;
                case "remove":
                    System.out.print("Enter task index to remove: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    todoList.removeTask(index);
                    break;
                case "list":
                    todoList.listTasks();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        } while (!command.equals("exit"));

        scanner.close();
    }
}
