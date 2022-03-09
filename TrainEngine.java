class TrainEngine extends Train{
	
String cityName;
double trainPrice;

TrainEngine(String cityName,int trainNo)
{
	super(trainNo);
	this.cityName=cityName;
	
	System.out.println("Execute city name");
}

TrainEngine(double trainPrice,String trainName)
{
	super(trainName);
	this.trainPrice=trainPrice;
	
	System.out.println("Execute train price");
}

TrainEngine(String cityName,double trainPrice,Type trainType)
{
	//super(trainType);
	this(cityName);
	this(trainPrice);
	
	
	
	System.out.println("Execute city name , train price and train type");
}
}