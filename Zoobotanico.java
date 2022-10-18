import java.util.Scanner;

public class Zoobotanico {

    public static void main(String[] args) {

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
            menu = tue.nextInt();
            switch (menu){
                case 0:
                    System.out.println("Obrigado por usar o ZOO!");
                    break;
                    case 1:
                    cadastrarJaula(scanner);
                    break;
                    case2:
                    listarjaula(scanner);
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
        
        
    }

}
