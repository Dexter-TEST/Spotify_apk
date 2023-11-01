package p.ls6;
import android.os.Parcelable;
import p.ie5;
import java.lang.String;
import p.c5;
import p.n46;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class ls6 implements Parcelable	// class@001db6 from classes.dex
{
    public final String a;
    public final c5 b;
    public final n46 c;
    public final ls6 t;
    public final ls6 v;
    public static final Parcelable$Creator CREATOR;

    static {
       ls6.CREATOR = new ie5(12);
    }
    public void ls6(String p0,c5 p1,n46 p2,ls6 p3,ls6 p4){
       co5.o(p0, "id");
       co5.o(p1, "action");
       co5.o(p2, "screen");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ls6) {
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
       if (!co5.c(this.v, p0.v)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       ls6 tt;
       int i = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
       int i1 = 0;
       int i2 = ((tt = this.t) == null)? 0: tt.hashCode();
       i = (i + i2) * 31;
       if ((tt = this.v) != null) {
          i1 = tt.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       return "Step\(id="+this.a+", action="+this.b+", screen="+this.c+", next="+this.t+", secondary="+this.v+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       ls6 tt;
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeParcelable(this.b, p1);
       p0.writeParcelable(this.c, p1);
       if ((tt = this.t) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          tt.writeToParcel(p0, p1);
       }
       if ((tt = this.v) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          tt.writeToParcel(p0, p1);
       }
       return;
    }
}
