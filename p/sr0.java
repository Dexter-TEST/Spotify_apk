package p.sr0;
import p.tr0;
import android.content.ClipData;
import java.lang.Object;
import android.view.ContentInfo$Builder;
import android.net.Uri;
import p.rr0;
import p.wr0;
import p.u44;
import android.view.ContentInfo;
import p.vr0;
import android.os.Bundle;

public final class sr0 implements tr0	// class@002682 from classes.dex
{
    public final ContentInfo$Builder a;

    public void sr0(ClipData p0,int p1){
       super();
       this.a = new ContentInfo$Builder(p0, p1);
    }
    public final void a(Uri p0){
       rr0.j(this.a, p0);
    }
    public final wr0 build(){
       return new wr0(new u44(rr0.e(this.a)));
    }
    public final void setExtras(Bundle p0){
       rr0.k(this.a, p0);
    }
    public final void setFlags(int p0){
       rr0.i(this.a, p0);
    }
}
