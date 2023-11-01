package p.pw3;
import android.os.Parcelable;
import p.t33;
import p.kw3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class pw3 implements Parcelable	// class@0022e3 from classes.dex
{
    public final boolean a;
    public final kw3 b;
    public static final Parcelable$Creator CREATOR;

    static {
       pw3.CREATOR = new t33(28);
    }
    public void pw3(boolean p0,kw3 p1){
       co5.o(p1, "vrColors");
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
       if (!p0 instanceof pw3) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       pw3 ta;
       if ((ta = this.a) != null) {
          ta = 1;
       }
       return (this.b.hashCode() + (ta * 31));
    }
    public final String toString(){
       return "VocalRemovalStatus\(hasVocalRemoval="+this.a+", vrColors="+this.b+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(this.a);
       this.b.writeToParcel(p0, p1);
    }
}
