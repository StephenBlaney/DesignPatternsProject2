package Proxy;

public class ReceiptProxy implements ReceiptInterface {
	Receipt receipt;

	public ReceiptProxy() {
	}

	@Override
	public void makeRecipt() {
		receipt = new Receipt();
		receipt.makeRecipt();
		
	}

}