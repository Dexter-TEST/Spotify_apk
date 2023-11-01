package p.ve;
import java.lang.Exception;
import com.google.android.gms.common.api.Status;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class ve extends Exception	// class@0029df from classes.dex
{
    public final Status a;

    public void ve(Status p0){
       Status c;
       Status b = p0.b;
       if ((c = p0.c) != null) {
       }else {
          c = "";
       }
       super(new StringBuilder((String.valueOf(c).length() + 13))+b+": "+c);
       this.a = p0;
       return;
    }
}
