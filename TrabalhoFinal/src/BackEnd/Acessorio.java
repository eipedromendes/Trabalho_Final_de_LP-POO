package BackEnd;

public class Acessorio extends Produto {
    private String tipo;

    public Acessorio(String nome, double preco, int quantidadeEmEstoque, String tipo) {
        super(nome, preco, quantidadeEmEstoque);
        this.tipo = tipo;
    }

    // Métodos getters e setters para acessar e modificar o tipo de acessório.
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}