
public class Warmup_1 {

	public static boolean sleepIn( boolean weekday, boolean vacation ) {
		  
		if ( ( weekday == false ) || ( vacation == true ) )
			return true;
		else
			return false;
	}
	
	public static boolean monkeyTrouble( boolean aSmile, boolean bSmile ) {
		  
		if ( aSmile == bSmile )
			return true;
		else
			return false;
	}
	
	public static int sumDouble( int a, int b ) {
		  
		if ( a != b )
			return ( a + b );
		else
			return ( ( a + b ) * 2 );
	}
	
	public static int diff21( int n ) {
		  
		if ( n <= 21 )
			return ( 21 - n );
		else
			return ( Math.abs( 21 - n ) * 2 );
	}

	
	public static void main(String[] args) {
		
		
		
	}

}
