package StreamApi1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import java.util.List;
public class Main {
    public static void main(String[] args) {


       StudentSA  Artem = new StudentSA("art",4);
        StudentSA  Stas = new StudentSA("Stas", 8);
        StudentSA  Tem = new StudentSA("Tem", 5);
        StudentSA  Artur = new StudentSA("Artur", 6);




        System.out.println("Home Work");

        List< StudentSA> students = Arrays.asList(Artem,Stas, Tem, Artur);

        List<Integer> Sort = students.stream().map(StudentSA::getBall).toList();
        List<String> Sort1 = students.stream().map(StudentSA::getName).toList();

        System.out.println(students);
        System.out.println(Sort);
        System.out.println(Sort1);






    }
}
