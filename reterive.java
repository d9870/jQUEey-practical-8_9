import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import org.bson.Document;

public class reterive
{
    public static void main(String args[])
    {
        MongoClient mongo=new MongoClient("localhost",27017);
        System.out.println("Connected to the database successfully");
        MongoDatabase database=mongo.getDatabase("TYITDB1");
        MongoCollection<Document> collection=database.getCollection("TYITCOL");
        System.out.println("Collection TYITCOL selected successfully");
        Document myDoc=collection.find().first();
        System.out.println();
        System.out.println(myDoc);
    }
}