package p.ra1;
import android.content.Context;
import p.gg1;
import java.lang.Object;
import java.util.AbstractCollection;
import java.lang.Iterable;
import java.util.ArrayList;
import p.dj0;
import java.util.List;
import p.di7;
import p.cc1;
import p.v42;
import p.la6;
import p.zf2;
import p.qa1;
import p.m52;
import p.qa6;
import p.l52;
import java.io.File;
import java.lang.Throwable;
import java.lang.String;
import com.spotify.base.java.logging.Logger;

public final class ra1	// class@0024a8 from classes.dex
{
    public final Context a;
    public final gg1 b;

    public void ra1(Context p0){
       super();
       this.a = p0;
       this.b = new gg1();
    }
    public static long a(AbstractCollection p0){
       long l;
       boolean b = false;
       try{
          List list = dj0.g0(dj0.i0(p0));
          di7 uodi7 = dj0.e0(list);
          cc1 uocc1 = new cc1(5, list);
          v42 ov42 = new v42(uodi7, b, uocc1);
          m52 om52 = new m52(ov42, qa1.y, qa6.z);
          l52 ol52 = new l52(om52);
          l = 0;
          while (ol52.a()) {
             File uFile = ol52.next();
             try{
                l = l + uFile.length();
             }catch(java.lang.SecurityException e3){
                Object[] objArray1 = new Object[b];
                Logger.c(e3, "Not allowed to read file", objArray1);
             }
          }
       }catch(java.lang.OutOfMemoryError e6){
          Object[] objArray = new Object[b];
          Logger.c(e6, "Ran out of memory while trying to compute directory size", objArray);
          l = -1;
       }
       return l;
    }
}
