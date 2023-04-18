


class BMI1{//.class file==> maintainiblity===> testing
	
	
	// its comman prperty for entire program
	 int a=9;
	double Height;
	double Weight;
	
	BMI1(double Height, double Weight){
		
		this.Height=Height;
		this.Weight=Weight;
	}
	
	double calculateBMI(){// method
		
		double BMI= Weight/(Height*Weight);
		
		return BMI;
		
		
	}

	public double getHeight() {// Retrieving the data// sunmmic
		return Height;
	}

	public void setHeight(double height) {
		this.Height = height;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		this.Weight = weight;
	}
}



public class BMI {
	          int a=9;
	   
//.class file // initial class ==> compiler// class not found exception ==> jvm problem 
	public static void main(String[] args) {// jvm start point of program 
		//access without creating object
		// TODO Auto-generated method stub
		 BMI1 bm= new BMI1(64.5, 6.8);
		  
		  bm.calculateBMI(); 
		  bm.setWeight(78.00);
		  bm.setHeight(6.0);
		 
		  System.out.println("hieght of person===>"+bm.getHeight());
		  System.out.println(bm.getWeight());
		 
		  
	   System.out.print("body mass index of first person===>"+" "+bm.calculateBMI());
	
	
	}

}

