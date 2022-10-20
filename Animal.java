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
        return "\n id:  " + this.getId() + "\n nome: " + this.getNome() + "\n especie: " + this.getEspecie();
    }

    public static Animal AnimalID(int id) throws Exception {
            for (Animal animal : animais) {
                if (animal.getId() == id) {
                    return animal;
                } 
                }  
                throw new Exception ("Animal não encontrado. "); 
            }



    public static Animal excluiAnimal(int id) throws Exception{
        for (Animal animal : Animal.animais){
            if (animal.getId() == id)
                Animal.animais.remove(animal);
               
        }
        return null;
    }

}
