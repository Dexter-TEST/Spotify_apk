package p.ib;
import p.xz4;
import p.eh2;
import java.lang.Object;
import p.gh2;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import java.lang.Class;
import java.lang.String;
import p.db;
import p.co5;
import p.ya;
import p.ay6;
import com.spotify.allboarding.entrypoint.EntryPoint;
import android.app.Activity;
import p.ae2;
import androidx.fragment.app.k;
import androidx.fragment.app.o;
import androidx.fragment.app.Fragment;
import com.spotify.allboarding.allboardingimpl.mobius.AllBoardingFragment;
import p.za;
import android.os.Bundle;
import android.os.Parcelable;
import p.lg4;
import p.tu6;
import p.gg4;
import p.cb;
import java.lang.Enum;
import android.os.BaseBundle;
import p.eb;
import p.ub4;
import p.rb4;
import p.wa;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.p55;
import p.n46;

public final class ib implements xz4, eh2	// class@001963 from classes.dex
{
    public final Object a;

    public void ib(Object p0){
       this.a = p0;
       super();
    }
    public final gh2 a(){
       gh2 v6 = new gh2(1, this.a, AllboardingActivity.class, "navigateEffects", "navigateEffects\(Lcom/spotify/allboarding/allboardingimpl/mobius/logic/AllBoardingViewEffect;\)V");
       return v6;
    }
    public final void b(Object p0){
       o x;
       Bundle uBundle;
       lg4 olg4;
       gg4 ogg4;
       rb4 z;
       AllBoardingFragment x1;
       ub4 obj;
       ib ta = this.a;
       co5.o(p0, "p0");
       ta.getClass();
       void ovoid = null;
       if (p0 instanceof ya) {
          if (ta.V != null) {
             co5.o(ta.X.getValue(), "entryPoint");
             ta.finish();
          }else {
             co5.N("allBoardingStatusLogger");
             throw ovoid;
          }
       }else if((x = ta.y().x) != null && ((x = x.getChildFragmentManager()) != null && ((x = x.x) != null && x instanceof AllBoardingFragment))){
          int i = 1;
          int i1 = 0x7f0a0071;
          if (p0 instanceof za) {
             uBundle = new Bundle();
             za a = p0.a;
             co5.o(a, "config");
             uBundle.putParcelable("allboarding-search-arg", a);
             olg4 = tu6.p(x);
             if ((ogg4 = olg4.e()) == null || ogg4.y != i1) {
                obj = 0;
             }
             if (i) {
                olg4.i(R.id.search, uBundle);
             }
          }else if(p0 instanceof cb){
             cb uocb = p0;
             uBundle = new Bundle();
             cb b = uocb.b;
             co5.o(b, "skipType");
             uBundle.putInt("allboarding-skiptype-arg", b.ordinal());
             uocb = uocb.a;
             co5.o(uocb, "step");
             uBundle.putString("allboarding-step-arg", uocb);
             olg4 = tu6.p(x);
             if ((ogg4 = olg4.e()) == null || ogg4.y != i1) {
                obj = 0;
             }
             if (i) {
                olg4.i(R.id.skip_dialog, uBundle);
             }
          }
          eb uoeb = x.v();
          if ((z = uoeb.w.z) == null) {
             obj = uoeb.x;
          }
          wa c = z.c;
          if ((x1 = x.x) != null) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = x1.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj.c(c)) {
                   uArrayList.add(obj);
                }
             }
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                iterator.next().b(p0);
             }
          }else {
             co5.N("pages");
             throw ovoid;
          }
       }
       return;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof xz4 && p0 instanceof eh2)? co5.c(this.a(), p0.a()): false;
       return b;
    }
    public final int hashCode(){
       return this.a().e();
    }
}
