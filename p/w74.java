package p.w74;
import android.os.Parcelable;
import p.v74;
import java.lang.String;
import com.spotify.messaging.criticalmessaging.criticalmessagingview.models.ViewType;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;
import java.lang.Enum;

public final class w74 implements Parcelable	// class@002adf from classes.dex
{
    public final boolean A;
    public final long a;
    public final String b;
    public final long c;
    public final String t;
    public final String v;
    public final String w;
    public final ViewType x;
    public final boolean y;
    public final String z;
    public static final Parcelable$Creator CREATOR;

    static {
       w74.CREATOR = new v74(0);
    }
    public void w74(long p0,String p1,long p2,String p3,String p4,String p5,ViewType p6,boolean p7,String p8,boolean p9){
       co5.o(p1, "uuid");
       co5.o(p3, "impressionUrl");
       co5.o(p4, "displayReason");
       co5.o(p5, "pageUri");
       co5.o(p6, "type");
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
       this.A = p9;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof w74) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       if (!co5.c(this.t, p0.t)) {
          return false;
       }
       if (!co5.c(this.v, p0.v)) {
          return false;
       }
       if (!co5.c(this.w, p0.w)) {
          return false;
       }
       if (this.x != p0.x) {
          return false;
       }
       if (this.y != p0.y) {
          return false;
       }
       if (!co5.c(this.z, p0.z)) {
          return false;
       }
       if (this.A != p0.A) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       w74 ty;
       w74 ta = this.a;
       w74 tc = this.c;
       int i = (this.x.hashCode() + tp2.g(this.w, tp2.g(this.v, tp2.g(this.t, ((tp2.g(this.b, ((int)(ta ^ (ta >> 32)) * 31), 31) + (int)((tc >> 32) ^ tc)) * 31), 31), 31), 31)) * 31;
       int i1 = 1;
       if ((ty = this.y) != null) {
          ty = 1;
       }
       i = (i + ty) * 31;
       int i2 = ((ty = this.z) == null)? 0: ty.hashCode();
       i = (i + i2) * 31;
       if ((ty = this.A) == null) {
          i1 = ty;
       }
       return (i + i1);
    }
    public final String toString(){
       return kg4.p("MessageMetadata\(id="+this.a+", uuid="+this.b+", endTimestamp="+this.c+", impressionUrl="+this.t+", displayReason="+this.v+", pageUri="+this.w+", type="+this.x+", transactional="+this.y+", requestId="+this.z+", control=", this.A, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeLong(this.a);
       p0.writeString(this.b);
       p0.writeLong(this.c);
       p0.writeString(this.t);
       p0.writeString(this.v);
       p0.writeString(this.w);
       p0.writeString(this.x.name());
       p0.writeInt(this.y);
       p0.writeString(this.z);
       p0.writeInt(this.A);
    }
}
