package p.lo1;
import android.text.style.LineHeightSpan$WithDensity;
import java.lang.Object;
import java.lang.CharSequence;
import android.graphics.Paint$FontMetricsInt;
import android.text.TextPaint;

public final class lo1 implements LineHeightSpan$WithDensity	// class@001d8e from classes.dex
{
    public final int a;

    public void lo1(int p0){
       this.a = p0;
    }
    public final void chooseHeight(CharSequence p0,int p1,int p2,int p3,int p4,Paint$FontMetricsInt p5){
       this.chooseHeight(p0, p1, p2, p3, p4, p5, null);
    }
    public final void chooseHeight(CharSequence p0,int p1,int p2,int p3,int p4,Paint$FontMetricsInt p5,TextPaint p6){
       if (p5 != null) {
          Paint$FontMetricsInt descent = p5.descent;
          Paint$FontMetricsInt ascent = p5.ascent;
          p3 = this.a - (descent - ascent);
          p2 = p3 % 2;
          p3 = p3 / 2;
          ascent = ascent - p3;
          p5.ascent = ascent;
          p5.top = ascent;
          p3 = (p3 + p2) + descent;
          p5.descent = p3;
          p5.bottom = p3;
       }
       return;
    }
}
