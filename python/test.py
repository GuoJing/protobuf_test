import addressbook_pb2

person  = addressbook_pb2.Person()
person.id = "1234"
person.name = "GuoJing"
person.email = "guojing.me@icloud.com"

data = person.SerializeToString()

print data, type(data)

print

person1 = addressbook_pb2.Person()
person1.ParseFromString(data)

print person1
