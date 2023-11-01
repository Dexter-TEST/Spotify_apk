package p.ya6;
import java.io.Externalizable;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.io.ObjectInput;
import java.io.DataInput;
import p.a14;
import java.io.InvalidObjectException;
import java.lang.StringBuilder;
import p.tp2;
import java.io.ObjectOutput;
import java.io.DataOutput;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class ya6 implements Externalizable	// class@002d7f from classes.dex
{
    public Map a;

    public void ya6(Map p0){
       co5.o(p0, "map");
       super();
       this.a = p0;
    }
    private final Object readResolve(){
       return this.a;
    }
    public final void readExternal(ObjectInput p0){
       int b;
       co5.o(p0, "input");
       if (b = p0.readByte()) {
          throw new InvalidObjectException(tp2.k("Unsupported flags value: ", b));
       }
       if ((b = p0.readInt()) < 0) {
          throw new InvalidObjectException("Illegal size value: "+b+'.');
       }
       a14 uoa14 = new a14(b);
       for (int i = 0; i < b; i = i + 1) {
          uoa14.put(p0.readObject(), p0.readObject());
       }
       uoa14.b();
       uoa14.C = true;
       this.a = uoa14;
       return;
    }
    public final void writeExternal(ObjectOutput p0){
       co5.o(p0, "output");
       p0.writeByte(0);
       p0.writeInt(this.a.size());
       Iterator iterator = this.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.writeObject(uEntry.getKey());
          p0.writeObject(uEntry.getValue());
       }
       return;
    }
}
