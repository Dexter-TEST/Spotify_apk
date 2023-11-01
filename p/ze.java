package p.ze;
import p.l4;
import p.sn5;
import p.ae1;
import p.ILoggerFactory;
import java.lang.Object;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import android.content.Context;
import p.lf7;
import java.io.File;
import java.lang.String;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import p.ef;
import android.os.StatFs;
import java.lang.Math;
import p.f15;
import p.a90;
import p.g15;
import p.tn5;
import java.lang.StringBuilder;
import p.up;
import p.rn5;
import android.view.View;
import android.view.ViewParent;
import p.iz7;
import java.lang.Runnable;
import p.is3;
import java.util.Map;
import p.nv6;
import p.bv5;
import p.cx5;
import p.r90;
import p.t90;
import p.lp5;

public final class ze implements l4, sn5, ae1, ILoggerFactory	// class@002ee2 from classes.dex
{
    public boolean a;
    public final Object b;
    public Object c;

    public void ze(){
       super();
       this.a = false;
       this.b = new HashMap();
       this.c = new LinkedBlockingQueue();
    }
    public void ze(Context p0,int p1){
       if (p1 != 4) {
          super();
          this.a = false;
          this.b = p0;
          return;
       }else {
          File uFile = new File(p0.getApplicationContext().getCacheDir(), "picasso-cache");
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          super(uFile);
          return;
       }
    }
    public void ze(ViewGroup p0){
       super();
       this.b = p0;
    }
    public void ze(AppBarLayout$BaseBehavior p0,ef p1,boolean p2){
       this.c = p0;
       this.b = p1;
       this.a = p2;
       super();
    }
    public void ze(File p0){
       long l1;
       long l = 0x500000;
       try{
          StatFs statFs = new StatFs(p0.getAbsolutePath());
          l1 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
       }catch(java.lang.IllegalArgumentException e0){
          l1 = e0;
       }
       f15 uof15 = new f15();
       uof15.k = new a90(p0, Math.max(Math.min(l1, 0x3200000), e0));
       g15 og15 = new g15(uof15);
       super();
       this.b = og15;
       this.c = og15.B;
       this.a = false;
       return;
    }
    public void ze(tn5 p0,StringBuilder p1){
       this.c = p0;
       this.b = p1;
       super();
       this.a = true;
    }
    public void ze(up p0){
       super();
       this.a = true;
       this.b = p0;
       this.c = null;
    }
    public final void a(int p0,rn5 p1){
       ze tb = this.b;
       if (this.a != null) {
          this.a = false;
       }else {
          tb+", ";
       }
       tb+p0;
       return;
    }
    public final void b(View p0){
       ze tc;
       if ((tc = this.c) == p0) {
          return;
       }
       ze tb = this.b;
       if (tc != null) {
          tb.removeView(tc);
       }
       this.c = p0;
       if (p0 == null) {
          tb.setVisibility(8);
          return;
       }else {
          p0.setDuplicateParentStateEnabled(this.a);
          tb.addView(p0);
          tb.setVisibility(0);
          p0 = tb.getParent();
          p0.post(new iz7(this, p0, 11));
          return;
       }
    }
    public final void c(){
       ze tc = this.c;
       int visibility = (tc != null)? tc.getVisibility(): 8;
       this.b.setVisibility(visibility);
       return;
    }
    public final boolean d(View p0){
       this.b.setExpanded(this.a);
       return true;
    }
    public synchronized final is3 e(String p0){
       nv6 onv6;
       if ((onv6 = this.b.get(p0)) == null) {
          onv6 = new nv6(p0, this.c, this.a);
          this.b.put(p0, onv6);
       }
       return onv6;
    }
    public final cx5 r(bv5 p0){
       return this.b.a(p0).f();
    }
}
