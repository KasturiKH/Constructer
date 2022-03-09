class Train{

int trainNo;
String trainName;
Type trainType;
boolean displayDetails;


Train(int trainNo)
{
	this.trainNo=trainNo;
	System.out.println("Execute Train number");
}

Train(String trainName)
{
	this.trainName=trainName;
	System.out.println("Execute Train name");
}

Train(Type trainType)
{
	this.trainType=trainType;
	System.out.println("Execute Train type");
}

void displayDetails()
{
		
		System.out.println("display detail of train" + displayDetails);
	}
}
