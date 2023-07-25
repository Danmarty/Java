import java.util.Scanner;//importa o scanner 

public class Main {//cria a classe 
    public static void main(String[] args) {//inicia o código
        Scanner input = new Scanner(System.in);//cria variavel do scanner
        System.out.println("Digite o cargo do funcionário (programador, gerente ou vendedor):");//da as opções de cargo
        String cargo = input.nextLine().toLowerCase();//le o cargo e passa pro switch case
        
        switch (cargo) {
            case "programador":// caso programador entra nesse código
                System.out.println("Digite a categoria do programador (junior, pleno ou senior):");
                String categoria = input.nextLine().toLowerCase();
                
                System.out.println("Digite o número de dias trabalhados no mês:");
                int diasTrabalhados = input.nextInt();
                
                System.out.println("Digite o número de horas trabalhadas por dia:");
                int horasTrabalhadas = input.nextInt();
                
                while (horasTrabalhadas < 3 || horasTrabalhadas > 8) {// enquanto as horas forem invalidas ele não continua o código
                    System.out.println("O número de horas trabalhadas por dia deve ser entre 3 e 8!");
                    System.out.println("Digite o número de horas trabalhadas por dia:");
                    horasTrabalhadas = input.nextInt();;
                }
                
                double valorHora;
                switch (categoria) {// define os valores da hora pra cada cargo
                    case "junior":
                        valorHora = 30.0;
                        break;
                    case "pleno":
                        valorHora = 45.0;
                        break;
                    case "senior":
                        valorHora = 80.0;
                        break;
                    default:
                        System.out.println("Cargo inválido!");
                        return;
                }
                
        
                double salario = diasTrabalhados * horasTrabalhadas * valorHora;// calcula o Salário
                System.out.println("Salário final: R$ " + salario);
                break;
                
            case "gerente":
                System.out.println("Digite o número de dias trabalhados no mês:");
                diasTrabalhados = input.nextInt();
                
                System.out.println("Digite o número de horas trabalhadas por dia:");
                horasTrabalhadas = input.nextInt();
 
                while (horasTrabalhadas < 3 || horasTrabalhadas > 8) {// enquanto as horas forem invalidas ele não continua o código
                    System.out.println("O número de horas trabalhadas por dia deve ser entre 3 e 8!");
                    System.out.println("Digite o número de horas trabalhadas por dia:");
                horasTrabalhadas = input.nextInt();
                }
                
                System.out.println("Digite o valor do bonus do gerente(em R$):");
                double salarioBonus = input.nextDouble();

                valorHora = 100.0 ;
                
                salario = diasTrabalhados * horasTrabalhadas * valorHora;
                
                while (salarioBonus <salario*0.1) {//enquanto não ter um valor de bonus valido o código nao continua
                    System.out.println("O bonus precisa ser de no minímo 10%");
                    System.out.println("Digite o valor do bonus do gerente(em R$):");
                    salarioBonus = input.nextDouble();;
                }
                salario=salario+salarioBonus;//soma o salario com o bonus
                System.out.println("Salário final: R$ " + salario);
                break;
                
            case "vendedor":
                System.out.println("Digite o valor total vendido no mês:");
                double valorVendas = input.nextDouble();
                
                salario = 2000.0 + valorVendas * 0.1;// soma o Salário padrão com a comissão de 10% das vendas feitas
                System.out.println("Salário final: R$ " + salario);
                break;
                
            default:
                System.out.println("Cargo inválido!");
                
        }
        
        input.close();
    }
}