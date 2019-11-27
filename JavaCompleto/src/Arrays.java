import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Arrays {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Angua");
		list.add("Paulo");
		list.add("Alex");
		list.add("Thiago");
		list.add("Bob");
		list.add("Amélia");
		list.add("Potiguar");
		list.add("Breno");
		list.add("Ana");
		list.add("Joao");
		list.add("Marco");
		list.add("Pedro");
		list.add("Bruno");
		

		list.add(5, "Lucas");
		
		//Tamanho size
		System.out.println(list.size());

		for (String nome : list) {
			System.out.println(nome);
		}

		System.out.println("------------------");

		list.removeIf(nome -> nome.charAt(0) == 'M');
		list.remove(1);
		for (String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println("------------------");
		//Em qual posição está o nome
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		/*System.out.println("------------------");
		Somente pessoas com a letra B
		list.removeIf(nome -> nome.charAt(0) != 'B');

		for (String nome : list) {
			System.out.println(nome);
		}
		*/
		System.out.println("------------------");
		//Somente pessoas com a letra P
		List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'P').collect(Collectors.toList());
		for (String nome : result) {
			System.out.println(nome);
		}
		
		System.out.println("------------------");
		//Primeiro cara com a letra A
		String name = list.stream().filter(nome -> nome.charAt(0) == 'W').findFirst().orElse(null);
		System.out.println(name);
		
	}
	
	

}
