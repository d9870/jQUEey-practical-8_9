// perform CRUD opearation to interact with java 

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.Document;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mongodb.client.MongoCursor;

class CRUDdata
{
    public void insert()
    {
        MongoClient mongo = new MongoClient("localhost" , 27017);
        System.out.println("Connected to the database successfully");
        MongoDatabase database = mongo.getDatabase("TYITDB1");
        MongoCollection <Document> collection = database.getCollection("TYITCOL");
        System.out.println("Collection TYITCOL selected successfully");
        Document document = new Document();
        document.append("id" , 1);
        document.append("document" , "database");
        document.append("likes" , 100);
        document.append("url" , "http://www.mongodb.com");
        document.append("by" , "NoSQL");
        document.append("id","1");
        collection.insertOne(document);
        System.out.println("Document inserted Successfully");
    }
    public void read()
    {
        MongoClient mongo = new MongoClient("localhost" , 27017);
        System.out.println("Connected to the database successfully");
        MongoDatabase database = mongo.getDatabase("TYITDB1");
        MongoCollection <Document> collection = database.getCollection("TYITCOL");
        System.out.println("Collection TYITCOL selected successfully");
        MongoCursor <Document> cursor = collection.find().iterator();
        try
        {
            while (cursor.hasNext())
            {
                System.out.println(cursor.next().toJson());
            }
        }
        finally
        {
            cursor.close();
        }
        
    }
    public void update()
    {
        MongoClient mongo = new MongoClient("localhost" , 27017);
        System.out.println("Connected to the database successfully");
        MongoDatabase database = mongo.getDatabase("TYITDB1");
        MongoCollection <Document> collection = database.getCollection("TYITCOL");
        System.out.println("Collection TYITCOL selected successfully");
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.append("$set", new BasicDBObject().append("likes", 200));
        BasicDBObject searchQuery = new BasicDBObject().append("id", 1);
        collection.updateOne(searchQuery, newDocument);
        System.out.println("Document updated successfully");
    }
    public void delete()
    {
        MongoClient mongo = new MongoClient("localhost" , 27017);
        System.out.println("Connected to the database successfully");
        MongoDatabase database = mongo.getDatabase("TYITDB1");
        MongoCollection <Document> collection = database.getCollection("TYITCOL");
        System.out.println("Collection TYITCOL selected successfully");
        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("id", 1);
        collection.deleteOne(searchQuery);
        System.out.println("Document deleted successfully");
    }
}
class CRUD
{
    public static void main(String args [])
    {
        CRUDdata crud = new CRUDdata();
        crud.insert();
        crud.read();
        crud.update();
        crud.read();
        crud.delete();
        crud.read();
    }
}