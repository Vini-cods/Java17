package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        ArrayList<String> nomes = new ArrayList<>();
//        nomes.add("Alice");
//        nomes.add("Bob");
//
//        int[] numeros = new int[5]; // Array de tamanho fixo
//        ArrayList<Integer> numerosLista = new ArrayList<>(); // ArrayList dinâmico
//
//        ArrayList<String> frutas = new ArrayList<>();
//        frutas.add("Maçã");
//        frutas.add("Banana");
//        frutas.add(1, "Laranja"); // Insere "Laranja" na posição 1
//        System.out.println(frutas.get(0)); // Exibe "Maçã"
//        frutas.remove(1); // Remove "Laranja"
//        System.out.println(frutas.size()); // Exibe 2
//
//        for (String fruta : frutas) {
//            System.out.println(fruta);
//        }
//
//        Iterator<String> iterator = frutas.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        ListIterator<String> listIterator = frutas.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//
//        ArrayList<Integer> Numeros = new ArrayList<>();
//        Numeros.add(10); // Autoboxing: int 10 é convertido para Integer
//        int valor = Numeros.get(0); // Unboxing: Integer é convertido para int
//
//
//        // Criando uma ArrayList de strings
//        ArrayList<String> estudantes = new ArrayList<>();
//
//        // Adicionando elementos à lista
//        estudantes.add("Alice");
//        estudantes.add("Bob");
//        estudantes.add("Cindy");
//        estudantes.add("David");
//
//        // Exibindo a lista e seu tamanho
//        System.out.println("Estudantes: " + estudantes);
//        System.out.println("Tamanho da lista: " + estudantes.size());
//
//        // Adicionando mais dois estudantes
//        estudantes.add(0, "Nick"); // Adiciona "Nick" no índice 0
//        estudantes.add(1, "Mike"); // Adiciona "Mike" no índice 1
//
//        // Removendo um estudante
//        estudantes.remove(3); // Remove o estudante no índice 3 ("Bob")
//
//        // Exibindo a lista atualizada
//        System.out.println("Estudantes após modificações: " + estudantes);
//        System.out.println("Tamanho da lista: " + estudantes.size());

        // Criando uma ArrayList de números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando números à lista
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        // Exibindo a lista original
        System.out.println("Lista original: " + numeros);

        // Percorrendo a lista com Iterator e removendo números pares
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove(); // Remove números pares
            }
        }

        // Exibindo a lista após a remoção dos números pares
        System.out.println("Lista após remoção dos pares: " + numeros);

    }
}