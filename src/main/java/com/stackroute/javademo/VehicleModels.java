package com.stackroute.javademo;

public class VehicleModels {
	
	public String[] getModels(String models,String code) {
		
		String resultData = "";
		String[] modelArr = models.split(",");
		for(String model:modelArr) {
			
			if(model.contains(code)) {
				resultData=resultData+" "+model;
			}
			
		}
		
		if(resultData.length() > 0)
			return resultData.trim().split(" ");
		else
			return new String[] {};
	}

}


/*

String[] newArray = new String[models.split(",").length+1];
int count =0;

String[] modelArr = models.split(",");
for(String model:modelArr) {
	if(model.contains(code)) {
		newArray[count] = model;
		count++;
	}
}

return newArray;

*/