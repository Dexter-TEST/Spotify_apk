package p.h3;
import java.lang.Object;
import java.lang.String;

public final class h3	// class@0017d7 from classes.dex
{
    public final String a;
    public final String b;

    public void h3(int p0){
       if (p0 != 1) {
          super();
          this.a = "oauth/access_token";
          this.b = "fb_extend_sso_token";
          return;
       }else {
          super();
          this.a = "refresh_access_token";
          this.b = "ig_refresh_token";
          return;
       }
    }
    public void h3(String p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
}
