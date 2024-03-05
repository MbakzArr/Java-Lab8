/**
 * Student class for a student with basic information.
 *
 * Parameters:
 * - firstName: The first name of the student.
 * - lastName: The last name of the student.
 * - idNumber: The ID number of the student.
 * - birthYear: The birth year of the student.
 * - percentageGrade: The percentage grade of the student.
 * - pass: The pass status of the student.
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * version 1.0
 * */

class Student
{
    private final String firstName;
    private final String lastName;
    private final String idNumber;
    private final int birthYear;
    private double percentageGrade;
    private boolean pass;

    private static final int GRADE_ZERO = 0;
    private static final int GRADE_MARK = 60;

    // Empty constructor
    Student() {}

    // Overloading the constructor
    Student(final String firstName,
            final String lastName,
            final String idNumber,
            final int birthYear,
            double percentageGrade)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setIdNumber(idNumber);
        setBirthYear(birthYear);
        setPercentageGrade(percentageGrade);
        setPass(percentageGrade >= GRADE_MARK);
    }

    // The getters methods
    String getFirstName()
    {
        return firstName;
    }

    String getLastName()
    {
        return lastName;
    }

    String getIdNumber()
    {
        return idNumber;
    }

    int getBirthYear()
    {
        return birthYear;
    }

    // the setters methods
    void setFirstName(final String firstName)
    {
        if (firstName != null && !firstName.isEmpty())
        {
            this.firstName = firstName;
        }
    }

    void setLastName(final String lastName)
    {
        if (lastName != null && !lastName.isEmpty())
        {
            this.lastName = lastName;
        }
    }

    void setIdNumber(final String idNumber)
    {
        if (idNumber != null && !idNumber.isEmpty())
        {
            this.idNumber = idNumber;
        }
    }

    void setBirthYear(final int birthYear)
    {
        if (birthYear > GRADE_ZERO)
        {
            this.birthYear = birthYear;
        }
    }

    void setPass(boolean pass)
    {
        this.pass = pass;
    }

    double getPercentageGrade()
    {
        return percentageGrade;
    }

    void setPercentageGrade(final double percentageGrade)
    {
        if (percentageGrade >= GRADE_ZERO)
        {
            this.percentageGrade = percentageGrade;
            setPass(percentageGrade >= GRADE_MARK);
        }
    }

    boolean isPass()
    {
        return pass;
    }

    @Override
    public String toString()
    {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", idNumber=" + idNumber +
                ", birthYear=" + birthYear + ", gradePct=" + percentageGrade + ", pass=" + pass + "]";
    }
}