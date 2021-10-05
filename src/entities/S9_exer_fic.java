package entities;

public class S9_exer_fic {
	
	private int number;
	private String holder;
	private double saldo;
	
	public S9_exer_fic(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public S9_exer_fic(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	public int getNumbacc() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double amount) {
		saldo += amount;
	}
	
	public void withdraw(double amount) {
		saldo -= amount + 5.00;
	}
	
	public String toString() {
	return "Account " 
			+ number 
			+ ", Holder: " 
			+ holder 
			+ ", Balence: $ " 
			+ String.format("%.2f", saldo);
	}
}
