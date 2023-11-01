package com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.zf2;
import java.lang.String;
import p.co5;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Ok;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Error;
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse$Status$Unknown;
import p.cd2;

public abstract class IdentifierTokenSignupResponse$Status	// class@0009b3 from classes.dex
{

    private void IdentifierTokenSignupResponse$Status(){
       super();
    }
    public void IdentifierTokenSignupResponse$Status(DefaultConstructorMarker p0){
       super();
    }
    public final Object map(zf2 p0,zf2 p1,zf2 p2){
       co5.o(p0, "whenOk");
       co5.o(p1, "whenError");
       co5.o(p2, "whenUnknown");
       if (this instanceof IdentifierTokenSignupResponse$Status$Ok) {
          p0 = p0.invoke(this);
       }else if(this instanceof IdentifierTokenSignupResponse$Status$Error){
          p0 = p1.invoke(this);
       }else if(this instanceof IdentifierTokenSignupResponse$Status$Unknown){
          p0 = p2.invoke(this);
       }else {
          throw new cd2(10);
       }
       return p0;
    }
}
