package studant_mangement_system;

import java.util.ArrayList;
import java.util.List;

public class Collage {

	public List<Studant> displayinfo() {
		Studant s1=new Studant();
		s1.setId(1);
		s1.setName("nikhil");
		s1.setMark(67.90);
		
		Studant s2=new Studant();
		s2.setId(89);
		s2.setName("om");
		s2.setMark(78);
		
		Studant s3=new Studant();
		s3.setId(67);
		s3.setName("ramdas");
		s3.setMark(78);
		
		List<Studant> info=new ArrayList<Studant>();
		info.add(s1);
		info.add(s2);
		info.add(s3);
		
		return  info;
		
		
	}
}
