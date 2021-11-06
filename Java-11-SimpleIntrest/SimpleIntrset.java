package SimpleIntrest;

public class SimpleIntrset {

	public static void main(String[] args) {
		var P=10000;
		var R=5;
		var T=10;
		FunctionalInterface Funcobj = (var a,var b,var c) -> (a*b*c)/100;
		System.out.println(Funcobj.SI_Intrest(P,R,T));
		

	}
	interface FunctionalInterface{
		double SI_Intrest(double P,double R,double T);
	}

}
