package tp4;

public class MyPolynomial {
	private double[] coeffs;
	
//	public MyPolynomial() {
//		
//	}
	
	public MyPolynomial(double... coeffs) {
		this.coeffs = new double[coeffs.length];
		for(int i = 0; i<coeffs.length; i++) {
			this.coeffs[i] = coeffs[i];
		}
	}
	
	
	
//	public MyPoly (double[] coeffs) {
//		this.coeffs = coeffs;
//	}
	
	public int getDegree() {
		return coeffs.length - 1;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for ( int i = coeffs.length - 1; i >= 0; i--) {
			if(coeffs[i] != 0.0) {
				sb.append(coeffs[i]);
				sb.append("x^" + i);
				if(i > 0) {
				sb.append("+");
				}
			}
		}
		return sb.toString();
	}
	
	public MyPolynomial add(MyPolynomial right) {
		int leMax = Math.max(this.getDegree() +1, right.coeffs.length);
		int leMin = Math.min(this.getDegree(), right.getDegree());
		double[] tab = new double[Math.max(this.getDegree()+1, right.coeffs.length)];
		MyPolynomial res = new MyPolynomial(tab);
		/*
		 * on copie tous les coeffs commun jusqu'a la taille du tableau le plus petit
		 */
		for(int i = 0; i < leMin + 1; i++) {
			tab[i] = this.coeffs[i] + right.coeffs[i];
		}
		
		/* On repere lequel des deux tableaux est le plus grand */
		double[] lePlusGrand = (this.getDegree() >= right.getDegree() ? this.coeffs : right.coeffs);
//		
		double[] lePLusGrand;
//		if(this.getDegree() >= right.getDegree()) {
//			lePLusGrand = this.coeffs;
//		}
//		else {
//			lePLusGrand = right.coeffs;
//		}
		
		/*
		 * on complète le tableau avec les coefficients seulement présents dans le tableau le plus grand
		 */
		for(int j = 0; j < leMax; j++) {
			tab[j] = this.coeffs[j] + right.coeffs[j];
		}
		return (res);
	}
	
	// Méthode qui multiplie ce polynôme avec un autre polynôme donné, et renvoie le résultat
	public MyPolynomial multiply(MyPolynomial another) {
	      int maxDegree = getDegree() + another.getDegree();
	      double[] resultCoeffs = new double[maxDegree + 1];
	      /* */
	      for (int i = 0; i <= getDegree(); i++) {
	         for (int j = 0; j <= another.getDegree(); j++) {
	            resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
	         }
	      }
	      return new MyPolynomial(resultCoeffs);
	   }
	
	
	public static void main(String[]args) {
		MyPolynomial p1 = new MyPolynomial(4,5,0,9);
		MyPolynomial p2 = new MyPolynomial(7);
		MyPolynomial p3 = new MyPolynomial(2,3);
		MyPolynomial p4 = new MyPolynomial(4,24,34,-6,8,18,43,90,76);
		double[] t = { 3.0, 6.0, 8.0};
		MyPolynomial p5 = new MyPolynomial(t);
		System.out.println("p1= " + p1.toString());
		System.out.println("p2= " + p2.toString());
		System.out.println("p3= " + p3.toString());
		System.out.println("p4= " + p4.toString());
		System.out.println("p5= " + p5.toString());
		MyPolynomial p6 = p1.multiply(p2);
		System.out.println("p6=" + p6.toString());