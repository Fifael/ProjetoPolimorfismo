 import java.util.ArrayList;
 
 public class Alimentação {

    public int id;
    public String data;
    public String descricao;
    public Animal animal;

    public static ArrayList<Alimentação> alimentacoes = new ArrayList<Alimentação>();

    public Alimentação(int id, String data, String descricao, Animal animal) {
                this.id = id;
                this.data = data;
                this.descricao = descricao;
                this.animal = animal;
                alimentacoes.add(this);
    }

    public int getId() {
    return id;
    }

    public String getData() {
    return data;
    }

    public String getDescricao() {
    return descricao;
    }

    public Animal getAnimal() {
    return animal;
    }


    public void setId(int id) {
    this.id = id;
    }

    public void setData(String data) {
    this.data = data;
    }

    public void setDescricao(String descricao) {
    this.descricao = descricao;
    }

    public void setAnimal(Animal animal) {
    this.animal = animal;
    }

    @Override
    public String toString(){
        return " Id: \n" + this.getId() + " Data: \n" + this.getData() + " Descrição: \n " + this.getDescricao() + " Animal: \n " + this.getAnimal() + "\n\t ";
    }

}
