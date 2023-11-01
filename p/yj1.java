package p.yj1;
import android.widget.TextView;
import java.lang.Object;
import p.xj1;
import java.lang.NullPointerException;
import java.lang.String;

public final class yj1	// class@002dca from classes.dex
{
    public final gg1 a;

    public void yj1(TextView p0){
       super();
       if (p0 == null) {
          throw new NullPointerException("textView cannot be null");
       }
       this.a = new xj1(p0);
       return;
    }
}
