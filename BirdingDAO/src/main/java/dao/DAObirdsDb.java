package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


import model.Bird;
import service.BirdsDB;

public class DAObirdsDb {
	
	private MongoDatabase database;
	
	public void setDataSource(MongoDatabase database) {
		this.database = database;
	}
	
	public static void addDAO(MongoDatabase database) {
		MongoCollection<Document> birdsCollection = database.getCollection("BirdsDB");
		
		Document mongoArray = new Document("_id", new ObjectId());
						
		birdsCollection.insertOne(mongoArray);
		
	}
	public void saveBird(BirdsDB db) {
	
		// get collection with THIS, BE CAREFUL it is a MONGO COOLLECTION
		//MongoCollection<Document> birdsCollection = this.getBirdsCollection();
		MongoCollection<Document> birdsCollection =  database.getCollection("BirdsDB");
		
 		// JAVA list within mongo DOCUMENT
		List<Document> birdsMongo = new ArrayList<Document>();
		
		// ITERATE all books from author
		for (Bird birds : db.getBirds()) {
        
		// create a JAVA object to be a MONGO DOCUMENT
	    	Document birdMongo = new Document("_id", new ObjectId());
			// fill the MONGO DOCUMENT with files from JAVA thanks to getters of book class
			birdMongo.append("name", birds.getName()).append("latinName", birds.getNameLatin()).append("observations", birds.getObservations());
			birdsMongo.add(birdMongo);
			birdsCollection.insertOne(birdMongo);
		}
		
		// create a JAVA object to be a MONGO DOCUMENT
		//Document birdMongo = new Document("_id", new ObjectId());
		// fill the MONGO DOCUMENT with files from JAVA thanks to getters of author
		// class
		// BE CAREFUL: there is an array, books-booksMongo
		//birdMongo.append("name", getName()).append("latin name", bird.getNameLatin())
		//		.append("observations", bird.getNameLatin());

		// finally, authorsCollecton calls insertOne and upload authorMongo, it is just
		// ONE MONGO DOCUMENT
		
		//System.out.println(db + " " +birdsMongo);
		
		//birdsCollection.insertMany(birdsMongo);
	}
	public MongoCollection<Document> getBirdsCollection() {

		MongoCollection<Document> birdsCollection = database.getCollection("BirdsDB");
	
		return birdsCollection;

	}

}
