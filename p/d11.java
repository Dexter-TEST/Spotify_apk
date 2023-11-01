package p.d11;
import p.mj7;
import android.os.Bundle;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.sz1;
import p.kg4;
import android.net.Uri;
import p.ej4;

public class d11	// class@0012b9 from classes.dex
{
    public Uri a;
    public static final mj7 b;

    static {
       d11.b = new mj7(5, 0);
    }
    public void d11(Bundle p0,String p1){
       Uri uri;
       super();
       if (p0 == null) {
          p0 = new Bundle();
       }
       if (co5.c(p1, "context_choose")) {
          Object[] objArray = new Object[]{"fb.gg"};
          uri = ej4.e(p0, kg4.q(objArray, 1, "%s", "java.lang.String.format\(format, *args\)"), co5.K(p1, "/dialog/"));
       }else {
          uri = d11.b.h(p0, p1);
       }
       this.a = uri;
       return;
    }
}
