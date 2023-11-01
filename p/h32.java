package p.h32;
import p.tm5;
import p.tu1;
import android.content.Context;
import p.vg0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.g32;
import p.ws6;
import p.uc;

public final class h32	// class@0017d1 from classes.dex
{
    public final tm5 a;
    public final tu1 b;
    public final Context c;
    public final vg0 d;

    public void h32(tm5 p0,tu1 p1,Context p2,vg0 p3){
       co5.o(p0, "properties");
       co5.o(p1, "eventPublisher");
       co5.o(p2, "context");
       co5.o(p3, "clientInfo");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final g32 a(String p0){
       return new g32(new ws6(this.b, p0), this.a.get().a(), this.c, this.d);
    }
}
