package com.spotify.connectivity.sessionapi.SendEndSongsResult$SendEndSongsFailure;
import com.spotify.connectivity.sessionapi.SendEndSongsResult;
import java.lang.String;
import java.lang.Object;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.hr7;

public final class SendEndSongsResult$SendEndSongsFailure extends SendEndSongsResult	// class@00080e from classes.dex
{
    private final int errorCode;
    private final String errorDescription;

    public void SendEndSongsResult$SendEndSongsFailure(int p0,String p1){
       co5.o(p1, "errorDescription");
       super(null);
       this.errorCode = p0;
       this.errorDescription = p1;
    }
    public static SendEndSongsResult$SendEndSongsFailure copy$default(SendEndSongsResult$SendEndSongsFailure p0,int p1,String p2,int p3,Object p4){
       SendEndSongsResult$SendEndSongsFailure errorCode;
       SendEndSongsResult$SendEndSongsFailure errorDescrip;
       if ((p3 & 0x01)) {
          errorCode = p0.errorCode;
       }
       if ((p3 & 0x02)) {
          errorDescrip = p0.errorDescription;
       }
       return p0.copy(errorCode, errorDescrip);
    }
    public final int component1(){
       return this.errorCode;
    }
    public final String component2(){
       return this.errorDescription;
    }
    public final SendEndSongsResult$SendEndSongsFailure copy(int p0,String p1){
       co5.o(p1, "errorDescription");
       return new SendEndSongsResult$SendEndSongsFailure(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof SendEndSongsResult$SendEndSongsFailure) {
          return false;
       }
       if (this.errorCode != p0.errorCode) {
          return false;
       }
       if (!co5.c(this.errorDescription, p0.errorDescription)) {
          return false;
       }
       return true;
    }
    public final int getErrorCode(){
       return this.errorCode;
    }
    public final String getErrorDescription(){
       return this.errorDescription;
    }
    public int hashCode(){
       return (this.errorDescription.hashCode() + (this.errorCode * 31));
    }
    public String toString(){
       return hr7.a("SendEndSongsFailure\(errorCode="+this.errorCode+", errorDescription=", this.errorDescription, ')');
    }
}
