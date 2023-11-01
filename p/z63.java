package p.z63;
import p.m73;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.String;
import com.google.common.collect.b;
import java.lang.AssertionError;
import java.lang.Object;
import p.xs5;
import p.bt5;
import java.util.Collection;
import p.y63;

public abstract class z63 extends m73	// class@002e97 from classes.dex
{

    public void z63(){
       super();
    }
    private void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("Use SerializedForm");
    }
    public final b e(){
       throw new AssertionError("should never be called");
    }
    public final b j(){
       m73 b;
       xs5 y = this.y;
       if ((b = y.b) == null) {
          b = y.d();
          y.b = b;
       }
       return b;
    }
    public final Collection values(){
       m73 b;
       xs5 y = this.y;
       if ((b = y.b) == null) {
          b = y.d();
          y.b = b;
       }
       return b;
    }
    public Object writeReplace(){
       return new y63(this);
    }
}
