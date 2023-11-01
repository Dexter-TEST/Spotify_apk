package p.of;
import java.lang.Runnable;
import android.content.Context;
import java.lang.Object;
import android.os.Build$VERSION;
import android.content.ComponentName;
import java.lang.String;
import android.content.pm.PackageManager;
import p.w51;
import p.rf;
import java.lang.Class;
import p.lk;
import p.sk;
import p.b93;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import p.jg;
import android.os.LocaleList;
import p.qf;
import p.br3;
import p.er3;
import p.dr3;
import p.ej4;
import p.pf;

public final class of implements Runnable	// class@002111 from classes.dex
{
    public final Context a;

    public void of(Context p0){
       this.a = p0;
    }
    public final void run(){
       rf orf;
       jg b;
       String systemServic;
       br3 uobr3;
       Object systemServic1;
       if (Build$VERSION.SDK_INT >= 33) {
          of ta = this.a;
          ComponentName uComponentNa = new ComponentName(ta, "androidx.appcompat.app.AppLocalesMetadataHolderService");
          if (ta.getPackageManager().getComponentEnabledSetting(uComponentNa) != 1) {
             String str = "locale";
             if (w51.D()) {
                sk x = rf.x;
                x.getClass();
                lk olk = new lk(x);
                while (true) {
                   if (olk.hasNext()) {
                      if ((orf = olk.next().get()) != null && (b = orf.B) != null) {
                         systemServic = b.getSystemService(str);
                      }
                   }else {
                      systemServic = null;
                   }
                   if (systemServic != null) {
                      uobr3 = new br3(new er3(qf.a(systemServic)));
                   }else {
                      uobr3 = br3.b;
                   }
                }
             }else if((uobr3 = rf.c) != null){
             }
             if (uobr3.a.isEmpty()) {
                systemServic = ej4.G0(ta);
                if ((systemServic1 = ta.getSystemService(str)) != null) {
                   qf.b(systemServic1, pf.a(systemServic));
                }
             }
             ta.getPackageManager().setComponentEnabledSetting(uComponentNa, 1, 1);
          }
       }
       rf.w = true;
       return;
    }
}
