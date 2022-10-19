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
            + "\n Especialidade: " + this.gettempoDeGestacao();

    }

    public static Mamiferos verificaId(int id) throws Exception {
        for (Mamiferos mamiferos : mamiferos) {
            if (mamiferos.getId() == id) {
                return mamiferos;
            }
        }
        throw new Exception("Mamifero não encontrado. ");
    }

    public static Mamiferos ExcluiID(int id) throws Exception {
        for (Mamiferos mamiferos : Mamiferos.mamiferos) {
            if (mamiferos.getId() == id) {
                Mamiferos.mamiferos.remove(mamiferos);
                
            }
        }
        return null;
/*
 *  List<String> names = ....
    for (String name : names) {
    // Do something
    names.remove(name).
 * 
 * 
 * 
*/
}


}
