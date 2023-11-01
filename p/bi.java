package p.bi;
import java.lang.CharSequence;
import android.text.Layout$Alignment;
import android.widget.TextView;
import android.text.TextPaint;
import p.ei;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import p.eh;

public abstract class bi	// class@0010d2 from classes.dex
{

    public static StaticLayout a(CharSequence p0,Layout$Alignment p1,int p2,int p3,TextView p4,TextPaint p5,ei p6){
       StaticLayout$Builder uBuilder = eh.m(p0, p0.length(), p5, p2);
       StaticLayout$Builder uBuilder1 = eh.D(eh.j(eh.l(eh.i(eh.k(uBuilder, p1), p4.getLineSpacingExtra(), p4.getLineSpacingMultiplier()), p4.getIncludeFontPadding()), eh.e(p4)), eh.C(p4));
       if (p3 == -1) {
          p3 = Integer.MAX_VALUE;
       }
       try{
          eh.v(uBuilder1, p3);
          p6.a(uBuilder, p4);
          return eh.n(uBuilder);
       }catch(java.lang.ClassCastException e0){
       }
    }
}
