package enums;

public enum TransactionType {
	DEBIT("+"),
	CREDIT("-"),
	SOLD_CONSULTATION("CONSULTATION");

	private final String value;
	
	TransactionType(String value) {
	    this.value = value;
	  }
	
	public String getValue() {
	    return value;
	  }
}
