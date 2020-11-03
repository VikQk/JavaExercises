package mongodb1;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class HelloMongoDB {

	public static void main(String[] args) {
		
		
		//create connection string to connect to cloud mongo with user/password
		//generated by security/database access
		//watch out the IP, pal!
		//string connection from Atlas/Connect
		MongoClientURI connectionString = new MongoClientURI(
				"mongodb+srv://VikQk:Viktor09111982@cluster0.sslzu.mongodb.net/test");
		//create object mongoClient: object to connect, manage, get DBs, handle, ... CRUD, clean, etc ...
		MongoClient mongoClient = new MongoClient(connectionString);
		
		//getter from mongo to get db, particularly CITY
		MongoDatabase database = mongoClient.getDatabase("database");
		//collection CARS
		MongoCollection<Document> collection = database.getCollection("cars");

		//System.out.println("Number of cars in my CAR collection: " + collection.countDocuments());
	
		//query to my collection and find the first document and then transform to JSON
		// in order to print that document as JSON and STRING
		//Document myDoc = collection.find().first();
		//System.out.println(myDoc.toJson());
		//System.out.println(myDoc.toString());

		//create a new Car as a DOCUMENT
		Document car = new Document("_id", new ObjectId());
		// set the document with APPEND
		//car.append("make", "Tesla").append("price", 15000d).append("designeBy", "Tesla, Niccola");
		//car.append("make", "Ford").append("price", 5000d).append("designeBy", "Ford, Henry").append("model", "Mustang");
		car.append("make", "Nissan").append("price", 59000d).append("designeBy", "Makoto, Uchida").append("model", "skyline");
		
		//add that document to CARS collection
		collection.insertOne(car);		
		
		System.out.println("New document, new car: " + collection.countDocuments());
		
		//print all documents from my collection CARS
		for (Document carToPrint : collection.find()) {
		    System.out.println(carToPrint.toJson());
		}

	}

}