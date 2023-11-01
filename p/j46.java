package p.j46;
import android.os.Parcelable;
import p.ie5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;

public final class j46 implements Parcelable	// class@001a66 from classes.dex
{
    public final String a;
    public final String b;
    public final boolean c;
    public static final Parcelable$Creator CREATOR;

    static {
       j46.CREATOR = new ie5(7);
    }
    public void j46(String p0,String p1,boolean p2){
       co5.o(p0, "title");
       co5.o(p1, "uri");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof j46) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       j46 tc;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       if ((tc = this.c) != null) {
          tc = 1;
       }
       return (i + tc);
    }
    public final String toString(){
       return kg4.p("Item\(title="+this.a+", uri="+this.b+", selected=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeInt(this.c);
    }
}
