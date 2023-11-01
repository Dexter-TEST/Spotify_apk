package p.y87;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import java.lang.Object;
import java.util.ArrayList;
import p.w51;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.ActionType;
import p.km3;
import p.q97;
import p.w12;
import p.fn0;

public final class y87	// class@002d6e from classes.dex
{
    public final q97 a;
    public final km3 b;
    public final w12 c;
    public final fn0 d;
    public static final ArrayList e;
    public static final ArrayList f;
    public static final ArrayList g;

    static {
       FormatType[] uFormatTypeA = new FormatType[]{FormatType.CARDS,FormatType.FULLSCREEN,FormatType.BANNERS};
       y87.e = w51.G(uFormatTypeA);
       TriggerType[] triggerTypeA = new TriggerType[]{TriggerType.URI,TriggerType.CLIENT_EVENT};
       y87.f = w51.G(triggerTypeA);
       ActionType[] uActionTypeA = new ActionType[]{ActionType.URL,ActionType.EXTERNAL_URL,ActionType.IAP,ActionType.DISMISS};
       y87.g = w51.G(uActionTypeA);
    }
    public void y87(km3 p0,q97 p1,w12 p2){
       super();
       this.d = new fn0();
       this.a = p1;
       this.b = p0;
       this.c = p2;
    }
}
