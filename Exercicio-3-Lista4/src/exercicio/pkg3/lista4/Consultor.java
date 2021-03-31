package exercicio.pkg3.lista4;

public class Consultor extends Funcionario {

    public Consultor() {
    }

    public Consultor(String matricula, String nome, float salario) {
        super(matricula, nome, salario);
    }
   @Override
   public float getSalario() {
        return (float) (super.getSalario() + super.getSalario() * 0.1);
    }

    @Override
    public float getSalario(float percentual) {
        return super.getSalario() + super.getSalario() * percentual / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "\nConsultor : Sim";
    }
    @Override
        public void setSalario(float salario) {
        super.setSalario(salario);
    }

}
