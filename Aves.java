import java.util.ArrayList;

public class Aves extends Animal {

    private String plumagem;

    private static ArrayList<Aves> aves = new ArrayList<>();
    
    public Aves( int id, String nome, String especie, String plumagem) {
          super(id, nome, especie);     
          this.plumagem = plumagem;
          aves.add(this);
    }

        public String getplumagem() {
        return this.plumagem;
        }   

        public void setplumagem(String plumagem) {
        this.plumagem = plumagem;
        }

    @Override
    public String toString() {
        return super.toString()
            + "\nEspecialidade: " + this.plumagem;
    }

    public static Aves verificaId(int id) throws Exception{
        for (Aves aves: aves) {
            if (aves.getId() == id) {
                return aves;
            } 
        }
        throw new Exception("Ave não encontrada");   
    } 

}
