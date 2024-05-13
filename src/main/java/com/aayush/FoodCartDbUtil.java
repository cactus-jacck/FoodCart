package com.aayush;

import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {

	public static List<Food> getFoodList()
	{
		List<Food> foodList = new ArrayList<>();
		foodList.add(new Food(1, "Chicken Biryani", 180));
		foodList.add(new Food(2, "Nalli Nihari", 270));
		foodList.add(new Food(3, "Grilled Chicken", 150));
		foodList.add(new Food(4, "Mutton Kabab", 180));
		return foodList;
	}

}
