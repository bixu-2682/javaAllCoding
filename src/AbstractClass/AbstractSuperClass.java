package AbstractClass;

//Here class is abstract
public abstract class AbstractSuperClass {

	//Data memebers can't be abstract
	public int a = 9;
	//myMethiod is abstract
	abstract void myMethod();
	// myMethod(int x) is not an abstract method. Its a concrete method
	void myMethod(int x){
		{
			System.out.println("I am the super class and I am not an abstract method. I am a concrete method");
		}
	}
}
