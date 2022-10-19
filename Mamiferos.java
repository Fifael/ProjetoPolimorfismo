import java.util.ArrayList;


public class Mamiferos extends Animal {

    private String tempoDeGestacao;

    private static ArrayList<Mamiferos> mamiferos = new ArrayList<>();

    public Mamiferos( int id, String nome, String especie, String tempoDeGestacao) {
            super(id, nome, especie); 
            this.tempoDeGestacao = tempoDeGestacao;
            mamiferos.add(this);
    }

        public String gettempoDeGestacao() {
        return this.tempoDeGestacao;
        }   

        public void settempoDeGestacao(String tempoDeGestacao) {
        this.tempoDeGestacao = tempoDeGestacao;
        }
    
    @Override
    public String toString() {
        return super.toString()
            + "\nEspecialidade: " + this.tempoDeGestacao;

    }

    public static Mamiferos verificaId(int id) throws Exception {
        for (Mamiferos mamiferos : mamiferos) {
            if (mamiferos.getId() == id) {
                return mamiferos;
            }
        }
        throw new Exception("Mamifero não encontrado. ");
    }
}