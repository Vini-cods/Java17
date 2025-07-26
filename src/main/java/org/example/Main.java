package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");

        int[] numeros = new int[5]; // Array de tamanho fixo
        ArrayList<Integer> numerosLista = new ArrayList<>(); // ArrayList dinâmico

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add(1, "Laranja"); // Insere "Laranja" na posição 1
        System.out.println(frutas.get(0)); // Exibe "Maçã"
        frutas.remove(1); // Remove "Laranja"
        System.out.println(frutas.size()); // Exibe 2

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = frutas.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        ArrayList<Integer> Numeros = new ArrayList<>();
        Numeros.add(10); // Autoboxing: int 10 é convertido para Integer
        int valor = Numeros.get(0); // Unboxing: Integer é convertido para int

    }
}