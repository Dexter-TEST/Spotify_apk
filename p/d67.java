package p.d67;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public final class d67 extends b0	// class@0012ec from classes.dex
{
    public int c;
    public boolean t;
    public static final Parcelable$Creator CREATOR;

    static {
       d67.CREATOR = new q86(1);
    }
    public void d67(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.c = p0.readInt();
       boolean b = (p0.readInt())? true: false;
       this.t = b;
       return;
    }
    public void d67(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeInt(this.c);
       p0.writeInt(this.t);
    }
}
