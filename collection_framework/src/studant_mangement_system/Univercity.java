package studant_mangement_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Univercity {

	public static void main(String[] args) {
		System.out.println("---for each loop----");
		Collage c=new Collage();
		List<Studant> newlist=c.displayinfo();
		for(Studant s:newlist) {
			System.out.println(s);
		}
		
		System.out.println("---intretor interface----");
		
		Iterator<Studant> itr=newlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
