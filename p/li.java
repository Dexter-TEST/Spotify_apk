package p.li;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.ObjectStreamClass;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.c3;
import java.lang.Class;
import p.ji;

public final class li extends ObjectInputStream	// class@001d61 from classes.dex
{

    public void li(BufferedInputStream p0){
       super(p0);
    }
    public final ObjectStreamClass readClassDescriptor(){
       ObjectStreamClass objectStream = super.readClassDescriptor();
       if (co5.c(objectStream.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
          objectStream = ObjectStreamClass.lookup(c3.class);
       }else if(co5.c(objectStream.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")){
          objectStream = ObjectStreamClass.lookup(ji.class);
       }
       co5.l(objectStream, "resultClassDescriptor");
       return objectStream;
    }
}
