class TrainTester{
	
	public static void main(String[] args)
	{
		Train train=new Train(25);
		System.out.println(train.trainNo);
		
		Train train1=new Train("Delhi Express");
		System.out.println(train1.trainName);
		
		Train train2=new Train(Type.FULE_DIESEL);
		System.out.println(train2.trainType); 
		train6 displayDetails();
		
		
		TrainEngine engine=new TrainEngine("Mysore",23);
		System.out.println(engine.cityName + " " +engine.trainNo);
		
		
		TrainEngine engine1=new TrainEngine(23456,"Bangalore Express ");
		System.out.println(engine1.trainPrice + " " +engine1.trainName);
		
		TrainEngine engine2=new TrainEngine("Mysore",234,Type.PETROL);
		System.out.println(engine2.cityName + " " +engine2.trainPrice + " " +engine2.trainType);
	
	
	
	Train train3=new TrainEngine("Delhi",52);
	 System.out.println(train3.cityName,train3.trainNo);
	 Train train4=new TrainEngine(2356d,"Belagavi");
	 System.out.println(train4.trainPrice,train4.trainName);
	Train train5=new TrainEngine("Hubli",235d,Type.PETROL);
	System.out.println(train5.cityName,train5.trainPrice,train5.trainType);
	 
	
	
	}


}