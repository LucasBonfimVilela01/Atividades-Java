import javax.swing.JOptionPane;

public class Testa_Funcionário {
    
    public static void main(String[] args) {
        //Definir variáveis para o laço e o menu
        int loop=1;
        int menu=0;
        do {
            //Menu de seleção
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha: \n "
                    + "1-Verificar Helena \n "
                    + "2-Verificar Mário \n "
                    + "3-Sair"));            
            switch(menu){
                case 1:
                    //Definir valores para os atributos
                    Funcionário funcionario = new Funcionário("Helena Reis", 1965, 4000);
                    //Executar métodos do funcionário
                    funcionario.Informar_Salário();
                    funcionario.CalcularIdade();
                break;
                case 2:
                    //Definir valores para os atributos
                    Funcionário funcionario2 = new Funcionário("Mário Sá", 1970, 3000);
                    //Executar métodos do funcionário
                    funcionario2.Informar_Salário();
                    funcionario2.CalcularIdade();
                break;
                case 3:
                    //Exibir mensagem de saída
                    JOptionPane.showMessageDialog(null,"Saindo...");
                    //Adicionar na variável "loop" e sair do laço
                    loop++;
                default:
                    /*  
                    PROBLEMA-Se você executar o programa como ele esta agora você percebera
                    que após a mensagem de "Saindo..." também é executado o default, por
                    ventura disso a mensagem "Valor inválido" é mostrada mesmo quando
                    o valor é válido.
                    (TIRE AS BARRAS DUPLAS ANTES DO "if" PARA PROVISORIAMENTE RESOLVER O PROBLEMA)
                    */
                    // if((menu!=1)&&(menu!=2)&&(menu!=3))
                        JOptionPane.showMessageDialog(null,"Valor inválido");
                break;
            }
        } while (loop==1);
    }
}
