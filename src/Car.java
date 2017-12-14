
public class Car {
	public Body body;
	public Chassis chassis;
	
	public Car(int length, int doors) throws Exception {
		if(length < 7) {
			throw new Exception();
		}
		if(length/2 <= doors) {
			throw new Exception();
		}
		if(doors < 1) {
			throw new Exception();
		}
		
		this.body = new Body(length, doors);
		this.chassis = new Chassis(length);
	}
	
	public class Body {
		public String component;
		
		public Body(int length, int doors) {
			this.component = " ";
			
			for(int i = 0; i< length - 3; i++) {
				this.component += "_";
			}
			
			this.component += "\n|";
			int backdoors = doors / 2;
			int frontdoors = doors - backdoors;
			
			for(int i = 0; i < backdoors; i++) {
				this.component += "[]";
			}
			
			for(int i = 0; i < length - 3 - 2*doors; i++) {
				this.component += " ";
			}
			
			for(int i = 0; i < frontdoors; i++) {
				this.component += "[]";
			}	
			this.component += "\\\n";
		}
	}
	
	public class Chassis {
		public String component;
		
		public Chassis(int length) {
			int addedAxles = (length - 10)/2 > 0 ? (length - 10)/2 : 0;
			
			int axles = 2 + addedAxles;
			int frontAxles = axles/2;
			int backAxles = axles - frontAxles;
			
			this.component = "";
			
			for(int i = 0; i < backAxles; i++) {
				this.component += "-o";
			}
			
			for(int i = 0; i < length - 2*axles - 1; i++) {
				this.component += "-";
			}
			
			for(int i = 0; i < frontAxles; i++) {
				this.component += "o-";
			}
			
			this.component += "'";
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		Car car = new Car(13,3);
		System.out.print(car.body.component);
//		System.out.println(car.chassis.component);
		System.out.print(car.chassis.component);
	}
	
}
