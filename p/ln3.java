package p.ln3;
import p.xt2;
import p.c33;
import p.fv1;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.mn3;
import java.lang.Class;
import p.zk2;
import p.eo5;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import p.hu2;
import p.j13;
import android.text.TextUtils;
import android.widget.ImageView;
import p.wd5;
import p.r45;
import p.uw5;
import p.sp6;
import p.lp6;
import android.content.Context;
import android.content.res.Resources;
import p.xj0;
import p.au2;
import android.graphics.Color;
import java.lang.Integer;
import com.spotify.base.java.logging.Logger;
import android.graphics.drawable.Drawable;
import p.bz2;
import p.ze;
import java.util.List;
import p.y33;
import android.view.ViewGroup;
import p.lq5;
import android.view.LayoutInflater;
import java.util.EnumSet;
import p.nk2;

public final class ln3 implements xt2	// class@001d88 from classes.dex
{
    public final c33 a;
    public final fv1 b;
    public lq5 c;

    public void ln3(c33 p0,fv1 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       sp6 osp6;
       lp6 olp6;
       String str1;
       Object[] objArray;
       mn3 omn3 = eo5.M(p0, mn3.class);
       String str = p1.y().d();
       mn3 c = omn3.c;
       c.setText(str);
       int i = 8;
       int i1 = (str != null)? 0: 8;
       c.setVisibility(i1);
       str = p1.y().e();
       c = omn3.t;
       c.setText(str);
       i1 = (str != null)? 0: 8;
       c.setVisibility(i1);
       str = p1.u().d();
       j13 oj13 = p1.u().e();
       ln3 ta = this.a;
       mn3 a = omn3.a;
       mn3 b = omn3.b;
       if (!TextUtils.isEmpty(str)) {
          ta.b.b(b);
          if ((osp6 = uw5.s(str).f()) != null) {
             olp6 = new lp6(p0.getContext(), osp6, (float)xj0.e0(64.00f, a.getResources()));
             if ((str1 = p1.b().q("iconColor")) != null) {
                try{
                   Integer integer = Integer.valueOf(Color.parseColor(str1));
                label_0096 :
                   if (objArray != null) {
                      e0.b(objArray.intValue());
                   }
                }catch(java.lang.IllegalArgumentException e0){
                   objArray = new Object[0];
                   Logger.b("Could not parse color for icon in EmptyView", objArray);
                }
                objArray = null;
                goto label_0096 ;
             }else {
             }
          }else {
             olp6 = null;
          }
          b.setImageDrawable(e0);
          if (e0 != null) {
             i = 0;
          }
          b.setVisibility(i);
       }else {
          b.setVisibility(0);
          ta.b(b, oj13, bz2.t);
       }
       mn3 v = omn3.v;
       v.b(null);
       v.c();
       List list = p1.j();
       if (!list.isEmpty()) {
          v.b(this.c.h(null, list.get(0), a, 0).b);
          v.c();
       }
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       if (this.c == null) {
          this.c = new lq5(p1);
       }
       this.b.getClass();
       p0 = LayoutInflater.from(p0.getContext()).inflate(R.layout.lite_empty_state, p0, false);
       eo5.P(new mn3(p0));
       return p0;
    }
    public final EnumSet d(){
       return EnumSet.noneOf(nk2.class);
    }
}
