
class InvalidVoterAgeException extends Exception
{
    public InvalidVoterAgeException(String message)
    {
        super(message);
    }
}

class Voter
{
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException
    {
        this.voterId = voterId;
        this.name = name;
        if (age < 18)
        {
            throw new InvalidVoterAgeException("Invalid age for voter");
        }
        this.age = age;
    }

    public int getVoterId()
    {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

