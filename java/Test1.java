import java.util.*;
class Customer {
	private int accno;
	private String name;
	Scanner sc= new Scanner(System.in);
	Customer(String name,int accno){
	this.name=name;
	this.accno=accno;
	}
public String getName(){
	return name;
	
}
public int getacno(){
	return accno;
	
}
}



class CustomerSort implements Comparator{
	
	public int compare(Object o1, Object o2){
		Customer c1=(Customer)o1;
		Customer c2=(Customer)o2;
		
	int c=c1.getName().compareTo(c2.getName());
	if(c==1)
		return 1;
	return -1;
	}	
}

class CheckNo extends RuntimeException{
		
	CheckNo(){
		 System.out.println("Invalid No.");

	 } 
	 
	
	}


class Test1{
	
	static int i=0;
	public static void main(String...args){
		int no;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of beniry");
		int size=sc.nextInt();
		Customer[] obj=new Customer[size];
		do{
		
		System.out.println("********************MENU**********************");
		System.out.println("Prass 1. For adding Benf");
		System.out.println("Prass 2. For Show");
		System.out.println("Prass 3. To exit ");
		no=sc.nextInt();
		switch(no){
			case 1:
			try{
					System.out.println("Enter Name");
					String name=sc.next();
					System.out.println("Enter Account No");
					String  accno=sc.next();
					int accountNumer = Integer.valueOf(accno);
					
					obj[i]=new Customer(name,accountNumer);
					
					i++;
				}
				catch(Exception c)
				{
					new CheckNo();
				}
			break;
			case 2:
			Arrays.sort(obj,new CustomerSort());
			System.out.println("Account no.         Name");
			for(int j=0;j<i;j++)
			{
				
				System.out.printf("%-20d %s",obj[j].getacno(),obj[j].getName());
				System.out.println();
			}
			System.out.println("*************************************************************************");
			break;
			
					
		}	
		}
		while(no!=3);
	}
}