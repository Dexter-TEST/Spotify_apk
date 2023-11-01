package p.bz5;
import p.o2;
import p.dj2;
import android.os.Parcel;
import p.is7;

public final class bz5 extends o2	// class@001166 from classes.dex
{
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int t;
    public final int v;
    public static final Parcelable$Creator CREATOR;

    static {
       bz5.CREATOR = new dj2(29);
    }
    public void bz5(int p0,boolean p1,boolean p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.I(p0, 2, 4);
       p0.writeInt(this.b);
       is7.I(p0, 3, 4);
       p0.writeInt(this.c);
       is7.I(p0, 4, 4);
       p0.writeInt(this.t);
       is7.I(p0, 5, 4);
       p0.writeInt(this.v);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
