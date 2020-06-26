package locadora;

public abstract class Pessoa
{
	private String Nome, CPF, RG, Telefone;
	private int Idade;
	
	public Pessoa(String n)
	{
		Nome = n;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Pessoa)
		{
			Pessoa p = (Pessoa)obj;
		
			if ((this.CPF == null) && (p.getCPF() == null) || (this.Nome != null && this.CPF.equals(p.getCPF())) &&
				(this.RG == null) && (p.getRG() == null) || (this.RG != null && this.RG.equals(p.getRG())))
				return true;
		}
		
		return false;
	}
	
	// Get Functions
	public String getNome() { return Nome; }
	public int getIdade() { return Idade; }
	public String getCPF() { return CPF; }
	public String getRG() { return RG; }
	public String getTelefone() { return Telefone; }
	
	// Set Functions
	public void setNome(String n) { Nome = n; }
	public void setIdade(int i) { Idade = i; }
	public void setCPF(String c) { CPF = c; }
	public void setRG(String r) { RG = r; }
	public void setTelefone(String t) { Telefone = t; }
}

