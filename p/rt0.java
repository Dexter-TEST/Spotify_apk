package p.rt0;
import android.view.View$OnClickListener;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import java.lang.Object;
import android.view.View;
import p.ab7;
import java.lang.Class;
import p.n91;
import p.eb4;
import p.ob7;
import p.kb7;
import p.fb7;
import p.ib7;
import java.util.HashMap;
import java.lang.String;
import p.gb7;
import p.pb7;
import p.nb3;
import p.ds3;
import p.mb3;
import p.vt0;
import p.co5;
import p.m26;
import p.jk0;
import p.kf6;
import p.ut0;
import p.b5;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.Completable;
import p.fd1;
import p.vx5;

public final class rt0 implements View$OnClickListener	// class@002551 from classes.dex
{
    public final int a;
    public final ContextualAudioFragment b;

    public void rt0(ContextualAudioFragment p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       ContextualAudioFragment v;
       ab7 b;
       ob7 oob7;
       HashMap hashMap;
       String str4;
       mb3 a;
       vt0 ovt0;
       String str = "MIX_ID";
       void ovoid = null;
       n91 String str1 = "logger";
       String str2 = "destination";
       String str3 = "";
       rt0 tb = this.b;
       switch (this.a){
           case 0:
             if ((v = tb.v) != null) {
                b = v.b;
                b.getClass();
                str1 = new n91(b);
                oob7 = new ob7();
                oob7.c(str1.b);
                oob7.b = str1.c.a;
                hashMap = new HashMap();
                if ((str4 = str3.toString()) == null) {
                   str4 = str3;
                }
                hashMap.put(str2, str4);
                oob7.d = new ib7(1, "ui_navigate", "hit", hashMap);
                a = v.a.b(oob7.a()).a.a;
                ovt0 = tb.u();
                co5.o(a, "interactionID");
                if ((str = ovt0.t.b(str)) != null) {
                   str3 = str;
                }
             }else {
                co5.N(str1);
                throw ovoid;
             }
             break;
           default:
             if ((v = tb.v) != null) {
                b = v.b;
                b.getClass();
                vx5 str11 = new vx5(b);
                oob7 = new ob7();
                oob7.c(str11.b);
                oob7.b = str11.c.a;
                hashMap = new HashMap();
                if ((str4 = str3.toString()) == null) {
                   str4 = str3;
                }
                hashMap.put(str2, str4);
                oob7.d = new ib7(1, "ui_navigate", "hit", hashMap);
                v.a.b(oob7.a());
                vt0 ovt01 = tb.u();
                if ((str = ovt01.t.b(str)) == null) {
                   str = str3;
                }
                ovt01.z.a(ovt01.v.e(str, str3, 0).subscribe(new ut0(ovt01, 1)));
                return;
             }else {
                co5.N(str1);
                throw ovoid;
             }
       }
       ovt0.z.a(ovt0.v.e(str3, a, 1).subscribe(new ut0(ovt0, 0)));
       return;
    }
}
