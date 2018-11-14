package GeneriValidator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validator
{
static	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
public static void main(String[] args)
{
	System.out.println("Data type Validator");
	System.out.println(DataTypeValidator(10.225));
	System.out.println("Data length validator");
	System.out.println(DataLengthValidator("Lana",(short)4));
	System.out.println("Special character Validator");
System.out.println(SpecialCharValidator("Lana@"));
System.out.println("Domain Validator");
System.out.println(domainValidation());
System.out.println("Email validator");
System.out.println(emailValidation("mailme.narayaan96@gmail.com"));
System.out.println("Date validator");
System.out.println(day(formatter, "77/3/1996"));

}
public static boolean DataTypeValidator(Object numeric)
{
	if(numeric.getClass().getSimpleName().equals("Integer"))
	{
		return true;
	}
	else if(numeric.getClass().getSimpleName().equals("String"))
	{
		return true;
	}
	else if(numeric.getClass().getSimpleName().equals("Character"))
	{
		return true;
	}
	else if (numeric.getClass().getSimpleName().equals("Double"))
	{
		return true;
	}
return false;
}
public static boolean DataLengthValidator(String object,short length)
{
if(object.length()<=length)
{
	return true;
}
return false;
}
public static boolean SpecialCharValidator(String character)
{
if(character.contains("@")|| character.contains("#")||character.contains("$")||character.contains("%")||character.contains("^"))
	{
		return false;
	}

return true;
}
public static boolean domainValidation() 
{
ArrayList<String> date = new ArrayList<String>(); 
date.add("Monday");
date.add("Tuesday");
date.add("Wednesday");
date.add("Thursday");
date.add("Friday");
date.add("Saturday");

if (date.contains("Sunday"))
{
   return true;
} else 
{
 return false;
}
}
public static boolean emailValidation(String email) 
{
	if(email.contains("@")||email.contains("."))
	{
//		Pattern pattern = Pattern.compile(//s);
//		Matcher matcher = pattern.matcher(email);
		if (!email.contains(" "))
		{
			return true;
		}
	}
	return false;	
}
public static Boolean day(SimpleDateFormat formatter, String datevalue)
{
	try
	{
		formatter.parse(datevalue);
		return true;
	} catch (ParseException e)
	{
		return false;
	}
	
}

}

 










