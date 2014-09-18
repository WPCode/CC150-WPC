package practice;

public class FiveTwo {
	
	/*
		Given a (decimal - e.g. 3.72) number that is passed in as a string, print the binary rep-
		resentation. If the number can not be represented accurately in binary, print “ERROR”
	*/

	public static void main(String[] args){
		String num = "19.375";
		
		String bin = printBinary(num);
		System.out.println(bin);

	}

	private static String printBinary(String num) {
		// TODO Auto-generated method stub
		
		int intPart = Integer.parseInt(num.substring(0, num.indexOf('.')));
		double decPart = Double.parseDouble(num.substring(num.indexOf('.'), num.length()));

		String is = "";
		while(intPart > 0){
			int n = intPart % 2;
			intPart = intPart>>1;
			is = n + is;
		}
		
		String ds = "";
		while(decPart > 0){
			if(ds.length()>32){
				return "ERROR";
			}
			if(decPart==1){
				ds += 1;
				break;
			}
			double n = decPart * 2;
			if(n>=1){
				decPart = n - 1;
				ds = ds + 1;
			}else{
				decPart = n;
				ds = ds + 0;
			}
		}
		
		return is + "." + ds;
	}
}