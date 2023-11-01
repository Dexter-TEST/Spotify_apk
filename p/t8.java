package p.t8;
import p.h9;
import p.ie5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class t8 extends h9	// class@002722 from classes.dex
{
    public final String a;
    public static final Parcelable$Creator CREATOR;

    static {
       t8.CREATOR = new ie5(13);
    }
    public void t8(String p0){
       co5.o(p0, "uri");
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
       if (!p0 instanceof t8) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return hr7.a("CloseAllBoarding\(uri=", this.a, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
    }
}
