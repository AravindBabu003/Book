package Assignments;

public class Test {
	public static void main(String[] args) {
		Test a = new Test(); 
		a.first();
		System.out.println();
		a.second();
		System.out.println();
		a.thirdfourthfifth();
	}
	//First Question
	 public void first(){
		int n=5;
		for(int i=0; i<n; i++)	{
			//I
			for(int j=0; j<n; j++){
				if(j==0)
				System.out.print("*");
//				else
//					System.out.println(" ");
			}
			System.out.print("  ");
			for(int j=0; j<n; j++){
				if(j==0||i==j||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(int j=0; j<n; j++){
				if(j==0||i==(n-1)/2||i==n-1||i==0)
					System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.print("  ");
			for(int j=0; j<n; j++){
				if(j==0&&i!=n-1||i==(n-1)&&j!=0&&j!=n-1||j==n-1&&i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(int j=0; j<n; j++){
				if(j==0&&i!=0 || i==0&&j!=0&&j!=n-1||j==1&&j==n-1||i*j==n-1&&j>=2||i==j&&j>=2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(int j=0; j<n; j++){
				if(i==0&&j!=0&&j!=n-1||j==n-1&&i!=0&&i!=n-1||i==n-1&&j!=0&&j!=n-1||j==0&&i!=0&&i!=n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for(int j=0; j<n; j++){
				if(j==0||i==j||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("  ");
		}
		
		
	}
	//Second Question
	 public void second(){
		 int n=4;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
		
	
		public void thirdfourthfifth(){
			int n=14;
		for(int i=0; i<n; i++){
			//Third
			for(int j=0; j<n; j++){
				if(i+j<=(n-1)/2 || j-i>=(n-1)/2||j==0||j==n-1||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			//Fourth
			for(int j=0; j<n; j++){
				if(i-j>=(n-1)/2||i+j>=(n+((n-1)/2)-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			//Fifth
			for(int j=0; j<n; j++){
				if(i+j<=(n-1)/2||i-j>=(n-1)/2||i==0||i==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		}
}
