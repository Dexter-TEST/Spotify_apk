package com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import p.co5;
import p.xe7;
import java.util.LinkedHashMap;
import java.util.Map;

public final class PrivacyPolicyAcceptance$Companion	// class@0009bf from classes.dex
{

    private void PrivacyPolicyAcceptance$Companion(){
       super();
    }
    public void PrivacyPolicyAcceptance$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final PrivacyPolicyAcceptance fromString(String p0){
       int i;
       PrivacyPolicyAcceptance privacyPolic1;
       co5.o(p0, "code");
       PrivacyPolicyAcceptance[] privacyPolic = PrivacyPolicyAcceptance.values();
       if ((i = xe7.F(privacyPolic.length)) < 16) {
          i = 16;
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap(i);
       i = privacyPolic.length;
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          object oobject = privacyPolic[i1];
          linkedHashMa.put(oobject.getValue(), oobject);
       }
       if ((privacyPolic1 = linkedHashMa.get(p0)) == null) {
          privacyPolic1 = PrivacyPolicyAcceptance.EXPLICIT;
       }
       return privacyPolic1;
    }
}
