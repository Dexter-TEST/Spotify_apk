package p.a9;
import p.h9;
import p.ie5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class a9 extends h9	// class@000f3f from classes.dex
{
    public final String a;
    public static final Parcelable$Creator CREATOR;

    static {
       a9.CREATOR = new ie5(20);
    }
    public void a9(String p0){
       co5.o(p0, "step");
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
       if (!p0 instanceof a9) {
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
       return hr7.a("LoggingBackButtonInteraction\(step=", this.a, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
    }
}
