package PrimitiveDatatypes;

public class Primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String si="188";
        int n = Integer.parseInt(si);
        System.out.println("Conversion of String to int: "+n);
        String sf="12.3";
        float f=Float.parseFloat(sf);
        System.out.println("Conversion of String to Float: "+f);
        String sl="123456789";
        long l=Long.parseLong(sl);
        System.out.println("Conversion of String to Long: "+l);
        String sd="123.456789";
        double d=Double.parseDouble(sd);
        System.out.println("Conversion of String to Double: "+d);
        String sb="Prasanthi";
        String sb1="FALSE";
        Boolean b1=Boolean.valueOf(sb);
        Boolean b2=Boolean.valueOf(sb1);
        System.out.println("Conversion of String to Boolean: "+b1);
        System.out.println("Conversion of String to Boolean: "+b2);
        String by="50";
        byte b=Byte.parseByte(by);
        System.out.println("Convertion of String to Byte: "+b);
        char ch = sb.charAt(4);
        System.out.println("Convertion of String to Character: "+ch);
	}

}
