package p.k5;
import android.os.Parcelable;
import p.tv7;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class k5 implements Parcelable	// class@001baf from classes.dex
{
    public final String a;
    public static final Parcelable$Creator CREATOR;

    static {
       k5.CREATOR = new tv7(19);
    }
    public void k5(String p0){
       co5.o(p0, "label");
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
       if (!p0 instanceof k5) {
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
       return hr7.a("ActionButton\(label=", this.a, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
    }
}
