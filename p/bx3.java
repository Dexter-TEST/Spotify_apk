package p.bx3;
import p.ax3;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import p.co5;
import androidx.appcompat.widget.AppCompatTextView;
import p.lw3;
import p.hz3;
import p.g37;
import p.q87;
import java.lang.CharSequence;
import android.widget.TextView;
import p.qw3;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import p.a37;
import p.er;
import p.vv7;
import java.lang.NullPointerException;
import p.wh7;
import p.eh7;
import java.util.List;
import p.dj0;
import p.ow3;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

public final class bx3 extends LinearLayout implements ax3	// class@001153 from classes.dex
{
    public final AppCompatTextView a;
    public final AppCompatTextView b;
    public final LinearLayout c;
    public hz3 t;

    public void bx3(Context p0){
       super(p0, null, 0);
       LayoutInflater.from(p0).inflate(R.layout.lyrics_cell_new_font, this);
       View view = this.findViewById(R.id.lyrics_cell_root);
       co5.l(view, "findViewById\(R.id.lyrics_cell_root\)");
       this.c = view;
       view = this.findViewById(R.id.lyrics_text_view);
       co5.l(view, "findViewById\(R.id.lyrics_text_view\)");
       this.a = view;
       view = this.findViewById(R.id.translation_text_view);
       co5.l(view, "findViewById\(R.id.translation_text_view\)");
       this.b = view;
    }
    public final void a(lw3 p0,hz3 p1,g37 p2,int p3,q87 p4){
       bx3 tt;
       qw3 b;
       ViewGroup$LayoutParams layoutParams1;
       ow3 oow3;
       co5.o(p0, "line");
       co5.o(p1, "lyricsUIModel");
       co5.o(p2, "lyricViewLineSpec");
       co5.o(p4, "translationState");
       this.t = p1;
       bx3 ta = this.a;
       ta.setText(p0.b);
       if ((tt = this.t) != null) {
          hz3 c = ((b = tt.a.b) != 2 && b != 3)? tt.b: tt.c;
          ta.setTextColor(c);
          if (p1.j != null) {
             tt = this.c;
             ViewGroup$LayoutParams layoutParams = tt.getLayoutParams();
             String str = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
             if (layoutParams != null) {
                int i = -1;
                layoutParams.height = i;
                tt.setLayoutParams(layoutParams);
                if ((layoutParams1 = ta.getLayoutParams()) != null) {
                   layoutParams1.height = i;
                   ta.setLayoutParams(layoutParams1);
                   ta.setPadding(0, 0, 0, 0);
                   ta.setGravity(17);
                   int i1 = 1;
                   if (Build$VERSION.SDK_INT >= 27) {
                      a37.f(ta, 8, 18, i1, 2);
                   }else {
                      ta.setAutoSizeTextTypeUniformWithConfiguration(8, 18, i1, 2);
                   }
                   vv7.Q(ta, R.style.TextAppearance.Encore.Cello);
                }else {
                   throw new NullPointerException(str);
                }
             }else {
                throw new NullPointerException(str);
             }
          }
          if ((tt = this.t) != null) {
             eh7.j(ta, tt.a.v);
             if ((tt = this.t) != null) {
                if ((oow3 = dj0.l0(tt.a.c)) != null && (oow3 = oow3.b) != null) {
                   String str1 = dj0.m0(p3, oow3);
                }
                this.b.setVisibility(8);
                return;
             }else {
                co5.N("uIModel");
                throw null;
             }
          }else {
             co5.N("uIModel");
             throw null;
          }
       }else {
          co5.N("uIModel");
          throw null;
       }
    }
    public final AppCompatTextView b(){
       return this.a;
    }
    public void setHighlightedState(int p0){
       bx3 tt;
       if (!p0) {
          return;
       }
       bx3 ta = this.a;
       SpannableString spannableStr = new SpannableString(ta.getText());
       if ((tt = this.t) != null) {
          spannableStr.setSpan(new ForegroundColorSpan(tt.b), 0, p0, 18);
          ta.setText(spannableStr);
          return;
       }else {
          co5.N("uIModel");
          throw null;
       }
    }
}
