package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pelicula peli1 = new Pelicula("Avatar", "12/4", "PG", "US", "asdasd", 120, 2);
        Pelicula peli2 = new Pelicula("Endgame", "12/4", "PG", "US", "asdasd", 120, 3);
        Pelicula peli3 = new Pelicula("Infinity War", "12/4", "PG", "US", "asdasd", 120, 4);
        Pelicula peli4 = new Pelicula("Titanic", "12/4", "PG", "US", "asdasd", 120, 5);
        Pelicula peli5 = new Pelicula("El Padrino", "12/4", "PG", "US", "asdasd", 120, 0);

        Cliente cliente1 = new Cliente("Dduardo", "2233049782");
        Cliente cliente2 = new Cliente("Raul", "2233049782");
        Cliente cliente3 = new Cliente("Ricardo", "2233049782");

        List<Pelicula> coleccion = new ArrayList<>();
        coleccion.add(peli1);
        coleccion.add(peli2);
        coleccion.add(peli3);
        coleccion.add(peli4);
        coleccion.add(peli5);

        List<Cliente> clientes =


    }
}
