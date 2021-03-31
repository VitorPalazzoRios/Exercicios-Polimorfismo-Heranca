package exercicio1.lista4;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        int opc = 0,verifica;
        Aluno aluno = null;
        String RA,nome,curso,anograduacao,anoensionomedio;
        ArrayList<Aluno> listAluno = new ArrayList<>();
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Aluno"
                    + "\n2 - Exibir Alunos"
                    + "\n3 - Sair"));
            switch(opc){
                case 1 :
                    RA = JOptionPane.showInputDialog("Digite o RA do aluno");
                    nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                    curso = JOptionPane.showInputDialog("digite o curso do aluno");
                    verifica = Integer.parseInt(JOptionPane.showInputDialog("você esta fazendo pós-graduação ? \n 1 - Sim \n 2 - Não"));
                    if(verifica == 1){
                        anograduacao = JOptionPane.showInputDialog("Digite o ano que foi sua graduação");
                        listAluno.add(new AlunoPosGraduacao(anograduacao, RA, nome, curso));
                    }
                    else if (verifica == 2){
                        anoensionomedio = JOptionPane.showInputDialog("Digite o ano em que terminou o ensino médio");
                        listAluno.add(new AlunoGraduacao(anoensionomedio, RA, nome, curso));
                        
                    }
                    break;
                    case 2:
                        String msg = "";
                         for(Aluno a : listAluno){
                             msg += a.toString()+ "\n";
                         }
                        JOptionPane.showMessageDialog(null, msg);
                        
                        break;
                    case 3:
                        
                        
                        
                        
                        
                        break;
            }
        }
    }
    
}
