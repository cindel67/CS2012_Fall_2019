package class_examples;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	list.add(10);
    	list.add(34);
    	list.add(12);
    	
    	//array name.length
    	//string name.length()
    	//arraylist name.size();
    	
    	System.out.println(list.contains(34));
    	
    	for (int i = 0 ; i < list.size(); i++) {
    		System.out.println(list.get(i));
    	}


    }
}
