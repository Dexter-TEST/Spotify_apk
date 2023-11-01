package p.qy3;
import p.ir0;
import androidx.fragment.app.o;
import java.lang.Object;
import p.dz3;
import p.my3;
import java.lang.String;
import java.lang.Class;
import androidx.fragment.app.Fragment;
import p.i50;
import p.oy3;
import p.t65;
import java.lang.Boolean;
import android.os.Bundle;
import p.do5;

public final class qy3 implements ir0	// class@00243b from classes.dex
{
    public final int a;
    public final o b;

    public void qy3(o p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       qy3 tb = this.b;
       dz3 uodz3 = dz3.class;
       switch (this.a){
           case 0:
             if ((p0 = tb.D(uodz3.getSimpleName())) != null && p0 instanceof dz3) {
                p0.u();
             }
             break;
           default:
             if ((p0 = tb.D(uodz3.getSimpleName())) != null && p0 instanceof dz3) {
                p0 = new t65[]{new t65("lyrics_report_bundle_key", Boolean.TRUE)};
                tb.Z(do5.g(p0), "lyrics_report_request_key");
             }
             return;
       }
       return;
    }
}
