import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task_five_A_student
{
    public static void main(String[] args)
    {

        List<String> studentNames = Arrays.asList("Alice", "Bob", "Andrew", "Catherine", "Amanda", "John", "Alex", "Zara", "Annie", "David");

        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
}

