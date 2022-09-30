import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;
public class insert
{
	public static void main(String args[])
 	{
 		MongoClient mongo =new MongoClient("localhost",27017);
 	System.out.println("Connected to the database successfully");
 	MongoDatabase database= mongo.getDatabase("TYITDB1");
 	
	MongoCollection<Document> collection=database.getCollection("TYITCOL");
 	System.out.println("Collection TYITCOL selected successfully");
 
 	Document document=new Document();
 	document.append("id",2);
 	document.append("description","database");
 	document.append("likes",200);
 	document.append("url","http://www.oracle.com");
 	document.append("by","OracleSQL");
 	
	collection.insertOne(document);

 	System.out.println("Document inserted successfully");
	}
}