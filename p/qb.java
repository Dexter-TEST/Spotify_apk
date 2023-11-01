package p.qb;
import p.pb;
import p.y37;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.LinkedHashMap;
import p.f55;
import p.b47;
import p.md;
import p.a47;
import p.ld;
import java.util.Map;

public final class qb implements pb	// class@002370 from classes.dex
{
    public final y37 a;
    public final LinkedHashMap b;

    public void qb(y37 p0){
       co5.o(p0, "timeKeeper");
       super();
       this.a = p0;
       this.b = new LinkedHashMap();
    }
    public final void a(f55 p0){
       b47 uob47;
       p0.toString();
       qb tb = this.b;
       if ((uob47 = tb.get("allboarding_initial_load")) != null) {
          uob47.c("allboarding_initial_load");
          uob47.a("outcome", p0.a);
          this.a.b(uob47.b());
       }
       tb.remove("allboarding_initial_load");
       return;
    }
    public final void b(String p0,f55 p1){
       b47 uob47;
       co5.o(p0, "itemUri");
       p1.toString();
       qb tb = this.b;
       if ((uob47 = tb.get("allboarding_load_more_".concat(p0))) != null) {
          uob47.c("allboarding_load_more");
          uob47.a("outcome", p1.a);
          this.a.b(uob47.b());
       }
       tb.remove("allboarding_load_more_".concat(p0));
       return;
    }
    public final void c(f55 p0){
       b47 uob47;
       p0.toString();
       qb tb = this.b;
       if ((uob47 = tb.get("allboarding_post")) != null) {
          uob47.c("allboarding_post");
          uob47.a("outcome", p0.a);
          this.a.b(uob47.b());
       }
       tb.remove("allboarding_post");
       return;
    }
}
