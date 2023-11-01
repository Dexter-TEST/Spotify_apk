package p.tb4;
import p.hr0;
import java.lang.Object;
import p.ub4;
import p.ne4;
import com.spotify.mobius.android.a;
import java.util.concurrent.ArrayBlockingQueue;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import p.ja3;
import java.lang.Runnable;
import p.er7;
import p.hd5;
import java.util.Calendar;
import com.spotify.litesignup.phonesignup.PhoneNumberSignupActivity;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import java.lang.Class;
import android.os.Bundle;
import java.io.Serializable;
import p.ae2;
import androidx.fragment.app.k;
import androidx.fragment.app.f;
import androidx.fragment.app.a;
import androidx.fragment.app.o;

public final class tb4 implements hr0	// class@00273a from classes.dex
{
    public final int a;
    public final Object b;

    public void tb4(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
             ub4 v = this.b.v;
             String str = "Maximum effect queue size \(";
             a a = v.a;
             _monitor_enter(a);
             if (v.f != null) {
                if (!v.c.offer(p0)) {
                   throw new IllegalStateException(str+v.c.size()+"\) exceeded when posting: "+p0);
                }
             }else {
                v.b.post(new ja3(v, 18, p0));
             }
             _monitor_exit(a);
             return;
             break;
           case 1:
           default:
             tb4 tb = this.b;
             if (tb.d0.isAdded()) {
                p0 = new Object[0];
                Logger.i("Birthday picker already added, aborting...", p0);
             }else if(p0 != null){
                PhoneNumberSignupActivity d0 = tb.d0;
                d0.getClass();
                Bundle uBundle = new Bundle();
                uBundle.putSerializable("ARG_DATE", p0);
                d0.setArguments(uBundle);
             }else {
                tb.d0.setArguments(null);
             }
             p0 = tb.d0;
             ae2 uoae2 = tb.y();
             p0.E = false;
             p0.F = true;
             uoae2.getClass();
             a uoa = new a(uoae2);
             uoa.p = true;
             uoa.g(0, p0, "FRAGMENT_BIRTHDATE_PICKER", true);
             uoa.f();
             return;
       }
       this.b.t.l(p0);
       return;
    }
}
