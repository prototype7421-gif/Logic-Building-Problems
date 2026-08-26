import java.util.Scanner;

class Info {
    String name;
    int salary;

    Info(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ids = {1, 2, 3};
        Info[] infos = {
            new Info("a", 23),
            new Info("b", 222),
            new Info("c", 333)   // added third employee
        };

        System.out.println("Enter your ID:");
        int enteredId = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < ids.length; i++) {
            if (enteredId == ids[i]) {
                System.out.println("Name: " + infos[i].name);
                System.out.println("Salary: " + infos[i].salary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No employee found with ID " + enteredId);
        }

        sc.close();
    }
}
