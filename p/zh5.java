package p.zh5;
import android.text.PrecomputedText$Params;
import java.lang.Object;
import android.text.TextPaint;
import p.l55;
import android.text.TextDirectionHeuristic;
import android.os.Build$VERSION;
import android.text.PrecomputedText$Params$Builder;
import android.graphics.Paint;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.LocaleList;
import p.zo4;
import p.v3;
import java.util.Locale;
import android.graphics.Typeface;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Boolean;
import p.yo4;
import java.lang.StringBuilder;
import p.aq3;

public final class zh5	// class@002efa from classes.dex
{
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public void zh5(PrecomputedText$Params p0){
       super();
       this.a = l55.g(p0);
       this.b = l55.f(p0);
       this.c = l55.a(p0);
       this.d = l55.w(p0);
    }
    public void zh5(TextPaint p0,TextDirectionHeuristic p1,int p2,int p3){
       super();
       if (Build$VERSION.SDK_INT >= 29) {
          new PrecomputedText$Params$Builder(p0).setBreakStrategy(p2).setHyphenationFrequency(p3).setTextDirection(p1).build();
       }
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       return;
    }
    public final boolean equals(Object p0){
       int sDK_INT;
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof zh5) {
          return false;
       }
       if ((sDK_INT = Build$VERSION.SDK_INT) < 23 || (this.c == p0.c && this.d == p0.d)) {
          zh5 ta = this.a;
          if (!(p0.a.getTextSize() - ta.getTextSize())) {
             zh5 a = p0.a;
             if (!(a.getTextScaleX() - ta.getTextScaleX()) && (!(a.getTextSkewX() - ta.getTextSkewX()) && (!(a.getLetterSpacing() - ta.getLetterSpacing()) && (TextUtils.equals(ta.getFontFeatureSettings(), a.getFontFeatureSettings()) && ta.getFlags() == a.getFlags())))) {
                if (sDK_INT >= 24) {
                   if (ta.A(zo4.e(a), zo4.e(ta))) {
                   }
                }else if(!ta.getTextLocale().equals(a.getTextLocale())){
                }
             }
          }
       }
       sDK_INT = 0;
       if (!sDK_INT) {
          return false;
       }else if(this.b != p0.b){
          return false;
       }else {
          return true;
       }
    }
    public final int hashCode(){
       Object[] objArray;
       zh5 ozh5 = this;
       zh5 d = ozh5.d;
       zh5 c = ozh5.c;
       zh5 b = ozh5.b;
       int i = 11;
       zh5 a = ozh5.a;
       if (Build$VERSION.SDK_INT >= 24) {
          objArray = new Object[i];
          objArray[0] = Float.valueOf(a.getTextSize());
          objArray[1] = Float.valueOf(a.getTextScaleX());
          objArray[2] = Float.valueOf(a.getTextSkewX());
          objArray[3] = Float.valueOf(a.getLetterSpacing());
          objArray[4] = Integer.valueOf(a.getFlags());
          objArray[5] = zo4.e(a);
          objArray[6] = a.getTypeface();
          objArray[7] = Boolean.valueOf(a.isElegantTextHeight());
          objArray[8] = b;
          objArray[9] = Integer.valueOf(c);
          objArray[10] = Integer.valueOf(d);
          return yo4.b(objArray);
       }else {
          objArray = new Object[i];
          objArray[0] = Float.valueOf(a.getTextSize());
          objArray[1] = Float.valueOf(a.getTextScaleX());
          objArray[2] = Float.valueOf(a.getTextSkewX());
          objArray[3] = Float.valueOf(a.getLetterSpacing());
          objArray[4] = Integer.valueOf(a.getFlags());
          objArray[5] = a.getTextLocale();
          objArray[6] = a.getTypeface();
          objArray[7] = Boolean.valueOf(a.isElegantTextHeight());
          objArray[8] = b;
          objArray[9] = Integer.valueOf(c);
          objArray[10] = Integer.valueOf(d);
          return yo4.b(objArray);
       }
    }
    public final String toString(){
       zh5 ta = this.a;
       int sDK_INT = Build$VERSION.SDK_INT;
       StringBuilder str = "{"+"textSize="+ta.getTextSize()+", textScaleX="+ta.getTextScaleX()+", textSkewX="+ta.getTextSkewX()+", letterSpacing="+ta.getLetterSpacing()+", elegantTextHeight="+ta.isElegantTextHeight();
       String str1 = ", textLocale=";
       str = (sDK_INT >= 24)? str+str1+zo4.e(ta): str+str1+ta.getTextLocale();
       str = str+", typeface="+ta.getTypeface();
       if (sDK_INT >= 26) {
          str = str+", variationSettings="+aq3.q(ta);
       }
       return str+", textDir="+this.b+", breakStrategy="+this.c+", hyphenationFrequency="+this.d+"}";
    }
}
