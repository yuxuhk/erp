package com.yuxuhk.connpool.mysql;

import java.util.ArrayList;
import java.util.List;

import com.yuxuhk.connpool.mysql.DBbean;

import com.mysql.jdbc.*;
public class DBInitInfo {
	public static List<DBbean> beans = null;
	static {
		beans = new ArrayList<DBbean>();
		// 这里数据 可以从xml 等配置文件进行获取
		// 为了测试，这里我直接写死
		DBbean beanMysql = new DBbean();
		beanMysql.setDriverName("com.mysql.jdbc.Driver");
		beanMysql.setUrl("jdbc:mysql://localhost:3306/cart");
		beanMysql.setUserName("root");
		beanMysql.setPassword("root");
		beanMysql.setMinConnections(5);
		beanMysql.setMaxConnections(100);
		beanMysql.setPoolName("testPool");
		//System.out.println("aaaaaaaaaa");
		beans.add(beanMysql);
	}
}
