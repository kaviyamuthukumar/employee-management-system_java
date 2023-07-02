package mainservice;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBUtil.DButill;
import bean.Bean_class;

public class Passingdata {
	public static int enterdata(Bean_class bcobj) {
		int i = 0;
		try {
			PreparedStatement pst = DButill.getDBConnection()
					.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, bcobj.getId());
			pst.setString(2, bcobj.getFname());
			pst.setString(3, bcobj.getLname());
			pst.setString(4, bcobj.getGender());
			pst.setInt(5, bcobj.getAge());
			pst.setString(6, bcobj.getEmail());
			pst.setString(7, bcobj.getPhno());
			pst.setString(8, bcobj.getDesignation());
			pst.setDouble(9, bcobj.getSalary());
			i = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Passing Data");
		}

		if (i == 1) {
			return 1;
		} else {
			return 0;
		}

	}

	public static int updatedata(Bean_class bcobj) {
		int i = 0;
		try {
			String sqlUpdate = "update employee set Fname=? where Id=?";

			PreparedStatement update = DButill.getDBConnection().prepareStatement(sqlUpdate);
			update.setInt(2, bcobj.getId());
			update.setString(1, bcobj.getFname());
			i = update.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Passing Data");
		}

		if (i == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int deletedata(Bean_class bcobj) {
		int i = 0;
		try {
			String sqldelete = "delete from employee where Id=?";

			PreparedStatement update = DButill.getDBConnection().prepareStatement(sqldelete);
			update.setInt(1, bcobj.getId());
			i = update.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Passing Data");
		}

		if (i == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void showdata() {
		int i = 0;
		try {
			String sqlshow = "select * from employee";

			Statement update = DButill.getDBConnection().createStatement();
			ResultSet obj=update.executeQuery(sqlshow);
			while(obj.next()) {
				System.out.println(obj.getInt(1)+"\t"+obj.getString(2)+"\t"+obj.getString(3)+"\t"+obj.getString(4)+"\t"+obj.getInt(5)+"\t"+obj.getString(6)+"\t"+obj.getString(7)+"\t"+obj.getString(8)+"\t"+obj.getDouble(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception in Passing Data");
		}

	}
}
