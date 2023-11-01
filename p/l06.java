package p.l06;
import p.yi2;
import p.dr0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public final class l06 implements yi2	// class@001cbc from classes.dex
{
    public static final int a;

    static {
       dr0 uodr0 = new dr0(8, 0);
    }
    public void l06(){
       super();
    }
    public final String a(String p0){
       InputStream inputStream;
       String str = "key";
       try{
          co5.o(p0, str);
          inputStream = ((inputStream = dr0.b(p0)) != null)? new BufferedReader(new InputStreamReader(inputStream)).readLine(): null;
       }catch(java.io.IOException e0){
       }catch(java.lang.SecurityException e0){
       }
       return inputStream;
    }
}
