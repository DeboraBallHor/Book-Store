package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro(0001, "Historia do Android", "Jose da Silva", 2016, 00011223344556, 38, 48.99 );
        Livro livro2 = new Livro(0002, "Aprenda Java", "Mateus Gomes", 2003, 00011223344557, 56, 29.90);
        Livro livro3 = new Livro(0003, "Comandos do Java", "Maria Dolores", 2009, 0001122334455, 73, 63.90);


        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        Livraria sistemaLivraria = new Livraria();

        sistemaLivraria.cadastro(livro1);
        sistemaLivraria.cadastro(livro2);
        sistemaLivraria.cadastro(livro3);
        sistemaLivraria.consulta(0001);


    }

}

