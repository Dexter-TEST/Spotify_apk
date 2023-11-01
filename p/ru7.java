package p.ru7;
import p.ca5;
import p.si4;
import p.ky;
import java.lang.Object;
import com.google.android.gms.common.api.Status;
import java.util.Map;

public final class ru7 implements ca5	// class@002561 from classes.dex
{
    public final BasePendingResult a;
    public final si4 b;

    public void ru7(si4 p0,ky p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void a(Status p0){
       this.b.a.remove(this.a);
    }
}
