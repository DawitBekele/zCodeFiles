package Homework.lab4.prob3;

public class PayCheck {
 private double grossPay;
 private double fica;
 private double stateTax;
 private double localTax;
 private double medicare;
 private double socialSecurity;
	public PayCheck(double grossPay,double fica,double stateTax,double localTax,double medicare,double socialSecurity ){
		this.grossPay=grossPay;
		this.fica=fica;
		this.stateTax=stateTax;
		this.localTax=localTax;
		this.medicare=medicare;
		this.socialSecurity=socialSecurity;
	}
	public double getGrossPay() {
		return grossPay;
	}
	public double getFica() {
		return fica;
	}
	public double getStateTax() {
		return stateTax;
	}
	public double getLocalTax() {
		return localTax;
	}
	public double getMedicare() {
		return medicare;
	}
	public double getSocialSecurity() {
		return socialSecurity;
	}
public double getNetPay() {
	double deduction=this.fica+this.socialSecurity+this.localTax+this.medicare+this.stateTax;
	return grossPay-deduction;
}
	public void print() {
		
	}

}
