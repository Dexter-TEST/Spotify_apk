package p.ci;
import p.ei;
import android.text.StaticLayout$Builder;
import android.widget.TextView;
import android.text.TextDirectionHeuristics;
import java.lang.String;
import java.lang.reflect.Method;
import p.fi;
import java.lang.Object;
import android.text.TextDirectionHeuristic;
import p.eh;

public class ci extends ei	// class@001216 from classes.dex
{

    public void ci(){
       super();
    }
    public void a(StaticLayout$Builder p0,TextView p1){
       String str = "getTextDirectionHeuristic";
       TextDirectionHeuristic fIRSTSTRONG_ = TextDirectionHeuristics.FIRSTSTRONG_LTR;
       try{
          Object[] objArray = new Object[0];
          Object obj = fi.d(str).invoke(p1, objArray);
          eh.w(p0, obj);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
