package dao;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DAObirdsDb {
	
	public static MongoDatabase init() {

		MongoClientURI connectionString = new MongoClientURI(
				"mongodb+srv://VikQk:Viktor09111982@cluster0.sslzu.mongodb.net/test");
		MongoClient mongoClient = new MongoClient(connectionString);

		MongoDatabase database = mongoClient.getDatabase("BirdsDB");

		return database;

	}
	public static void addDAO(MongoDatabase database) {
		MongoCollection<Document> birdsCollection = database.getCollection("BirdsDB");
		
		Document mongoArray = new Document("_id", new ObjectId());
		
		mongoArray.append("name", bird)
		
		birdsCollection.insertOne(mongoArray);
		
	}

}
