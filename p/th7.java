package p.th7;
import android.view.OnReceiveContentListener;
import p.k25;
import java.lang.Object;
import android.view.View;
import android.view.ContentInfo;
import p.wr0;
import p.u44;
import p.vr0;
import p.h37;
import java.util.Objects;

public final class th7 implements OnReceiveContentListener	// class@002773 from classes.dex
{
    public final k25 a;

    public void th7(k25 p0){
       super();
       this.a = p0;
    }
    public final ContentInfo onReceiveContent(View p0,ContentInfo p1){
       wr0 owr01;
       wr0 owr0 = new wr0(new u44(p1));
       if ((owr01 = this.a.a(p0, owr0)) == null) {
          return null;
       }
       if (owr01 == owr0) {
          return p1;
       }
       ContentInfo uContentInfo = owr01.a.k();
       Objects.requireNonNull(uContentInfo);
       return uContentInfo;
    }
}
