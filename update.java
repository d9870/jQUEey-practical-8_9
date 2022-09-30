import com.mongodb.client.MongoCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;
import java.net.UnknownHostException;

public class update
{
	public static void main(String args[])
	{
		MongoClient mongo=new MongoClient("Localhost",27017);
		System.out.println("Conneted to the database successfully");
		DB db=mongo.getDB("TYITDB1");
		DBCollection col=db.getCollection("TYITCOL");
		DBObject query=new BasicDBObject("id",1);
		DBObject update=new BasicDBObject();
		update.put("$set",new BasicDBObject("likes",300));
			WriteResult result=col.update(query,update);
			mongo.close();
		
	}
}