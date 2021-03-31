package exercicio.pkg3.lista4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opc = 0, escolha, escolha1;
        String matricula, nome;
        float salario, percentual;
        ArrayList<Funcionario> listFuncionario = new ArrayList<>();
        Funcionario funcionario = new Funcionario();
        Consultor consultor = new Consultor();
        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Funcionario \n2 - Mostrar funcionario \n3 - Sair"));
            switch (opc) {
                case 1:
                    matricula = JOptionPane.showInputDialog("Digite a matricula");
                    nome = JOptionPane.showInputDialog("Digite o nome");
                    salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario"));
                    escolha = Integer.parseInt(JOptionPane.showInputDialog("Você é consultor \n1 - sim \n2 - não"));
                    if (escolha == 1) {
                        escolha1 = Integer.parseInt(JOptionPane.showInputDialog("Vai ter acrecimo ? \n1 - sim \n 2 - não"));
                        if (escolha1 == 1) {
                            percentual = Float.parseFloat(JOptionPane.showInputDialog("Digite o percentual  (%) que você quer"));
                            consultor.setSalario(salario);
                            salario = consultor.getSalario(percentual);
                            listFuncionario.add(new Consultor(matricula, nome, salario));

                        } else if (escolha1 == 2) {
                            consultor.setSalario(salario);
                            salario = consultor.getSalario();
                            listFuncionario.add(new Consultor(matricula, nome, salario));

                        }

                    } else if (escolha == 2) {
                        listFuncionario.add(new Funcionario(matricula, nome, salario));
                    }

                    break;
                case 2:
                    String msg = "";
                    for (Funcionario a : listFuncionario) {
                        msg += a.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);

                    break;
                case 3:

                    break;
                default:
                    break;
            }
        }
    }

}
