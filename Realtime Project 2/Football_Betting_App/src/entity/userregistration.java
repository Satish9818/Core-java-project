package entity;

public class userregistration {
		private String uusername;
		private String upassword;
		private String uemail;
		private String ufirstname;
		private String ulastname;
		private Address caddress;
		private double ubalance;
		
		
		public userregistration(String uusername, String upassword, String uemail, String ufirstname, String ulastname, Address caddress,
				double ubalance) {
			
			this.uusername = uusername;
			this.upassword = upassword;
			this.uemail = uemail;
			this.ufirstname = ufirstname;
			this.ulastname = ulastname;
			this.ubalance = ubalance;
			this.caddress=caddress;
		}


		public String getUusername() {
			return uusername;
		}


		public void setUusername(String uusername) {
			this.uusername = uusername;
		}


		public String getUpassword() {
			return upassword;
		}


		public void setUpassword(String upassword) {
			this.upassword = upassword;
		}


		public String getUemail() {
			return uemail;
		}


		public void setUemail(String uemail) {
			this.uemail = uemail;
		}


		public String getUfirstname() {
			return ufirstname;
		}


		public void setUfirstname(String ufirstname) {
			this.ufirstname = ufirstname;
		}


		public String getUlastname() {
			return ulastname;
		}


		public void setUlastname(String ulastname) {
			this.ulastname = ulastname;
		}


		public double getUbalance() {
			return ubalance;
		}


		public void setUbalance(double ubalance) {
			this.ubalance = ubalance;
		}
		
		public Address getCaddress() {
			return caddress;
		}

		public void setCaddress(Address caddress) {
			this.caddress = caddress;
		}


		@Override
		public String toString() {
			return "userregistration [uusername=" + uusername + ", upassword=" + upassword + ", uemail=" + uemail
					+ ", ufirstname=" + ufirstname + ", ulastname=" + ulastname + ", caddress=" + caddress
					+ ", ubalance=" + ubalance + "]";
		}
		


	
		
}
