package com.spotify.login.signupapi.services.model.AgeValidationResponse;
import com.spotify.login.signupapi.services.model.AgeValidationResponse$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.login.signupapi.services.model.AgeValidationResponse$Status;
import com.spotify.login.signupapi.services.model.AgeValidationResponse$Status$Unknown;
import com.spotify.login.signupapi.services.model.AgeValidationResponse$Status$TooYoung;
import com.spotify.login.signupapi.services.model.AgeValidationResponse$Status$BadAge;
import com.spotify.login.signupapi.services.model.AgeValidationResponse$Status$Ok;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class AgeValidationResponse	// class@000990 from classes.dex
{
    private final int statusCode;
    public static final AgeValidationResponse$Companion Companion;
    public static final int STATUS_CODE_BAD_AGE;
    public static final int STATUS_CODE_OK;
    public static final int STATUS_CODE_TOO_YOUNG;

    static {
       AgeValidationResponse.Companion = new AgeValidationResponse$Companion(null);
    }
    public void AgeValidationResponse(){
       super(0, 1, null);
    }
    public void AgeValidationResponse(int p0){
       super();
       this.statusCode = p0;
    }
    public void AgeValidationResponse(int p0,int p1,DefaultConstructorMarker p2){
       if ((p1 & 0x01)) {
          p0 = 0;
       }
       super(p0);
       return;
    }
    public static AgeValidationResponse copy$default(AgeValidationResponse p0,int p1,int p2,Object p3){
       AgeValidationResponse statusCode;
       if ((p2 & 0x01)) {
          statusCode = p0.statusCode;
       }
       return p0.copy(statusCode);
    }
    public final int component1(){
       return this.statusCode;
    }
    public final AgeValidationResponse copy(int p0){
       return new AgeValidationResponse(p0);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AgeValidationResponse) {
          return false;
       }
       if (this.statusCode != p0.statusCode) {
          return false;
       }
       return true;
    }
    public final AgeValidationResponse$Status getStatus(){
       AgeValidationResponse tstatusCode;
       AgeValidationResponse$Status$Unknown status$Unkno;
       if ((tstatusCode = this.statusCode) != 1) {
          if (tstatusCode != 100) {
             status$Unkno = (tstatusCode != 200)? new AgeValidationResponse$Status$Unknown(tstatusCode): AgeValidationResponse$Status$TooYoung.INSTANCE;
          }else {
             status$Unkno = AgeValidationResponse$Status$BadAge.INSTANCE;
          }
       }else {
          status$Unkno = AgeValidationResponse$Status$Ok.INSTANCE;
       }
       return status$Unkno;
    }
    public final int getStatusCode(){
       return this.statusCode;
    }
    public int hashCode(){
       return this.statusCode;
    }
    public String toString(){
       return tp2.n("AgeValidationResponse\(statusCode=", this.statusCode, ')');
    }
}
