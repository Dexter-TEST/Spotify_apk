package p.b9;
import p.h9;
import p.ie5;
import java.lang.String;
import p.de5;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.tp2;
import android.os.Parcel;
import android.os.Parcelable;

public final class b9 extends h9	// class@001081 from classes.dex
{
    public final String a;
    public final de5 b;
    public final int c;
    public static final Parcelable$Creator CREATOR;

    static {
       b9.CREATOR = new ie5(21);
    }
    public void b9(String p0,de5 p1,int p2){
       co5.o(p0, "step");
       co5.o(p1, "clickedItem");
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
       if (!p0 instanceof b9) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c);
    }
    public final String toString(){
       return tp2.n("LoggingItemClicked\(step="+this.a+", clickedItem="+this.b+", positionWithinSection=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeParcelable(this.b, p1);
       p0.writeInt(this.c);
    }
}
