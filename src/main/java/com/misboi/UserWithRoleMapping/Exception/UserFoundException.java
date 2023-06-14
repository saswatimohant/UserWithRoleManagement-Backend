package com.misboi.UserWithRoleMapping.Exception;

public class UserFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	public UserFoundException(){
        super("User with this username is already in DB!! Try with another one..");
    }
    public UserFoundException(String msg){
        super(msg);
    }
}
