package p.o60;
import android.content.res.Resources;
import java.lang.Object;
import p.rv;
import java.lang.String;
import p.co5;
import p.hl3;
import java.lang.StringBuilder;
import p.r45;
import java.lang.Integer;
import p.ye7;
import java.lang.Iterable;
import p.zf2;
import p.dj0;
import com.spotify.base.java.logging.Logger;

public final class o60	// class@0020b7 from classes.dex
{
    public final Resources a;

    public void o60(Resources p0){
       super();
       this.a = p0;
    }
    public final void a(rv p0){
       rv c;
       co5.o(p0, "configuration");
       hl3 ohl3 = new hl3();
       ohl3.add("infoText="+p0.a);
       Integer integer = p0.b.f();
       o60 ta = this.a;
       if (integer != null && integer.intValue()) {
          ohl3.add("infoTextResId="+ta.getResourceName(integer.intValue()));
          ohl3.add("infoTextResContent="+ta.getString(integer.intValue()));
       }else {
          ohl3.add("infoTextRes=null");
       }
       if ((c = p0.c) == null) {
          c = "";
       }
       ohl3.add("actionText=".concat(c));
       if ((integer = p0.d.f()) != null && integer.intValue()) {
          ohl3.add("actionTextResourceId="+ta.getResourceName(integer.intValue()));
          ohl3.add("actionTextResourceContent="+ta.getString(integer.intValue()));
       }else {
          ohl3.add("actionTextResource=null");
       }
       String str = "hasOnClickListener=";
       boolean b = (p0.e != null)? true: false;
       ohl3.add(str+b);
       ye7.g(ohl3);
       Object[] objArray = new Object[0];
       Logger.a("Snackbar configuration: ".concat(dj0.q0(ohl3, ";", null, null, null, 62)), objArray);
       return;
    }
}
