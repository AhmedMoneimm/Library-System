package frontend;

public class Validation {
    
    public static boolean hasNoSpace(String str){
	for(int i=0;i<str.length();i++){
            if(Character.isSpaceChar(str.charAt(i)))
                return false;
        }
        return true;
    }
    
    public static boolean isDouble(String number){
        if(!hasNoSpace(number))
            return false;
	try
	{
            Double.parseDouble(number);
            return true;
	}
	catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean isInt(String number){
        if(!hasNoSpace(number))
            return false;
	try
	{
            Integer.parseInt(number);
            return true;
	}
	catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean isPositive(String number){
        if(!hasNoSpace(number))
            return false;
	try
	{
            return Integer.parseInt(number) > 0;
	}
	catch(NumberFormatException e){
            return false;
        }
    }
    
    public static boolean isPhoneNumber(String number){
        if(!hasNoSpace(number))
            return false;
        else if(number.length()!=11)
            return false;
        else if(number.charAt(0)!='0')
            return false;
        else if(number.charAt(1)!='1')
            return false;
        else if(number.charAt(2)!='0' && number.charAt(2)!='1' && number.charAt(2)!='2' && number.charAt(2)!='5')
            return false;
        else
            for(int i=2;i<11;i++){
                if(!Character.isDigit(number.charAt(i)))
                    return false;
                    }
        return true;
    }
    
    public static boolean isAlphabetic(String str){
        if(!hasNoSpace(str))
            return false;
        for(int i=0;i<str.length();i++){
            if(!Character.isAlphabetic(str.charAt(i)))
                return false;
        }
        return true;
    }   
    
    public static boolean isEmail(String email){
        if(!hasNoSpace(email))
            return false;
        int flag=0,i;

        if(email.charAt(0)=='@')
            return false;

        if(!hasNoSpace(email))
            return false;

        for(i=0;i<email.length();i++){
            if(email.charAt(i)=='@')
            flag=1;
        }
        if(flag==1){
            if(email.charAt(i-4)=='.' && email.charAt(i-3)=='c' && email.charAt(i-2)=='o' && email.charAt(i-1)=='m' )
            {
                if(email.charAt(i-5)!='@')
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }
}