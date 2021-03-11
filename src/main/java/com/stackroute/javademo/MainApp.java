package com.stackroute.javademo;


public class MainApp {
	
	
	public static void main(String[] args) {
	
		String models="IN-Swift,IN-Alto,GE-Benz,US-Ford,KO-i10";
		VehicleModels vehicleModels = new VehicleModels();
		String[] modelArray = vehicleModels.getModels(models, "IN");
		
		for(int count=0;count <= modelArray.length-1;count++) {
			System.out.println(modelArray[count]);
		}

		for(String model: modelArray) {
			System.out.println(model);
		}
		
		int counter = 0;
		while(counter < modelArray.length) {
			System.out.println(modelArray[counter]);
			counter++;
		}
		
	}

}
