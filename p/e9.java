package p.e9;
import p.h9;
import p.ie5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class e9 extends h9	// class@001446 from classes.dex
{
    public final String a;
    public final int b;
    public final String c;
    public static final Parcelable$Creator CREATOR;

    static {
       e9.CREATOR = new ie5(24);
    }
    public void e9(String p0,int p1,String p2){
       co5.o(p0, "step");
       co5.o(p2, "tagUri");
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
       if (!p0 instanceof e9) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31));
    }
    public final String toString(){
       return hr7.a("ScrollToTag\(step="+this.a+", adapterPos="+this.b+", tagUri=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeInt(this.b);
       p0.writeString(this.c);
    }
}
