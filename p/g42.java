package p.g42;
import p.j42;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class g42 extends j42	// class@001698 from classes.dex
{
    public boolean b;

    public void g42(File p0){
       co5.o(p0, "rootFile");
       super(p0);
    }
    public final File a(){
       if (this.b != null) {
          return null;
       }
       this.b = true;
       return this.a;
    }
}
