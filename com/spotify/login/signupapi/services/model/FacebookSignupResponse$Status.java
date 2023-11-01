package com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.zf2;
import java.lang.String;
import p.co5;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status$Ok;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse$Status$Error;
import p.cd2;

public abstract class FacebookSignupResponse$Status	// class@0009ac from classes.dex
{

    private void FacebookSignupResponse$Status(){
       super();
    }
    public void FacebookSignupResponse$Status(DefaultConstructorMarker p0){
       super();
    }
    public final Object map(zf2 p0,zf2 p1){
       co5.o(p0, "whenOk");
       co5.o(p1, "whenError");
       if (this instanceof FacebookSignupResponse$Status$Ok) {
          p0 = p0.invoke(this);
       }else if(this instanceof FacebookSignupResponse$Status$Error){
          p0 = p1.invoke(this);
       }else {
          throw new cd2(10);
       }
       return p0;
    }
}
