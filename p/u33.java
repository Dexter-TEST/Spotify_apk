package p.u33;
import android.view.View$BaseSavedState;
import p.t33;
import android.os.Parcel;
import p.xs2;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

public final class u33 extends View$BaseSavedState	// class@002834 from classes.dex
{
    public Parcelable a;
    public Parcelable b;
    public boolean c;
    public float t;
    public static final Parcelable$Creator CREATOR;

    static {
       u33.CREATOR = new t33(0);
    }
    public void u33(Parcel p0){
       super(p0);
       this.a = p0.readParcelable(xs2.class.getClassLoader());
       this.b = p0.readParcelable(RecyclerView.class.getClassLoader());
       boolean b = (p0.readInt())? true: false;
       this.c = b;
       this.t = p0.readFloat();
       return;
    }
    public void u33(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeParcelable(this.a, p1);
       p0.writeParcelable(this.b, p1);
       p0.writeInt(this.c);
       p0.writeFloat(this.t);
    }
}
