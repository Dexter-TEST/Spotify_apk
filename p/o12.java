package p.o12;
import p.w53;
import androidx.fragment.app.Fragment;
import p.vk7;
import p.wk7;
import p.v55;
import p.x55;
import android.content.Context;
import p.ej4;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import p.ry7;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager2.widget.ViewPager2;
import p.t63;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import android.content.res.Resources;
import java.lang.String;
import java.lang.NullPointerException;
import p.n12;
import p.al5;
import p.t00;
import p.sv;
import java.lang.Class;
import p.yq5;
import p.hz6;
import p.up0;
import p.fz6;
import p.me2;
import java.util.List;
import p.gz6;
import java.util.ArrayList;
import p.ne2;
import p.ar5;
import java.lang.IllegalStateException;

public class o12 extends Fragment implements w53	// class@00208c from classes.dex
{
    public al5 a;
    public t63 b;
    public static final int c;

    public void o12(){
       super();
    }
    public final vk7 b(){
       return wk7.w;
    }
    public final v55 h(){
       return x55.J;
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       TabLayout tabLayout;
       ViewPager2 viewPager2;
       View view = p0.inflate(R.layout.favorites_tabs_fragment, p1, false);
       int i = 0x7f0a05fb;
       if ((tabLayout = ry7.q(view, i)) != null) {
          i = 0x7f0a0667;
          if ((viewPager2 = ry7.q(view, i)) != null) {
             t63 ot63 = new t63(view, tabLayout, viewPager2, 10);
             this.b = ot63;
             return ot63.l();
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       this.b = null;
       super.onDestroyView();
    }
    public final void onViewCreated(View p0,Bundle p1){
       super.onViewCreated(p0, p1);
       sv osv = this.a.c.c();
       osv.getClass();
       this.b.t.setAdapter(new n12(this, osv.f));
       o12 tb = this.b;
       t63 c = tb.c;
       t63 t = tb.t;
       hz6 ohz6 = new hz6(c, t, new up0(4, this));
       if (ohz6.e != null) {
          throw new IllegalStateException("TabLayoutMediator is already attached");
       }
       yq5 adapter = t.getAdapter();
       ohz6.d = adapter;
       if (adapter == null) {
          throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
       }
       ohz6.e = true;
       t.c.b.add(new fz6(c));
       gz6 ogz6 = new gz6(t, true);
       TabLayout b0 = c.b0;
       if (!b0.contains(ogz6)) {
          b0.add(ogz6);
       }
       ohz6.d.u(new ne2(true, ohz6));
       ohz6.a();
       c.k(t.getCurrentItem(), 0, true, true);
       return;
    }
}
