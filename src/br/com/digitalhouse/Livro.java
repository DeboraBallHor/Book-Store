package br.com.digitalhouse;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private float anoLancamento;
    private int codigoIsbn;
    private int quantEstoque;
    private double preco;



    public Livro(int codigo, String titulo, String autor, float anoLancamento, int codigoIsbn, int quantEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.codigoIsbn = codigoIsbn;
        this.quantEstoque = quantEstoque;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(float anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getCodigoIsbn() {
        return codigoIsbn;
    }

    public void setCodigoIsbn(int codigoIsbn) {
        this.codigoIsbn = codigoIsbn;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro" +
                "\ncodigo=" + getCodigo() +
                ", \ntitulo='" + getTitulo() + '\'' +
                ", \nautor='" + getAutor() + '\'' +
                ", \nanoLancamento=" + getAnoLancamento() +
                ", \ncodigoIsbn=" + getCodigoIsbn() +
                ", \nquantEstoque=" + getQuantEstoque() +
                ", \npreco=" + getPreco();
    }

}





