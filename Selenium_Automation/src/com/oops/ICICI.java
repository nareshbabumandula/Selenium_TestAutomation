package com.oops;

public class ICICI implements RBI, FederalReserve{

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.maxWithDrawl();
		RBI.minWithDrawl();
		ic.accountType();

	}

	@Override
	public void accountType() {
		System.out.println("Account types are joint account, demat, personal and current");
	}

	@Override
	public void loans() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void minDeposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maxDeposit() {
		// TODO Auto-generated method stub
		
	}

}
