package demo5_2;

import demo5_2.validateur.Modele;

public class Demo5_2 extends Modele<Demo5_2> {
	
	private MapHash map;
	
	@Override
	public void initialize() {
        map = new MapHash();

        map.put("a", 10);
        map.put("ab", 11);
        map.put("abc", 12);

        map.put("b", 13);

        map.put("", 14);
        
        map.put("bob", 13);
        map.put("charlie", 14);

        map.put("alice", 12);
        map.put("Mélia", 66);

        map.put("Willyam", 77);
        map.put("Ralph", 88);

        map.put("mélia", 67);
        map.put("willyam", 78);
        map.put("ralph", 89);

        map.put("Maxime", 99);

        map.put("amina", 18);

        int valeurAlice = (int) map.get("alice");
        System.out.println(valeurAlice);
        
        
        
	}

    public static void main(String[] args) {
    	new Demo5_2().initialize();
    }

}
