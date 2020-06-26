package locadora;

public class Cliente extends Pessoa
{
	private int CNH;
	private String ValidadeCNH;
	
	public Cliente(String n)
	{
		super(n);
	}
	
	public void setCNH(int c) { CNH = c; }
	public void setValidadeCNH(String v) { ValidadeCNH = v; }
	
	public int getCNH() { return CNH; }
	public String getValidadeCNH() { return ValidadeCNH; }
}
