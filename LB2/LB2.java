public class LB2 {
    public static void main(String[] args) {
        int levels = 6; 
        int rows = 4; 
        int cols = 5; 
        Tree(levels);
        int[][] array = createIntArray(rows, cols);
        printIntArray(array);
        

    }

    public static void Tree(int levels) {
        System.out.print("Ялинка:\n");
        for (int i = 0; i < levels; i++) {
              for (int j = 0; j < levels - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 1 + 1; j++) {
                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println(); 
        }
    }
    
    public static int[][] createIntArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 3;
        System.out.print("Масив:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value += 3;
            }
        }

        return array;
    }

    public static void printIntArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }
    }

}