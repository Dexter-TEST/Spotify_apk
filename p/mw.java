package p.mw;
import android.widget.TextView;
import java.lang.Object;
import p.g86;
import p.j86;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.text.TextWatcher;
import android.view.View$OnLayoutChangeListener;
import java.lang.CharSequence;
import android.util.TypedValue;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.text.Layout;

public final class mw	// class@001f1f from classes.dex
{
    public final TextView a;
    public final TextPaint b;
    public float c;
    public final int d;
    public float e;
    public final float f;
    public float g;
    public boolean h;
    public final g86 i;
    public final j86 j;

    public void mw(TextView p0){
       TransformationMethod transformati;
       super();
       this.i = new g86(this);
       this.j = new j86(this);
       DisplayMetrics scaledDensit = p0.getContext().getResources().getDisplayMetrics().scaledDensity;
       this.a = p0;
       this.b = new TextPaint();
       float textSize = p0.getTextSize();
       if (textSize - this.c) {
          this.c = textSize;
       }
       int i = ((transformati = p0.getTransformationMethod()) != null && transformati instanceof SingleLineTransformationMethod)? 1: p0.getMaxLines();
       this.d = i;
       this.e = scaledDensit * 8.00f;
       this.f = this.c;
       this.g = 0x3f000000;
       return;
    }
    public static mw b(TextView p0){
       mw omw = new mw(p0);
       boolean b = true;
       if (omw.h != b) {
          omw.h = b;
          mw a = omw.a;
          a.addTextChangedListener(omw.i);
          a.addOnLayoutChangeListener(omw.j);
          omw.a();
       }
       return omw;
    }
    public static float c(CharSequence p0,TextPaint p1,float p2,int p3,float p4,float p5,float p6,DisplayMetrics p7){
       StaticLayout v15;
       int lineCount;
       float f2;
       Paint paint = p1;
       float f = p2;
       int i = p3;
       float f1 = (p4 + p5) / 2.00f;
       int i1 = 0;
       paint.setTextSize(TypedValue.applyDimension(i1, f1, p7));
       if (i != 1) {
          v15 = new StaticLayout(p0, p1, (int)f, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, true);
          lineCount = v15.getLineCount();
       }else {
          Layout layout = null;
          lineCount = 1;
       }
       if (lineCount > i) {
          if (((p5 - p4) - p6) < 0) {
             return p4;
          }else {
             return mw.c(p0, p1, p2, p3, p4, f1, p6, p7);
          }
       }else if(lineCount < i){
          return mw.c(p0, p1, p2, p3, f1, p5, p6, p7);
       }else if(i == 1){
          f2 = paint.measureText(p0, i1, p0.length());
       }else {
          int i2 = 0;
          while (i1 < lineCount) {
             if ((i2 - v15.getLineWidth(i1)) > 0) {
                i2 = v15.getLineWidth(i1);
             }
             i1 = i1 + 1;
          }
          f2 = i2;
       }
       if (((p5 - p4) - p6) < 0) {
          return p4;
       }else if((f - f2) > 0){
          return mw.c(p0, p1, p2, p3, p4, f1, p6, p7);
       }else if((f2 - f) < 0){
          return mw.c(p0, p1, p2, p3, f1, p5, p6, p7);
       }else {
          return f1;
       }
    }
    public final void a(){
       int i;
       TransformationMethod transformati;
       DisplayMetrics uDisplayMetr;
       CharSequence uCharSequenc1;
       StaticLayout v17;
       mw omw = this;
       mw a = omw.a;
       a.getTextSize();
       mw b = omw.b;
       mw e = omw.e;
       mw f = omw.f;
       mw d = omw.d;
       mw g = omw.g;
       if (d > null && (d != Integer.MAX_VALUE && (i = (a.getWidth() - a.getPaddingLeft()) - a.getPaddingRight()) > 0)) {
          CharSequence text = a.getText();
          if ((transformati = a.getTransformationMethod()) != null) {
             text = transformati.getTransformation(text, a);
          }
          CharSequence uCharSequenc = text;
          Context context = a.getContext();
          Resources system = Resources.getSystem();
          if (context != null) {
             system = context.getResources();
          }
          DisplayMetrics displayMetri = system.getDisplayMetrics();
          b.set(a.getPaint());
          b.setTextSize(f);
          int i1 = 0;
          if (d == 1 && ((float)i - b.measureText(uCharSequenc, i1, uCharSequenc.length())) > 0) {
             uDisplayMetr = displayMetri;
             uCharSequenc1 = uCharSequenc;
          }else {
             b.setTextSize(TypedValue.applyDimension(i1, f, displayMetri));
             uDisplayMetr = displayMetri;
             uCharSequenc1 = uCharSequenc;
             if ((v17 = new StaticLayout(uCharSequenc, b, (int)(float)i, Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, 1)) <= d) {
             label_00aa :
                if ((f - e) >= 0) {
                   e = f;
                }
                a.setTextSize(0, e);
             }
          }
          f = mw.c(uCharSequenc1, b, (float)i, d, 0, f, g, uDisplayMetr);
          goto label_00aa ;
       }
       a.getTextSize();
       return;
    }
    public final void d(float p0,int p1){
       Context context = this.a.getContext();
       Resources system = Resources.getSystem();
       if (context != null) {
          system = context.getResources();
       }
       p0 = TypedValue.applyDimension(p1, p0, system.getDisplayMetrics());
       if (this.e - p0) {
          this.e = p0;
          this.a();
       }
       return;
    }
}
