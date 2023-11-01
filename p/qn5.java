package p.qn5;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import p.en6;

public final class qn5	// class@0023db from classes.dex
{
    public final int a;
    public final int b;
    public static final qn5 c;

    static {
       qn5.c = new qn5(0, 0);
    }
    public void qn5(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String toString(){
       return en6.o(qn5.class.getSimpleName()+"[position = "+this.a+", length = ", this.b, "]");
    }
}
