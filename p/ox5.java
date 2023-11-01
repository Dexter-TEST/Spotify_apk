package p.ox5;
import p.ux;
import p.au0;
import p.xw0;
import p.il1;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;

public abstract class ox5 extends ux	// class@0021ad from classes.dex
{

    public void ox5(au0 p0){
       super(p0);
       if (p0 != null) {
          int i = (p0.getContext() == il1.a)? 1: 0;
          if (!i) {
             throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
          }
       }
       return;
    }
    public final xw0 getContext(){
       return il1.a;
    }
}
