package pack1;

import java.io.Serializable;

public class UserBean implements Serializable
{
private String uName;
private String uPassword;
private String uFirstName;
private String uLastName;
private String uMailId;
private String uPhone;
public String getuName()
{
	return uName;
}
public void setuName(String uName)
{
	this.uName = uName;
}
public String getuPassword()
{
	return uPassword;
}
public void setuPassword(String uPassword) 
{
	this.uPassword = uPassword;
}
public String getuFirstName()
{
	return uFirstName;
}
public void setuFirstName(String uFirstName)
{
	this.uFirstName = uFirstName;
}
public String getuLastName() 
{
	return uLastName;
}
public void setuLastName(String uLastName) 
{
	this.uLastName = uLastName;
}
public String getuMailId() 
{
	return uMailId;
}
public void setuMailId(String uMailId) 
{
	this.uMailId = uMailId;
}
public String getuPhone() 
{
	return uPhone;
}
public void setuPhone(String uPhone)
{
	this.uPhone = uPhone;
}
 public UserBean() {};
}