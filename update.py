from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db = client.TYITDB1
def update():
    try:
        name = input("Enter the name:")
        Age = int(input("Enter the age:"))
        db.TYITCOL.update_one({"name": name}, {"$set": {"Age": Age}})
        print("Data updated successfully")
    except Exception as e:
        print(str(e))

update()