package p.dk2;
import android.view.View$BaseSavedState;
import p.dy1;
import p.o75;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;
import p.cv0;
import android.view.AbsSavedState;

public final class dk2 extends View$BaseSavedState	// class@001361 from classes.dex
{
    public cv0 a;
    public static final Parcelable$Creator CREATOR;

    static {
       dk2.CREATOR = new o75(new dy1(26));
    }
    public void dk2(Parcel p0,ClassLoader p1){
       super(p0);
       this.a = p0.readParcelable(p1);
    }
    public void dk2(AbsSavedState p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeParcelable(this.a, p1);
    }
}
