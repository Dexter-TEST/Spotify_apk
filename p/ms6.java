package p.ms6;
import p.in2;
import java.nio.ByteBuffer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;

public final class ms6 extends in2	// class@001ef9 from classes.dex
{
    public final int a;

    public void ms6(int p0){
       this.a = p0;
       super();
    }
    public final ByteBuffer a(){
       switch (this.a){
           case 0:
           default:
             return ByteBuffer.allocate(0);
       }
       return ByteBuffer.allocate(0);
    }
    public final String b(){
       switch (this.a){
           case 0:
           default:
             return "tsas";
       }
       return "stsa";
    }
    public final void c(ByteBuffer p0){
    }
    public final boolean equals(Object p0){
       boolean b = true;
       switch (this.a){
           case 0:
             if (this != p0 && (p0 == null || ms6.class != p0.getClass())) {
                b = false;
             }
             break;
           default:
             if (this != p0 && (p0 == null || ms6.class != p0.getClass())) {
                b = false;
             }
             return b;
       }
       return b;
    }
    public final int hashCode(){
       switch (this.a){
           case 0:
           default:
             return 41;
       }
       return 37;
    }
}
