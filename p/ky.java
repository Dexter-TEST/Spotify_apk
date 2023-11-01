package p.ky;
import p.ly;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p.ko1;
import p.pt7;
import java.lang.NullPointerException;
import java.lang.String;
import p.bl2;
import com.google.android.gms.common.api.Status;
import p.w51;
import p.wx5;

public abstract class ky extends BasePendingResult implements ly	// class@001cac from classes.dex
{

    public void ky(ko1 p0,pt7 p1){
       if (p1 == null) {
          throw new NullPointerException("GoogleApiClient must not be null");
       }
       super(p1);
       if (p0 != null) {
          return;
       }
       throw new NullPointerException("Api must not be null");
    }
    public abstract void H(bl2 p0);
    public final void I(Status p0){
       int i = 1;
       int i1 = (p0.b <= null)? 1: 0;
       w51.d("Failed result must not be success", (i1 ^ i));
       this.G(this.D(p0));
       return;
    }
}
