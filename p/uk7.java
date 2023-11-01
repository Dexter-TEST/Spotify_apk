package p.uk7;
import android.os.Parcelable;
import p.v74;
import p.e63;
import p.ay6;
import p.wf2;
import java.lang.String;
import java.lang.Object;
import p.co5;
import android.os.Parcel;

public final class uk7 implements Parcelable	// class@0028cc from classes.dex
{
    public final String a;
    public static final Parcelable$Creator CREATOR;

    static {
       uk7.CREATOR = new v74(5);
       ay6 uoay6 = new ay6(e63.B);
    }
    public void uk7(String p0){
       co5.o(p0, "viewUri");
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
       if (!p0 instanceof uk7) {
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
       return this.a;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
    }
}
