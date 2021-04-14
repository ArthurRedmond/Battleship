package battleship;

public class Main {

    public static void main(String[] args) {
        char[][] gameplay = new char[10][10];
        startGame(gameplay);
    }

    public static void startGame(char[][] gameplay) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameplay[i][j] = '~';
            }
        }
        printGame(gameplay);
    }


    public static void printGame(char[][] gameplay) {
        int index = 0;
        int row = 65;
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < 10; i++) {
            System.out.print((char)row + " ");
            row++;
            for (int j = 0; j < 10; j++) {
                System.out.print(gameplay[index][j] + " ");
            }
            System.out.println();
            index++;
        }
    }
}
