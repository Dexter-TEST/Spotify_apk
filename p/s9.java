package p.s9;
import p.ir0;
import java.lang.Object;
import android.graphics.Bitmap;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import p.gs0;
import java.lang.String;
import p.co5;
import p.en6;
import p.cd2;
import android.graphics.Rect;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Paint;
import java.lang.Math;
import java.util.Map;
import android.view.View;
import io.reactivex.rxjava3.disposables.Disposable;
import p.v9;
import p.y8;
import p.nr0;
import p.qb;
import java.lang.Class;
import p.ld;
import p.md;
import java.util.concurrent.ConcurrentHashMap;
import com.spotify.clientfoundations.cosmos.cosmos.Response;
import io.reactivex.rxjava3.core.ObservableEmitter;
import com.spotify.clientfoundations.cosmos.cosmos.Request;

public final class s9 implements ir0	// class@0025e8 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void s9(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final void accept(Object p0){
       s9 tb;
       ContentStackView uContentStac;
       switch (this.a){
           case 0:
           case 1:
             tb = this.b;
             ContentStackView g = tb.G;
             s9 tc = this.c;
             co5.l(p0, "bitmap");
             int i = en6.A(tc.b);
             ContentStackView y = tb.y;
             int i1 = 1;
             if (i) {
                if (i == i1) {
                   uContentStac = y;
                }else {
                   throw new cd2(10);
                }
             }else {
                uContentStac = tb.v;
             }
             i = (int)uContentStac;
             Rect rect = new Rect(0, 0, i, i);
             Bitmap uBitmap = Bitmap.createBitmap(i, i, Bitmap$Config.ARGB_8888);
             co5.l(uBitmap, "createBitmap\(size, size, Bitmap.Config.ARGB_8888\)");
             Canvas uCanvas = new Canvas(uBitmap);
             int i2 = en6.A(tc.b);
             ContentStackView d = tb.D;
             if (i2) {
                if (i2 == i1) {
                   uCanvas.drawRoundRect(new RectF(0, 0, y, y), tb.c, tb.c, d);
                }
             }else {
                uCanvas.drawCircle(tb.w, tb.w, tb.w, d);
             }
             int i3 = Math.min(p0.getWidth(), p0.getHeight());
             i2 = i3 >> 1;
             int i4 = (p0.getWidth() >> i1) - i2;
             i1 = (p0.getHeight() >> 1) - i2;
             int i5 = i4 + i3;
             uCanvas.drawBitmap(p0, new Rect(i4, i1, i5, (i3 + i1)), rect, tb.F);
             g.put(tc, uBitmap);
             tb.postInvalidate();
             return;
             break;
           default:
             co5.o(p0, "response");
             tb = this.b;
             if (!tb.isDisposed()) {
                tb.onNext(p0);
                if (!"SUB".equals(this.c.getAction())) {
                   tb.onComplete();
                }
             }
             return;
       }
       p0 = this.b.f;
       qb oqb = this.c.a.a();
       p0.getClass();
       co5.o(oqb, "itemUri");
       p0 = p0.a.a("allboarding_load_more");
       p0.h = "android-libs-allboarding";
       p0.g("allboarding_load_more");
       p0.e.put("item-uri", oqb);
       p0.b.put("allboarding_load_more_".concat(oqb), p0);
       return;
    }
}
