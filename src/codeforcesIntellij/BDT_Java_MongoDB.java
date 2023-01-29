//package codeforcesIntellij;
//import com.mongodb.*;
//
//public class BDT_Java_MongoDB {
//
//	public static void main(String[] args) {
//	MongoClient mongo = new MongoClient("localhost",27017);
//	DB db = mongo.getDB("Assignment3");
//	DBCollection coll = db.getCollection("collection");
//	//insert
//	BasicDBObject d1 = new BasicDBObject();
//	BasicDBObject d2 = new BasicDBObject();
//	BasicDBObject sub1 = new BasicDBObject();
//	BasicDBObject sub2 = new BasicDBObject();
//	BasicDBObject sub3 = new BasicDBObject();
//	BasicDBObject sub4 = new BasicDBObject();
//	d1.append("SID", "1");
//	d1.append("Sname", "Oze");
//	d1.append("Branch", "CSE");
//	d1.append("age", "19");
//	d1.append("panel", "C");
//	d2.append("area","Sahakarnagar-1");
//	d2.append("city","Pune");
//	d2.append("pincode","411009");
//	d1.append("Address", d2);
//	sub1.append("name", "DBMS");
//	sub1.append("score", "90");
//	sub2.append("name", "TOC");
//	sub2.append("score", "80");
//	sub3.append("name", "ICS");
//	sub3.append("score", "85");
//	sub4.append("name", "AIES");
//	sub4.append("score", "95");
//	d1.append("subjects", Arrays.asList(sub1,sub2,sub3,sub4));
//	d1.append("AOI", Arrays.asList("DBMS","Networking"));
//
//
//	BasicDBObject d3 = new BasicDBObject();
//	BasicDBObject d4 = new BasicDBObject();
//	BasicDBObject sub5 = new BasicDBObject();
//	BasicDBObject sub6 = new BasicDBObject();
//	BasicDBObject sub7 = new BasicDBObject();
//	BasicDBObject sub8 = new BasicDBObject();
//	d3.append("SID", "2");
//	d3.append("Sname", "Rohit");
//	d3.append("Branch", "ECE");
//	d3.append("age", "20");
//	d3.append("panel", "E");
//	d4.append("area","AnandNagar");
//	d4.append("city","Pune");
//	d4.append("pincode","400706");
//	d3.append("Address", d4);
//	sub5.append("name", "DBMS");
//	sub5.append("score", "80");
//	sub6.append("name", "TOC");
//	sub6.append("score", "70");
//	sub7.append("name", "IS");
//	sub7.append("score", "75");
//	sub8.append("name", "AI");
//	sub8.append("score", "60");
//	d3.append("subjects", Arrays.asList(sub1,sub2,sub3,sub4));
//	d3.append("AOI", Arrays.asList("DBMS","BDT"));
//
//	coll.insert(d1);
//	coll.insert(d3);
//	//display
//	DBCursor cursor = coll.find();
//	while (cursor.hasNext())
//	{
//		System.out.println(cursor.next());
//	}
//
//	System.out.println("Update starts here");
//
//	//update
//	BasicDBObject query = new BasicDBObject();
//	query.put("Sname", "Shubham");
//	BasicDBObject newDocument = new BasicDBObject();
//	newDocument.put("Sname", "Harshal");
//	BasicDBObject updateObj = new BasicDBObject();
//	updateObj.put("$set", newDocument);
//	coll.update(query, updateObj);
//
//	DBCursor cursor1 = coll.find();
//	while (cursor1.hasNext())
//	{
//	System.out.println(cursor1.next());
//	}
//
//	//remove
//	System.out.println("Remove starts here");
//	BasicDBObject searchQuery = new  BasicDBObject();
//	searchQuery.put("Sname", "Harshal");
//	coll.remove(searchQuery);
//
//	DBCursor cursor2 = coll.find();
//	while (cursor2.hasNext())
//	{
//	System.out.println(cursor2.next());
//	}
//
//}
//
//	}
//
//
