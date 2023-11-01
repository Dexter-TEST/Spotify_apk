package p.yz1;
import android.graphics.drawable.Drawable;
import p.hh3;
import p.qe4;
import java.lang.Class;
import java.lang.String;
import p.ns5;
import java.lang.Object;
import android.content.Context;
import java.lang.CharSequence;
import p.av6;
import p.wz1;
import android.graphics.Paint;
import android.graphics.Typeface;
import p.xw5;
import android.graphics.Paint$Align;
import android.graphics.Rect;
import java.lang.Boolean;
import p.xz1;
import android.graphics.Color;
import p.n6;
import java.lang.Integer;
import p.co5;
import android.os.Build$VERSION;
import android.icu.text.BreakIterator;
import p.k11;
import p.ib3;
import p.gb3;
import java.util.Locale;
import java.lang.Math;
import p.ej4;
import android.graphics.Canvas;
import p.gv4;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.ColorFilter;

public final class yz1 extends Drawable	// class@002e56 from classes.dex
{
    public final Context a;
    public final int b;
    public final wz1 c;
    public final Paint d;
    public final Paint e;
    public Drawable f;
    public final Rect g;
    public final xz1 h;
    public static final hh3[] i;

    static {
       hh3[] ohh3Array = new hh3[]{new qe4(yz1.class, "isCircular", "isCircular\(\)Z")};
       ns5.a.getClass();
       yz1.i = ohh3Array;
    }
    public void yz1(int p0,int p1,Context p2,String p3){
       super();
       this.a = p2;
       this.b = p1;
       if (p3 == null || !((av6.p0(p3) ^ 1))) {
          p3 = null;
       }
       this.c = new wz1(p0, p1, p2, p3);
       Paint paint = new Paint();
       paint.setColor(p1);
       paint.setTypeface(xw5.c(p2, R.font.circular_sp_bold));
       paint.setAntiAlias(1);
       paint.setTextAlign(Paint$Align.CENTER);
       this.d = paint;
       Paint paint1 = new Paint();
       paint1.setColor(p0);
       paint1.setAntiAlias(1);
       this.e = paint1;
       this.g = new Rect();
       this.h = new xz1(Boolean.TRUE, this, 0);
       return;
    }
    public void yz1(int p0,Context p1,String p2){
       int i = ((((((Color.red(p0) * 299) + (Color.green(p0) * 587)) + (Color.blue(p0) * 114)) / 1000)) >= 128)? 1: 0;
       i = (i)? 0x7f0501f2: 0x7f050b4a;
       super(p0, n6.b(p1, i), p1, p2);
       return;
    }
    public void yz1(Context p0,String p1,String p2,Integer p3){
       String str;
       int i;
       co5.o(p1, "username");
       if (p2 != null) {
          str = ((av6.p0(p2) ^ 1))? p2: null;
          if (str) {
          label_0023 :
             if (Build$VERSION.SDK_INT >= 24) {
                BreakIterator uBreakIterat = k11.d();
                k11.w(uBreakIterat, str);
                str = str.substring(0, k11.a(uBreakIterat));
                co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
             }else {
                try{
                   String str1 = str.substring(0, str.offsetByCodePoints(0, 1));
                   co5.l(str1, "this as java.lang.String…ing\(startIndex, endIndex\)");
                   str = str1;
                }catch(java.lang.NullPointerException e0){
                   str = str.substring(Integer.valueOf(0).intValue(), (Integer.valueOf(new ib3(0, 0).b).intValue() + 1));
                   co5.l(str, "this as java.lang.String…ing\(startIndex, endIndex\)");
                }
             }
             str = str.toUpperCase(Locale.ROOT);
             co5.l(str, "this as java.lang.String\).toUpperCase\(Locale.ROOT\)");
          label_0076 :
             if (p3 != null) {
                i = p3.intValue();
             }else if(p2 != null){
                if (!((av6.p0(p2) ^ 1))) {
                   p2 = null;
                }
                if (p2 != null) {
                   p1 = p2;
                }
             }
             i = ((av6.p0(p1) ^ 1))? ej4.w[(Math.abs(p1.hashCode()) % 6)]: 0x7f05046b;
             i = n6.b(p0, i);
             super(i, p0, str);
             return;
          }
       }
       str = ((av6.p0(p1) ^ 1))? p1: null;
       if (!str) {
          str = null;
          goto label_0076 ;
       }else {
          goto label_0023 ;
       }
    }
    public final void draw(Canvas p0){
       wz1 b;
       yz1 tf;
       co5.o(p0, "canvas");
       Rect bounds = this.getBounds();
       co5.l(bounds, "bounds");
       int i = bounds.height();
       int i1 = 0;
       yz1 th = this.h;
       th.getClass();
       co5.o(yz1.i[i1], "property");
       th = this.e;
       if (th.a.booleanValue()) {
          float f = 2.00f;
          p0.drawCircle(((float)bounds.width() / f), ((float)i / f), ((float)i / f), th);
       }else {
          p0.drawPaint(th);
       }
       if ((b = this.c.b) != null) {
          th = this.d;
          th.setTextSize(((float)i * 0x3f0ccccd));
          yz1 tg = this.g;
          th.getTextBounds(b, i1, b.length(), tg);
          p0.drawText(b, bounds.exactCenterX(), (bounds.exactCenterY() - tg.exactCenterY()), th);
       }else if((tf = this.f) != null){
          tf.draw(p0);
       }
       return;
    }
    public final Drawable$ConstantState getConstantState(){
       yz1 tc = this.c;
       tc.e = this.getChangingConfigurations();
       return tc;
    }
    public final int getOpacity(){
       return -3;
    }
    public final Drawable mutate(){
       yz1 tc = this.c;
       tc.getClass();
       return new yz1(tc.c, tc.d, tc.a, tc.b);
    }
    public final void onBoundsChange(Rect p0){
       co5.o(p0, "bounds");
       if (this.c.b == null) {
          int i = p0.width();
          int i1 = (int)((float)i * 0x3f000000);
          i = (i - i1) / 2;
          yz1 ta = this.a;
          Resources resources = ta.getResources();
          co5.l(resources, "context.resources");
          i1 = (i1 <= (int)resources.getDimension(R.dimen.encore_graphic_size_decorative_smaller))? 1: 0;
          i1 = (i1)? 0x7f070502: 0x7f070503;
          Drawable drawable = ta.getResources().getDrawable(i1, null);
          drawable.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff$Mode.SRC_IN));
          Rect rect = new Rect(p0);
          rect.inset(i, i);
          drawable.setBounds(rect);
          this.f = drawable;
       }
       return;
    }
    public final void setAlpha(int p0){
       this.d.setAlpha(p0);
       this.e.setAlpha(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.d.setColorFilter(p0);
       this.e.setColorFilter(p0);
    }
}
