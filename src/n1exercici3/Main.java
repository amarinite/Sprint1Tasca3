package n1exercici3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        String username = "";
        int userScore = 0;

        textToMap("countries.txt", countries);
        ArrayList<String> keysAsArray = new ArrayList<String>(countries.keySet());
        Random r = new Random();

        System.out.println("What's your name?");
        username = scanner.next();
        for(int i = 0; i < 3; i++) {
            String country = keysAsArray.get(r.nextInt(keysAsArray.size()));
            String capital = countries.get(country);

            if(evaluateCountry(country, capital)) {
                userScore++;
            }
        }

        File userScores = new File("userScores.txt");
        writeScore(username, userScore, userScores);
    }

    public static boolean evaluateCountry(String country, String capital) {
        String answer;

        System.out.println("What's the capital of " + country + "?");
        answer = scanner.next();

        return answer.equalsIgnoreCase(capital);
    }

    public static void textToMap(String file, HashMap<String, String> map) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                String[] splitLine = line.split(" ");
                map.put(splitLine[0], splitLine[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeScore(String name, int score, File file) {
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(name + ": " + score + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}
