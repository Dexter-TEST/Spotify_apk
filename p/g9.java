package p.g9;
import p.h9;
import p.ie5;
import p.sl6;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Enum;

public final class g9 extends h9	// class@0016c9 from classes.dex
{
    public final String a;
    public final sl6 b;
    public static final Parcelable$Creator CREATOR;

    static {
       g9.CREATOR = new ie5(26);
    }
    public void g9(sl6 p0,String p1){
       co5.o(p1, "step");
       co5.o(p0, "skipType");
       super();
       this.a = p1;
       this.b = p0;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof g9) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return "ShowSkipDialog\(step="+this.a+", skipType="+this.b+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b.name());
    }
}
