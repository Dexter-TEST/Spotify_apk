package com.spotify.login.termsandconditions.acceptance.AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel;
import p.o2;
import p.t33;
import p.x2;
import p.w2;
import p.v2;
import p.u2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Class;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;

public final class AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel extends o2	// class@0009cc from classes.dex
{
    public final boolean a;
    public static final Parcelable$Creator CREATOR;

    static {
       AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel.CREATOR = new t33(21);
    }
    public void AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel(x2 p0,w2 p1,v2 p2,u2 p3,boolean p4,int p5,DefaultConstructorMarker p6){
       if ((p5 & 0x10)) {
          p4 = false;
       }
       super(p4);
       throw null;
    }
    public void AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel(boolean p0){
       co5.o(null, "termsType");
       co5.o(null, "privacyPolicyType");
       co5.o(null, "marketingMessageType");
       co5.o(null, "contentSharingType");
       super();
       this.a = p0;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel) {
          return false;
       }
       p0.getClass();
       Object obj = null;
       if (!co5.c(obj, obj)) {
          return false;
       }
       if (!co5.c(obj, obj)) {
          return false;
       }
       if (!co5.c(obj, obj)) {
          return false;
       }
       if (!co5.c(obj, obj)) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       throw 0;
    }
    public final String toString(){
       return kg4.p("TermsAndPrivacySeparatedAcceptanceModel\(termsType=null, privacyPolicyType=null, marketingMessageType=null, contentSharingType=null, showOptionalBadge=", this.a, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeValue(null);
       p0.writeValue(null);
       p0.writeValue(null);
       p0.writeValue(null);
       p0.writeInt(this.a);
    }
}
