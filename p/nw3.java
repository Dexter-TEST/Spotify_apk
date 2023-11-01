package p.nw3;
import android.os.Parcelable;
import p.t33;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;
import android.os.Parcel;
import p.co5;

public final class nw3 implements Parcelable	// class@002060 from classes.dex
{
    public final int a;
    public final int b;
    public static final Parcelable$Creator CREATOR;

    static {
       nw3.CREATOR = new t33(26);
    }
    public void nw3(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof nw3) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((this.a * 31) + this.b);
    }
    public final String toString(){
       return tp2.n("Syllable\(startTimeInMs="+this.a+", characterCount=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(this.a);
       p0.writeInt(this.b);
    }
}
