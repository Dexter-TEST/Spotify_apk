package p.ik;
import p.i1;
import p.dk0;
import java.lang.String;
import p.w51;
import java.io.ObjectInputStream;
import java.util.Collection;
import p.ck0;
import java.util.Iterator;
import java.lang.Object;
import p.ap5;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import p.n1;
import p.o1;
import p.q1;
import java.io.ObjectOutputStream;
import p.l1;
import java.util.Set;
import p.j1;
import java.util.Map$Entry;

public final class ik extends i1	// class@0019b3 from classes.dex
{
    public int v;

    public void ik(){
       super(new dk0(0));
       w51.h(3, "expectedValuesPerKey");
       this.v = 3;
    }
    private void readObject(ObjectInputStream p0){
       int i1;
       int i2;
       Collection uCollection1;
       p0.defaultReadObject();
       this.v = 3;
       int i = p0.readInt();
       dk0 uodk0 = new dk0();
       this.c = uodk0;
       this.t = 0;
       Iterator iterator = uodk0.values().iterator();
       while (iterator.hasNext()) {
          Collection uCollection = iterator.next();
          i1 = uCollection.isEmpty() ^ 0x01;
          ap5.e(i1);
          i2 = uCollection.size() + this.t;
          this.t = i2;
       }
       int i3 = 0;
       while (i3 < i) {
          Object obj = p0.readObject();
          if ((uCollection1 = this.c.get(obj)) == null) {
             uCollection1 = new ArrayList(this.v);
          }
          o1 oo1 = null;
          n1 on1 = (uCollection1 instanceof RandomAccess)? new n1(this, obj, uCollection1, oo1): new q1(this, obj, uCollection1, oo1);
          i2 = p0.readInt();
          for (i1 = 0; i1 < i2; i1 = i1 + 1) {
             on1.add(p0.readObject());
          }
          i3 = i3 + 1;
       }
       return;
    }
    private void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeInt(this.a().size());
       Iterator iterator = this.a().a().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.writeObject(uEntry.getKey());
          p0.writeInt(uEntry.getValue().size());
          Iterator iterator1 = uEntry.getValue().iterator();
          while (iterator1.hasNext()) {
             p0.writeObject(iterator1.next());
          }
       }
       return;
    }
}
