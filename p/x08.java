package p.x08;
import java.lang.Object;
import java.io.BufferedReader;
import android.util.JsonReader;
import java.io.Reader;
import java.lang.String;
import android.util.JsonToken;
import java.lang.Long;
import java.io.IOException;
import java.lang.StringBuilder;

public final class x08	// class@002be5 from classes.dex
{
    public final long a;

    public void x08(long p0){
       super();
       this.a = p0;
    }
    public static x08 a(BufferedReader p0){
       JsonReader jsonReader = new JsonReader(p0);
       jsonReader.beginObject();
       while (true) {
          if (!jsonReader.hasNext()) {
             throw new IOException("Response is missing nextRequestWaitMillis field.");
          }
          if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
             if (jsonReader.peek() == JsonToken.STRING) {
                break ;
             }else {
                jsonReader.close();
                return new x08(jsonReader.nextLong());
             }
          }else {
             jsonReader.skipValue();
          }
       }
       jsonReader.close();
       return new x08(Long.parseLong(jsonReader.nextString()));
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof x08) {
          return false;
       }
       if (this.a - p0.a) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       x08 ta = this.a;
       return (0xf4243 ^ (int)((ta >> 32) ^ ta));
    }
    public final String toString(){
       return "LogResponse{nextRequestWaitMillis="+this.a+"}";
    }
}
