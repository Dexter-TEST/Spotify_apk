package p.y77;
import p.o77;
import java.util.List;
import java.util.Collections;
import java.lang.Object;
import java.util.ArrayList;
import p.x77;

public final class y77 implements o77	// class@002d66 from classes.dex
{
    public x77 a;
    public final List b;
    public static final y77 c;

    static {
       y77.c = new y77(Collections.emptyList());
    }
    public void y77(){
       super();
       this.b = new ArrayList();
    }
    public void y77(List p0){
       super();
       this.a = x77.b;
       this.b = p0;
    }
    public final float a(float p0){
       return this.a.a(this.b, p0);
    }
}
