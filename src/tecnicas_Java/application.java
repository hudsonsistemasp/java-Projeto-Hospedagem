package tecnicas_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Hospedagem;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Para leitura no teclado
		Scanner sc = new Scanner(System.in);
		
		//Implementar a lista que será do tipo da classe Employees e cadastrarão esses.
		List<Hospedagem> listHospedagem = new ArrayList<Hospedagem>();
		
		//Verificar a quantidade de funcionários que serão cadastrados
		System.out.println("How many peoples will be registered? ");
		int quantPeoples = sc.nextInt();
		
		//Cadastrar a quantidade de employee 'num' que foi digitada acima
		for(int i=1;i<=quantPeoples;i++) {
			System.out.println();
			System.out.println("Employee n°" + i);
			System.out.println("Type id: ");
			int id = sc.nextInt();
			//Verificar se o ID digitado acima já existe na classe
			Hospedagem emp = listHospedagem.stream().filter(k -> k.getId() == id).findFirst().orElse(null);
			int newId = id;
			if (emp != null) {
				System.out.println("This Id already exists, please, insert new Id!");
				do {
					System.out.println("Type new id: ");
					newId = sc.nextInt();
				}while(newId == id);
			}
			
			sc.nextLine();
			System.out.println("Type name: ");
			String name = sc.nextLine();
			System.out.println("Type Salary: ");
			Double salary = sc.nextDouble();
			//Agora 'cadastrar esses dados na list' jogando nos atributos da classe
			listHospedagem.add(new Hospedagem(newId, name, salary));
		}
		
		
		//Imprimir os dados cadastrados:
		System.out.println("List of employees:");
		for(Hospedagem emp: listHospedagem) {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary() );
		}
	
		//Dar reajuste salarial para o empregado desejado:
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Hospedagem emp = listHospedagem.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp != null) {
			System.out.print("Enter the employee percentage salary that increased: ");
			double percentage = sc.nextDouble();
			emp.increasySalary(percentage);
		}else {
			System.out.println("This id does not exist!");
		}
		
		//Imprimir list Updated
		for(Hospedagem e: listHospedagem) {
			if (e.getId() == id) {
				System.out.println("Novo salário do funcionário: " + e.getName() + " é de $ " + e.getSalary());
			}
		}
		
		sc.close();

	}

}
