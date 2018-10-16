package com.yuxuhk.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoDatabase;

public interface MongoDao {

	public boolean insert(MongoDatabase db, String table, BasicDBObject doc);

	public boolean delete(MongoDatabase db, String table, BasicDBObject doc);

	public boolean update(MongoDatabase db, String table, BasicDBObject newdoc);
}
