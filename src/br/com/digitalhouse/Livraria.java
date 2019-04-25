package br.com.digitalhouse;


import java.util.ArrayList;
import java.util.List;

public class Livraria {
    public List<Livro> listaDeLivros = new ArrayList<>();

        //CADASTRO
    public void cadastro(Livro cadastroLivro){
        listaDeLivros.add(cadastroLivro);
        System.out.println("Cadastro com sucesso");
    }

    //CONSULTA

    public void consulta(int consultaLivro) {
        for (Livro listaDeLivro : listaDeLivros) {
            if (listaDeLivro.getCodigo() == consultaLivro) {
                System.out.println(listaDeLivro);
            } else {
                System.out.println("Livro não encontrado");
            }
        }
    }

        //VENDA

        public void venda(int vendaLivro){
            for (Livro livro : listaDeLivros) {
                if (livro.getCodigo() == vendaLivro) {
                    listaDeLivros.remove(livro);

                } else {
                    System.out.println("Estoque Esgotado");
                }
            }
        }
    }






