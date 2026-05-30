import java.util.*;

public class CodeVita2 {

    
    static class Board {
        Map<Integer, Integer> cellTransitions = new HashMap<>();

    
        public int getNextPosition(int currentPosition) {
            return cellTransitions.getOrDefault(currentPosition, currentPosition);
        }

        public void addTransition(int from, int to) {
            cellTransitions.put(from, to);
        }

        public boolean hasTransition(int position) {
            return cellTransitions.containsKey(position);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTransitions = Integer.parseInt(scanner.nextLine());
        Board gameBoard = new Board();
        Map<Integer, Integer> originalTransitions = new HashMap<>();
        
        for (int i = 0; i < numTransitions; i++) {
            int startCell = scanner.nextInt();
            int endCell = scanner.nextInt();
            gameBoard.addTransition(startCell, endCell);
            originalTransitions.put(startCell, endCell);
        }
        scanner.nextLine();  // Move to the next line after reading transitions
        List<Integer> diceRolls = new ArrayList<>();
        String[] diceInputs = scanner.nextLine().split(" ");
        for (String roll : diceInputs) {
            diceRolls.add(Integer.parseInt(roll));
        }

        // Read the target position
        int targetCell = scanner.nextInt();

        // Simulate the game and check if the target cell is reached
        int currentCell = 1;
        for (int roll : diceRolls) {
            currentCell += roll;
            if (currentCell > 100) {
                currentCell = 100;
            }
            if (originalTransitions.containsKey(currentCell)) {
                currentCell = originalTransitions.get(currentCell);
            }
        }

        // If the target cell is reached, print "Not affected"
        if (currentCell == targetCell) {
            System.out.println("Not affected");
            return;
        }
        for (Map.Entry<Integer, Integer> entry : originalTransitions.entrySet()) {
            int startCell = entry.getKey();
            int endCell = entry.getValue();

            // Create a modified board by swapping the start and end cells
            Board modifiedBoard = new Board();
            modifiedBoard.cellTransitions.putAll(originalTransitions);
            modifiedBoard.addTransition(endCell, startCell);

            // Simulate the game with the modified board
            int newPosition = 1;
            for (int roll : diceRolls) {
                newPosition += roll;
                if (newPosition > 100) {
                    newPosition = 100;
                }
                if (modifiedBoard.hasTransition(newPosition)) {
                    newPosition = modifiedBoard.getNextPosition(newPosition);
                }
            }
            if (newPosition == targetCell) {
                if (startCell < endCell) {
                    System.out.println("Ladder " + startCell + " " + endCell);
                } else {
                    System.out.println("Snake " + startCell + " " + endCell);
                }
                return;
            }
        }

        System.out.println("Not reachable");

        scanner.close();
    }
}
