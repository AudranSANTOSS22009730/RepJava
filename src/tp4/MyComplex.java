package tp4;

public class MyComplex {
	private double real, imag;
	
	public MyComplex() {
		real = 0.0;
		imag = 0.0;
	}
	public MyComplex(double real, double imag) {
		this.imag = imag;
		this.real = real;
	}
	public double getReal() {
		return real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	/**
	 * doit retourner une chaine de la forme "real+imagi" , sans formattage
	 * du type <code>double</code>
	 */
	public String toString() {
		return (real + "+" + imag + "i");
	}
	/**
	 * @return <code>true</code> si <code>imag = 0</code>
	 */
	
	public boolean isReal() {
		return imag ==0.0;
	}
	
	public boolean isImaginary() {
		return real ==0.0;
	}
	
	public boolean equals(double real, double imag) {
		return this.real==real && this.imag==imag;
	}
	
	/**
	 * @return la norme du vecteur...
	 */
	
	
	public static void main(String[]args ) {
		MyComplex c1 = new Mycomplex();
		c1.setValue(1.0,2.0);
		System.out.println(c1);
		MyComplex c2 = new MyComplex(4.0,5.0);
		System.out.println("test equals :" + c1.equals(c2.getReal(),c2.getImag()));
	}
}
