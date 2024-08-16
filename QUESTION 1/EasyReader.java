/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oppexams;

/**
 *

 */



import java.util.Scanner;

public class EasyReader {
    private Scanner scanner;

    public EasyReader() {
        scanner = new Scanner(System.in);
    }

    public String readString() {
        return scanner.nextLine();
    }

    public int readInt() {
        return scanner.nextInt();
    }
}
