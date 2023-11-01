package com.spotify.eventsender.eventsender.EventSenderDatabase_Impl;
import com.spotify.eventsender.eventsender.EventSenderDatabase;
import p.vc3;
import java.util.HashMap;
import java.lang.String;
import p.xy5;
import p.o51;
import p.rw6;
import p.yy5;
import p.mq7;
import android.content.Context;
import p.ow6;
import p.pw6;
import p.qw6;
import java.util.LinkedHashMap;
import java.util.List;
import p.ka4;
import java.lang.Object;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Collections;
import p.aw1;
import p.lv1;
import p.uv1;
import p.qo5;
import p.mv1;

public final class EventSenderDatabase_Impl extends EventSenderDatabase	// class@0008ac from classes.dex
{
    public aw1 l;
    public mv1 m;
    public uv1 n;
    public qo5 o;

    public void EventSenderDatabase_Impl(){
       super();
    }
    public final void d(){
       throw null;
    }
    public final vc3 f(){
       String[] stringArray = new String[]{"Events","EventSequenceNumbers","RateLimitedEvents"};
       return new vc3(this, new HashMap(0), new HashMap(0), stringArray);
    }
    public final rw6 g(o51 p0){
       ow6 oow6 = pw6.a(p0.a);
       oow6.b = p0.b;
       oow6.c = new yy5(p0, new mq7(this, 11, 1), "c6ffea087c1eb57023f5bbcc2c41e2ce", "3d91887fb6006f9b1f27d9dd076d75bd");
       return p0.c.f(oow6.a());
    }
    public final List h(LinkedHashMap p0){
       ka4[] oka4Array = new ka4[0];
       return Arrays.asList(oka4Array);
    }
    public final Set j(){
       return new HashSet();
    }
    public final Map k(){
       HashMap hashMap = new HashMap();
       hashMap.put(aw1.class, Collections.emptyList());
       hashMap.put(lv1.class, Collections.emptyList());
       hashMap.put(uv1.class, Collections.emptyList());
       hashMap.put(qo5.class, Collections.emptyList());
       return hashMap;
    }
    public final lv1 t(){
       if (this.m != null) {
          return this.m;
       }
       _monitor_enter(this);
       if (this.m == null) {
          this.m = new mv1(this);
       }
       _monitor_exit(this);
       return this.m;
    }
    public final uv1 u(){
       if (this.n != null) {
          return this.n;
       }
       _monitor_enter(this);
       if (this.n == null) {
          this.n = new uv1(0, this);
       }
       _monitor_exit(this);
       return this.n;
    }
    public final aw1 v(){
       if (this.l != null) {
          return this.l;
       }
       _monitor_enter(this);
       if (this.l == null) {
          this.l = new aw1(this);
       }
       _monitor_exit(this);
       return this.l;
    }
    public final qo5 w(){
       if (this.o != null) {
          return this.o;
       }
       _monitor_enter(this);
       if (this.o == null) {
          this.o = new qo5(this);
       }
       _monitor_exit(this);
       return this.o;
    }
}
