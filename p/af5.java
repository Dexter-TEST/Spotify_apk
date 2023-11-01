package p.af5;
import java.util.HashSet;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import android.os.Process;
import java.lang.StringBuilder;

public abstract class af5	// class@000f71 from classes.dex
{
    public static final HashMap a;

    static {
       String[] stringArray = new String[]{"app_update","review"};
       HashSet hashSet = new HashSet(Arrays.asList(stringArray));
       stringArray = new String[]{"native","unity"};
       hashSet = new HashSet(Arrays.asList(stringArray));
       af5.a = new HashMap();
       (new StringBuilder(39)+"UID: ["+Process.myUid()+"]  PID: ["+Process.myPid()+"] ").concat("PlayCoreVersion");
    }
}
