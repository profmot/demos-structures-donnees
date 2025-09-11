package demo5_1;

import ca.ntro.core.NtroCore;
import demo5_1.validateur.Modele;

public class Demo5_1 extends Modele<Demo5_1> {
	
	private MapNaif map;

	/*
	 * tableau
	 * tab[1] = 12;
	 * tab[2] = 24; // temps constant
	 * tab[3] = 12;
	 * 
	 * on voudrait
	 * map["cle01"] = 12; // temps constant
	 * 
	 * en réalité
	 * map.put("cle01", 12) doit mémoriser
	 * {"cle01":12}
	 * 
	 * map.get("cle01") doit retrouver 12
	 * 
	 * map.put("cle02", 24) doit ajouter
	 * {"cle01":12, "cle02":24}
	 * 
	 * map.get("cle02") doit retrouver 24
	 * 
	 * map.put("cle01", 6) doit écraser
	 * {"cle01":6, "cle02":24}
	 * 
	 */
	
	@Override
	public void initialize() {
        map = new MapNaif();

        
        map.put("cle01", 12);
        map.put("cle02", 24);
        map.put("cle03", 36);
        map.put("cle04", 48);
        
        
        map.put("cle01", 6);

        
        NtroCore.logger().info(map.toString());
	}

    public static void main(String[] args) {
    	new Demo5_1().initialize();
    }

}
