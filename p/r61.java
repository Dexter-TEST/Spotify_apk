package p.r61;
import android.content.Context;
import p.g63;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.net.Uri;
import p.li0;
import p.l63;

public final class r61	// class@002483 from classes.dex
{
    public final Context a;
    public final g63 b;

    public void r61(Context p0,g63 p1){
       co5.o(p0, "context");
       co5.o(p1, "coilImageLoader");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final li0 a(Uri p0){
       l63 ol63 = new l63(this.a);
       ol63.c = p0;
       return new li0(this.b, ol63);
    }
}
