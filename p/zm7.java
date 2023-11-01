package p.zm7;
import p.km7;
import p.bn7;
import androidx.fragment.app.k;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import p.co5;
import p.ct3;
import p.bv3;
import p.rm7;
import android.os.BaseBundle;
import java.lang.Enum;
import android.content.Context;
import p.mm7;
import java.lang.NullPointerException;

public final class zm7 extends km7	// class@002f29 from classes.dex
{
    public String e;
    public ct3 f;
    public bv3 g;
    public boolean h;
    public boolean i;
    public String j;
    public String k;

    public void zm7(bn7 p0,k p1,String p2,Bundle p3){
       co5.o(p0, "this$0");
       co5.o(p2, "applicationId");
       super(p1, p2, p3, 0);
       this.e = "fbconnect://success";
       this.f = ct3.x;
       this.g = bv3.b;
    }
    public final rm7 a(){
       km7 td;
       km7 ta;
       if ((td = this.d) == null) {
          throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
       }
       td.putString("redirect_uri", this.e);
       td.putString("client_id", this.b);
       zm7 tj = this.j;
       rm7 orm7 = null;
       String str = "e2e";
       if (tj != null) {
          td.putString(str, tj);
          String str1 = (this.g == bv3.c)? "token,signed_request,graph_domain,granted_scopes": "token,signed_request,graph_domain";
          td.putString("response_type", str1);
          str = "true";
          td.putString("return_scopes", str);
          if ((tj = this.k) != null) {
             td.putString("auth_type", tj);
             td.putString("login_behavior", this.f.name());
             if (this.h != null) {
                td.putString("fx_app", this.g.a);
             }
             if (this.i != null) {
                td.putString("skip_dedupe", str);
             }
             if ((ta = this.a) != null) {
                zm7 tg = this.g;
                co5.o(tg, "targetApp");
                rm7.b(ta);
                rm7 v6 = new rm7(ta, "oauth", td, tg, this.c);
                return v6;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
             }
          }else {
             co5.N("authType");
             throw orm7;
          }
       }else {
          co5.N(str);
          throw orm7;
       }
    }
}
