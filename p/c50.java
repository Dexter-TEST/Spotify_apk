package p.c50;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.os.Parcelable;

public final class c50 extends b0	// class@001199 from classes.dex
{
    public final int c;
    public final int t;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public static final Parcelable$Creator CREATOR;

    static {
       c50.CREATOR = new q86(8);
    }
    public void c50(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.c = p0.readInt();
       this.t = p0.readInt();
       boolean b = false;
       boolean b1 = (p0.readInt() == 1)? true: false;
       this.v = b1;
       b1 = (p0.readInt() == 1)? true: false;
       this.w = b1;
       if (p0.readInt() == 1) {
          b = true;
       }
       this.x = b;
       return;
    }
    public void c50(AbsSavedState p0,BottomSheetBehavior p1){
       super(p0);
       this.c = p1.G;
       this.t = p1.d;
       this.v = p1.b;
       this.w = p1.D;
       this.x = p1.E;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeInt(this.c);
       p0.writeInt(this.t);
       p0.writeInt(this.v);
       p0.writeInt(this.w);
       p0.writeInt(this.x);
    }
}
