package p.xk6;
import p.yq5;
import p.ci4;
import p.qx1;
import java.lang.String;
import java.lang.CharSequence;
import p.zr5;
import p.al2;
import p.xz5;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.view.View;
import p.qz5;
import androidx.appcompat.widget.SwitchCompat;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import java.lang.Object;
import p.aw6;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.ViewGroup;
import p.o85;
import p.xj0;
import p.a06;
import p.zk2;
import p.eo5;
import android.util.AttributeSet;
import p.wk6;
import android.view.View$OnClickListener;
import p.sz5;

public final class xk6 extends yq5	// class@002c97 from classes.dex
{
    public final aw6 t;
    public final CompoundButton$OnCheckedChangeListener v;
    public final CharSequence w;
    public final CharSequence x;

    public void xk6(ci4 p0,qx1 p1,String p2,CharSequence p3){
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
    }
    public final int d(){
       return 1;
    }
    public final void n(zr5 p0,int p1){
       al2 u = p0.u;
       u.setTitle(this.w);
       u.setSubtitle(this.x);
       u.getSubtitleView().setEllipsize(null);
       u.getSubtitleView().setSingleLine(false);
       SwitchCompat switchCompat = u.h();
       switchCompat.setOnCheckedChangeListener(null);
       switchCompat.setChecked(this.t.get().booleanValue());
       switchCompat.setOnCheckedChangeListener(this.v);
    }
    public final zr5 o(int p0,RecyclerView p1){
       o85 oo85 = xj0.x0(p1.getContext(), p1, R.layout.glue_listtile_2);
       a06 uoa06 = new a06(oo85);
       eo5.P(uoa06);
       SwitchCompat switchCompat = new SwitchCompat(p1.getContext(), null);
       oo85.setOnClickListener(new wk6(switchCompat, 0));
       uoa06.d(switchCompat);
       return new al2(uoa06);
    }
}
