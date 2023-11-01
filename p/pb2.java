package p.pb2;
import java.lang.Runnable;
import p.qb2;
import java.lang.Object;
import p.dc2;
import p.x67;
import java.lang.String;
import p.w67;
import java.lang.Class;
import p.pa7;
import android.content.Context;
import android.graphics.Typeface;
import p.vf;
import android.net.Uri;
import java.nio.MappedByteBuffer;
import p.ry7;
import p.j8;
import p.f94;
import p.vv7;
import p.ap5;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class pb2 implements Runnable	// class@00222a from classes.dex
{
    public final int a;
    public final qb2 b;

    public void pb2(qb2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       dc2 e;
       MappedByteBuffer mappedByteBu;
       switch (this.a){
           case 0:
             break;
           default:
             this.b.c();
             return;
       }
       pb2 tb = this.b;
       String str = "fetchFonts result is not OK. \(";
       qb2 t = tb.t;
       _monitor_enter(t);
       if (tb.y == null) {
          _monitor_exit(t);
       }else {
          _monitor_exit(t);
          dc2 uodc2 = tb.d();
          if ((e = uodc2.e) == 2) {
             qb2 t1 = tb.t;
             _monitor_enter(t1);
             _monitor_exit(t1);
          }
          if (e == null) {
             w67.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
             tb.c.getClass();
             dc2[] uodc2Array = new dc2[]{uodc2};
             Typeface typeface = pa7.a.h(tb.a, uodc2Array, 0);
             if ((mappedByteBu = ry7.P(tb.a, uodc2.a)) != null && typeface != null) {
                w67.a("EmojiCompat.MetadataRepo.create");
                j8 oj8 = new j8(typeface, vv7.K(mappedByteBu));
                w67.b();
                w67.b();
                qb2 t2 = tb.t;
                _monitor_enter(t2);
                if ((t = tb.y) != null) {
                   t.v(oj8);
                }
                _monitor_exit(t2);
                tb.a();
             }else {
                throw new RuntimeException("Unable to open file.");
             }
          }else {
             throw new RuntimeException(str+e+"\)");
          }
       }
       return;
    }
}
