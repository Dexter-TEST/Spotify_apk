package p.g53;
import java.io.File;
import p.su6;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.String;
import java.io.Closeable;

public abstract class g53	// class@000204 from classes2.dex
{
    public static final int a;

    static {
       su6 osu6 = new su6();
       PrintWriter printWriter = new PrintWriter(osu6);
       printWriter.println();
       osu6.toString();
       printWriter.close();
    }
    public static void a(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
}
