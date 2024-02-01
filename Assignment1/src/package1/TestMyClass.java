package package1;

class MyClass{
	
	MyClass(int n){
		System.out.println("in one argument");
	}
	
	MyClass(){
		System.out.println("in no argument");
		
	}
}

public class TestMyClass {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass(20);
		
		
	}

}
