package p.z8;
import p.h9;
import p.ie5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;

public final class z8 extends h9	// class@002ead from classes.dex
{
    public final String a;
    public final boolean b;
    public static final Parcelable$Creator CREATOR;

    static {
       z8.CREATOR = new ie5(19);
    }
    public void z8(String p0,boolean p1){
       co5.o(p0, "step");
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
       if (!p0 instanceof z8) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       z8 tb;
       int i = this.a.hashCode() * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public final String toString(){
       return kg4.p("LoggingActionButtonClicked\(step="+this.a+", isPrimary=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeInt(this.b);
    }
}
