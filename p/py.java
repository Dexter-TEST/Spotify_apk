package p.py;
import p.ny;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import java.lang.Object;
import java.util.List;
import p.ph3;
import p.q24;
import p.uw0;
import p.ft5;
import p.z7;

public final class py implements ny	// class@0022fa from classes.dex
{
    public float a;
    public final Object b;

    public void py(GlueToolbar p0){
       super();
       this.a = 0xbf800000;
       this.b = p0;
    }
    public void py(List p0){
       super();
       this.a = 0xbf800000;
       this.b = p0.get(0);
    }
    public void py(q24 p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final uw0 a(uw0 p0){
       if (p0 instanceof ft5) {
       }else {
          z7 oz7 = new z7(this.a, p0);
       }
       return p0;
    }
    public final float g(){
       return this.b.a();
    }
    public final boolean h(float p0){
       if (!(p0 - this.a)) {
          return true;
       }
       this.a = p0;
       return false;
    }
    public final float i(){
       return this.b.b();
    }
    public final boolean isEmpty(){
       return false;
    }
    public final ph3 j(){
       return this.b;
    }
    public final boolean m(float p0){
       return (this.b.c() ^ 0x01);
    }
}
