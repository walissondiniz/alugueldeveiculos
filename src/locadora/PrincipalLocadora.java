package locadora;

import java.util.Scanner;

public class PrincipalLocadora
{
	public static void Register(Pessoa p, Scanner key)
	{
		System.out.printf("Digite o CPF: ");
		p.setCPF(key.nextLine());
		
		System.out.printf("Digite o RG: ");
		p.setRG(key.nextLine());
		
		System.out.printf("Digite o Telefone: ");
		p.setTelefone(key.nextLine());
		
		System.out.printf("Digite a Idade: ");
		p.setIdade(key.nextInt());
		key.nextLine();
	}
	
	public static void main(String args[])
	{
		Locadora Office = new Locadora();
		Pessoa User;
		Scanner key = new Scanner(System.in);
		int Op;
		
		// 1 - criar, listar, remover
		// 2 - 
		// 3 - 
		// 4 - listar os objetos e escolher para a locação
		// 5 - locacoes que nao foram devolvidas
		
		do
		{
			System.out.printf("[Menu]:\n\n1. Gerenciar Funcionarios\n2. Gerenciar Clientes\n3. Gerenciar Veiculos\n4. Registrar Locacao\n5. Registrar Devolucao\n0 - Sair\n\nOpcao: -> ");
			Op = key.nextInt();
			key.nextLine();
			
			switch (Op)
			{	
				case 1:
					System.out.printf("[Funcionarios]:\n\n1. Criar Funcionario\n2. Listar Funcionarios\n3. Remover Funcionario\n0 - Voltar\n\nOpcao: -> ");
					Op = key.nextInt();
					key.nextLine();
					
					if (Op == 0)
					{
						Op = 1;
						break;
					}
					
					switch (Op)
					{
						case 1:
							System.out.printf("[Cadastro de Funcionarios]:\n\nDigite o Nome: ");
							User = new Funcionario(key.nextLine());
							Register(User, key);
							
							System.out.printf("Digite o Cargo: ");
							((Funcionario)User).setCargo(key.nextLine());
							
							System.out.printf("Digite o Salario: ");
							((Funcionario)User).setSalario(key.nextFloat());
							key.nextLine();
							
							Office.addWorker((Funcionario)User);
							break;
							
						case 2:
							System.out.printf("[Lista de Funcionarios]:\n\n");
							for (int i = 0; i < Office.getNumWorkers(); i++)
								System.out.printf("Nome: [%s] - CPF: [%s] - RG: [%s] - Cargo: [%s] - Salario: [%.2f]\n", Office.getWorker(i).getNome(), Office.getWorker(i).getCPF(), Office.getWorker(i).getRG(), Office.getWorker(i).getCargo(), Office.getWorker(i).getSalario());
							break;
							
						case 3:
							System.out.printf("[Remover Funcionarios]:\n\n0 - Sair\n");
							for (int i = 0; i < Office.getNumWorkers(); i++)
								System.out.printf("%d - Nome: [%s] - Cargo: [%s]\n", (i + 1), Office.getWorker(i).getNome(), Office.getWorker(i).getCargo());
								
							System.out.printf("Opcao: -> ");
							Op = key.nextInt();
							key.nextLine();
							
							if (Op == 0)
							{
								Op = 1;
								break;
							}
							
							Office.removeWorker(Office.getWorker((Op - 1)));
							break;
					}	
					break;
					
				case 2:
					System.out.printf("[Clientes]:\n\n1. Criar Cliente\n2. Listar Clientes\n3. Remover Cliente\n0 - Sair\n\nOpcao: -> ");
					Op = key.nextInt();
					key.nextLine();
					
					if (Op == 0)
					{
						Op = 1;
						break;
					}
					
					switch (Op)
					{
						case 1:
							System.out.printf("[Cadastro de Clientes]:\n\nDigite o Nome: ");
							User = new Cliente(key.nextLine());
							Register(User, key);
							
							System.out.printf("Digite o Numero da CNH: ");
							((Cliente)User).setCNH(key.nextInt());
							key.nextLine();
							
							System.out.printf("Digite a Validade da CNH: ");
							((Cliente)User).setValidadeCNH(key.nextLine());
							
							Office.addCustomer((Cliente)User);
							break;
							
						case 2:
							System.out.printf("[Lista de Clientes]:\n\n");
							for (int i = 0; i < Office.getNumCustomers(); i++)
								System.out.printf("Nome: [%s] - CPF: [%s] - RG: [%s] - CNH: [%d] - Validade CNH: [%s]\n", Office.getCustomer(i).getNome(), Office.getCustomer(i).getCPF(), Office.getCustomer(i).getRG(), Office.getCustomer(i).getCNH(), Office.getCustomer(i).getValidadeCNH());
							break;
							
						case 3:
							System.out.printf("[Remover Clientes]:\n\n0 - Sair\n");
							for (int i = 0; i < Office.getNumCustomers(); i++)
								System.out.printf("%d - Nome: [%s] - CNH: [%d]\n", (i + 1), Office.getCustomer(i).getNome(), Office.getCustomer(i).getCNH());
								
							System.out.printf("Opcao: -> ");
							Op = key.nextInt();
							key.nextLine();
							
							if (Op == 0)
							{
								Op = 1;
								break;
							}
							
							Office.removeCustomer(Office.getCustomer((Op - 1)));
							break;
					}
					break;
					
				case 3:
					System.out.printf("[Veiculos]:\n\n1. Criar Veiculo\n2. Listar Veiculos\n3. Remover Veiculo\n0 - Sair\n\nOpcao: -> ");
					Op = key.nextInt();
					key.nextLine();
					
					if (Op == 0)
					{
						Op = 1;
						break;
					}
					
					switch (Op)
					{
						case 1:
							System.out.printf("[Cadastrar Veiculos]:\n\nDigite o Modelo: ");
							Veiculo Car = new Veiculo(key.nextLine());
							
							System.out.printf("Digite a Placa: ");
							Car.setPlaca(key.nextLine());
							
							System.out.printf("Digite o Ano: ");
							Car.setAno(key.nextInt());
							key.nextLine();
							
							System.out.printf("Digite a Quilometragem: ");
							Car.setQuilometragem(key.nextFloat());
							key.nextLine();
							
							Car.setSituacao("Nao");
							
							System.out.printf("Digite o Valor da Locacao: ");
							Car.setValorLocacao(key.nextFloat());
							key.nextLine();
							
							Office.addVehicle(Car);
							break;
							
						case 2:
							System.out.printf("[Lista de Veiculos]:\n\n");
							for (int i = 0; i < Office.getNumVehicles(); i++)
								System.out.printf("Modelo: [%s] - Placa: [%s] - Ano: [%d] - Quilometragem: [%.2f] - Situacao: [%s] - Valor da Locacao: [%.2f]\n", Office.getVehicle(i).getModelo(), Office.getVehicle(i).getPlaca(), Office.getVehicle(i).getAno(), Office.getVehicle(i).getQuilometragem(), Office.getVehicle(i).getSituacao(), Office.getVehicle(i).getValorLocacao());
							break;
							
						case 3:
							System.out.printf("[Remover Veiculos]:\n\n0 - Sair\n");
							for (int i = 0; i < Office.getNumVehicles(); i++)
								System.out.printf("%d - Modelo: [%s] - Placa: [%s]\n", (i + 1), Office.getVehicle(i).getModelo(), Office.getVehicle(i).getPlaca());
								
							System.out.printf("Opcao: -> ");
							Op = key.nextInt();
							key.nextLine();
							
							if (Op == 0)
							{
								Op = 1;
								break;
							}
							
							Office.removeVehicle(Office.getVehicle((Op - 1)));
							break;
					}
					break;
					
				case 4:
					Locacao Loc = new Locacao();
					System.out.printf("[Registrar Locacao]:\n\nEscolha o Veiculo:\n0 - Sair\n");
					for (int i = 0; i < Office.getNumVehicles(); i++)
						System.out.printf("%d - Modelo: [%s] - Placa: [%s]\n", (i + 1), Office.getVehicle(i).getModelo(), Office.getVehicle(i).getPlaca());		
					System.out.printf("Opcao: -> ");
					Op = key.nextInt();
					key.nextLine();	
					if (Op == 0)
					{
						Op = 1;
						break;
					}
					Office.getVehicle((Op - 1)).setSituacao("Locado");
					Loc.setCar(Office.getVehicle((Op - 1)));
					Loc.setQuiloAtual(Office.getVehicle((Op - 1)).getQuilometragem());
					
					System.out.printf("\nEscolha o Cliente:\n0 - Sair\n");
					for (int i = 0; i < Office.getNumCustomers(); i++)
						System.out.printf("%d - Nome: [%s] - CNH: [%d]\n", (i + 1), Office.getCustomer(i).getNome(), Office.getCustomer(i).getCNH());
					System.out.printf("Opcao: -> ");
					Op = key.nextInt();
					key.nextLine();
					if (Op == 0)
					{
						Op = 1;
						break;
					}
					Loc.setClient(Office.getCustomer((Op - 1)));
					
					System.out.printf("\nEscolha o Funcionario:\n0 - Sair\n");
					for (int i = 0; i < Office.getNumWorkers(); i++)
						System.out.printf("%d - Nome: [%s] - Cargo: [%s]\n", (i + 1), Office.getWorker(i).getNome(), Office.getWorker(i).getCargo());			
					System.out.printf("Opcao: -> ");
					Op = key.nextInt();
					key.nextLine();
					if (Op == 0)
					{
						Op = 1;
						break;
					}
					Loc.setFunc(Office.getWorker((Op - 1)));
					
					Loc.setDev(null);
					
					System.out.printf("Digite a Hora: ");
					Loc.setHora(key.nextLine());
					
					System.out.printf("Digite a Data: ");
					Loc.setData(key.nextLine());
					
					Office.addLocation(Loc);
					break;
					
				case 5:
					Devolucao Dev = new Devolucao();
					System.out.printf("[Registrar Devolucao]:\n\nLista de Locacao:\n0 - Sair\n");
					for (int i = 0; i < Office.getNumLocations(); i++)
						System.out.printf("%d - Veiculo: [%s] - Cliente: [%s] - Funcionario: [%s] - Data e Hora:[%s %s]\n", (i + 1), Office.getLocation(i).getCar().getModelo(), Office.getLocation(i).getClient().getNome(), Office.getLocation(i).getFunc().getNome(), Office.getLocation(i).getData(), Office.getLocation(i).getHora());
					System.out.printf("Opcao: -> ");
					Op = key.nextInt();
					key.nextLine();
					
					if (Op == 0)
					{
						Op = 1;
						break;
					}
					
					Dev.setFunc(Office.getLocation((Op - 1)).getFunc());
					Dev.setQuiloAtual(Office.getLocation((Op - 1)).getCar().getQuilometragem());
					
					System.out.printf("Digite a Hora: ");
					Dev.setHora(key.nextLine());
					
					System.out.printf("Digite a Data: ");
					Dev.setData(key.nextLine());
					
					Office.getLocation((Op - 1)).getCar().setSituacao("Nao");
					Office.getLocation((Op - 1)).setDev(Dev);
					break;
			}
			
		}while (Op != 0);
	}
}
