package p.cb6;
import p.ua6;
import java.io.Serializable;
import p.og3;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Class;

public final class cb6 implements ua6, Serializable	// class@0011d6 from classes.dex
{
    public final String a;
    public String b;

    static {
    }
    public void cb6(String p0){
       super();
       if (p0 == null) {
          throw new IllegalStateException("Null String illegal for SerializedString");
       }
       this.a = p0;
       return;
    }
    private void readObject(ObjectInputStream p0){
       this.b = p0.readUTF();
    }
    private void writeObject(ObjectOutputStream p0){
       p0.writeUTF(this.a);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 != null && p0.getClass() == cb6.class) {
          return this.a.equals(p0.a);
       }
       return false;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public Object readResolve(){
       return new cb6(this.b);
    }
    public final String toString(){
       return this.a;
    }
}
