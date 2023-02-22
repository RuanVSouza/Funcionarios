package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;

public class programa1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionarios funcionarios = new Funcionarios();
		
		funcionarios.name = sc.nextLine();
		funcionarios.grossSalary = sc.nextDouble();
		funcionarios.tax = sc.nextDouble();
		
		System.out.println("Name: " + funcionarios.name);
		System.out.println("Gross salary: " + funcionarios.grossSalary);
		System.out.println("Tax: " + funcionarios.tax);
		System.out.println();
		
		System.out.println("Employee: " + funcionarios.name + ", $ " + funcionarios.netSalary() );
		System.out.println();
		
		System.out.println("Which percentage to increase salary? ");
		funcionarios.percentage = sc.nextDouble();
		System.out.println("Update data: " + funcionarios.name + ", $ " + funcionarios.increaseSalary());
		
		
		
		
		sc.close();
		
	}

}
