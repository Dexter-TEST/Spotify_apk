package p.jj7;
import android.view.View;
import java.lang.Object;
import java.lang.Math;
import p.wh7;
import android.os.Build$VERSION;
import android.view.ViewParent;

public final class jj7	// class@001aed from classes.dex
{
    public final View a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    public void jj7(View p0){
       super();
       this.a = p0;
    }
    public final void a(){
       jj7 td = this.d;
       if (this.g != null) {
          td = Math.max(this.e, Math.min(this.f, td));
       }
       jj7 ta = this.a;
       wh7.i(ta, (td - (ta.getTop() - this.b)));
       wh7.h(ta, ((ta.getLeft() - this.c) - 0));
       if (Build$VERSION.SDK_INT < 23) {
          float translationX = ta.getTranslationX();
          float f = 0x3f800000;
          ta.setTranslationX((translationX + f));
          ta.setTranslationX(translationX);
          ViewParent parent = ta.getParent();
          if (parent instanceof View) {
             float translationX1 = parent.getTranslationX();
             parent.setTranslationX((f + translationX1));
             parent.setTranslationX(translationX1);
          }
       }
       return;
    }
}
