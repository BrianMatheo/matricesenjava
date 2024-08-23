package com.javalovers.matricesenjava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matricesenjava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz;
        int filas;
        int columnas;
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("digite filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("digite columnas"));
        
        matriz = new int[filas][columnas];
        
        for(int i = 0; i < filas; i++){ 
            for(int j = 0; j < columnas;j++){ 
                System.out.println("matriz" + i + " " + j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < filas; i++){ 
            for(int j = 0; j < columnas;j++){
                System.out.print(matriz[i][j]);
            }
            }
    }
}
