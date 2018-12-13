package pe.maldonado.java.advanced;


public class PrimeChecker {

	public void checkPrime(int ... a) {
			
		for (int n : a) {
			
			// print all primes from 1 to n
			//for (int i = 1; i <= n; i++) {
				if (isPrime(n)) {
					System.out.print(n + " ");
				}
			//}
			
			
		}
		
		System.out.print("\n");
		
	}
	
	private boolean isPrime(int n) {
		
		if (n == 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
		
	
	public static void main(String[] args) {
		
		PrimeChecker p = new PrimeChecker();
		
		p.checkPrime(2);
		p.checkPrime(2,1);
		p.checkPrime(2,1,3);
		p.checkPrime(2,1,3,4,5);
		
		
		/*try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
	}

	
	
}
