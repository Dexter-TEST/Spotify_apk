package p.yj7;
import android.view.View$BaseSavedState;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public final class yj7 extends View$BaseSavedState	// class@002dd0 from classes.dex
{
    public int a;
    public int b;
    public Parcelable c;
    public static final Parcelable$Creator CREATOR;

    static {
       yj7.CREATOR = new q86(6);
    }
    public void yj7(Parcel p0){
       super(p0);
       this.a = p0.readInt();
       this.b = p0.readInt();
       this.c = p0.readParcelable(null);
    }
    public void yj7(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.a = p0.readInt();
       this.b = p0.readInt();
       this.c = p0.readParcelable(p1);
    }
    public void yj7(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeParcelable(this.c, p1);
    }
}
