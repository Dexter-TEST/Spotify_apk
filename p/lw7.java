package p.lw7;
import p.iw7;
import p.pw7;
import p.l08;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import android.os.Bundle;
import p.az5;
import java.lang.String;
import java.util.HashMap;
import p.iy7;
import p.lz7;
import p.cx7;
import com.google.android.play.core.assetpacks.zzbn;
import android.os.BaseBundle;
import java.util.Collection;
import p.jd;
import java.util.concurrent.atomic.AtomicBoolean;
import p.ow7;
import java.lang.Integer;
import p.ll;
import java.lang.Exception;

public final class lw7 extends iw7	// class@001ddb from classes.dex
{
    public final int d;
    public final pw7 e;

    public void lw7(pw7 p0,l08 p1,int p2){
       this.d = p2;
       this.e = p0;
       super(p0, p1);
    }
    public final void r(ArrayList p0){
       zzbn ozzbn;
       zzbn b2;
       lw7 olw7 = this;
       switch (olw7.d){
           case 0:
             super.r(p0);
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                Bundle uBundle = iterator.next();
                lw7 e = olw7.e;
                pw7 b = e.b;
                ArrayList uArrayList1 = new ArrayList();
                az5 b1 = az5.B;
                ArrayList stringArrayL = uBundle.getStringArrayList("pack_names");
                HashMap hashMap = new HashMap();
                int i = stringArrayL.size();
                int i1 = 0;
                for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                   String str = stringArrayL.get(i2);
                   hashMap.put(str, zzbn.b(uBundle, str, b, e.c, b1));
                }
                Iterator iterator1 = uArrayList1.iterator();
                while (iterator1.hasNext()) {
                   String str1 = iterator1.next();
                   hashMap.put(str1, zzbn.a(str1, 4, 0, 0, 0, 0, 1, "", ""));
                }
                uBundle.getLong("total_bytes_to_download");
                if ((ozzbn = hashMap.values().iterator().next()) == null) {
                   Object[] objArray = new Object[i1];
                   pw7.g.c("onGetSessionStates: Bundle contained no pack.", objArray);
                }
                if ((b2 = ozzbn.b) == 1 || (b2 == 7 || (b2 == 2 || b2 == 3))) {
                   i1 = 1;
                }
                if (i1) {
                   uArrayList.add(ozzbn.a);
                }
             }
             olw7.b.b(uArrayList);
             return;
             break;
       }
       super.r(p0);
       return;
    }
    public final void t(Bundle p0,Bundle p1){
       switch (this.d){
           case 1:
             super.t(p0, p1);
             lw7 te = this.e;
             boolean b = false;
             if (!te.f.compareAndSet(true, b)) {
                Object[] objArray = new Object[b];
                pw7.g.f("Expected keepingAlive to be true, but was false.", objArray);
             }
             if (p0.getBoolean("keep_alive")) {
                te.e();
             }
             break;
           default:
             super.t(p0, p1);
             return;
       }
       return;
    }
    public final void u(Bundle p0){
       switch (this.d){
           case 1:
           default:
             super.u(p0);
             return;
       }
       iw7 tb = this.b;
       this.e.e.c(tb);
       int intx = p0.getInt("error_code");
       Object[] objArray = new Object[]{Integer.valueOf(intx)};
       pw7.g.c("onError\(%d\)", objArray);
       tb.a(new ll(intx, 0));
       return;
    }
}
