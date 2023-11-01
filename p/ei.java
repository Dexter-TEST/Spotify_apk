package p.ei;
import java.lang.Object;
import android.text.StaticLayout$Builder;
import android.widget.TextView;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Method;
import p.fi;

public class ei	// class@001496 from classes.dex
{

    public void ei(){
       super();
    }
    public void a(StaticLayout$Builder p0,TextView p1){
    }
    public boolean b(TextView p0){
       String str = "getHorizontallyScrolling";
       Boolean fALSE = Boolean.FALSE;
       try{
          Object[] objArray = new Object[0];
          Object obj = fi.d(str).invoke(p0, objArray);
          return obj.booleanValue();
       }catch(java.lang.Exception e0){
       }
    }
}
