package ro.ase.csie.cts.g1092.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Tree3DModel implements Cloneable{
	String color;
	int height;
	ArrayList<Integer> points = null;
	
	public Tree3DModel(String color, int height) {
		
		System.out.println("Loading the 3D model...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.points  = new ArrayList<>();
		Random random = new Random();
		for(int i = 0; i<20; i++) {
			this.points.add(random.nextInt(1000));
		}
		
		System.out.println("Applying color...");
		
		this.color = color;
		this.height = height;
		
		System.out.println("Rendering final 3D model");
	}
	
	private Tree3DModel() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//mistake - you still pay the price
		//Tree3DModel copy = new Tree3DModel(this.color, this.height)
		
		Tree3DModel copy = new Tree3DModel();
		copy.color = this.color;
		copy.height = this.height;
		copy.points = (ArrayList<Integer>) this.points.clone();
		
		if(copy.points == this.points)
			System.out.println("Same.");
		else
			System.out.println("Different.");
		
		System.out.println("First array");
		for(int i = 0; i<this.points.size(); i++) {
			System.out.println(this.points.get(i)+" ");
		}
		
		this.points.set(0, 99999);
		
		System.out.println("\nSecond array");
		for(int i = 0; i<copy.points.size(); i++) {
			System.out.println(copy.points.get(i)+" ");
		}
		
		return copy;
	}
	
}
