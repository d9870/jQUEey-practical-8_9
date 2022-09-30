from pymongo import MongoClient
client = MongoClient('localhost',27017)
db = client.TYITDB1
def update():
    try:
        name=input("Enter the name:")
        Age= input(int("Enter the age:"))
        db.TYITCOL.update_one({
            "Name":name,
            "Age":Age
        })
        print("Data updated successfully")
    except Exception:
        print(str(Exception))
update()