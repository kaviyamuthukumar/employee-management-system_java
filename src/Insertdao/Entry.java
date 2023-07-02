package Insertdao;

import java.util.Scanner;

import bean.Bean_class;
import mainservice.Passingdata;

public class Entry {
	public static void main(String[] args) {
		
		Bean_class bcobj = new Bean_class();
		bcobj.setId(15);
		bcobj.setFname("Kaviya");
		bcobj.setLname("Saju");
		bcobj.setGender("Female");
		bcobj.setAge(23);
		bcobj.setEmail("kavi@gmail.com");
		bcobj.setPhno("968369561");
		bcobj.setDesignation("designer");
		bcobj.setSalary(50000);
		int ans = Passingdata.deletedata(bcobj);
		System.out.println(ans);
		Passingdata.showdata();
	}
}
