package com.alltopic;

public class Person {
	
	
	    private String fname, lname, address, city, state, phone, zip, email;

	    public Person(String fname, String lname, String address, String city, String state, String phone, String zip, String email)
	    {
	        this.fname = fname;
	        this.lname = lname;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.phone = phone;
	        this.zip = zip;
	        this.email = email;
	    }

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Person [fname=" + fname + ", lname=" + lname + ", address=" + address + ", city=" + city
					+ ", state=" + state + ", phone=" + phone + ", zip=" + zip + ", email=" + email + "]";
		}
}
