package p.q17;
import android.text.style.URLSpan;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import p.co5;
import android.content.Context;
import p.hj3;
import p.m11;
import java.lang.Integer;
import p.zq7;
import android.content.Intent;
import p.li5;
import android.net.Uri;

public final class q17 extends URLSpan	// class@002314 from classes.dex
{

    public void q17(String p0){
       super(p0);
    }
    public final void onClick(View p0){
       co5.o(p0, "widget");
       Context context = p0.getContext();
       co5.l(context, "context");
       String uRL = this.getURL();
       co5.l(uRL, "url");
       hj3 ohj3 = new hj3(context, uRL);
       context = (ohj3.b == 1)? 1: 0;
       m11 context1 = new m11();
       context1.b.a = Integer.valueOf(0xff000000);
       context1.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
       context1.a().h(p0.getContext(), Uri.parse(ohj3.a));
       return;
    }
}
