package com.theanswerli.Singleton.懒汉模式.Enum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author: Liming
 * Date: 2017/06/04
 * Company: Lenovo
 */
public enum MyObject {

	conectionFactory;

	private Connection connection;

	//暴露了枚举类，违反“单一职责原则”，优化类见 MyObject1;
	private MyObject() {
		try {
			System.out.println("调用了MyObject的构造函数...");
			String url = "jdbc:mysql://localhost:3306;";
			String driverName = "org.mysql.driver...";
			String user = "sa";
			String password = "baba...";
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}
}
