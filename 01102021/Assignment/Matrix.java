public class Matrix{
	public static void main(String[] args){
		int a[][]={{1,3,2},{6,4,5},{7,4,8}};
		System.out.println("The Diagnol elements of the given matrices are:");
				System.out.print("{"+a[0][0]+","+a[1][1]+","+a[2][2]+",");
				System.out.print(a[2][0]+","+a[1][1]+","+a[0][2]+"}");
	}
}