package occurrences_string_treemap;

import java.util.TreeMap;

public class OccurrencesString {

	public static void main(String[] args) {
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		String s="The List interface provides a way to store the ordered collection. It is a child interface of Collection";
		String mWord[]=s.split(" ");
		for(int i=0;i<mWord.length;i++) {
			mWord[i]=mWord[i].toLowerCase();
			if(tmap.containsKey(mWord[i])) {
				tmap.replace(mWord[i], tmap.get(mWord[i])+1);
			}
			else
				tmap.put(mWord[i], 1);
		}
		System.out.println(tmap);

	}

}
