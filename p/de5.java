package p.de5;
import p.he5;
import p.tv7;
import java.lang.String;
import p.nr0;
import java.util.List;
import p.ll1;
import java.lang.Object;
import p.co5;
import java.util.ArrayList;
import java.lang.Class;
import p.kg4;
import java.lang.StringBuilder;
import android.os.Parcel;
import android.os.Parcelable;

public final class de5 extends he5	// class@00132f from classes.dex
{
    public final String a;
    public final int b;
    public final nr0 c;
    public final boolean t;
    public final boolean v;
    public final List w;
    public final boolean x;
    public static final Parcelable$Creator CREATOR;

    static {
       de5.CREATOR = new tv7(26);
    }
    public void de5(String p0,int p1,nr0 p2,boolean p3,List p4,int p5){
       ll1 a;
       if ((p5 & 0x20)) {
          a = ll1.a;
       }
       super(p0, p1, p2, p3, false, a, false);
       return;
    }
    public void de5(String p0,int p1,nr0 p2,boolean p3,boolean p4,List p5,boolean p6){
       co5.o(p0, "sectionId");
       co5.o(p2, "content");
       co5.o(p5, "tagUris");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
    }
    public static de5 a(de5 p0,boolean p1,boolean p2,ArrayList p3,boolean p4,int p5){
       de5 t;
       de5 v;
       de5 w;
       de5 x;
       de5 "tagUris";
       int i = 0;
       de5 uode5 = ((p5 & 0x01))? p0.a: i;
       de5 uode51 = ((p5 & 0x02))? p0.b: 0;
       if ((p5 & 0x04)) {
          i = p0.c;
       }
       de5 uode52 = i;
       if ((p5 & 0x08)) {
          t = p0.t;
       }
       de5 uode53 = t;
       if ((p5 & 0x10)) {
          v = p0.v;
       }
       de5 uode54 = v;
       if ((p5 & 0x20)) {
          w = p0.w;
       }
       de5 uode55 = w;
       if ((p5 & 0x40)) {
          x = p0.x;
       }
       p0.getClass();
       co5.o(uode5, "sectionId");
       co5.o(uode52, "content");
       co5.o(uode55, "tagUris");
       "tagUris" = new de5(uode5, uode51, uode52, uode53, uode54, uode55, x);
       return "tagUris";
    }
    public final String b(){
       return this.c.a();
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof de5) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (this.t != p0.t) {
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
       return true;
    }
    public final int hashCode(){
       de5 tt;
       int i2;
       int i = (this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31)) * 31;
       int i1 = 1;
       if ((tt = this.t) != null) {
          tt = 1;
       }
       i = (i + tt) * 31;
       if ((tt = this.v) != null) {
          i2 = 1;
       }
       i = kg4.j(this.w, ((i + i2) * 31), 31);
       if ((tt = this.x) == null) {
          i1 = tt;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("Picker\(sectionId="+this.a+", sectionIdx="+this.b+", content="+this.c+", isSelected="+this.t+", hasExpanded="+this.v+", tagUris="+this.w+", isLoadingMore=", this.x, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeInt(this.b);
       p0.writeParcelable(this.c, p1);
       p0.writeInt(this.t);
       p0.writeInt(this.v);
       p0.writeStringList(this.w);
       p0.writeInt(this.x);
    }
}
