package com.spotify.connectivity.authstorage.AuthStorageResult$Failure;
import com.spotify.connectivity.authstorage.AuthStorageResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import com.spotify.connectivity.authstorage.AuthStorageResult$Failure$Unrecognised;
import java.lang.Object;
import p.co5;
import com.spotify.connectivity.authstorage.AuthStorageResult$Failure$UserAlreadyExists;
import com.spotify.connectivity.authstorage.AuthStorageResult$Failure$UserNotFound;
import p.cd2;

public abstract class AuthStorageResult$Failure extends AuthStorageResult	// class@00066e from classes.dex
{

    private void AuthStorageResult$Failure(){
       super(null);
    }
    public void AuthStorageResult$Failure(DefaultConstructorMarker p0){
       super();
    }
    public final String message(){
       String str;
       if (co5.c(this, AuthStorageResult$Failure$Unrecognised.INSTANCE)) {
          str = "Unrecognised";
       }else if(co5.c(this, AuthStorageResult$Failure$UserAlreadyExists.INSTANCE)){
          str = "UserAlreadyExists";
       }else if(co5.c(this, AuthStorageResult$Failure$UserNotFound.INSTANCE)){
          str = "UserNotFound";
       }else {
          throw new cd2(10);
       }
       return str;
    }
}
