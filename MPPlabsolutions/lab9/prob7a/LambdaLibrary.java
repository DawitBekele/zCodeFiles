package Homework.lab9.prob7a;
import java.util.List;
import java.util.stream.Collectors;
interface TriFunction<T,U,V,R>{
	public R apply(T t,U u, V v);
}
public class LambdaLibrary {
	final static TriFunction<List<Employee>,String,Integer,String> triFunction=
			(list,searchStr,value)->list.stream().filter(e->e.getSalary()>value&&
					e.getLastName().compareToIgnoreCase("m")>0).map(Employee::getFullName)
			.sorted().collect(Collectors.joining(","));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}

}
