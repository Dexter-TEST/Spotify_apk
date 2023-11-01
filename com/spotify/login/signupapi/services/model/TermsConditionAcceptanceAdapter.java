package com.spotify.login.signupapi.services.model.TermsConditionAcceptanceAdapter;
import java.lang.Object;
import java.lang.String;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import p.co5;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance$Companion;

public final class TermsConditionAcceptanceAdapter	// class@0009c7 from classes.dex
{

    public void TermsConditionAcceptanceAdapter(){
       super();
    }
    public final TermsConditionAcceptance fromJson(String p0){
       co5.o(p0, "value");
       return TermsConditionAcceptance.Companion.fromString(p0);
    }
    public final String toJson(TermsConditionAcceptance p0){
       co5.o(p0, "type");
       return p0.getValue();
    }
}
