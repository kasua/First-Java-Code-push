package com.class26;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank Banka = new BankA ();
		Bank Bankb = new BankB ();
		Bank Bankc = new BankC ();
		
		Banka.getBalance();
		Bankb.getBalance();
		Bankc.getBalance();
	}
}