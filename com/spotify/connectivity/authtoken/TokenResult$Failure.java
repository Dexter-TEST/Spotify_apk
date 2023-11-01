package com.spotify.connectivity.authtoken.TokenResult$Failure;
import com.spotify.connectivity.authtoken.TokenResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;

public abstract class TokenResult$Failure extends TokenResult	// class@000685 from classes.dex
{
    private final boolean isPermanent;

    private void TokenResult$Failure(boolean p0){
       this.isPermanent = p0;
    }
    public void TokenResult$Failure(boolean p0,DefaultConstructorMarker p1){
       super(p0);
    }
    public abstract String getMessage();
    public final boolean isPermanent(){
       return this.isPermanent;
    }
}
