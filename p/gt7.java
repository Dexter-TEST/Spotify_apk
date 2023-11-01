package p.gt7;
import p.o2;
import p.dj2;
import java.util.List;
import android.os.Parcel;
import p.is7;

public final class gt7 extends o2	// class@001779 from classes.dex
{
    public final int a;
    public List b;
    public static final Parcelable$Creator CREATOR;

    static {
       gt7.CREATOR = new dj2(22);
    }
    public void gt7(int p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void writeToParcel(Parcel p0,int p1){
       is7.I(p0, 1, 4);
       p0.writeInt(this.a);
       is7.E(p0, 2, this.b);
       is7.J(p0, is7.F(p0, 0x4f45));
    }
}
