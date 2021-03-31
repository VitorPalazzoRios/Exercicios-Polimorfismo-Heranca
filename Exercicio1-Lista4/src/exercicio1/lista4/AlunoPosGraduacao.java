package exercicio1.lista4;


public class AlunoPosGraduacao extends Aluno{
    private String anoConclusaoGraduacao;

    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String anoConclusaoGraduacao, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
      @Override
    public String toString(){
        return "\nAno de conclusão da graduação: " + anoConclusaoGraduacao + super.toString() ;
    }    
}
