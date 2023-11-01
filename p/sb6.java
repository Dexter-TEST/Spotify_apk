package p.sb6;
import java.lang.Object;
import org.json.JSONObject;

public final class sb6	// class@0025f9 from classes.dex
{
    public final int a;
    public Object b;

    public void sb6(int p0){
       super();
       this.a = p0;
    }
    public final JSONObject a(){
       sb6 tb = this.b;
       if (tb instanceof JSONObject) {
          return tb;
       }
       return new JSONObject();
    }
}
