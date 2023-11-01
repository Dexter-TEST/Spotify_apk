package p.xa6;
import java.io.Externalizable;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.io.ObjectInput;
import java.io.DataInput;
import p.ec6;
import p.a14;
import java.io.InvalidObjectException;
import java.lang.StringBuilder;
import p.hl3;
import p.ye7;
import java.io.ObjectOutput;
import java.io.DataOutput;
import java.util.Iterator;

public final class xa6 implements Externalizable	// class@002c3d from classes.dex
{
    public Collection a;
    public final int b;

    public void xa6(int p0,Collection p1){
       co5.o(p1, "collection");
       super();
       this.a = p1;
       this.b = p0;
    }
    private final Object readResolve(){
       return this.a;
    }
    public final void readExternal(ObjectInput p0){
       ec6 uoec6;
       co5.o(p0, "input");
       int b = p0.readByte();
       int i = b & 0x01;
       char c = '.';
       if ((b & 0xfe)) {
          throw new InvalidObjectException("Unsupported flags value: "+b+c);
       }
       if ((b = p0.readInt()) < 0) {
          throw new InvalidObjectException("Illegal size value: "+b+c);
       }
       int i1 = 0;
       if (i) {
          if (i == 1) {
             uoec6 = new ec6(new a14(b));
             for (; i1 < b; i1 = i1 + 1) {
                uoec6.add(p0.readObject());
             }
             co5.f(uoec6);
          }else {
             throw new InvalidObjectException("Unsupported collection type tag: "+i+c);
          }
       }else {
          uoec6 = new hl3(b);
          for (; i1 < b; i1 = i1 + 1) {
             uoec6.add(p0.readObject());
          }
          ye7.g(uoec6);
       }
       this.a = uoec6;
       return;
    }
    public final void writeExternal(ObjectOutput p0){
       co5.o(p0, "output");
       p0.writeByte(this.b);
       p0.writeInt(this.a.size());
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          p0.writeObject(iterator.next());
       }
       return;
    }
}
