package assignment;
class Modifiers{
	protected String fname="Priya";
	  protected String lname="Priyaaaa";
	  protected String mail="lp@gmail.com";
	  protected int age= 22;
}
 class  Protected extends Modifiers {
	 private String place="Ooty";

	public static void main(String[] args) {
		Protected myObj=new Protected();
		System.out.println("name:"+myObj.fname+""+myObj.lname);
		  System.out.println("mail:"+myObj.mail);
		  System.out.println("age:"+myObj.age);
		  System.out.println("place:"+myObj.place);


	}

}
