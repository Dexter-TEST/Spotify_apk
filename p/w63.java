package p.w63;
import com.google.common.collect.c;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.String;
import java.lang.Object;
import p.vs5;
import com.google.common.collect.f;
import java.lang.Class;
import p.v63;

public abstract class w63 extends c	// class@002ad5 from classes.dex
{

    public void w63(){
       super();
    }
    private void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("Use SerializedForm");
    }
    public final boolean contains(Object p0){
       return this.c.contains(p0);
    }
    public final boolean isEmpty(){
       this.c.getClass();
       return false;
    }
    public final boolean k(){
       this.c.getClass();
       return false;
    }
    public final int size(){
       return this.c.size();
    }
    public Object writeReplace(){
       return new v63(this.c);
    }
}
