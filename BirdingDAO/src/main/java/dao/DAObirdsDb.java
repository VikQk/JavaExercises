package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;


import model.Bird;
import service.BirdsDB;

public class DAObirdsDb {
	
	private MongoDatabase database;
	
	public void setDataSource(MongoDatabase database) {
		this.database = database;
	}
	
	
	public void saveBird(Bird bird) {
	
		MongoClientURI connectionString = new MongoClientURI(
				"mongodb+srv://VikQk:Viktor09111982@cluster0.sslzu.mongodb.net/test");
	
		MongoClient mongoClient = new MongoClient(connectionString);
		
		MongoDatabase database = mongoClient.getDatabase("MongoBirding");
		
		this.database = database;
		
		MongoCollection<Document> collection = database.getCollection("birdsdb");
		
		Document birdtoFind = birdFind(bird.getName());
		
		if (birdtoFind.containsValue(birdtoFind)) {
		Document birdMongo = new Document("_id", new ObjectId());
		
	    birdMongo.append("name", bird.getName()).append("latinName", bird.getNameLatin()).append("observations", bird.getObservations());
	    	
		collection.insertOne(birdMongo);
		}else {
			System.out.println(birdtoFind + " is in database!");
		}
		System.out.println("Saved in Mongo!");
	}
	public MongoCollection<Document> getBirdsCollection() {

		MongoCollection<Document> birdsCollection = database.getCollection("birdsdb");
	
		return birdsCollection;

	}
	public Document birdFind(String birdtofind) {
		
		MongoCollection<Document> collection = database.getCollection("birdsdb");
		
		Document birdFound = collection.find(eq("name", birdtofind)).first();
		
		return birdFound;
		
	}
	

}
