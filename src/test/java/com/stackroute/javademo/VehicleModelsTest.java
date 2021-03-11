package com.stackroute.javademo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleModelsTest {

	VehicleModels vm;
	
	@Before
	public void init() {
		vm = new VehicleModels();
	}
	
	@Test
	public void test() {
		String models="IN-Swift,IN-Alto,GE-Benz,US-Ford,KO-i10,IN-Zen";
		String[] actual = vm.getModels(models, "IN");
		String[] expected = new String[] {"IN-Swift","IN-Alto","IN-Zen"};
		assertArrayEquals(expected, actual);
		
		actual = vm.getModels(models, "UK");
		expected = new String[] {};
		assertArrayEquals(expected, actual);
		
		
		
	}
	
	

}
