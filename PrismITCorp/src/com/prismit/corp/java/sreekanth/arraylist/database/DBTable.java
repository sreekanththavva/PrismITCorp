/**
 * 
 */
package com.prismit.corp.java.sreekanth.arraylist.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author sreekanthreddy
 *
 */
public class DBTable {
	public List<UserTable> findAll(){
		{
			List<UserTable> userTables  = new ArrayList<UserTable>();
			Statement statement = null;
			Connection conn = null;
			ResultSet result = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost/didb", "root", "root.123");
				System.out.print("Database is connected !");
				statement = conn.createStatement();
				String sqlquery = "select first_name,last_name from user";
				result = statement.executeQuery(sqlquery);
				while(result.next()) {
					UserTable  userTable = new UserTable();
					userTable.setFirst_name(result.getString("first_name"));
					userTable.setLast_name(result.getString("last_name"));
					userTables.add(userTable);
				}
				
			} catch (Exception e) {
				System.out.print("Do not connect to DB - Error:" + e);
			}finally {
				try {
					result.close();
					statement.close();
					conn.close();
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			return userTables;
		}
	}
}