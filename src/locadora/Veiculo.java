package locadora;

public class Veiculo
{
	private String Placa, Modelo, Situacao;
	private int Ano;
	private float ValorLocacao, Quilometragem;
	
	public Veiculo(String m)
	{
		Modelo = m;
	}
	
	public void setPlaca(String p) { Placa = p; }
	public void setModelo(String m) { Modelo = m; }
	public void setSituacao(String s) { Situacao = s; }
	public void setAno(int a) { Ano = a; }
	public void setQuilometragem(float q) { Quilometragem = q; }	
	public void setValorLocacao(float v) { ValorLocacao = v; }
	
	public String getPlaca() { return Placa; }
	public String getModelo() { return Modelo; }
	public String getSituacao() { return Situacao; }
	public int getAno() { return Ano; }
	public float getQuilometragem() { return Quilometragem; }
	public float getValorLocacao() { return ValorLocacao; }
}
