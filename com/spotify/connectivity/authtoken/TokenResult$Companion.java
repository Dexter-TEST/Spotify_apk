package com.spotify.connectivity.authtoken.TokenResult$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import com.spotify.connectivity.authtoken.TokenResult$Failure;
import p.co5;
import com.spotify.connectivity.authtoken.TokenExchangeError;
import com.spotify.connectivity.authtoken.TokenResult$Failure$Aborted;
import com.spotify.connectivity.authtoken.TokenResult$Failure$InvalidCredentials;
import com.spotify.connectivity.authtoken.TokenResult$Failure$BadRequest;
import com.spotify.connectivity.authtoken.TokenResult$Failure$Forbidden;
import com.spotify.connectivity.authtoken.TokenResult$Failure$PermanentNetworkError;
import com.spotify.connectivity.authtoken.TokenResult$Failure$TemporaryBackendError;
import com.spotify.connectivity.authtoken.TokenResult$Failure$PermanentBackendError;
import com.spotify.connectivity.authtoken.TokenResult$Failure$UnexpectedError;

public final class TokenResult$Companion	// class@00067c from classes.dex
{

    private void TokenResult$Companion(){
       super();
    }
    public void TokenResult$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final TokenResult$Failure getFailure(int p0,String p1){
       TokenResult$Failure$Aborted uFailure$Abo;
       co5.o(p1, "message");
       if (p0 == TokenExchangeError.ABORTED.getValue()) {
          uFailure$Abo = new TokenResult$Failure$Aborted(p1);
       }else if(p0 == TokenExchangeError.INVALID_CREDENTIALS.getValue()){
          uFailure$Abo = new TokenResult$Failure$InvalidCredentials(p1);
       }else if(p0 == TokenExchangeError.BAD_REQUEST.getValue()){
          uFailure$Abo = new TokenResult$Failure$BadRequest(p1);
       }else if(p0 == TokenExchangeError.FORBIDDEN.getValue()){
          uFailure$Abo = new TokenResult$Failure$Forbidden(p1);
       }else if(p0 == TokenExchangeError.PERMANENT_NETWORK_ERROR.getValue()){
          uFailure$Abo = new TokenResult$Failure$PermanentNetworkError(p1);
       }else if(p0 == TokenExchangeError.TEMPORARY_BACKEND_ERROR.getValue()){
          uFailure$Abo = new TokenResult$Failure$TemporaryBackendError(p1);
       }else if(p0 == TokenExchangeError.PERMANENT_BACKEND_ERROR.getValue()){
          uFailure$Abo = new TokenResult$Failure$PermanentBackendError(p1);
       }else if(p0 == TokenExchangeError.UNEXPECTED_ERROR.getValue()){
          uFailure$Abo = new TokenResult$Failure$UnexpectedError(p1);
       }else {
          uFailure$Abo = new TokenResult$Failure$UnexpectedError(p1);
       }
       return uFailure$Abo;
    }
}
