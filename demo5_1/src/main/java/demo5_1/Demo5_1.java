package demo5_1;

import ca.ntro.core.NtroCore;
import demo5_1.validateur.Modele;

public class Demo5_1 extends Modele<Demo5_1> {
	
	private MapNaif map;
	
	@Override
	public void initialize() {
        map = new MapNaif();
        
        map.put("cle01", 12);
        map.put("cle02", 2);
        map.put("cle03", 42);
        map.put("cle04", 55);

        map.put("cle01", 555);

        //int valeur = (int) map.get("cle01");
        
        int taille = map.size();
        
        
        NtroCore.logger().info(map.toString());
	}

    public static void main(String[] args) {
    	new Demo5_1().initialize();
    }

}
