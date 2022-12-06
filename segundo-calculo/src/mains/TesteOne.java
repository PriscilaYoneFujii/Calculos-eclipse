package mains;

import java.util.ArrayList;
import java.util.List;

import beans.Saltos;

//import beans.TianguloRetangulo;

public class TesteOne {

	public static void main(String[] args) {
		Saltos s = new Saltos(0, 50, 0);
		List<Integer> li = new ArrayList<Integer>();
		li = s.intervaloInverso();
		for(Integer var : li) {
			System.out.println(var);
		}
		
		
	}

}
