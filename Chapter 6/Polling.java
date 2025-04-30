import java.util.Scanner;

public class Polling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] topics = {
            "Climate Change", "Healthcare", "Education", 
            "Income Inequality", "National Security"
        };
        
        int[][] responses = new int[5][10]; // 5 topics, 10 ratings each
        
        System.out.println("Rate each topic from 1 (least important) to 10 (most important)");
        
        for (int topic = 0; topic < topics.length; topic++) {
            System.out.println("\nTopic: " + topics[topic]);
            System.out.print("Enter your rating (1-10): ");
            int rating = input.nextInt();
            
            if (rating < 1 || rating > 10) {
                System.out.println("Invalid rating. Please try again.");
                topic--; // Repeat this topic
                continue;
            }
            
            responses[topic][rating - 1]++;
        }
        
        // Display results
        System.out.println("\nSurvey Results:");
        System.out.print("Topic\t\t");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("Average");
        
        int highestTotal = 0;
        int lowestTotal = Integer.MAX_VALUE;
        String highestTopic = "";
        String lowestTopic = "";
        
        for (int topic = 0; topic < topics.length; topic++) {
            System.out.printf("%-15s", topics[topic]);
            int total = 0;
            int count = 0;
            
            for (int rating = 0; rating < 10; rating++) {
                System.out.print(responses[topic][rating] + "\t");
                total += (rating + 1) * responses[topic][rating];
                count += responses[topic][rating];
            }
            
            double average = (double) total / count;
            System.out.printf("%.2f%n", average);
            
            if (total > highestTotal) {
                highestTotal = total;
                highestTopic = topics[topic];
            }
            
            if (total < lowestTotal) {
                lowestTotal = total;
                lowestTopic = topics[topic];
            }
        }
        
        System.out.println("\nHighest point total: " + highestTopic + " (" + highestTotal + ")");
        System.out.println("Lowest point total: " + lowestTopic + " (" + lowestTotal + ")");
    }
}