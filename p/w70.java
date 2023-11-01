package p.w70;
import p.l14;
import java.lang.Object;
import android.net.Uri;
import p.r;
import java.lang.String;
import p.co5;
import java.util.List;
import p.dj0;
import p.vv7;
import java.lang.CharSequence;
import p.av6;
import java.util.Collection;

public final class w70 implements l14	// class@002adb from classes.dex
{
    public final int a;

    public void w70(int p0){
       this.a = p0;
       super();
    }
    public final boolean a(Uri p0){
       String scheme;
       boolean b = true;
       switch (this.a){
           case 1:
             String str = "file";
             int i = (co5.c(p0.getScheme(), str) && co5.c(dj0.l0(p0.getPathSegments()), "android_asset"))? 1: 0;
             if (!i) {
                scheme = ((scheme = p0.getScheme()) != null && !co5.c(scheme, str))? 0: 1;
                if (scheme) {
                   if ((scheme = p0.getPath()) == null) {
                      scheme = "";
                   }
                   scheme = (scheme.length() > 0 && vv7.q(scheme.charAt(0), '/', 0))? 1: 0;
                   if (!scheme || dj0.l0(p0.getPathSegments()) == null) {
                   label_006b :
                      b = false;
                   }
                }else {
                   goto label_006b ;
                }
             }else {
                goto label_006b ;
             }
             break;
           default:
             if (co5.c(p0.getScheme(), "android.resource")) {
                scheme = ((scheme = p0.getAuthority()) != null && !av6.p0(scheme))? 0: 1;
                if (!scheme && p0.getPathSegments().size() == 2) {
                label_0098 :
                   return b;
                }
             }
             b = false;
             goto label_0098 ;
       }
       return b;
    }
}
