class HolaMundo{
	public static void main(String argumentos[]) {
	 System.out.println("Hola mundo");
		for (int i=0;  i< argumentos.length; i++) {
			System.out.println("Arg " + i + " = " + argumentos[i]);
	}
	int entero;
	entero = 1234567890;    //  hasta 2.000.000.000   4 byte en general 
	float decimel = 42345678222222222229f;   // editar f 
	double  dobleprecision = 42342222222222256789d ; // editar d para doble 
	long enterolong = 12345678901234567L;    // mas largo 
	byte unbyte = -127; // hasta 127
	 String texto ;
	 texto = "cualquier texto";
	 char caracter = 'A';
	 
	 
	 System.out.println ("entero= " + entero); // + para ajunta texto 
	 System.out.println ("decimel =" + decimel);
	 System.out.println ("double =" + dobleprecision);
	 System.out.println ("enterolong =" + enterolong);
	 System.out.println ("unbyte =" + unbyte);
	 System.out.println ("texto =" + texto);
	 System.out.println ("caracter =" + caracter);
	}
}