public class TreasureFinder {

    public static void main(String[] args) {

        char[][] grid = {
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
            {'+', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };

        findTreasure(grid);
    }

    /**
     * Finds and prints the coordinates of the treasure ('+') in the map.
     */
    public static void findTreasure(char[][] map) {

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {

                if (map[row][col] == '+') {
                    System.out.println("Treasure found at row " + (row + 1) + ", column " + (col + 1));
                    return; // stop once found
                }
            }
        }

        System.out.println("No treasure found.");
    }
}
