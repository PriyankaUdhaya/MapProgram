package mapVsFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		List<String>citiesWorkedIn1=new ArrayList<String>();
		citiesWorkedIn1.add("Pune");
		citiesWorkedIn1.add("Mumbai");
		citiesWorkedIn1.add("Noida");
		citiesWorkedIn1.add("Bangaalore");
		Employee e1=new Employee(1,"Code",citiesWorkedIn1);
		List<String>citiesWorkedIn2=new ArrayList<String>();
		citiesWorkedIn2.add("Pune");
		citiesWorkedIn2.add("nagpur");
		citiesWorkedIn2.add("Indore");
		Employee e2=new Employee(2,"Decode",citiesWorkedIn2);
		List<String>citiesWorkedIn3=new ArrayList<String>();
		citiesWorkedIn3.add("Pune");
		citiesWorkedIn3.add("Bangalore");
		Employee e3=new Employee(3,"Code Decode",citiesWorkedIn3);
		List<Employee>employeelist=new ArrayList<Employee>();
		employeelist.add(e1);
		employeelist.add(e2);
		employeelist.add(e3);
		System.out.println(employeelist);
	
		List emplist=employeelist.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		
		
		
	}

	

}
