package p.jf3;
import java.lang.Object;
import java.lang.String;
import java.io.StringWriter;
import p.wg3;
import java.io.Writer;
import com.google.gson.internal.bind.a;
import com.google.gson.b;
import java.lang.AssertionError;

public abstract class jf3	// class@001ac5 from classes.dex
{

    public void jf3(){
       super();
    }
    public final String toString(){
       try{
          StringWriter stringWriter = new StringWriter();
          wg3 owg3 = new wg3(stringWriter);
          owg3.v = true;
          a.y.c(owg3, this);
          return stringWriter.toString();
       }catch(java.io.IOException e0){
          throw new AssertionError(e0);
       }
    }
}
