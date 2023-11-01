package p.vg3;
import p.po4;
import p.ag7;
import java.io.Writer;
import java.util.HashMap;
import p.cf3;
import java.lang.Object;
import android.util.JsonWriter;
import java.lang.String;
import java.lang.Number;
import java.lang.Class;
import android.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import p.yl1;
import java.lang.ClassCastException;
import p.oo4;
import p.vl1;
import p.zf7;
import java.lang.Enum;
import java.lang.IllegalStateException;

public final class vg3 implements po4, ag7	// class@0029ec from classes.dex
{
    public boolean a;
    public final JsonWriter b;
    public final Map c;
    public final Map d;
    public final oo4 e;
    public final boolean f;

    public void vg3(Writer p0,HashMap p1,HashMap p2,cf3 p3,boolean p4){
       super();
       this.a = true;
       this.b = new JsonWriter(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final vg3 a(int p0,String p1){
       this.e();
       vg3 tb = this.b;
       tb.name(p1);
       this.e();
       tb.value((long)p0);
       return this;
    }
    public final vg3 b(Object p0){
       int len;
       oo4 ooo4;
       zf7 ozf7;
       vg3 tb = this.b;
       if (p0 == null) {
          tb.nullValue();
          return this;
       }else if(p0 instanceof Number){
          tb.value(p0);
          return this;
       }else {
          int i = 0;
          int i1 = 2;
          if (p0.getClass().isArray()) {
             if (p0 instanceof byte[]) {
                this.e();
                tb.value(Base64.encodeToString(p0, i1));
                return this;
             }else {
                tb.beginArray();
                if (p0 instanceof int[]) {
                   len = p0.length;
                   for (; i < len; i = i + 1) {
                      tb.value((long)p0[i]);
                   }
                }else if(p0 instanceof long[]){
                   len = p0.length;
                   for (; i < len; i = i + 1) {
                      this.e();
                      tb.value(p0[i]);
                   }
                }else if(p0 instanceof double[]){
                   len = p0.length;
                   for (; i < len; i = i + 1) {
                      tb.value(p0[i]);
                   }
                }else if(p0 instanceof boolean[]){
                   len = p0.length;
                   for (; i < len; i = i + 1) {
                      tb.value(p0[i]);
                   }
                }else if(p0 instanceof Number[]){
                   len = p0.length;
                   for (; i < len; i = i + 1) {
                      this.b(p0[i]);
                   }
                }else {
                   len = p0.length;
                   for (; i < len; i = i + 1) {
                      this.b(p0[i]);
                   }
                }
                tb.endArray();
                return this;
             }
          }else if(p0 instanceof Collection){
             tb.beginArray();
             p0 = p0.iterator();
             while (p0.hasNext()) {
                this.b(p0.next());
             }
             tb.endArray();
             return this;
          }else if(p0 instanceof Map){
             tb.beginObject();
             p0 = p0.entrySet().iterator();
             while (p0.hasNext()) {
                Map$Entry uEntry = p0.next();
                Object key = uEntry.getKey();
                try{
                   this.c(uEntry.getValue(), key);
                }catch(java.lang.ClassCastException e7){
                   Object[] objArray = new Object[i1];
                   objArray[i] = key;
                   objArray[1] = key.getClass();
                   throw new yl1(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", objArray), e7);
                }
             }
             tb.endObject();
             return this;
          }else if((ooo4 = this.c.get(p0.getClass())) != null){
             tb.beginObject();
             ooo4.a(p0, this);
             tb.endObject();
             return this;
          }else if((ozf7 = this.d.get(p0.getClass())) != null){
             ozf7.a(p0, this);
             return this;
          }else if(p0 instanceof Enum){
             this.e();
             tb.value(p0.name());
             return this;
          }else {
             tb.beginObject();
             this.e.a(p0, this);
             tb.endObject();
             return this;
          }
       }
    }
    public final vg3 c(Object p0,String p1){
       vg3 tb = this.b;
       if (this.f != null) {
          if (p0 == null) {
             p0 = this;
          }else {
             this.e();
             tb.name(p1);
             p0 = this.b(p0);
          }
          return p0;
       }else {
          this.e();
          tb.name(p1);
          if (p0 == null) {
             tb.nullValue();
             p0 = this;
          }else {
             p0 = this.b(p0);
          }
          return p0;
       }
    }
    public final vg3 d(String p0,long p1){
       this.e();
       vg3 tb = this.b;
       tb.name(p0);
       this.e();
       tb.value(p1);
       return this;
    }
    public final void e(){
       if (this.a != null) {
          return;
       }
       throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
