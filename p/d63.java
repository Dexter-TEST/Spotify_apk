package p.d63;
import p.wf2;
import p.gi3;
import p.f63;
import java.lang.Object;
import android.app.ActivityManager;
import p.r;
import android.content.Context;
import java.lang.Class;
import p.n6;
import p.co5;
import p.iq5;
import android.content.pm.ApplicationInfo;
import p.fq5;
import p.xl7;
import p.ql1;
import p.aq5;
import p.dv6;
import p.az5;
import p.c42;
import p.mc1;
import java.io.File;
import java.lang.String;
import p.uk;
import p.m95;
import p.ir2;
import android.os.StatFs;
import p.eb3;
import p.rp5;
import p.yg3;
import p.j71;

public final class d63 extends gi3 implements wf2	// class@0012e8 from classes.dex
{
    public final int a;
    public final f63 b;

    public void d63(f63 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final Object invoke(){
       rp5 obj;
       double d;
       iq5 oiq5;
       fq5 obj1;
       int i2;
       ql1 oql1;
       long l;
       long l1;
       d63 uod63 = this;
       int i = 0;
       switch (uod63.a){
           case 0:
             ActivityManager uActivityMan = ActivityManager.class;
             f63 a = uod63.b.a;
             Bitmap$Config[] a1 = r.a;
             try{
                obj = n6.e(a, uActivityMan);
                co5.i(obj);
                d = (obj.isLowRamDevice())? 0x3fc3333333333333: 0x3fc999999999999a;
             }catch(java.lang.Exception e0){
             }
             oiq5 = new iq5();
             int i1 = 0;
             if ((i - d) > 0) {
                Bitmap$Config[] a2 = r.a;
                try{
                   obj1 = n6.e(a, e0);
                   co5.i(obj1);
                   if ((a.getApplicationInfo().flags & 0x100000)) {
                      i1 = 1;
                   label_004d :
                      i2 = (i1)? obj1.getLargeMemoryClass(): obj1.getMemoryClass();
                   }else {
                      goto label_004d ;
                   }
                }catch(java.lang.Exception e0){
                   i2 = 256;
                }
                double d1 = (double)1024;
                i1 = (int)(((d * (double)i2) * d1) * d1);
             }
             obj1 = (i1 > 0)? new fq5(i1, oiq5): new ql1(oiq5);
             break;
           default:
             az5 z = az5.z;
             f63 a3 = uod63.b.a;
             _monitor_enter(z);
             if ((obj = az5.A) == null) {
                yg3 a4 = c42.a;
                d = 0xa00000;
                j71 b = mc1.b;
                File cacheDir = a3.getCacheDir();
                cacheDir.mkdirs();
                m95 om95 = ir2.w(uk.p0(cacheDir, "image_cache"));
                double d2 = 0x3f947ae147ae147b;
                if ((i - d2) > 0) {
                   try{
                      StatFs statFs = new StatFs(om95.toFile().getAbsolutePath());
                      l = eb3.e((long)((d2 * (double)statFs.getBlockCountLong()) * (double)statFs.getBlockSizeLong()), d, 0xfa00000);
                   }catch(java.lang.Exception e0){
                      l1 = d;
                   }
                }else {
                   l = 0;
                }
                l1 = l;
                rp5 d3 = new rp5(l1, om95, a4, b);
                az5.A = d;
             }
             _monitor_exit(z);
             return d;
       }
       return new aq5(obj1, oiq5);
    }
}
