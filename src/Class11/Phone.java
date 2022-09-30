package Class11;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	void call(){
		System.out.println("calling.......");
			
		}
		void takePicture() {
			System.out.println("Taking pictures");
			}
		
				public static void main(String[] args) {
					Phone iphone=new Phone();
					iphone.make="Apple";
					iphone.model="Iphone 14 pro Max";
					iphone.color="Black";
					iphone.storage=123;
					iphone.size=6.8;
					iphone.cheap=false;
					System.out.println(iphone.make+" model "+iphone.model);
					iphone.call();
					
					Phone sumsung=new Phone();
					sumsung.make="samsung";
					sumsung.model="s22";
					sumsung.color="gray";
					sumsung.storage=256;
					sumsung.size=6.7;
					sumsung.cheap=false;
					System.out.println(sumsung.make+" model "+sumsung.model);
					sumsung.call();
			}
		
		
	}

	


