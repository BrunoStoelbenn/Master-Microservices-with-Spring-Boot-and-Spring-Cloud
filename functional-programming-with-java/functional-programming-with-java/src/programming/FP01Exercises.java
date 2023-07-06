package programming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API",
                "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates");
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        printOddNumbersInListFunctional(numbers);
        printAllCoursesIndividually(courses);
        printAllCoursesWithSpringIndividually(courses);
        printCoursesWithAtLeast4LettersIndividually(courses);
        printCubesOfOddNumbersInListFunctional(numbers);
        printNumberOfCharactersInEachCourse(courses);

    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {

        System.out.println("\nPrinting Odd Numbers\n");
        numbers.stream()
                //.filter(FP01Functional::isEven)
                .filter(number -> number%2 != 0) //Lambda Expression
                .forEach(System.out::println); //Method Reference

    }

    private static void printAllCoursesIndividually(List<String> courses){
        System.out.println("\nPrinting all courses individually\n");
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printAllCoursesWithSpringIndividually(List<String> courses){
        System.out.println("\nPrinting Only Courses With Spring Word individually\n");
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printCoursesWithAtLeast4LettersIndividually(List<String> courses){
        System.out.println("\nPrinting Only Courses With At Least 4 Letters individually\n");
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {

        System.out.println("\nPrinting Cubes Of Odd Numbers\n");
        numbers.stream()
                //.filter(FP01Functional::isEven)
                .filter(number -> number%2 != 0) //Lambda Expression
                //mapping - x -> x * x
                .map(number -> number * number * number)
                .forEach(System.out::println); //Method Reference

    }

    private static void printNumberOfCharactersInEachCourse(List<String> courses){
        System.out.println("\nPrinting Number Of Characters of Each Course Name\n");
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }


}