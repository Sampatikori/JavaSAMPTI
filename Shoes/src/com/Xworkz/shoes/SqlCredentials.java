package com.Xworkz.shoes;

public enum SqlCredentials {
	URL("jdbc:mysql://localhost:3306/sep_08"),USERNAME("root"),PASSWORD("Xworkzodc@123");
  String value;

private SqlCredentials(String value) {
	this.value = value;
}

public String getValue() {
	return value;
}


  
}
