package bankapp;

public class Acc {
private long  accno;
private String holdname;
private String bname;
private String Ifsccode;
private String acctype;
private String transaction;
private double amount;
public long getAccno() {
	return accno;
}
public void setAccno(long accno) {
	this.accno = accno;
}
public String getHoldname() {
	return holdname;
}
public void setHoldname(String holdname) {
	this.holdname = holdname;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getIfsccode() {
	return Ifsccode;
}
public void setIfsccode(String ifsccode) {
	Ifsccode = ifsccode;
}
public String getAcctype() {
	return acctype;
}
public void setAcctype(String acctype) {
	this.acctype = acctype;
}
public String getTransaction() {
	return transaction;
}
public void setTransaction(String transaction) {
	this.transaction = transaction;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Acc [accno=" + accno + ", holdname=" + holdname + ", bname=" + bname + ", Ifsccode=" + Ifsccode
			+ ", acctype=" + acctype + ", transaction=" + transaction + ", amount=" + amount + "]";
}

}
