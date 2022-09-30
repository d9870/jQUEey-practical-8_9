from pymongo import MongoClient
client = MongoClient('localhost',27017)
db = client.TYITDB1
def delete():
    try:
        name=input("Enter the name:")
        db.TYITCOL.delete_one({
            "Name":name
        })
        print("Data deleted successfully")
    except Exception:
        print(str(Exception))
delete()