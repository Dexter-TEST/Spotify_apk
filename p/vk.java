package p.vk;
import p.ox1;
import p.wz6;
import p.ba6;
import p.hb2;
import p.b63;
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
import p.et0;
import android.os.Parcel;
import java.util.Iterator;

public final class vk extends nr0 implements ox1, wz6, ba6, hb2, b63	// class@002a15 from classes.dex
{
    public final String a;
    public final String b;
    public final List c;
    public final List t;
    public final int v;
    public final String w;
    public final boolean x;
    public final String y;
    public final boolean z;
    public static final Parcelable$Creator CREATOR;

    static {
       vk.CREATOR = new tv7(20);
    }
    public void vk(String p0,String p1,ArrayList p2,List p3,int p4,String p5,boolean p6,String p7,boolean p8){
       co5.o(p0, "uri");
       co5.o(p1, "text");
       co5.o(p3, "tags");
       co5.o(p5, "moreUrl");
       co5.o(p7, "imageUrl");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
    }
    public final String F(){
       return this.y;
    }
    public final String G(){
       return this.w;
    }
    public final List H(){
       return this.t;
    }
    public final boolean J(){
       return this.x;
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
       if (!p0 instanceof vk) {
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
       if (this.x != p0.x) {
          return false;
       }
       if (!co5.c(this.y, p0.y)) {
          return false;
       }
       if (this.z != p0.z) {
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
       vk tx;
       int i = tp2.g(this.w, ((kg4.j(this.t, kg4.j(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31), 31) + this.v) * 31), 31);
       int i1 = 1;
       if ((tx = this.x) != null) {
          tx = 1;
       }
       i = tp2.g(this.y, ((i + tx) * 31), 31);
       if ((tx = this.z) == null) {
          i1 = tx;
       }
       return (i + i1);
    }
    public final boolean p(){
       return this.z;
    }
    public final String toString(){
       return kg4.p("Artist\(uri="+this.a+", text="+this.b+", related="+this.c+", tags="+this.t+", expansionLimit="+this.v+", moreUrl="+this.w+", selected="+this.x+", imageUrl="+this.y+", shouldFollow=", this.z, ')');
    }
    public final boolean v(){
       return et0.b(this);
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       vk tc = this.c;
       p0.writeInt(tc.size());
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, p1);
       }
       p0.writeStringList(this.t);
       p0.writeInt(this.v);
       p0.writeString(this.w);
       p0.writeInt(this.x);
       p0.writeString(this.y);
       p0.writeInt(this.z);
       return;
    }
}