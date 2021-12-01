package com.cucumber.test.sql;

public class DBCall  {
    public static String testsql(String loginId){
    	if (loginId=="a1")
    	{
    	loginId="Select top 1 ID from Claim ORDER BY ID desc";
    	
    	}
    	else if(loginId=="b1")
    	{
    		loginId="Select top 1 InsuredName from Claim ORDER BY ID desc";
        
    	}
		return loginId;
		
    }
    
    public static String testInsuredsql(String sql){
    	sql="Select top 1 InsuredName from Claim ORDER BY ID desc";
    	return sql;
    }
    
    public static String querryexecuter(String userid){
        if (userid=="c1")
        {
            userid = "select TOP 1 id from Status where id=id and Time IS NULL";
            
        }
    
    	else if(userid=="c2")
        {
            userid = "select TOP 1 id FROM Status where id=lid and ProductId = 1 and Time IS NULL";
 	    
        }

        else if (userid=="c3"){
            userid = "select TOP 1 id FROM Status where id=nonid and ProductId = 0 and Time IS NULL";
 	    
        }
        return userid;
    }
}
