import java.util.ArrayList;

public abstract class Animal {

    private int id;
    private String nome;
    private String especie;

    public static ArrayList<Animal> animais = new ArrayList<Animal>();

    protected Animal (int id, String nome, String especie)

    {
        this.setId(id);
        this.setNome(nome);
        this.setEspecie(especie);

        animais.add(this);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie()
    {
        return especie;
    }

    
    private void setId(int id)
    {
        this.id = id;
    }

    private void setNome(String nome) 
    {
        this.nome = nome;
    }

    private void setEspecie(String especie) 
    {
        this.especie = especie;
    }


    @Override
    public String toString() {
        return "id: " + this.getId() + "\n:nome: " + this.getNome() + "\n especie: " + this.getEspecie();
    }
}
