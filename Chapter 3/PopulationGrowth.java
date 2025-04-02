public class PopulationGrowth {
    public static void main(String[] args) {
        double population = 8_000_000_000.0; // Assume 8 billion today
        double growthRate = 1.05 / 100; // Example: 1.05% annual growth
        
        System.out.printf("%-5s %-20s %-20s%n", "Year", "Population", "Increase");

        for (int year = 1; year <= 75; year++) {
            double increase = population * growthRate;
            population += increase;
            System.out.printf("%-5d %-20.0f %-20.0f%n", year, population, increase);
        }
    }
}
