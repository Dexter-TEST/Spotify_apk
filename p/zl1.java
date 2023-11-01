package p.zl1;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.b24;
import android.os.Parcelable;

public final class zl1 extends b0	// class@002f1a from classes.dex
{
    public boolean c;
    public static final Parcelable$ClassLoaderCreator CREATOR;

    static {
       zl1.CREATOR = new q86(12);
    }
    public void zl1(Parcel p0,ClassLoader p1){
       co5.o(p0, "source");
       super(p0, p1);
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.c = b;
       return;
    }
    public void zl1(b24 p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeParcelable(this.a, p1);
       p0.writeInt(this.c);
    }
}
