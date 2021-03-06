package HRMS.hrms.business.Rules;


import java.time.LocalDate;
import java.util.regex.Pattern;


public class Rules {
public static boolean checkFirstName(String firstName) {
		
		if (firstName.length()<2) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkLastName(String lastName) {
		
		if (lastName.length()<2) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkMail(String mail) 	{
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		java.util.regex.Matcher matcher = pattern.matcher(mail);
		
		if (matcher.matches()) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public static boolean checkPhone(String phone) {
		
		if (phone.length()<7) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkNationalityId(String nationalityId) {
		
		if (nationalityId.length()<11) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkPassword(String password) {
		
		if (password.length()<6) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkCompanyName(String companyName) {
		
		if (companyName.length()<2) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkWebSite(String webSite) {
		
		if (webSite.length()<5) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkBirthDate(LocalDate birthDate) {
		
		if (birthDate == null) {			
			return false;
		}else {
			return true;
		}			
	}
	
	public static boolean checkPositionName(String positionName) {
		
		if (positionName.length()<2) {			
			return false;
		}else {
			return true;
		}			
	}
}
