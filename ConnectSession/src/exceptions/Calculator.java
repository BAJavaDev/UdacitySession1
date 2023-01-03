package exceptions;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Please select an option:");
        Integer operation = scanner.nextInt();

        System.out.println("Please enter your first number:");
        Integer num1 = scanner.nextInt();
        System.out.println("Please enter your second number:");
        Integer num2 = scanner.nextInt();
        try {
           // getMathRulesFromApi();

            switch (operation) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    subtract(num1, num2);
                    break;
                case 3:
                    multiply(num1, num2);
                    break;
                case 4:
                    divide(num1, num2);
                    break;

                default:
                    throw new Exception("Operation selected is not supported");

            }
        } catch (URISyntaxException|IOException|InterruptedException ex) {
            System.out.println("Failed to fetch math rules from api");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.toString());
        }

        System.out.println("Shutting down successfully");
    }

    private static void getMathRulesFromApi() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://mathrules.com"))
                .GET()
                .build();

        HttpResponse<String> response = HttpClient.newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
    }

    private static void divide(Integer num1, Integer num2) {
        System.out.println(num1/num2);
    }

    private static void multiply(Integer num1, Integer num2) {
        System.out.println(num1*num2);
    }

    private static void subtract(Integer num1, Integer num2) {
        System.out.println(num1-num2);
    }

    private static void add(Integer num1, Integer num2) {
        System.out.println(num1+num2);
    }


}
