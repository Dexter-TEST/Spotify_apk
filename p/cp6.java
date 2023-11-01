package p.cp6;
import java.lang.Object;
import p.ef6;
import java.lang.String;
import android.net.Uri;
import p.co5;

public final class cp6	// class@001253 from classes.dex
{
    public final ef6 a;

    public void cp6(){
       super();
       this.a = new ef6();
    }
    public final boolean a(String p0){
       Uri uri;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!this.a.a(p0)) {
          try{
             uri = Uri.parse(p0);
             uri = (uri.isHierarchical() && (co5.c(uri.getScheme(), "spotify") && uri.getQueryParameter("_branch_referrer") != null))? 1: 0;
          }catch(java.lang.UnsupportedOperationException e0){
          }
          if (!uri) {
          label_0031 :
             return b;
          }
       }
       b = true;
       goto label_0031 ;
    }
}
