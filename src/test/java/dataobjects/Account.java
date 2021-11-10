package dataobjects;

import java.util.UUID;

public class Account {
	private String customer_firstname = "Tiep";
	private String customer_lastname = "Duong";
	private String email = UUID.randomUUID().toString() + "@test.com";
	private String passwd = "123456";
	private String firstname = "Tiep";
	private String lastname = "Duong";
	private String address1 = "20 W 29th St";
	private String city = "New York";
	private String id_state = "Alabama";
	private String postcode = "10001";
	private String id_country = "United States";
	private String phone_mobile = "12126792222";
	private String alias = "Address";

	public String getCustomerFirstName() {
		return this.customer_firstname;
	}

	public String getCustomerLastName() {
		return this.customer_lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public String getAddress1() {
		return this.address1;
	}

	public String getCity() {
		return this.city;
	}

	public String getIdState() {
		return this.id_state;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public String getIdCountry() {
		return this.id_country;
	}

	public String getPhoneMobile() {
		return this.phone_mobile;
	}

	public String getAlias() {
		return this.alias;
	}
}
