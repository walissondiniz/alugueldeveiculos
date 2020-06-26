package locadora;

import java.util.List;
import java.util.ArrayList;

public class Locadora
{
	private List<Veiculo> Vehicles;
	private List<Funcionario> Workers;
	private List<Cliente> Customers;
	private List<Locacao> Locations;
	
	public Locadora()
	{
		Vehicles = new ArrayList<>();
		Workers = new ArrayList<>();
		Customers = new ArrayList<>();
		Locations = new ArrayList<>();
	}
	
	public void addVehicle(Veiculo v) 
	{ 
		Veiculo Finded = findVehicle(v);
		
		if (Finded == null)
			Vehicles.add(v); 
	} 
	public void addWorker(Funcionario f) 
	{ 
		Funcionario Finded = findWorker(f);
		
		if (Finded == null)
			Workers.add(f); 
	}
	public void addCustomer(Cliente c) 
	{
		Cliente Finded = findCustomer(c);
		
		if (Finded == null)
			Customers.add(c);
	}
	public void addLocation(Locacao l) 
	{ 
		Locacao Finded = findLocation(l);
		
		if (Finded == null)
			Locations.add(l); 
	}
	
	public void removeVehicle(Veiculo v) 
	{ 
		Veiculo Finded = findVehicle(v);
		
		if (Finded != null)
			Vehicles.remove(v); 
	} 
	public void removeWorker(Funcionario f) 
	{ 
		Funcionario Finded = findWorker(f);
		
		if (Finded != null)
			Workers.remove(f);
	}
	public void removeCustomer(Cliente c) 
	{ 
		Cliente Finded = findCustomer(c);
		
		if (Finded != null)
			Customers.remove(c); 
	}
	public void removeLocation(Locacao l) 
	{ 
		Locacao Finded = findLocation(l);
		
		if (Finded != null)
			Locations.remove(l); 
	}
	
	public int getNumVehicles() { return Vehicles.size(); }	
	public int getNumWorkers() { return Workers.size(); }
	public int getNumCustomers() { return Customers.size(); }
	public int getNumLocations() { return Locations.size(); }
	
	public Veiculo getVehicle(int pos) { return Vehicles.get(pos); }
	public Funcionario getWorker(int pos) { return Workers.get(pos); }
	public Cliente getCustomer(int pos) { return Customers.get(pos); }
	public Locacao getLocation(int pos) { return Locations.get(pos); }
	
	public Veiculo findVehicle(Veiculo v)
	{
		Veiculo Finded = null;
		
		for (Veiculo item : Vehicles)
		{
			if (item.getPlaca().equals(v.getPlaca()))
			{
				Finded = item;
				break;
			}
		}
		
		return Finded;
	}
	
	public Funcionario findWorker(Funcionario f)
	{
		Funcionario Finded = null;
		
		for (Funcionario item : Workers)
		{
			if (item.getCPF().equals(f.getCPF()))
			{
				Finded = item;
				break;
			}
		}
		
		return Finded;
	}
	
	public Cliente findCustomer(Cliente c)
	{
		Cliente Finded = null;
		
		for (Cliente item : Customers)
		{
			if (item.getCPF().equals(c.getCPF()))
			{
				Finded = item;
				break;
			}
		}
		
		return Finded;
	}
	
	public Locacao findLocation(Locacao l)
	{
		Locacao Finded = null;
		
		for (Locacao item : Locations)
		{
			if (item.getCar().getPlaca().equals(l.getCar().getPlaca()))
			{
				Finded = item;
				break;
			}
		}
		
		return Finded;
	}
}
