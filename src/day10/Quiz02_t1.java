package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Quiz02_t1 {
	static String lottoNumbers() {
		Set<Integer>set = new HashSet<Integer>(); 
		while(set.size() != 6){ 
			set.add((int)(Math.random() * 45 + 1)); 
			}
		List<Integer> list = new ArrayList<Integer>(set); 
		Collections.sort(list); return list.toString(); } 
}
