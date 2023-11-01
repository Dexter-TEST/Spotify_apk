package p.s51;
import p.n90;
import p.tv7;
import java.lang.Object;
import java.lang.Long;
import java.util.Arrays;
import android.os.Parcel;

public final class s51 implements n90	// class@0025be from classes.dex
{
    public final long a;
    public static final Parcelable$Creator CREATOR;

    static {
       s51.CREATOR = new tv7(10);
    }
    public void s51(long p0){
       super();
       this.a = p0;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof s51) {
          return false;
       }
       if (this.a - p0.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Long.valueOf(this.a)};
       return Arrays.hashCode(objArray);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeLong(this.a);
    }
}
