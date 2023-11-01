package com.spotify.login.signupapi.services.model.TermsConditionAcceptance;
import java.lang.Enum;
import java.lang.String;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Class;
import java.lang.Object;

public final class TermsConditionAcceptance extends Enum	// class@0009c6 from classes.dex
{
    private final String value;
    private static final TermsConditionAcceptance[] $VALUES;
    public static final TermsConditionAcceptance$Companion Companion;
    public static final TermsConditionAcceptance EXPLICIT;
    public static final TermsConditionAcceptance IMPLICIT;

    private static final TermsConditionAcceptance[] $values(){
       TermsConditionAcceptance[] termsConditi = new TermsConditionAcceptance[]{TermsConditionAcceptance.IMPLICIT,TermsConditionAcceptance.EXPLICIT};
       return termsConditi;
    }
    static {
       TermsConditionAcceptance.IMPLICIT = new TermsConditionAcceptance("IMPLICIT", 0, "implicit");
       TermsConditionAcceptance.EXPLICIT = new TermsConditionAcceptance("EXPLICIT", 1, "explicit");
       TermsConditionAcceptance.$VALUES = TermsConditionAcceptance.$values();
       TermsConditionAcceptance.Companion = new TermsConditionAcceptance$Companion(null);
    }
    private void TermsConditionAcceptance(String p0,int p1,String p2){
       this.value = p2;
    }
    public static TermsConditionAcceptance valueOf(String p0){
       return Enum.valueOf(TermsConditionAcceptance.class, p0);
    }
    public static TermsConditionAcceptance[] values(){
       return TermsConditionAcceptance.$VALUES.clone();
    }
    public final String getValue(){
       return this.value;
    }
}
