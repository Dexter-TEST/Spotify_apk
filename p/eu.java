package p.eu;
import p.g;
import p.t33;
import java.lang.String;
import p.v35;
import p.na5;
import p.ra5;
import android.os.Parcel;
import android.os.Parcelable;
import p.mu;

public final class eu extends g	// class@001501 from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       eu.CREATOR = new t33(16);
    }
    public void eu(String p0,v35 p1,na5 p2,ra5 p3,String p4,String p5,boolean p6,long p7,long p8){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       g ta;
       g tc;
       if ((ta = this.a) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeString(ta);
       }
       p0.writeParcelable(this.b, p1);
       if ((tc = this.c) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          tc.a.writeToParcel(p0, 0);
          p0.writeString(tc.b);
          p0.writeInt(tc.c);
          p0.writeInt(tc.d);
       }
       if ((tc = this.t) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeString(tc.a);
       }
       if ((tc = this.v) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeString(tc);
       }
       if ((tc = this.w) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeString(tc);
       }
       p0.writeInt(this.x);
       p0.writeLong(this.y);
       p0.writeLong(this.z);
       return;
    }
}
