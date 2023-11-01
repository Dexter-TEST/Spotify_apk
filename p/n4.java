package p.n4;
import p.g10;
import p.gg1;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import android.view.ViewGroup;
import p.a06;
import p.u01;
import p.o85;
import p.xj0;
import p.vz5;
import p.zk2;
import p.eo5;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import com.spotify.litesettings.settings.AccountActivity;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import android.util.AttributeSet;
import p.sz5;
import p.wk6;
import android.view.View$OnClickListener;

public final class n4 implements g10	// class@001f69 from classes.dex
{
    public final int a;
    public final gg1 b;

    public void n4(int p0,gg1 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object h(RecyclerView p0){
       a06 uoa06;
       int b = true;
       int i = 5;
       boolean b1 = false;
       n4 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             uoa06 = gg1.w(p0.getContext(), p0, b1);
             uoa06.t.setMaxLines(i);
             return uoa06;
           case 1:
             tb.getClass();
             return gg1.w(p0.getContext(), p0, b);
           case 2:
             tb.getClass();
             uoa06 = gg1.w(p0.getContext(), p0, b);
             uoa06.t.setMaxLines(i);
             return uoa06;
           case 3:
             tb.getClass();
             return gg1.w(p0.getContext(), p0, b1);
           case 4:
             tb.getClass();
             return gg1.w(p0.getContext(), p0, b1);
           case 5:
             tb.getClass();
             vz5 ovz5 = new vz5(xj0.x0(p0.getContext(), p0, R.layout.glue_listtile_1_image));
             eo5.P(ovz5);
             vz5 t = ovz5.t;
             b = xj0.e0(24.00f, t.getResources());
             ViewGroup$LayoutParams layoutParams = t.getLayoutParams();
             layoutParams.width = b;
             layoutParams.height = b;
             return ovz5;
           case 6:
             tb.getClass();
             return new u01(p0, gg1.w(p0.getContext(), p0, b1));
           default:
             tb.getClass();
             a06 uoa061 = gg1.w(p0.getContext(), p0, b1);
             SwitchCompat switchCompat = new SwitchCompat(p0.getContext(), null);
             uoa061.d(switchCompat);
             uoa061.a.setOnClickListener(new wk6(switchCompat, b));
             uoa061.t.setMaxLines(i);
             return uoa061;
       }
    }
}
