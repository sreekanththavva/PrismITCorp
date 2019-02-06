/**
 * 
 */
package com.prismit.corp.java.sreekanth.arraylist.database;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sreekanthreddy
 *
 */
public class LastNameFirstName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<UserTable> list = new DBTable().findAll();
		for(UserTable userTable:list) {
			System.out.println(userTable.toString());
			IDao dao = new UserDao();
			dao.insert(userTable);
		}
	}

}
