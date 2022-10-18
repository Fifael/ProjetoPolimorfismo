import java.util.ArrayList;

public abstract class Animal {

    private int id;
    private String nome;
    private String especie;

    public static ArrayList<Animal> animais = new ArrayList<Animal>();

    protected Animal (int id, String nome, String especie)

    {
        this.id = id;
        this.nome = nome;
        this.especie = especie;

        animais.add(this);
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecie()
    {
        return this.especie;
    }

    
    public void setId(int id)
    {
        this.id = id;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }
// doenca
    public void setEspecie(String especie) 
    {
        this.especie = especie;
    }


    @Override
    public String toString() {
        return "id: " + this.id + "\n:nome: " + this.nome + "\n especie: " + this.especie;
    }
}
