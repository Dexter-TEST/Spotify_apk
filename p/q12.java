package p.q12;
import p.o2;
import p.tv7;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.util.Arrays;
import p.fh5;
import p.ye7;
import android.os.Parcel;
import p.is7;

public final class q12 extends o2	// class@00230f from classes.dex
{
    public final String a;
    public final int b;
    public final long c;
    public static final Parcelable$Creator CREATOR;

    static {
       q12.CREATOR = new tv7(1);
    }
    public void q12(){
       super();
       this.a = "CLIENT_TELEMETRY";
       this.c = 1;
       this.b = -1;
    }
    public void q12(int p0,long p1,String p2){
       super();
       this.a = p2;
       this.b = p0;
       this.c = p1;
    }
    public final long b(){
       q12 tc = this.c;
       if (!(tc - -1)) {
          return (long)this.b;
       }
       return tc;
    }
    public final boolean equals(Object p0){
       q12 ta;
       if (p0 instanceof q12 && ((ta = this.a) != null && (ta.equals(p0.a) || (ta == null && (p0.a == null && !(this.b() - p0.b())))))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,Long.valueOf(this.b())};
       return Arrays.hashCode(objArray);
    }
    public final String toString(){
       fh5 uofh5 = ye7.X(this);
       uofh5.b(this.a, "name");
       uofh5.b(Long.valueOf(this.b()), "version");
       return uofh5.toString();
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.C(p0, 1, this.a);
       is7.I(p0, 2, 4);
       p0.writeInt(this.b);
       is7.I(p0, 3, 8);
       p0.writeLong(this.b());
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
