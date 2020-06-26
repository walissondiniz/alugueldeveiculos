package locadora;

public class Funcionario extends Pessoa
{	
	private String Cargo;
	private float Salario;
	
	public Funcionario(String n)
	{
		super(n);
	}
	
	public void setCargo(String c) { Cargo = c; }	
	public void setSalario(float s) { Salario = s; }
	
	public String getCargo() { return Cargo; }
	public float getSalario() { return Salario; }
}
