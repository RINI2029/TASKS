// Custom exception for age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for name validation
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private int rollNo;
    private int age;
    private String name;
    private String course;

    public Student(int rollNo, int age, String name, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.course = course;

        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }
        this.age = age;

        // Validate name
        if (!name.matches("[A-Za-z]+")) {
            throw new NameNotValidException("Name contains numbers or special characters");
        }
        this.name = name;
    }

    // Getter methods (optional)
    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}


  class handling{
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, 18, "John", "Computer Science");
            System.out.println("Student " + student1.getName() + " has been created successfully.");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student2 = new Student(2, 22, "Jane", "Mathematics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student3 = new Student(3, 19, "Jane123", "Physics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

