package com.spotify.connectivity.productstate.ProductStateFlags;
import com.spotify.connectivity.productstateflags.SimpleFlagsListProvider;
import com.spotify.connectivity.productstateflags.FlagMaker;
import com.spotify.connectivity.flags.Overridable;
import java.lang.String;
import com.spotify.connectivity.flags.StringFlag;
import com.spotify.connectivity.productstateflags.ProductStateSource;
import com.spotify.connectivity.productstate.ProductStateFlags$SHUFFLE_RESTRICTED$1;
import com.spotify.connectivity.flags.BooleanFlag;
import p.po2;
import p.mo2;
import java.lang.CharSequence;
import p.fo2;
import p.y0;

public final class ProductStateFlags extends SimpleFlagsListProvider	// class@0007d9 from classes.dex
{
    private static final int EXPECTED_HASH_VALUE = 1929113152;
    public static final ProductStateFlags INSTANCE;
    public static final BooleanFlag LIMITED_OFFLINE;
    public static final BooleanFlag OFFLINE;
    public static final StringFlag ON_DEMAND_TRIAL;
    public static final BooleanFlag PODCASTS_ENABLED;
    public static final StringFlag PREMIUM;
    public static final BooleanFlag SHOWS_COLLECTION_VIDEO_ENABLED;
    public static final BooleanFlag SHUFFLE_RESTRICTED;

    static {
       ProductStateFlags.INSTANCE = new ProductStateFlags();
       FlagMaker iNSTANCE = FlagMaker.INSTANCE;
       Overridable dEBUG = Overridable.DEBUG;
       ProductStateFlags.PREMIUM = iNSTANCE.makeStringProductStateFlag("type", dEBUG);
       ProductStateFlags.SHUFFLE_RESTRICTED = new ProductStateFlags$SHUFFLE_RESTRICTED$1(new ProductStateSource("streaming-rules"), Overridable.NEVER);
       ProductStateFlags.OFFLINE = iNSTANCE.makeBooleanProductStateFlag("offline", dEBUG);
       ProductStateFlags.LIMITED_OFFLINE = iNSTANCE.makeBooleanProductStateFlag("limited-offline", dEBUG);
       ProductStateFlags.ON_DEMAND_TRIAL = iNSTANCE.makeStringProductStateFlag("on-demand-trial", dEBUG);
       ProductStateFlags.PODCASTS_ENABLED = iNSTANCE.makeBooleanProductStateFlag("shows-collection", dEBUG);
       ProductStateFlags.SHOWS_COLLECTION_VIDEO_ENABLED = iNSTANCE.makeBooleanProductStateFlag("shows-collection-jam", dEBUG);
    }
    private void ProductStateFlags(){
       super();
    }
    public static void getLIMITED_OFFLINE$annotations(){
    }
    public static void getOFFLINE$annotations(){
    }
    public static void getON_DEMAND_TRIAL$annotations(){
    }
    public static void getPODCASTS_ENABLED$annotations(){
    }
    public static void getPREMIUM$annotations(){
    }
    public static void getSHOWS_COLLECTION_VIDEO_ENABLED$annotations(){
    }
    public static final boolean isShuffleRestricted(String p0){
       boolean b = (p0 != null && mo2.b.a.a(p0).b() != 0x72fbee40)? false: true;
       return b;
    }
}
