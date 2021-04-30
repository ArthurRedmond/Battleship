package battleship;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

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
        placeAircraftCarrier(gameplay);
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

    public static void placeAircraftCarrier(char[][] gameplay) {
        Scanner scanner = new Scanner(System.in);
        char[] aircraftCarrier = new char[5];
        char firstPostionRow;
        char firstPostionColumn;
        char lastPostionRow;
        char lastPostionColumn;

        System.out.println("\nEnter the coordinates of the Aircraft Carrier (5 cells):");
        String input = scanner.nextLine();
        char[] inputArray = input.toCharArray();

        firstPostionRow = inputArray[0];
        firstPostionColumn = inputArray[1];
        lastPostionRow = inputArray[3];
        lastPostionColumn = inputArray[4];

        boolean test = false;

        if (firstPostionRow == lastPostionRow || firstPostionRow == lastPostionRow) {
            test = true;
        }


    }
}

