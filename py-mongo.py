import collections
from pymongo import MongoClient
client = MongoClient('localhost',27017)
db = client.TYITDB1
collection = db.TYITCOL
def insert():
    try:
        name=input("Enter the name:")
        Age= int(input("Enter the age:"))
        collection.insert_one({
            "Name":name,
            "Age":Age
        })
        print("Data inserted successfully")
    except Exception:
        print(str(Exception))
insert()