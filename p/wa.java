package p.wa;
import android.os.Parcelable;
import p.ie5;
import p.h46;
import p.ls6;
import p.u4;
import java.lang.String;
import p.c5;
import p.n46;
import p.ll1;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.util.List;
import p.h9;
import java.lang.Object;
import p.co5;
import java.util.ArrayList;
import java.lang.Class;
import p.kg4;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Enum;
import java.util.Iterator;

public final class wa implements Parcelable	// class@002afe from classes.dex
{
    public final EntryPoint a;
    public final ls6 b;
    public final n46 c;
    public final List t;
    public final h9 v;
    public static final Parcelable$Creator CREATOR;
    public static final wa w;

    static {
       wa.CREATOR = new ie5(27);
       h46 oh46 = h46.a;
       ls6 v1 = new ls6("", u4.b, oh46, null, null);
       wa v8 = new wa(null, v1, oh46, ll1.a, null);
       wa.w = v8;
    }
    public void wa(EntryPoint p0,ls6 p1,n46 p2,List p3,h9 p4){
       co5.o(p1, "step");
       co5.o(p2, "screen");
       co5.o(p3, "selectedContent");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public static wa a(wa p0,EntryPoint p1,ls6 p2,n46 p3,ArrayList p4,h9 p5,int p6){
       wa a;
       wa b;
       wa c;
       wa t;
       wa v;
       wa "selectedContent";
       if ((p6 & 0x01)) {
          a = p0.a;
       }
       wa owa = a;
       if ((p6 & 0x02)) {
          b = p0.b;
       }
       wa owa1 = b;
       if ((p6 & 0x04)) {
          c = p0.c;
       }
       wa owa2 = c;
       if ((p6 & 0x08)) {
          t = p0.t;
       }
       wa owa3 = t;
       if ((p6 & 0x10)) {
          v = p0.v;
       }
       p0.getClass();
       co5.o(owa1, "step");
       co5.o(owa2, "screen");
       co5.o(owa3, "selectedContent");
       "selectedContent" = new wa(owa, owa1, owa2, owa3, v);
       return "selectedContent";
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof wa) {
          return false;
       }
       if (this.a != p0.a) {
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
       if (!co5.c(this.v, p0.v)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       wa ta;
       wa tv;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       i1 = kg4.j(this.t, ((this.c.hashCode() + ((this.b.hashCode() + (i1 * 31)) * 31)) * 31), 31);
       if ((tv = this.v) != null) {
          i = tv.hashCode();
       }
       return (i1 + i);
    }
    public final String toString(){
       return "AllBoardingState\(entryPoint="+this.a+", step="+this.b+", screen="+this.c+", selectedContent="+this.t+", retryEffect="+this.v+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       wa ta;
       co5.o(p0, "out");
       if ((ta = this.a) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          p0.writeString(ta.name());
       }
       p0.writeParcelable(this.b, p1);
       p0.writeParcelable(this.c, p1);
       ta = this.t;
       p0.writeInt(ta.size());
       Iterator iterator = ta.iterator();
       while (iterator.hasNext()) {
          p0.writeParcelable(iterator.next(), p1);
       }
       p0.writeParcelable(this.v, p1);
       return;
    }
}
