package p.to2;
import android.view.View$BaseSavedState;
import p.dy1;
import p.o75;
import android.os.Parcel;
import android.view.AbsSavedState;
import android.os.Parcelable;

public final class to2 extends View$BaseSavedState	// class@0027ac from classes.dex
{
    public float a;
    public boolean b;
    public static final Parcelable$Creator CREATOR;

    static {
       to2.CREATOR = new o75(new dy1(27));
    }
    public void to2(Parcel p0){
       super(p0);
       this.a = p0.readFloat();
       boolean b = (p0.readInt())? true: false;
       this.b = b;
       return;
    }
    public void to2(AbsSavedState p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeFloat(this.a);
       p0.writeInt(this.b);
    }
}
