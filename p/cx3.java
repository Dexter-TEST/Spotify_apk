package p.cx3;
import p.ax3;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import p.o26;
import java.lang.Object;
import p.ay6;
import p.wf2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.String;
import p.co5;
import androidx.appcompat.widget.AppCompatTextView;
import p.lo1;
import p.lw3;
import p.hz3;
import p.g37;
import p.q87;
import java.lang.CharSequence;
import android.widget.TextView;
import p.qw3;
import p.wh7;
import p.eh7;
import java.util.List;
import p.dj0;
import p.ow3;
import java.lang.Number;
import android.text.SpannableString;
import p.vv7;
import android.text.style.ForegroundColorSpan;

public final class cx3 extends LinearLayout implements ax3	// class@001296 from classes.dex
{
    public final AppCompatTextView a;
    public final AppCompatTextView b;
    public hz3 c;
    public g37 t;
    public final ay6 v;

    public void cx3(Context p0){
       super(p0, null, 0);
       this.v = new ay6(new o26(22, this));
       LayoutInflater.from(p0).inflate(R.layout.lyrics_cell, this);
       View view = this.findViewById(R.id.lyrics_text_view);
       co5.l(view, "findViewById\(R.id.lyrics_text_view\)");
       this.a = view;
       view = this.findViewById(R.id.translation_text_view);
       co5.l(view, "findViewById\(R.id.translation_text_view\)");
       this.b = view;
    }
    private final lo1 getEqualLineHeightSpan(){
       return this.v.getValue();
    }
    public final void a(lw3 p0,hz3 p1,g37 p2,int p3,q87 p4){
       qw3 b;
       ow3 oow3;
       cx3 tt;
       co5.o(p0, "line");
       co5.o(p1, "lyricsUIModel");
       co5.o(p2, "lyricViewLineSpec");
       co5.o(p4, "translationState");
       this.c = p1;
       this.t = p2;
       cx3 ta = this.a;
       ta.setText(p0.b);
       cx3 tc = this.c;
       void ovoid = null;
       String str = "uIModel";
       if (tc != null) {
          hz3 c = ((b = tc.a.b) != 2 && b != 3)? tc.b: tc.c;
          ta.setTextColor(c);
          if ((tc = this.c) != null) {
             eh7.j(ta, tc.a.v);
             if ((tc = this.c) != null) {
                if ((oow3 = dj0.l0(tc.a.c)) != null && (oow3 = oow3.b) != null) {
                   String str1 = dj0.m0(p3, oow3);
                }
                this.b.setVisibility(8);
                tc = this.t;
                str = "lyricTextViewLineSpec";
                if (tc != null) {
                   int i = tc.a.get(p3).intValue();
                   if ((tt = this.t) != null) {
                      ta.setHeight((i * tt.b));
                      SpannableString spannableStr = new SpannableString(ta.getText());
                      spannableStr.setSpan(this.getEqualLineHeightSpan(), 0, spannableStr.length(), 18);
                      ta.setText(spannableStr);
                      vv7.O(ta, this.getEqualLineHeightSpan().a);
                      ta.setLineSpacing(0, 0x3f800000);
                      return;
                   }else {
                      co5.N(str);
                      throw ovoid;
                   }
                }else {
                   co5.N(str);
                   throw ovoid;
                }
             }else {
                co5.N(str);
                throw ovoid;
             }
          }else {
             co5.N(str);
             throw ovoid;
          }
       }else {
          co5.N(str);
          throw ovoid;
       }
    }
    public final AppCompatTextView b(){
       return this.a;
    }
    public final AppCompatTextView getLyricsTextView(){
       return this.a;
    }
    public void setHighlightedState(int p0){
       cx3 tc;
       if (!p0) {
          return;
       }
       cx3 ta = this.a;
       SpannableString spannableStr = new SpannableString(ta.getText());
       if ((tc = this.c) != null) {
          spannableStr.setSpan(new ForegroundColorSpan(tc.b), 0, p0, 18);
          ta.setText(spannableStr);
          return;
       }else {
          co5.N("uIModel");
          throw null;
       }
    }
}
