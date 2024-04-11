package Cognifyz_Tasks.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". Title: " + task.getTitle() + ", Description: " + task.getDescription());
        }
    }

    public void updateTask(int index, Task newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Invalid task index!");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task index!");
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(title, description);
                    taskManager.addTask(newTask);
                    break;
                case 2:
                    taskManager.displayTasks();
                    break;
                case 3:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter new task title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    Task updatedTask = new Task(newTitle, newDescription);
                    taskManager.updateTask(updateIndex, updatedTask);
                    break;
                case 4:
                    System.out.print("Enter task index to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    taskManager.deleteTask(deleteIndex);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }
}
