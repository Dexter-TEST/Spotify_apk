package com.spotify.login.signupapi.services.model.AgeValidationResponse$Status$Unknown;
import com.spotify.login.signupapi.services.model.AgeValidationResponse$Status;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class AgeValidationResponse$Status$Unknown extends AgeValidationResponse$Status	// class@00098e from classes.dex
{
    private final int code;

    public void AgeValidationResponse$Status$Unknown(int p0){
       this.code = p0;
    }
    public static AgeValidationResponse$Status$Unknown copy$default(AgeValidationResponse$Status$Unknown p0,int p1,int p2,Object p3){
       AgeValidationResponse$Status$Unknown code;
       if ((p2 & 0x01)) {
          code = p0.code;
       }
       return p0.copy(code);
    }
    public final int component1(){
       return this.code;
    }
    public final AgeValidationResponse$Status$Unknown copy(int p0){
       return new AgeValidationResponse$Status$Unknown(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AgeValidationResponse$Status$Unknown) {
          return false;
       }
       if (this.code != p0.code) {
          return false;
       }
       return true;
    }
    public final int getCode(){
       return this.code;
    }
    public int hashCode(){
       return this.code;
    }
    public String toString(){
       return tp2.n("Unknown\(code=", this.code, ')');
    }
}
