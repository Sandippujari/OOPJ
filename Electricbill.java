
class ElectrictyBill{
	
	String customerName;
	double unitsConsumed;
	double billAmount;
	
	ElectrictyBill(String customerName, double unitsConsumed){
		
		this.customerName=customerName;
		this.unitsConsumed=unitsConsumed;
		
		
	}
	
	double calculateBillAmount(){
		
		if(unitsConsumed<=100) {
		billAmount= unitsConsumed*5;
		}
		else if(unitsConsumed>100) {
			
		billAmount= unitsConsumed*7;
		}
		else if (unitsConsumed>200){
			
		billAmount= unitsConsumed*10;
		}
		
		
		return billAmount;
	}
	
}

public class Electricbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectrictyBill E1= new ElectrictyBill("Sandip", 100);
		ElectrictyBill E2= new ElectrictyBill("vaibhav", 200);
		ElectrictyBill E3= new ElectrictyBill("onkar", 300);
		
		System.out.println("bill amount of "+E1.customerName+" "+"is "+E1.calculateBillAmount());
		System.out.println("bill amount of "+E2.customerName+" "+"is "+E2.calculateBillAmount());
		System.out.println("bill amount of "+E3.customerName+" "+"is "+E3.calculateBillAmount());
	}

}
