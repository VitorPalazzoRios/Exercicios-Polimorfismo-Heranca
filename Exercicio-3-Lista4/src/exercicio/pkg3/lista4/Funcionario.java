package exercicio.pkg3.lista4;

public class Funcionario {
    private String matricula;
    private String nome;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float getSalario(float percentual) {
        return  salario + salario * percentual / 100;
    }
    @Override
    public String toString(){
        return "Matricula: " + matricula + "\nNome: " + nome + "\nSalario: " + salario;
    }
}
