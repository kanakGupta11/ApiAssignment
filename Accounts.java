package com.example.demo;

import java.util.Date;

public class Accounts {
		private String City, state,Ownername;
		private int pin;
		private int BalanceAmount;
		private Date CreatedDate;
		private String AccountStatus ;//ACTIVE,INACTIVE,CLOSED
		public Accounts(String city, String state, String Ownername, 
				int pin, int BalanceAmount,String AccountStatus) {
			this.City = city;
			this.state = state;
			this.Ownername = Ownername;
			this.pin = pin;
			this.BalanceAmount = BalanceAmount;
			this.CreatedDate = new Date();
			this.AccountStatus = AccountStatus;
		}
		public String getCity() {
			return City;
		}
		public String getState() {
			return state;
		}
		public String getOwnername() {
			return Ownername;
		}
		public int getPin() {
			return pin;
		}
		public int getBalanceAmount() {
			return BalanceAmount;
		}
		public Date getCreatedDate() {
			return CreatedDate;
		}
		public String getAccountStatus() {
			return AccountStatus;
		}
		
		public void ShowAccountDetails() {
			
			System.out.println("name:"+Ownername);
			
		}
		
}
