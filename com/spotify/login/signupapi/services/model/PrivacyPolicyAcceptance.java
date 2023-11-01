package com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import java.lang.Enum;
import java.lang.String;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Class;
import java.lang.Object;

public final class PrivacyPolicyAcceptance extends Enum	// class@0009c0 from classes.dex
{
    private final String value;
    private static final PrivacyPolicyAcceptance[] $VALUES;
    public static final PrivacyPolicyAcceptance$Companion Companion;
    public static final PrivacyPolicyAcceptance EXPLICIT;
    public static final PrivacyPolicyAcceptance IMPLICIT;
    public static final PrivacyPolicyAcceptance NON;

    private static final PrivacyPolicyAcceptance[] $values(){
       PrivacyPolicyAcceptance[] privacyPolic = new PrivacyPolicyAcceptance[]{PrivacyPolicyAcceptance.IMPLICIT,PrivacyPolicyAcceptance.EXPLICIT,PrivacyPolicyAcceptance.NON};
       return privacyPolic;
    }
    static {
       PrivacyPolicyAcceptance.IMPLICIT = new PrivacyPolicyAcceptance("IMPLICIT", 0, "implicit");
       PrivacyPolicyAcceptance.EXPLICIT = new PrivacyPolicyAcceptance("EXPLICIT", 1, "explicit");
       PrivacyPolicyAcceptance.NON = new PrivacyPolicyAcceptance("NON", 2, "non");
       PrivacyPolicyAcceptance.$VALUES = PrivacyPolicyAcceptance.$values();
       PrivacyPolicyAcceptance.Companion = new PrivacyPolicyAcceptance$Companion(null);
    }
    private void PrivacyPolicyAcceptance(String p0,int p1,String p2){
       this.value = p2;
    }
    public static PrivacyPolicyAcceptance valueOf(String p0){
       return Enum.valueOf(PrivacyPolicyAcceptance.class, p0);
    }
    public static PrivacyPolicyAcceptance[] values(){
       return PrivacyPolicyAcceptance.$VALUES.clone();
    }
    public final String getValue(){
       return this.value;
    }
}
