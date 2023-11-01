package p.cf4;
import java.lang.Object;
import java.util.TreeSet;
import java.lang.Boolean;
import p.co5;
import p.df4;
import p.bf4;
import android.content.Context;
import p.sz1;
import android.content.pm.ApplicationInfo;
import java.lang.String;

public abstract class cf4	// class@0011f8 from classes.dex
{
    public TreeSet a;

    public void cf4(){
       super();
    }
    public synchronized final void a(boolean p0){
       cf4 ta;
       if (p0 || ((ta = this.a) == null || !co5.c(Boolean.valueOf(ta.isEmpty()), Boolean.FALSE))) {
          this.a = df4.a(this);
       }
       ta = this.a;
       int i = 1;
       ArrayList a = (ta != null && !ta.isEmpty())? 0: 1;
       if (ta) {
          switch (this.b){
              case 2:
                if (sz1.a().getApplicationInfo().targetSdkVersion < 30) {
                   i = 0;
                }
                if (i) {
                   a = df4.a;
                }
                break;
              default:
          }
       }
       return;
    }
    public abstract String b();
}
