package p.jm;
import p.ir0;
import p.km;
import java.lang.Object;
import p.jc7;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.lang.String;
import android.content.Intent;
import p.xj0;
import p.zs2;
import p.wk7;
import p.tk7;
import p.ab3;
import p.v55;
import p.vk7;
import p.lm;
import p.an;
import p.sl;
import p.tl;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Bundle;
import p.ry7;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import p.yq5;
import androidx.viewpager2.widget.ViewPager2;

public final class jm implements ir0	// class@001b09 from classes.dex
{
    public final int a;
    public final km b;

    public void jm(km p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       km v;
       zs2 b;
       zs2 c;
       wk7 owk7;
       int i1;
       jm tb = this.b;
       switch (this.a){
           case 0:
             p0 = xj0.s(tb.requireContext(), "spotify:internal:assisted-curation-search:"+tb.z);
             v = tb.v;
             String dataString = p0.getDataString();
             b = v.b;
             c = v.c;
             owk7 = (dataString == null)? wk7.S: new tk7(dataString);
             break;
           default:
             if ((v = tb.B) != null) {
                int i = 1;
                if (p0 instanceof lm) {
                   i1 = 0;
                }else if(p0 instanceof an){
                   i1 = 1;
                }else {
                   i1 = 2;
                }
                tl d = v.D;
                v.D = d + 1;
                sl osl = new sl(p0, i1, d);
                p0 = v.E;
                Iterator iterator = p0.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      sl osl1 = iterator.next();
                      osl1.getClass();
                      osl1 = (osl1 != osl && (!TextUtils.equals(osl.c, osl1.c) && ry7.p(osl.t, osl1.t)))? 0: 1;
                      if (osl1) {
                         i = 0;
                      }
                   }else {
                      p0.add(osl);
                      Collections.sort(p0, tl.F);
                      v.g();
                   }
                   if (i) {
                      tb.x.b(0, 0);
                      break ;
                   }
                }
             }
             return;
       }
       v.a.a(b, c, owk7, 19, null);
       tb.startActivity(p0);
       return;
    }
}
