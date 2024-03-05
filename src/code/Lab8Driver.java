/**
 * Lab8Driver class to manages student data for the Lab8 session, 
 * including interactive input and file reading capabilities.
 *
 * Parameters: None
 * Arguments: None
 * Return: None
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * version 1.0
 * */

import java.util.HashMap;

class Lab8Driver {
    private HashMap<String, Student> students;

    // setting array elements
    private static final int INDEX_ONE   = 0;
    private static final int INDEX_TWO   = 1;
    private static final int INDEX_THREE = 2;
    private static final int INDEX_FOUR  = 3;
    private static final int INDEX_FIVE  = 4;

    // Construcor
    Lab8Driver()
    {
        students = new HashMap<>();
    }

    void readFromPrompt()
    {
        boolean proceed = true;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        do {
            System.out.println("Do you wish to create a Student? (y/n): ");
            String choice = scanner.next().toLowerCase();
            if (choice.equals("y"))
            {
                System.out.println("Enter first name:");
                String firstName = scanner.next();
                System.out.println("Enter last name:");
                String lastName = scanner.next();
                System.out.println("Enter id number:");
                String idNumber = scanner.next();
                System.out.println("Enter birth year as a whole number:");
                int birthYear = scanner.nextInt();
                System.out.println("Enter grade (percent) as a decimal number:");
                double percentageGrade = scanner.nextDouble();
                students.put(idNumber, new Student(firstName, lastName, idNumber, birthYear, percentageGrade));
            } else
            {
                proceed = false;
            }
        } while (proceed);
        scanner.close();
    }

    void readFromFile()
    {
        try {
            java.util.Scanner fileScanner = new java.util.Scanner(new java.io.File("student_data.txt"));
            while (fileScanner.hasNextLine())
            {
                String[] data          = fileScanner.nextLine().split(",");
                String firstName       = data[INDEX_ONE];
                String lastName        = data[INDEX_TWO];
                String idNumber        = data[INDEX_THREE];
                int birthYear          = Integer.parseInt(data[INDEX_FOUR]);
                double percentageGrade = Double.parseDouble(data[INDEX_FIVE]);
                students.put(idNumber, new Student(firstName, lastName, idNumber, birthYear, percentageGrade));
            }
            fileScanner.close();
        } catch (java.io.FileNotFoundException e)
        {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    void showStudents()
    {
        for (Student student : students.values())
        {
            System.out.println(student);
        }
    }

    public static void main(String[] args)
    {
        Lab8Driver driver = new Lab8Driver();
        System.out.println("DEBUG: calling readFromPrompt");
        driver.readFromPrompt();
        System.out.println("\nDEBUG: calling readFromFile");
        driver.readFromFile();
        System.out.println("\nList of Students created");
        driver.showStudents();
    }
}
