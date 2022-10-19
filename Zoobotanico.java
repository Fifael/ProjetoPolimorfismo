import java.util.Scanner;

public class Zoobotanico {

    public static void main(final String[] args) {

    int menu = 0;    
    Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Digite a operação");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar Jaula");
            System.out.println("2 - Listar Jaula");
            System.out.println("3 - Cadastrar Animal");
            System.out.println("4 - Listar Animal");
            System.out.println("5 - Cadastrar Alimentação");
            System.out.println("6 - Listar Alimentação");
            menu = scanner.nextInt();
            switch (menu){
                case 0:
                    System.out.println("Obrigado por usar o ZOO!");
                    break;
                    case 1:
                    cadastrarJaula(scanner);
                    break;
                    case 2:
                    listarJaula();
                    break;
                    case 3:
                    cadastrarAnimal(scanner);
                    break;
                    case 4:
                    listarAnimal();
                    break;
                    case 5:
                    cadastrarAlimentação(scanner);
                    break;
                    case 6:
                    listarAlimentação();
                    break;

                }
            } while (menu != 0);
            scanner.close();
            
    }
    
    public static void cadastrarJaula(Scanner scanner) {
        System.out.println("Cadastro Jaula");
        System.out.print("Id: ");
        int id = scanner.nextInt();
        System.out.print("nome: ");
        String nome = scanner.next();
        System.out.print("Tipo: ");
        String tipo = scanner.next();
        new Jaula(id, nome, tipo);   
    }

    public static void listarJaula(){
        for (Jaula jaula : Jaula.jaulas) {
            System.out.println(jaula); 
        }     
    }
    public static void cadastrarAnimal(Scanner scanner) {
        System.out.println("Cadastro Animal");
        System.out.print("Id: ");
        int id = scanner.nextInt();
        System.out.print("nome: ");
        String nome = scanner.next();
        System.out.print("Especie: [M] MAMIFERO [A] AVES [R] REPTEIS ");
        String especie = scanner.next();

        switch (especie) {
            case "M":
                System.out.println("Qual o tempo de gestação");
                String tempoGestacao = scanner.next();
                new Mamiferos(id, nome, especie, tempoGestacao);
                break;
            case "A":
            System.out.println("Qual a plumagem");
            String plumagem = scanner.next();  
            new Aves(id, nome, especie, plumagem);
            break;
            case "R":
            System.out.println("Qual o habitat");
            String habitat = scanner.next();
            new Repteis(id, nome, especie, habitat);
            default: 
            System.out.println("Digite uma opção coerente");
                break;
        }
        }

        public static void listarAnimal(){
            for (Animal animal : Animal.animais){
                System.out.println(animal);
            }
        }

        public static void cadastrarAlimentação(Scanner scanner) {
            System.out.println("Cadastro Alimentação");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            System.out.print("nome: ");
            String nome = scanner.next();
            System.out.print("Descrição: ");
            String descrição = scanner.next();
            System.out.print("Especie: [M] MAMIFERO [A] AVES [R] REPTEIS ");
            String especie = scanner.next();

            switch (especie) {
                case "M":
                    System.out.println("Digite o id do mamífero: ");
                    int idMamifero = scanner.nextInt();
                    Mamiferos idMamiferoVerficado = Mamiferos.verificaId(idMamifero);
                    new Alimentação(id, especie, descrição, idMamiferoVerficado);
                    break;
                case "A":
                   System.out.println("Digite o id de Aves: ");
                   int idAves = scanner.nextInt();
                   Aves idAvesVerficado = Aves.verificaId(idAves);
                   new Alimentação(id, especie, descrição, idAvesVerficado);
                   break;
                case "R":
                    System.out.println("Digite o id do Réptil: ");
                    int idReptil = scanner.nextInt();
                    Repteis idReptilVerficado = Repteis.verificaId(idReptil);
                    new Alimentação(id, especie, descrição, idReptilVerficado);
                default: 
                    System.out.println("Digite uma opção coerente");
                    break;
        }
    }

    public static void listarAlimentação() {
        for (Alimentação alimentacao : Alimentação.alimentacoes) {
            System.out.println(alimentacao);
        }

    }

}
        
    



