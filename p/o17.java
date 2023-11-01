package p.o17;
import p.cr0;
import p.e63;
import p.ay6;
import p.wf2;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.i17;
import java.lang.CharSequence;
import p.tj2;
import p.xe7;
import p.j17;
import p.k17;
import p.l17;
import p.kf6;
import p.m17;
import p.lj2;
import android.view.View;
import android.app.Dialog;
import android.widget.TextView;
import p.r17;
import java.lang.StringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.text.Spanned;
import p.eb3;
import android.text.style.URLSpan;
import java.lang.Class;
import android.text.SpannableStringBuilder;
import p.q17;
import p.p17;
import p.n17;

public final class o17	// class@002091 from classes.dex
{
    public final Context a;
    public boolean b;
    public p17 c;
    public i17 d;
    public static final ay6 e;

    static {
       cr0 uocr0 = new cr0(1, 0);
       o17.e = new ay6(e63.z);
    }
    public void o17(Context p0){
       co5.o(p0, "context");
       super();
       this.a = p0;
       this.d = o17.e.getValue();
    }
    public static final void a(o17 p0,i17 p1){
       o17 a = p0.a;
       tj2 otj2 = xe7.k0(a, a.getString(R.string.terms_and_conditions_title_terms_and_conditions), a.getString(R.string.terms_and_conditions_text_decline));
       otj2.a = a.getString(R.string.terms_and_conditions_button_exit);
       otj2.c = new j17(0, p1);
       otj2.b = a.getString(R.string.terms_and_conditions_button_cancel);
       otj2.d = new k17(p0, p1, 0);
       otj2.f = new l17(p1);
       otj2.a().l();
    }
    public final void b(int p0,int p1,i17 p2){
       int i3;
       int i4;
       URLSpan[] spans;
       o17 ta = this.a;
       tj2 otj2 = xe7.k0(ta, ta.getString(p0), "");
       int i = 1;
       otj2.a = ta.getString(R.string.terms_and_conditions_button_accept);
       otj2.c = new j17(i, p2);
       otj2.b = ta.getString(R.string.terms_and_conditions_button_decline);
       otj2.d = new k17(this, p2, i);
       otj2.f = new m17(this, p2);
       kf6 okf6 = otj2.a();
       TextView textView = okf6.c.findViewById(R.id.body);
       co5.l(textView, "bodyTextView");
       String str = ta.getString(p1);
       co5.l(str, "context.getString\(body\)");
       StringBuilder str1 = new StringBuilder(str.length());
       Matcher matcher = r17.b.matcher(str);
       int i1 = 0;
       int i2 = 0;
       while (matcher.find()) {
          i3 = matcher.start();
          i4 = matcher.end();
          str1 = str1.append(str, i2, i3).append("<strong>").append(str, i3, i4).append("</strong>");
          i2 = i4;
       }
       str = str1+str;
       co5.l(str, "sb.toString\(\)");
       str = r17.a.matcher(str).replaceAll("com.spotify.mobile.android.tos:spotify:");
       co5.l(str, "COMPILE.matcher\(text\).re…BILE_ANDROID_TOS_SPOTIFY\)");
       textView.setMovementMethod(LinkMovementMethod.getInstance());
       Spanned spanned = eb3.k(str);
       co5.l(spanned, "html");
       if ((spans = spanned.getSpans(i1, spanned.length(), URLSpan.class)) != null) {
          matcher = (!spans.length)? 1: 0;
          if (!matcher) {
             i = 0;
          }
       }
       if (!i) {
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(spanned);
          co5.l(spans, "spans");
          i = spans.length;
          for (; i1 < i; i1 = i1 + 1) {
             object oobject = spans[i1];
             i3 = spanned.getSpanStart(oobject);
             i4 = spanned.getSpanEnd(oobject);
             int spanFlags = spanned.getSpanFlags(oobject);
             spannableStr.removeSpan(oobject);
             spannableStr.setSpan(new q17(oobject.getURL()), i3, i4, spanFlags);
          }
          spanned = spannableStr;
       }
       textView.setText(spanned);
       okf6.l();
       return;
    }
    public final void c(p17 p0,i17 p1){
       co5.o(p1, "acceptanceListener");
       this.c = p0;
       if (p0.a != null) {
          p1.b();
       }else if(p0.b != null){
          this.d(true, p1);
       }else if(this.b != null){
          this.b(R.string.terms_and_conditions_title_privacy_policy, 0x7f1203f3, p1);
       }else {
          this.d(false, new n17(this, p1));
       }
       return;
    }
    public final void d(boolean p0,i17 p1){
       o17 tc;
       int i;
       int i1;
       if ((tc = this.c) != null) {
          i = 1;
          if (tc.c == i) {
          label_000b :
             if (i) {
                i1 = 0x7f1203f5;
             }else if(p0){
                i1 = 0x7f1203ee;
             }else {
                i1 = 0x7f1203f4;
             }
             this.b(R.string.terms_and_conditions_title_terms_and_conditions, i1, p1);
             return;
          }
       }
       i = 0;
       goto label_000b ;
    }
}
