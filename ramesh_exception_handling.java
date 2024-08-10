
class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message)
    {
        super(message);
   }
}
class NameNotValidException extends Exception 
{
    public NameNotValidException(String message) 
    {
        super(message);
    }
}
class Student 
{
    private int rollNo;
    private int age;
    private String name;
    private String course;

    public Student(int rollNo, int age, String name, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.course = course;
 
        if (age < 15 || age > 21) 
        {
            throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21");
        }
        this.age = age;


        if (!name.matches("[A-Za-z]+"))
        {
            throw new NameNotValidException("Name contains numbers or special characters");
        }
        this.name = name;
    }


    public int getRollNo() 
    {
        return rollNo;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
                                                                                                                                    
    public String getCourse() 
    {
        return course;
    }
}


  
