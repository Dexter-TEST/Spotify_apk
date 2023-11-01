package p.v17;
import java.lang.String;
import java.lang.Class;

public abstract class v17	// class@002964 from classes.dex
{
    public static final boolean a;

    static {
       boolean b;
       try{
          Class.forName("org.robolectric.Robolectric");
          b = true;
       }catch(java.lang.Exception e0){
          b = false;
       }
       v17.a = b;
    }
}
