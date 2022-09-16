package onesoft;

public class UseMobile {
	
	public static void main(String[] args) {
		
		
Mobile m=new Mobile();
		
		Mobile m2=new Mobile();
		
		
		m.brand="Samsung";
	    m.price=10000;
	    m.tax=5;
	    m.discount=1000;
	    m.warranty=true;
	    m.percentage=m.price*m.tax/100;
	    
	    m.netprice=m.price+m.percentage-m.discount;
	   
	    
	    
	    
	    
System.out.println(m.brand+"="+m.price+" "+m.warranty+" "+"NetPrice:"+m.netprice+" "+"percent="+m.percentage+"%");


m2.brand="OnePlus";
m2.price=20000;
m2.tax=2;
m2.discount=2000;
m2.percentage=m2.price*m2.tax/100;
m2.netprice=m2.price+m2.percentage-m2.discount;

System.out.println(m2.brand+"="+m2.price+" "+m2.warranty+" "+"Net Price:"+m2.netprice+"percent="+m2.percentage+"%");


		

		
		
		
		
		
	}

}
