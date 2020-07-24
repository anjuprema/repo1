import java.io.IOException;

class typeCasting{
	public static void main(String args[]) throws IOException{
		int i = 10;
		double d = 300.501;
		
		//widening or implicit casting
		long l = (long) i;
		System.out.println("int ="+i+" is widening casted to long="+l);
		
		//narrowing or explicit casting
		int ni = (int) d;
		System.out.println("double="+d+" is narrowing casted to int="+ni);
	}
}