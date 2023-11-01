package p.ue4;
import p.is3;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import p.ls3;

public abstract class ue4 implements is3, Serializable	// class@000369 from classes2.dex
{

    public void ue4(){
       super();
    }
    public Object readResolve(){
       return ls3.e("NOP");
    }
}
