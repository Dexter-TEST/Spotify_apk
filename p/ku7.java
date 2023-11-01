package p.ku7;
import p.o2;
import p.dj2;
import android.os.Parcel;
import p.is7;

public final class ku7 extends o2	// class@001c89 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final long t;
    public final long v;
    public static final Parcelable$Creator CREATOR;

    static {
       ku7.CREATOR = new dj2(23);
    }
    public void ku7(int p0,int p1,int p2,long p3,long p4){
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
       is7.I(p0, 4, 8);
       p0.writeLong(this.t);
       is7.I(p0, 5, 8);
       p0.writeLong(this.v);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
