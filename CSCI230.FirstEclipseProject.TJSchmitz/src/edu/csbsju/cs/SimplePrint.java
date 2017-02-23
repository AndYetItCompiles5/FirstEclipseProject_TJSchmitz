/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author tjschmitz
 *
 */
public class SimplePrint {
	private String pName;
	private int pAge;

	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TJ Schmitz");
		
		for(int i = 0; i < args.length;i++){
			System.out.println("args[ " + i + " ] = " + args[i] );	
		}

	}

	/**
	 * @return the pName
	 */

	 * @param pAge the pAge to set
	 */
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	/**
	 * @param pName
	 * @param pAge
	 */
	public SimplePrint(String pName, int pAge) {
		super();
		this.pName = pName;
		this.pAge = pAge;
	}

}
