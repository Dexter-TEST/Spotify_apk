package com.spotify.connectivity.authtoken.TokenExchangeError;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TokenExchangeError extends Enum	// class@00067b from classes.dex
{
    private final int value;
    private static final TokenExchangeError[] $VALUES;
    public static final TokenExchangeError ABORTED;
    public static final TokenExchangeError BAD_REQUEST;
    public static final TokenExchangeError FORBIDDEN;
    public static final TokenExchangeError INVALID_CREDENTIALS;
    public static final TokenExchangeError PERMANENT_BACKEND_ERROR;
    public static final TokenExchangeError PERMANENT_NETWORK_ERROR;
    public static final TokenExchangeError TEMPORARY_BACKEND_ERROR;
    public static final TokenExchangeError UNEXPECTED_ERROR;

    private static final TokenExchangeError[] $values(){
       TokenExchangeError[] tokenExchang = new TokenExchangeError[]{TokenExchangeError.ABORTED,TokenExchangeError.INVALID_CREDENTIALS,TokenExchangeError.BAD_REQUEST,TokenExchangeError.FORBIDDEN,TokenExchangeError.PERMANENT_NETWORK_ERROR,TokenExchangeError.TEMPORARY_BACKEND_ERROR,TokenExchangeError.PERMANENT_BACKEND_ERROR,TokenExchangeError.UNEXPECTED_ERROR};
       return tokenExchang;
    }
    static {
       TokenExchangeError.ABORTED = new TokenExchangeError("ABORTED", 0, 0);
       TokenExchangeError.INVALID_CREDENTIALS = new TokenExchangeError("INVALID_CREDENTIALS", 1, 1);
       TokenExchangeError.BAD_REQUEST = new TokenExchangeError("BAD_REQUEST", 2, 2);
       TokenExchangeError.FORBIDDEN = new TokenExchangeError("FORBIDDEN", 3, 3);
       TokenExchangeError.PERMANENT_NETWORK_ERROR = new TokenExchangeError("PERMANENT_NETWORK_ERROR", 4, 4);
       TokenExchangeError.TEMPORARY_BACKEND_ERROR = new TokenExchangeError("TEMPORARY_BACKEND_ERROR", 5, 5);
       TokenExchangeError.PERMANENT_BACKEND_ERROR = new TokenExchangeError("PERMANENT_BACKEND_ERROR", 6, 6);
       TokenExchangeError.UNEXPECTED_ERROR = new TokenExchangeError("UNEXPECTED_ERROR", 7, 7);
       TokenExchangeError.$VALUES = TokenExchangeError.$values();
    }
    private void TokenExchangeError(String p0,int p1,int p2){
       this.value = p2;
    }
    public static TokenExchangeError valueOf(String p0){
       return Enum.valueOf(TokenExchangeError.class, p0);
    }
    public static TokenExchangeError[] values(){
       return TokenExchangeError.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
