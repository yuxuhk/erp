package com.yuxuhk.mongodb;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDaoImpl {

	public boolean insert(MongoDatabase db, String table, BasicDBObject doc) {

		return true;
	}

	public boolean delete(MongoDatabase db, String table, BasicDBObject doc) {
       MongoCollection<Document> collection=db.getCollection(table);
		return true;
	}

	public boolean update(MongoDatabase db, String table, BasicDBObject newdoc) {

		return true;
	}
}










