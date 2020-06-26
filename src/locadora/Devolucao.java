package locadora;

public class Devolucao
{
	private Funcionario Func;
	private String Data, Hora;
	private float QuilometragemAtual;
	
	public void setFunc(Funcionario f) { Func = f; }
	public void setData(String d) { Data = d; }
	public void setHora(String h) { Hora = h; }
	public void setQuiloAtual(float q) { QuilometragemAtual = q; }
	
	public Funcionario getFunc() { return Func; }
	public String getData() { return Data; }
	public String getHora() { return Hora; }
	public float getQuiloAtual() { return QuilometragemAtual; }
}
