package com.spotify.login.signupapi.services.model.TermsConditionAcceptance$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import p.co5;
import p.xe7;
import java.util.LinkedHashMap;
import java.util.Map;

public final class TermsConditionAcceptance$Companion	// class@0009c5 from classes.dex
{

    private void TermsConditionAcceptance$Companion(){
       super();
    }
    public void TermsConditionAcceptance$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final TermsConditionAcceptance fromString(String p0){
       int i;
       TermsConditionAcceptance termsConditi1;
       co5.o(p0, "code");
       TermsConditionAcceptance[] termsConditi = TermsConditionAcceptance.values();
       if ((i = xe7.F(termsConditi.length)) < 16) {
          i = 16;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(i);
       i = termsConditi.length;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          object oobject = termsConditi[i1];
          linkedHashMa.put(oobject.getValue(), oobject);
       }
       if ((termsConditi1 = linkedHashMa.get(p0)) == null) {
          termsConditi1 = TermsConditionAcceptance.EXPLICIT;
       }
       return termsConditi1;
    }
}
