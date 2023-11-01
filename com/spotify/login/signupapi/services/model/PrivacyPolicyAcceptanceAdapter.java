package com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptanceAdapter;
import java.lang.Object;
import java.lang.String;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import p.co5;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance$Companion;

public final class PrivacyPolicyAcceptanceAdapter	// class@0009c1 from classes.dex
{

    public void PrivacyPolicyAcceptanceAdapter(){
       super();
    }
    public final PrivacyPolicyAcceptance fromJson(String p0){
       co5.o(p0, "value");
       return PrivacyPolicyAcceptance.Companion.fromString(p0);
    }
    public final String toJson(PrivacyPolicyAcceptance p0){
       co5.o(p0, "type");
       return p0.getValue();
    }
}
