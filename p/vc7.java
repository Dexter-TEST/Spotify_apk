package p.vc7;
import android.text.Spannable;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.SpannableString;
import android.os.Build$VERSION;
import p.gg1;
import p.uc7;
import java.util.stream.IntStream;
import p.zo4;
import android.text.Spanned;
import java.lang.Class;
import java.lang.String;

public final class vc7 implements Spannable	// class@0029c9 from classes.dex
{
    public boolean a;
    public Spannable b;

    public void vc7(Spannable p0){
       super();
       this.a = false;
       this.b = p0;
    }
    public void vc7(CharSequence p0){
       super();
       this.a = false;
       this.b = new SpannableString(p0);
    }
    public final void a(){
       vc7 tb = this.b;
       if (this.a == null) {
          gg1 ogg1 = (Build$VERSION.SDK_INT < 28)? new gg1(11): new uc7();
          if (ogg1.N(tb)) {
             this.b = new SpannableString(tb);
          }
       }
       this.a = true;
       return;
    }
    public final char charAt(int p0){
       return this.b.charAt(p0);
    }
    public final IntStream chars(){
       return zo4.q(this.b);
    }
    public final IntStream codePoints(){
       return zo4.D(this.b);
    }
    public final int getSpanEnd(Object p0){
       return this.b.getSpanEnd(p0);
    }
    public final int getSpanFlags(Object p0){
       return this.b.getSpanFlags(p0);
    }
    public final int getSpanStart(Object p0){
       return this.b.getSpanStart(p0);
    }
    public final Object[] getSpans(int p0,int p1,Class p2){
       return this.b.getSpans(p0, p1, p2);
    }
    public final int length(){
       return this.b.length();
    }
    public final int nextSpanTransition(int p0,int p1,Class p2){
       return this.b.nextSpanTransition(p0, p1, p2);
    }
    public final void removeSpan(Object p0){
       this.a();
       this.b.removeSpan(p0);
    }
    public final void setSpan(Object p0,int p1,int p2,int p3){
       this.a();
       this.b.setSpan(p0, p1, p2, p3);
    }
    public final CharSequence subSequence(int p0,int p1){
       return this.b.subSequence(p0, p1);
    }
    public final String toString(){
       return this.b.toString();
    }
}
