public class OoDesignPatterns {
	public static void main(String[] args) {
		// NOTE:: Factory patterns take the instantiation of an object and delegates the work to a subclass
		// NOTE:: Singleton patterns make it so there is only one universal version of a class that is controlled in one place
		// NOTE:: Proxy patterns are a way to add or control funcitionality wihtout modifying the original object
		//
	}
}

// TODO:: FACTORY::
public interface VehicleFactory {
	public static void createVehicle() {}
}

public class CarFactory implements VehicleFactory {
	@Override
	public static void createVehicle() {
		Integer car = 1;
	}
}

// TODO:: SINGLETON::
public class Singleton {
	//1. private static instance of the same class
	private static Singleton instance;
	//2. private constructor so no one else can create an object
	private Singleton(){}
	//3. public static method to get the instance
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
			return instance;
		}

	}
}

// TODO:: PROXY::
public interface BankAccount {
	void withdraw(String user, double amount);
}
public class RealBankAccount implements BankAccount {
	private double balance = 1000;
	@Override
	public void withdraw(String user, double amount) {}
}
public class CreditCard implements BankAccount {
	RealBankAccount ba = new RealBankAccount();
	@Override
	public void withdraw(String user, double amount) {}
}

