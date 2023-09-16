package salpro;

public class Calc {
	
    int no1;
    int no2;
	@Override
	public String toString() {
		return "Calc [no1=" + no1 + ", no2=" + no2 + "]";
	}
	
	public int getAa() {
		return no1;
	}
	public void setAa(int aa) {
		this.no1 = aa;
	}
	public int getBb() {
		return no2;
	 }
	public void setBb(int bb) {
		this.no2 = bb;
	}
	
	public int add() {
		
		return  no1+no2;
	}
 public int sub() {
		
		return  no1-no2;
	}
 public int mult() {
	
	return  no1*no2;
}
 public int div() {
	
	return  no1/no2;
}
	
	

}
