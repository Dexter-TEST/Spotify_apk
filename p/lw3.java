package p.lw3;
import android.os.Parcelable;
import p.t33;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import java.util.List;
import p.kg4;
import android.os.Parcel;
import java.util.Iterator;
import p.nw3;

public final class lw3 implements Parcelable	// class@001dd7 from classes.dex
{
    public final long a;
    public final String b;
    public final List c;
    public static final Parcelable$Creator CREATOR;

    static {
       lw3.CREATOR = new t33(24);
    }
    public void lw3(String p0,long p1,ArrayList p2){
       co5.o(p0, "words");
       super();
       this.a = p1;
       this.b = p0;
       this.c = p2;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof lw3) {
          return false;
       }
       if (this.a - p0.a) {
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
       lw3 ta = this.a;
       return (this.c.hashCode() + tp2.g(this.b, ((int)(ta ^ (ta >> 32)) * 31), 31));
    }
    public final String toString(){
       return kg4.o("Line\(startTimeInMs="+this.a+", words="+this.b+", syllables=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeLong(this.a);
       p0.writeString(this.b);
       lw3 tc = this.c;
       p0.writeInt(tc.size());
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, p1);
       }
       return;
    }
}
