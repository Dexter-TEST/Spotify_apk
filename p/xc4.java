package p.xc4;
import p.ox1;
import p.wz6;
import p.nr0;
import p.tv7;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import p.co5;
import p.tp2;
import p.kg4;
import java.lang.StringBuilder;
import p.hr7;
import p.et0;
import android.os.Parcel;
import java.util.Iterator;
import p.iq6;

public final class xc4 extends nr0 implements ox1, wz6	// class@002c4d from classes.dex
{
    public final String a;
    public final String b;
    public final List c;
    public final List t;
    public final int v;
    public final String w;
    public final String x;
    public static final Parcelable$Creator CREATOR;

    static {
       xc4.CREATOR = new tv7(25);
    }
    public void xc4(String p0,String p1,ArrayList p2,List p3,int p4,String p5,String p6){
       co5.o(p0, "uri");
       co5.o(p1, "text");
       co5.o(p3, "tags");
       co5.o(p5, "moreUrl");
       co5.o(p6, "color");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
    }
    public final String G(){
       return this.w;
    }
    public final List H(){
       return this.t;
    }
    public final String a(){
       return this.a;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof xc4) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.t, p0.t)) {
          return false;
       }
       if (this.v != p0.v) {
          return false;
       }
       if (!co5.c(this.w, p0.w)) {
          return false;
       }
       if (!co5.c(this.x, p0.x)) {
          return false;
       }
       return true;
    }
    public final List f(){
       return this.c;
    }
    public final int h(){
       return this.v;
    }
    public final int hashCode(){
       return (this.x.hashCode() + tp2.g(this.w, ((kg4.j(this.t, kg4.j(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31), 31) + this.v) * 31), 31));
    }
    public final String toString(){
       return hr7.a("MoreSquares\(uri="+this.a+", text="+this.b+", related="+this.c+", tags="+this.t+", expansionLimit="+this.v+", moreUrl="+this.w+", color=", this.x, ')');
    }
    public final boolean v(){
       return et0.b(this);
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       xc4 tc = this.c;
       p0.writeInt(tc.size());
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, p1);
       }
       p0.writeStringList(this.t);
       p0.writeInt(this.v);
       p0.writeString(this.w);
       p0.writeString(this.x);
       return;
    }
}
