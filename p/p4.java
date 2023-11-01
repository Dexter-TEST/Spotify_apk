package p.p4;
import p.ir0;
import android.view.KeyEvent$Callback;
import java.lang.Object;
import com.spotify.litesettings.settings.AccountActivity;
import p.lm0;
import p.qm0;
import p.hw;
import java.lang.Class;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import p.yk5;
import java.lang.String;
import android.content.Context;
import p.yq5;
import android.view.View;
import p.l51;
import com.spotify.litesettings.settings.ChangeCellularLimitFragment;
import p.z4;
import java.lang.Long;

public final class p4 implements ir0	// class@0021f0 from classes.dex
{
    public final int a;
    public final KeyEvent$Callback b;
    public final Object c;
    public final Object t;
    public final Object v;
    public final Object w;
    public final Object x;

    public void p4(KeyEvent$Callback p0,Object p1,Object p2,Object p3,Object p4,Object p5,int p6){
       this.a = p6;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       this.x = p5;
       super();
    }
    public final void accept(Object p0){
       p4 tx = this.x;
       p4 tw = this.w;
       p4 tv = this.v;
       p4 tt = this.t;
       p4 tc = this.c;
       p4 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             hw e = p0.e;
             if (TextUtils.isEmpty(e)) {
                tc.v.remove(tt);
             }else {
                tt.e = e;
                tc.w(tv, tt);
             }
             String str = ((p0 = p0.b) == yk5.a)? tb.getString(R.string.settings_account_product_type_premium): tb.getString(R.string.settings_account_product_type_free);
             tw.e = str;
             if (p0 == yk5.b) {
                tc.w(tw, tx);
             }else {
                tc.v.remove(tx);
             }
             break;
           default:
             if (p0.a == null && p0.b == null) {
                p0 = p0.c;
                boolean b = true;
                boolean b1 = (p0.longValue() - ChangeCellularLimitFragment.v)? true: false;
                tb.setEnabled(b1);
                boolean b2 = (p0.longValue() - ChangeCellularLimitFragment.w)? true: false;
                tc.setEnabled(b2);
                boolean b3 = (p0.longValue() - ChangeCellularLimitFragment.x)? true: false;
                tt.setEnabled(b3);
                boolean b4 = (p0.longValue() - ChangeCellularLimitFragment.y)? true: false;
                tv.setEnabled(b4);
                boolean b5 = (p0.longValue() - ChangeCellularLimitFragment.z)? true: false;
                tw.setEnabled(b5);
                if (!(p0.longValue() - ChangeCellularLimitFragment.A)) {
                   b = false;
                }
                tx.setEnabled(b);
             }
             return;
       }
       tc.g();
       return;
    }
}
