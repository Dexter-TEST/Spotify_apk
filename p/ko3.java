package p.ko3;
import p.wd5;
import p.p77;
import p.id0;
import p.ac;
import p.zg0;
import p.ix;
import p.az2;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import p.ju2;
import p.ru2;
import java.util.Locale;
import java.lang.Integer;
import p.jl;
import p.fu2;
import java.lang.Class;
import p.io3;
import android.content.Context;
import p.jo3;

public final class ko3	// class@001c51 from classes.dex
{
    private final ix mBadgesFactory;
    private final id0 mCenterCropGravityTopFactory;
    private final p77 mCircleTransformation;
    private final zg0 mClock;
    private final Map mCustomComponentBinders;
    private final ac mEventSender;
    private final az2 mGlueIconCache;
    private final p77 mIdentityTransformation;
    private final wd5 mPicasso;

    public void ko3(wd5 p0,p77 p1,p77 p2,id0 p3,ac p4,zg0 p5,ix p6,az2 p7,Map p8){
       super();
       this.mPicasso = p0;
       this.mCircleTransformation = p1;
       this.mIdentityTransformation = p2;
       this.mCenterCropGravityTopFactory = p3;
       this.mEventSender = p4;
       this.mClock = p5;
       this.mBadgesFactory = p6;
       this.mGlueIconCache = p7;
       this.mCustomComponentBinders = p8;
    }
    public static int a(String p0,int p1,ju2 p2){
       return ko3.lambda$single$0(p0, p1, p2);
    }
    public static ru2 access$100(String p0,int p1){
       return ko3.single(p0, p1);
    }
    private static int lambda$single$0(String p0,int p1,ju2 p2){
       Object[] objArray;
       int i = 2;
       if (p2 == null) {
          objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          jl.p(String.format(Locale.US, "model is null comparing with componentId:%s binderId:%d", objArray));
          return 0;
       }else if(p2.q() == null){
          objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          jl.p(String.format(Locale.US, "model.componentId\(\) is null comparing with componentId:%s with binderId:%d", objArray));
          return 0;
       }else if(p2.q().c() == null){
          objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          jl.p(String.format(Locale.US, "model.componentId\(\).id\(\) is null comparing with componentId:%s with binderId:%d", objArray));
          return 0;
       }else if(p2.q().c().equals(p0)){
          return p1;
       }else {
          return 0;
       }
    }
    private static ru2 single(String p0,int p1){
       p0.getClass();
       return new io3(p0, p1, 0);
    }
    public jo3 newBuilder(Context p0){
       jo3 v11 = new jo3(p0, this.mClock, this.mBadgesFactory, this.mPicasso, this.mCircleTransformation, this.mIdentityTransformation, this.mCenterCropGravityTopFactory, this.mGlueIconCache, this.mEventSender, this.mCustomComponentBinders);
       return v11;
    }
}
