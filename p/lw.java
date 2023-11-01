package p.lw;
import p.j;
import p.t33;
import p.ry7;
import android.os.Parcel;
import p.uo7;

public final class lw extends j	// class@001ddc from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       lw.CREATOR = new t33(12);
    }
    public void lw(ry7 p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7){
       super(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       this.a.O(new uo7(p0, 0), new uo7(p0, 1), new uo7(p0, 2), new uo7(p0, 3));
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.t);
       p0.writeInt(this.v);
       p0.writeInt(this.w);
       p0.writeInt(this.x);
       p0.writeInt(this.y);
    }
}
