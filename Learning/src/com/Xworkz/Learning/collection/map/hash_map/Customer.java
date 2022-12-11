package com.Xworkz.Learning.collection.map.hash_map;

public class Customer {
private String name;
private Integer acc_no;
private String location;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAcc_no() {
	return acc_no;
}
public void setAcc_no(Integer acc_no) {
	this.acc_no = acc_no;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", acc_no=" + acc_no + ", location=" + location + "]";
}


}
