package classjava;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println("Odd" + "    "+ "Even");
        for(int i=1; i<n;i++) {
        	if(i%2==0) {
        		System.out.println(i);
        	}
        	else
        		System.out.print(i+"    ");
        }
	}

}
