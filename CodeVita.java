import java.util.*;

public class CodeVita {

    // Function to calculate intersection point of two lines
    public static double[] lineIntersection(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Denominator for the intersection formula
        double denom = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        
        if (denom == 0) {
            return null; // Lines are parallel or coincident
        }

        // Calculate intersection point using determinant method
        double x = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denom;
        double y = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denom;
        
        return new double[] {x, y};  // Return intersection point (x, y)
    }

    // Function to calculate intensity of stars of a specific type
    public static int calculateIntensity(List<int[]> lines, int starType) {
        Map<String, Set<Integer>> intersections = new HashMap<>();

        // Iterate over all pairs of lines and check for intersections
        for (int i = 0; i < lines.size(); i++) {
            for (int j = i + 1; j < lines.size(); j++) {
                int[] line1 = lines.get(i);
                int[] line2 = lines.get(j);

                // Get the intersection point of two lines
                double[] intersection = lineIntersection(line1[0], line1[1], line1[2], line1[3], line2[0], line2[1], line2[2], line2[3]);
                if (intersection != null) {
                    // Convert the intersection point to a string for easy lookup
                    String key = String.format("%.6f,%.6f", intersection[0], intersection[1]);

                    // Add the line indices to the intersection point set
                    intersections.putIfAbsent(key, new HashSet<>());
                    intersections.get(key).add(i);
                    intersections.get(key).add(j);
                }
            }
        }

        // Calculate intensity for each intersection point
        int totalIntensity = 0;
        for (Set<Integer> linesAtPoint : intersections.values()) {
            if (linesAtPoint.size() == starType) {
                // For now, set intensity as 1 (this should be expanded to consider the number of cells touched)
                totalIntensity += 1;
            }
        }

        return totalIntensity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of lines
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after integer input

        // Read the lines
        List<int[]> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            int x1 = Integer.parseInt(line[0]);
            int y1 = Integer.parseInt(line[1]);
            int x2 = Integer.parseInt(line[2]);
            int y2 = Integer.parseInt(line[3]);
            lines.add(new int[] {x1, y1, x2, y2});
        }

        // Read the star type
        int starType = scanner.nextInt();

        // Calculate the intensity for the specified star type
        int intensity = calculateIntensity(lines, starType);

        // Output the result
        System.out.println(intensity);

        scanner.close();
    }
}
