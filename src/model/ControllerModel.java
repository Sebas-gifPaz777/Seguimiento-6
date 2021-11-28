package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.GoldandSilever;

public class ControllerModel {

	List<Contries> country;
	List<Contries>replacement;
	
	public ControllerModel() {
		
		country=new ArrayList<Contries>();
	}
	
	public void useBufferedReader() throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int counter=25;
		
		while(counter>0) {
			
			String line=br.readLine();
			String[]parts=line.split(";");
			Contries register= new Contries(parts[0],parts[1],parts[2],parts[3],parts[4],parts[5],parts[6]);
			addCountry(register);
			counter--;
		}
		br.close();
	}
	
	public void addCountry(Contries newCountry) {
		
		country.add(newCountry);
		replacement.add(newCountry);
	}
	
	public void sortByGoldAndSilverandBronzeMen() {
		Comparator<Contries>s1= new GoldandSilever();
		Collections.sort(country,s1);
	}
	
	public void sortByGoldAndSilverandBronzeMan() {
		int j;
		Contries aux;
		
		for(int i=1;i<country.size();i++) {
			aux=country.get(i);
			j=i-1;
			while(j>=0 && (aux.compareByGoldw(country.get(j))<0)) {
				country.set(j+1, country.get(j));
				j--;
			}
			country.set(j+1, aux);
		}
	}
	
	public void bubbleSort() {
		
	}
}

