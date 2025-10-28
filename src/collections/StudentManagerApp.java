package collections;

import java.util.*;

public class StudentManagerApp {

    // Simple Student record (id is unique)
    static class Student {
        private final String id;
        private String name;
        private int age;

        Student(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public String id()   { return id; }
        public String name() { return name; }
        public int age()     { return age; }

        public void setName(String name) { this.name = name; }
        public void setAge(int age)      { this.age = age; }

        @Override public String toString() {
            return String.format("Student{id='%s', name='%s', age=%d}", id, name, age);
        }
    }

    private final Map<String, Student> db = new LinkedHashMap<>();
    private final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new StudentManagerApp().run();
    }

    private void run() {
        while (true) {
            printMenu();
            int choice = readInt("Choose option: ");
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> listStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> { System.out.println("Bye!"); return; }
                default -> System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }
    }

    private void printMenu() {
        System.out.println("==== Student Manager ====");
        System.out.println("1. Add Student");
        System.out.println("2. List Students");
        System.out.println("3. Search by ID");
        System.out.println("4. Update by ID");
        System.out.println("5. Delete by ID");
        System.out.println("6. Exit");
    }

    private void addStudent() {
        String id = readNonEmpty("ID (unique): ");
        if (db.containsKey(id)) {
            System.out.println("ID already exists.");
            return;
        }
        String name = readNonEmpty("Name: ");
        int age = readBoundedInt("Age: ", 1, 120);
        db.put(id, new Student(id, name, age));
        System.out.println("Added.");
    }

    private void listStudents() {
        if (db.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        db.values().forEach(System.out::println);
    }

    private void searchStudent() {
        String id = readNonEmpty("Enter ID: ");
        Student s = db.get(id);
        System.out.println(s == null ? "Not found." : s);
    }

    private void updateStudent() {
        String id = readNonEmpty("Enter ID to update: ");
        Student s = db.get(id);
        if (s == null) { System.out.println("Not found."); return; }

        String name = prompt("New name (leave blank to keep '" + s.name() + "'): ");
        String ageStr = prompt("New age (leave blank to keep " + s.age() + "): ");

        if (!name.isBlank()) s.setName(name);
        if (!ageStr.isBlank()) {
            try {
                int age = Integer.parseInt(ageStr);
                if (age < 1 || age > 120) throw new NumberFormatException();
                s.setAge(age);
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Keeping previous value.");
            }
        }
        System.out.println("Updated: " + s);
    }

    private void deleteStudent() {
        String id = readNonEmpty("Enter ID to delete: ");
        Student removed = db.remove(id);
        System.out.println(removed == null ? "Not found." : "Deleted: " + removed);
    }

    // ----- Input helpers -----
    private String prompt(String msg) {
        System.out.print(msg);
        return in.nextLine();
    }

    private String readNonEmpty(String msg) {
        while (true) {
            String s = prompt(msg).trim();
            if (!s.isBlank()) return s;
            System.out.println("Value cannot be empty.");
        }
    }

    private int readInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                String s = in.nextLine().trim();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid integer.");
            }
        }
    }

    private int readBoundedInt(String msg, int min, int max) {
        while (true) {
            int v = readInt(msg);
            if (v < min || v > max) {
                System.out.printf("Enter between %d and %d.%n", min, max);
            } else return v;
        }
    }
}
