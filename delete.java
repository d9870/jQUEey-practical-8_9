import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;
import com.mongodb.client.model.Filters;

public class delete
{
	public static void main(String args[])
	{
		MongoClient mongo=new MongoClient("localhost",27017);
		System.out.println("Collected to the database successfully");
		MongoDatabase database=mongo.getDatabase("TYITDB1");
		MongoCollection<Document> Collection=database.getCollection("TYITCOL");
		System.out.println("Collection Selected successfully");
		Collection.deleteOne(Filters.eq("Rollno",229749));
		System.out.println("Document deleted Successfully");
	}
}
