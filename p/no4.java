package p.no4;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.HashSet;
import p.a61;
import java.lang.Object;
import p.n16;
import p.vx;
import p.ux1;
import p.mo4;
import p.ul5;
import p.so;
import p.wx1;
import p.cg1;
import p.z51;
import java.util.Iterator;
import p.s91;
import java.lang.annotation.Annotation;
import java.lang.Integer;
import java.util.Map;
import java.nio.ByteBuffer;
import java.lang.reflect.Modifier;
import java.util.logging.Level;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.lc7;
import java.nio.Buffer;

public abstract class no4	// class@00201a from classes.dex
{
    public static final Logger a;
    public static final HashMap b;

    static {
       Map map;
       no4.a = Logger.getLogger(no4.class.getName());
       no4.b = new HashMap();
       HashSet hashSet = new HashSet();
       hashSet.add(a61.class);
       hashSet.add(n16.class);
       hashSet.add(vx.class);
       hashSet.add(ux1.class);
       hashSet.add(mo4.class);
       hashSet.add(ul5.class);
       hashSet.add(so.class);
       hashSet.add(wx1.class);
       hashSet.add(cg1.class);
       hashSet.add(z51.class);
       Iterator iterator = hashSet.iterator();
       while (iterator.hasNext()) {
          Class uClass = iterator.next();
          s91 annotation = uClass.getAnnotation(s91.class);
          int[] ointArray = annotation.tags();
          int i = annotation.objectTypeIndication();
          if ((map = no4.b.get(Integer.valueOf(i))) == null) {
             map = new HashMap();
          }
          int len = ointArray.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             map.put(Integer.valueOf(ointArray[i1]), uClass);
          }
          no4.b.put(Integer.valueOf(i), map);
       }
    }
    public static vx a(ByteBuffer p0){
       int b;
       Map map;
       lc7 olc7;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       HashMap b1 = no4.b;
       int i = -1;
       if ((map = b1.get(Integer.valueOf(i))) == null) {
          map = b1.get(Integer.valueOf(i));
       }
       Class uClass = map.get(Integer.valueOf(b));
       Logger a = no4.a;
       if (uClass != null && (!uClass.isInterface() && !Modifier.isAbstract(uClass.getModifiers()))) {
          try{
             olc7 = uClass.newInstance();
          }catch(java.lang.Exception e6){
             a.log(Level.SEVERE, "Couldn\'t instantiate BaseDescriptor class "+uClass+" for objectTypeIndication -1 and tag "+b, e6);
             throw new RuntimeException(e6);
          }
       }else {
          a.warning("No ObjectDescriptor found for objectTypeIndication "+Integer.toHexString(i)+" and tag "+Integer.toHexString(b)+" found: "+uClass);
          olc7 = new lc7();
       }
       olc7.a = b;
       if ((b = p0.get()) < 0) {
          b = b + 256;
       }
       olc7.b = b & 0x7f;
       while ((b = b >> 7) == 1) {
          if ((b = p0.get()) < 0) {
             b = b + 256;
          }
          int i1 = olc7.b << 7;
          int i2 = b & 0x7f;
          i1 = i1 | i2;
          olc7.b = i1;
       }
       ByteBuffer uByteBuffer = p0.slice();
       uByteBuffer.limit(olc7.b);
       olc7.c = uByteBuffer.slice();
       p0.position((p0.position() + olc7.b));
       return olc7;
    }
}
