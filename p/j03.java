package p.j03;
import p.k03;
import p.c33;
import p.xz5;
import java.lang.Class;
import android.content.Context;
import android.view.ViewGroup;
import p.uu2;
import p.zk2;
import p.qz5;
import p.ju2;
import java.lang.CharSequence;
import p.eo5;
import android.text.TextUtils;
import p.au2;
import java.lang.String;
import java.lang.Object;
import p.io2;
import android.widget.TextView;
import android.view.View;
import p.o85;
import p.xj0;
import p.a06;

public class j03 extends k03	// class@001a3c from classes.dex
{
    public final boolean f;

    public void j03(c33 p0,boolean p1){
       super(p0, xz5.class);
       this.f = p1;
    }
    public zk2 f(Context p0,ViewGroup p1,uu2 p2){
       return this.j(p0, p1);
    }
    public void g(qz5 p0,ju2 p1){
       this.i(p0, p1);
    }
    public void i(xz5 p0,ju2 p1){
       p0.setTitle(eo5.m(p1));
       CharSequence uCharSequenc = eo5.l(p1);
       if (!TextUtils.isEmpty(uCharSequenc)) {
          String str = "";
          if (io2.j(p1.b().b("glue:subtitleStyle", str), "metadata")) {
             p0.e(uCharSequenc);
          }else {
             p0.setSubtitle(uCharSequenc);
          }
          TextView subtitleView = p0.getSubtitleView();
          String str1 = p1.b().q("label");
          Context context = subtitleView.getContext();
          if (str1 != null) {
             str = str1;
          }
          eo5.a(context, subtitleView, str);
       }else {
          p0.setSubtitle(null);
       }
       return;
    }
    public qz5 j(Context p0,ViewGroup p1){
       return this.k(p0, p1);
    }
    public xz5 k(Context p0,ViewGroup p1){
       int i = (this.f != null)? 0x7f0d00be: 0x7f0d00ba;
       a06 uoa06 = new a06(xj0.x0(p0, p1, i));
       eo5.P(uoa06);
       return uoa06;
    }
}
