package p.o75;
import android.os.Parcelable$ClassLoaderCreator;
import p.dy1;
import java.lang.Object;
import android.os.Parcel;
import p.dk2;
import java.lang.ClassLoader;
import p.to2;

public final class o75 implements Parcelable$ClassLoaderCreator	// class@0020c5 from classes.dex
{
    public final p75 a;

    public void o75(dy1 p0){
       super();
       this.a = p0;
    }
    public final Object createFromParcel(Parcel p0){
       dk2 uodk2;
       switch (this.a.a){
           case 26:
             uodk2 = new dk2(p0, null);
             break;
           default:
             uodk2 = new to2(p0);
       }
       return uodk2;
    }
    public final Object createFromParcel(Parcel p0,ClassLoader p1){
       dk2 uodk2;
       switch (this.a.a){
           case 26:
             uodk2 = new dk2(p0, p1);
             break;
           default:
             uodk2 = new to2(p0);
       }
       return uodk2;
    }
    public final Object[] newArray(int p0){
       dk2[] uodk2Array;
       switch (this.a.a){
           case 26:
             uodk2Array = new dk2[p0];
             break;
           default:
             uodk2Array = new to2[p0];
       }
       return uodk2Array;
    }
}
