from pymongo import MongoClient
client = MongoClient('localhost', 27017)
db = client.TYITDB1
def insert():
    try:
        name = input("Enter the name:")
        Rollno = int(input("Enter rollno:"))
        Age = int(input("Enter age:"))
        id = int(input("Enter id:"))
        db.TYITCOL.insert_one({
            "name": name,
            "Rollno": Rollno,
            "Age": Age,
            "id": id
        })
        print("Data inserted successfully!")
    except Exception as e:
        print(str(e))


insert()
