package main;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

import static merge.Merge.merge;

public class Main {
    public static void main(String args []){
        int X [] = new int[10];
        int i;
        Scanner entrada = new Scanner(System.in);
        for(i=0;i<=9;i++)
        {
            System.out.println("digite o "+(i+1)+"º numero: ");
            X[i] = entrada.nextInt();
        }
        merge(X,0,9);
        for(i=0;i<=9;i++){
            System.out.println((i+1)+"º numero: "+X[i]);
        }
    }
}

