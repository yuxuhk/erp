package Test;

import java.util.ArrayList;
import java.util.Iterator;

import javax.net.ssl.SSLContext;

public class Weapon extends Item {
	private int damage;

	public static void main(String[] args) {
           Weapon w=new Weapon();
           ArrayList<Weapon> s=new ArrayList<Weapon>();
           s.add(w);
           w.name="ljw";
           w.price=1;
           w.damage=1;
           Iterator it=s.iterator();
           while(it.hasNext()) {
        	   Weapon g=(Weapon) it.next();
        	   System.out.println(g.name+g.price);
           }
	}
}
