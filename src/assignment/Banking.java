package assignment;
class Bank{
	int getBal() {
		return 0;
	}
}
class BankA extends Bank{
	int getBal(int bal) {
		return bal;
	}
}
class BankB extends Bank{
	int getBal(int bal) {
		return bal;
	}
}
class BankC extends Bank{
	int getBal(int bal) {
		return bal;
	}
}


public class Banking {

	public static void main(String[] args) {
		
       BankA a=new BankA();
       BankB b= new BankB();
       BankC c =new BankC();
       System.out.println("$"+a.getBal(25000));
       System.out.println("$"+b.getBal(35000));
       System.out.println("$"+c.getBal(45000));
	}

}
