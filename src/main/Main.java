package main;

import intercala.Intercala;
import jdk.jshell.SourceCodeAnalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static merge.Merge.merge;

public class Main {
    public static void main(String args[]) throws IOException {
        List<Integer> valores = new ArrayList<Integer>();

        BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/guilh/Downloads/1000_numbers.txt"));
        String numeros;
        int i;

        ///int converted = Integer.parseInt(br2);

        while ((numeros = br2.readLine()) != null) {
            int converted = Integer.parseInt(numeros);
            valores.add(converted);
            ///System.out.println(valores);
        }
        merge(valores, 0, 999);
        for (i = 0; i <= 999; i++) {
            System.out.println((i + 1) + "º numero: " + valores.get(i));
        }
    }
}


