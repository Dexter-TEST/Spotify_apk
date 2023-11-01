package p.xh3;
import java.lang.Error;
import java.lang.String;
import java.lang.Throwable;

public final class xh3 extends Error	// class@002c79 from classes.dex
{

    public void xh3(){
       super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
    public void xh3(String p0,Throwable p1){
       super(p0, p1);
    }
}
