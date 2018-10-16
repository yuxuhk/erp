package com.yuxuhk.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoHelper {
	static String DBName = "mydb";
	static String ServerAddress = "10.134.158.244";
	static int Port = 27017;

	public MongoClient getgetMongoClient() {
		MongoClient mongoClient = null;
		try {
			// MongoClient mongoClient = new MongoClient(ServerAddress, Port);
			MongoDatabase mgdb = mongoClient.getDatabase(DBName);
			System.out.println("Connect to database successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		return mongoClient;
	}

	public MongoDatabase getMongoClient(MongoClient mongoClient) {
		MongoDatabase mongoDatabase = null;
		try {
			if (mongoClient != null) {
				mongoDatabase = mongoClient.getDatabase(DBName);
				System.out.println("Connect to DataBase successfully");
			} else {
				throw new RuntimeException("MongoClient不能够为空");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return mongoDatabase;
	}

	public void closeMongoClient(MongoClient mongoClient, MongoDatabase mongoDatabase) {
		if (mongoDatabase != null) {
			mongoDatabase = null;
		}
		if (mongoClient != null) {
			mongoClient.close();
		}
		System.out.println("CloseMongoClient successfully");
	}

}
