import java.util.ArrayList;

public class Jaula {
    private int id;
    private String nome;
    private String tipo;


    public static ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public Jaula( int id, String nome, String tipo) {
        this.setId(id);
        this.setNome(nome);
        this.setTipo(tipo);
        jaulas.add(this);
    }

    public int getId() {
    return id;
    }

    public String getNome() {
    return nome;
    }

    public String getTipo() {
    return tipo;
    }

    private void setId(int id) {
    this.id = id;
    }
    
    private void setNome(String nome) {
    this.nome = nome;
    }    

    private void setTipo(String tipo) {
    this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + " Nome: " + this.getNome() + " Tipo: " + this.getTipo();
    }

}
