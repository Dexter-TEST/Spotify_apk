package p.la0;
import android.os.Parcelable;
import p.yd7;
import p.xd7;
import p.t33;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class la0 implements Parcelable, yd7, xd7	// class@001d12 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public static final Parcelable$Creator CREATOR;

    static {
       la0.CREATOR = new t33(14);
    }
    public void la0(String p0,String p1,String p2){
       co5.o(p0, "countryCode");
       co5.o(p1, "callingCode");
       co5.o(p2, "countryName");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof la0) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.c.hashCode() + tp2.g(this.b, (this.a.hashCode() * 31), 31));
    }
    public final String toString(){
       return hr7.a("CallingCode\(countryCode="+this.a+", callingCode="+this.b+", countryName=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
    }
}
