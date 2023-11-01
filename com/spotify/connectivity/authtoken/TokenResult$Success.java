package com.spotify.connectivity.authtoken.TokenResult$Success;
import com.spotify.connectivity.authtoken.TokenResult;
import com.spotify.connectivity.authtoken.Token;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;

public final class TokenResult$Success extends TokenResult	// class@000686 from classes.dex
{
    private final Token token;

    public void TokenResult$Success(Token p0){
       co5.o(p0, "token");
       super(null);
       this.token = p0;
    }
    public static TokenResult$Success copy$default(TokenResult$Success p0,Token p1,int p2,Object p3){
       TokenResult$Success token;
       if ((p2 & 0x01)) {
          token = p0.token;
       }
       return p0.copy(token);
    }
    public final Token component1(){
       return this.token;
    }
    public final TokenResult$Success copy(Token p0){
       co5.o(p0, "token");
       return new TokenResult$Success(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof TokenResult$Success) {
          return false;
       }
       if (!co5.c(this.token, p0.token)) {
          return false;
       }
       return true;
    }
    public final Token getToken(){
       return this.token;
    }
    public int hashCode(){
       return this.token.hashCode();
    }
    public String toString(){
       return "Success\(token="+this.token+')';
    }
}
