package Miscellaneous;

import com.coforge.training.Oracle.Softwares;
import com.coforge.training.microsoft.OperatingSystem;

public class SoftwareList {

	public static void main(String[] args) {
		
		Softwares s1=new Softwares();
		s1.printSoftware();
		
		System.out.println("---------------------------");
		
		OperatingSystem op1=new OperatingSystem();
		op1.listSoftware();
		

	}

}
