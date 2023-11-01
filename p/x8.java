package p.x8;
import p.h9;
import p.ie5;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Enum;

public final class x8 extends h9	// class@002c2f from classes.dex
{
    public final EntryPoint a;
    public static final Parcelable$Creator CREATOR;

    static {
       x8.CREATOR = new ie5(17);
    }
    public void x8(EntryPoint p0){
       co5.o(p0, "entryPoint");
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
       if (!p0 instanceof x8) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "LoadInitialData\(entryPoint="+this.a+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a.name());
    }
}
