package exercicio1.lista4;


public class AlunoGraduacao  extends Aluno{
    private String anoConclusaoEnsinoMedio;

    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String anoConclusaoEnsinoMedio, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    @Override
    public String toString(){
        return "\nAno de conclusão do ensino médio: " + anoConclusaoEnsinoMedio + super.toString() ;
    }    
    
}
