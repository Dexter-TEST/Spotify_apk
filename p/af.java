package p.af;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.view.AbsSavedState;
import android.os.Parcelable;

public final class af extends b0	// class@000f74 from classes.dex
{
    public boolean c;
    public int t;
    public float v;
    public boolean w;
    public static final Parcelable$Creator CREATOR;

    static {
       af.CREATOR = new q86(7);
    }
    public void af(Parcel p0,ClassLoader p1){
       super(p0, p1);
       boolean b = true;
       boolean b1 = (p0.readByte())? true: false;
       this.c = b1;
       this.t = p0.readInt();
       this.v = p0.readFloat();
       if (!p0.readByte()) {
          b = false;
       }
       this.w = b;
       return;
    }
    public void af(AbsSavedState p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeByte((byte)this.c);
       p0.writeInt(this.t);
       p0.writeFloat(this.v);
       p0.writeByte((byte)this.w);
    }
}
