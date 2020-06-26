package locadora;

public class Locacao
{
	private Cliente Client;
	private Funcionario Func;
	private Veiculo Car;
	private Devolucao Dev;
	private String Data, Hora;
	private float QuilometragemAtual;
	
	public void setClient(Cliente c) { Client = c; }
	public void setFunc(Funcionario f) { Func = f; }
	public void setCar(Veiculo v) { Car = v; }
	public void setDev(Devolucao d) { Dev = d; }
	public void setData(String d) { Data = d; }
	public void setHora(String h) { Hora = h; }
	public void setQuiloAtual(float q) { QuilometragemAtual = q; }
	
	public Cliente getClient() { return Client; }
	public Funcionario getFunc() { return Func; }
	public Veiculo getCar() { return Car; }
	public Devolucao getDev() { return Dev; }
	public String getData() { return Data; }
	public String getHora() { return Hora; }
	public float getQuiloAtual() { return QuilometragemAtual; }
}
