package p.q86;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import p.k27;
import java.lang.ClassLoader;
import p.qe0;
import p.b24;
import p.c50;
import p.af;
import android.os.Build$VERSION;
import p.yj7;
import p.rr5;
import p.ed2;
import android.os.Parcelable;
import p.b0;
import java.lang.IllegalStateException;
import java.lang.String;
import p.cv0;
import p.d67;
import p.r86;
import p.co5;
import p.zl1;

public final class q86 implements Parcelable$ClassLoaderCreator	// class@002352 from classes.dex
{
    public final int a;

    public void q86(int p0){
       this.a = p0;
       super();
    }
    public final Object createFromParcel(Parcel p0){
       switch (this.a){
           case 0:
             return new r86(p0, null);
           case 1:
             return new d67(p0, null);
           case 2:
             return new cv0(p0, null);
           case 3:
             if (p0.readParcelable(null) == null) {
                return b0.b;
             }else {
                throw new IllegalStateException("superState must be null");
             }
             break;
           case 4:
             return new ed2(p0, null);
           case 5:
             return new rr5(p0, null);
           case 6:
             yj7 oyj7 = (Build$VERSION.SDK_INT >= 24)? new yj7(p0, null): new yj7(p0);
             return oyj7;
             break;
           case 7:
             return new af(p0, null);
           case 8:
             return new c50(p0, null);
           case 9:
             return new b24(p0, null);
           case 10:
             return new qe0(p0, null);
           case 11:
             return new k27(p0, null);
           default:
             co5.o(p0, "source");
             return new zl1(p0, null);
       }
    }
    public final Object createFromParcel(Parcel p0,ClassLoader p1){
       switch (this.a){
           case 0:
             return new r86(p0, p1);
           case 1:
             return new d67(p0, p1);
           case 2:
             return new cv0(p0, p1);
           case 3:
             if (p0.readParcelable(p1) == null) {
                return b0.b;
             }else {
                throw new IllegalStateException("superState must be null");
             }
             break;
           case 4:
             return new ed2(p0, p1);
           case 5:
             return new rr5(p0, p1);
           case 6:
             yj7 oyj7 = (Build$VERSION.SDK_INT >= 24)? new yj7(p0, p1): new yj7(p0);
             return oyj7;
             break;
           case 7:
             return new af(p0, p1);
           case 8:
             return new c50(p0, p1);
           case 9:
             return new b24(p0, p1);
           case 10:
             return new qe0(p0, p1);
           case 11:
             return new k27(p0, p1);
           default:
             co5.o(p0, "source");
             return new zl1(p0, p1);
       }
    }
    public final Object[] newArray(int p0){
       switch (this.a){
           case 0:
             r86[] or86Array = new r86[p0];
             return or86Array;
           case 1:
             d67[] uod67Array = new d67[p0];
             return uod67Array;
           case 2:
             cv0[] uocv0Array = new cv0[p0];
             return uocv0Array;
           case 3:
             b0[] uob0Array = new b0[p0];
             return uob0Array;
           case 4:
             ed2[] uoed2Array = new ed2[p0];
             return uoed2Array;
           case 5:
             rr5[] orr5Array = new rr5[p0];
             return orr5Array;
           case 6:
             yj7[] oyj7Array = new yj7[p0];
             return oyj7Array;
           case 7:
             af[] uoafArray = new af[p0];
             return uoafArray;
           case 8:
             c50[] uoc50Array = new c50[p0];
             return uoc50Array;
           case 9:
             b24[] uob24Array = new b24[p0];
             return uob24Array;
           case 10:
             qe0[] oqe0Array = new qe0[p0];
             return oqe0Array;
           case 11:
             k27[] ok27Array = new k27[p0];
             return ok27Array;
           default:
             zl1[] ozl1Array = new zl1[p0];
             return ozl1Array;
       }
    }
}
