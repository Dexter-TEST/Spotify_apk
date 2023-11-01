package p.v8;
import p.h9;
import p.ie5;
import p.nr0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;
import android.os.Parcelable;

public final class v8 extends h9	// class@0029a5 from classes.dex
{
    public final nr0 a;
    public final boolean b;
    public static final Parcelable$Creator CREATOR;

    static {
       v8.CREATOR = new ie5(15);
    }
    public void v8(nr0 p0,boolean p1){
       co5.o(p0, "content");
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
       if (!p0 instanceof v8) {
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
       v8 tb;
       int i = this.a.hashCode() * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       return (i + tb);
    }
    public final String toString(){
       return kg4.p("FollowItem\(content="+this.a+", isSelected=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeParcelable(this.a, p1);
       p0.writeInt(this.b);
    }
}
