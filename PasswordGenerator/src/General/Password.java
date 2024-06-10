package General;

public class Password {
	String value;
	int length;
	public Password(String s){
		value = s;
		length = s.length();
	}
	
	public int charType(char c){
		int val;
		if((int)c>=65 && (int)c<=90){
			val = 1;
		}
		else if((int)c>=97 && (int)c<=122){
			val = 2;
		}
		else if((int)c>=60 && (int)c<=71){
			val = 3;
		}
		else{
			val = 4;
		}
		return val;
	}
	
	public int passwordStrength(){
		String s = this.value;
		boolean UsedUpper = false;
        boolean UsedLower = false;
        boolean UsedNum = false;
        boolean UsedSym = false;
        int type;
        int score = 0;
        
        for(int i=0;i<s.length();i++){
        	char ch = s.charAt(i);
        	type = charType(ch);
        	
        	if (type == 1) UsedUpper = true;
            if (type == 2) UsedLower = true;
            if (type == 3) UsedNum = true;
            if (type == 4) UsedSym = true;
        }
        
        if (UsedUpper) score += 1;
        if (UsedLower) score += 1;
        if (UsedNum) score += 1;
        if (UsedSym) score += 1;
        if (s.length() >= 8) score += 1;
        if (s.length() >= 16) score += 1;

        return score;
		
	}
	
	public String calculateScore(){
		int score = this.passwordStrength();
		
		if (score == 6) {
            return "This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines";
        } else if (score >= 4) {
            return "This is a good password :) but you can still do better";
        } else if (score >= 3) {
            return "This is a medium password :/ try making it better";
        } else {
            return "This is a weak password :( definitely find a new one";
        }
	}
	
	@Override
	public String toString(){
		return value;
	}
}
