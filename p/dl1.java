package p.dl1;
import p.z83;
import java.lang.Object;
import p.ij4;
import java.lang.String;
import java.lang.StringBuilder;
import p.hr7;

public final class dl1 implements z83	// class@001369 from classes.dex
{
    public final boolean a;

    public void dl1(boolean p0){
       this.a = p0;
    }
    public final boolean b(){
       return this.a;
    }
    public final ij4 c(){
       return null;
    }
    public final String toString(){
       String str = "Empty{";
       String str1 = (this.a != null)? "Active": "New";
       return hr7.a(str, str1, '}');
    }
}
