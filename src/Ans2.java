class Customer {
	private int id;
	private String name;
	private double amount;

	public Customer(int id, String name, double amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double calculateBill() {
		// this method will be implemented by subclasses
		return 0.0;
	}
}

class RegularCustomer extends Customer {
	public RegularCustomer(int id, String name, double amount) {
		super(id, name, amount);
	}

	@Override
	public double calculateBill() {
		return this.getAmount();
	}
}

class SeniorCustomer extends Customer {
	private static final double DISCOUNT = 0.5;

	public SeniorCustomer(int id, String name, double amount) {
		super(id, name, amount);
	}

	@Override
	public double calculateBill() {
		return this.getAmount() * (1 - DISCOUNT);
	}
}
