package p.uo7;
import p.gr0;
import android.os.Parcel;
import java.lang.Object;
import p.br6;
import p.dr6;
import p.zq6;
import p.er6;

public final class uo7 implements gr0	// class@0028f0 from classes.dex
{
    public final int a;
    public final Parcel b;

    public void uo7(Parcel p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       uo7 tb = this.b;
       switch (this.a){
           case 0:
             tb.writeInt(0);
             return;
           case 1:
             tb.writeInt(1);
             return;
           case 2:
             tb.writeInt(2);
             tb.writeInt(p0.M);
             return;
           default:
             tb.writeInt(3);
             return;
       }
    }
}
