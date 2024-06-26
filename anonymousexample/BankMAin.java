package anonymousexample;
public class BankMAin {
public static void main(String[] args) {
		
		Bank b = (int bal,String name)->{
			
			System.out.println("Hii "+name);
			int k = bal+5000;
			System.out.println("Your balance is "+k);
			return k;
		};
		
		int r = b.getDeposite(3000,"Khushi");
	}

}
