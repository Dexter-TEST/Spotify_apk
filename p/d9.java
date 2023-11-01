package p.d9;
import p.h9;
import p.ie5;
import java.lang.String;
import java.util.List;
import com.spotify.allboarding.entrypoint.EntryPoint;
import java.lang.Object;
import p.co5;
import p.kg4;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Enum;

public final class d9 extends h9	// class@001307 from classes.dex
{
    public final String a;
    public final List b;
    public final boolean c;
    public final EntryPoint t;
    public static final Parcelable$Creator CREATOR;

    static {
       d9.CREATOR = new ie5(23);
    }
    public void d9(String p0,List p1,boolean p2,EntryPoint p3){
       co5.o(p0, "postUrl");
       co5.o(p1, "uriList");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof d9) {
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
       if (this.t != p0.t) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       d9 tc;
       int i = kg4.j(this.b, (this.a.hashCode() * 31), 31);
       if ((tc = this.c) != null) {
          tc = 1;
       }
       i = (i + tc) * 31;
       int i1 = ((tc = this.t) == null)? 0: tc.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "PostData\(postUrl="+this.a+", uriList="+this.b+", timer="+this.c+", entryPoint="+this.t+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       d9 tt;
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeStringList(this.b);
       p0.writeInt(this.c);
       if ((tt = this.t) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          p0.writeString(tt.name());
       }
       return;
    }
}
