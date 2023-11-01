package p.op0;
import p.o2;
import p.dj2;
import p.bz5;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class op0 extends o2	// class@002162 from classes.dex
{
    public final bz5 a;
    public final boolean b;
    public final boolean c;
    public final int[] t;
    public final int v;
    public static final Parcelable$Creator CREATOR;

    static {
       op0.CREATOR = new dj2(27);
    }
    public void op0(bz5 p0,boolean p1,boolean p2,int[] p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void writeToParcel(Parcel p0,int p1){
       op0 tt;
       int i = is7.F(p0, 0x4f45);
       is7.B(p0, 1, this.a, p1);
       is7.I(p0, 2, 4);
       p0.writeInt(this.b);
       is7.I(p0, 3, 4);
       p0.writeInt(this.c);
       if ((tt = this.t) == null) {
       }else {
          p0.writeIntArray(tt);
          is7.J(p0, is7.F(p0, 4));
       }
       is7.I(p0, 5, 4);
       p0.writeInt(this.v);
       is7.J(p0, i);
       return;
    }
}
