package p.r12;
import android.os.Parcelable;
import p.v74;
import java.lang.String;
import java.lang.Object;
import p.co5;
import android.os.Parcel;

public class r12 implements Parcelable	// class@002456 from classes.dex
{
    public final String a;
    public static final Parcelable$Creator CREATOR;

    static {
       r12.CREATOR = new v74(4);
    }
    public void r12(String p0){
       co5.o(p0, "name");
       super();
       this.a = p0;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       r12 or12 = null;
       if (p0 instanceof r12) {
       }else {
          p0 = or12;
       }
       if (p0 != null) {
          or12 = p0.a;
       }
       return co5.c(or12, this.a);
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
