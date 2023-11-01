package com.spotify.connectivity.productstate.ProductStateUtil;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import com.spotify.connectivity.productstate.BooleanProductStateValueConverter;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.co5;
import com.spotify.connectivity.flags.Flags;
import com.spotify.connectivity.productstate.ProductStateFlags;
import com.spotify.connectivity.flags.Flag;
import java.io.Serializable;
import java.lang.Boolean;
import p.po2;
import p.mo2;
import java.lang.CharSequence;
import p.fo2;
import p.y0;
import com.spotify.connectivity.flags.Flags$Util;

public final class ProductStateUtil	// class@0007da from classes.dex
{
    private static final int EXPECTED_HASH_VALUE = 1929113152;
    private static final String ON_DEMAND_TRIAL_ACTIVATE = "active";
    private static final String TAG_PREMIUM = "premium";

    private static final boolean getBooleanValueForKey(Map p0,String p1){
       String str = p0.get(p1);
       try{
          return BooleanProductStateValueConverter.convert(str);
       }catch(com.spotify.connectivity.productstate.ConvertProductStateValueException e2){
          Object[] objArray = new Object[0];
          Logger.c(e2, "Unable to extract product state", objArray);
          return 0;
       }
    }
    public static final boolean isCheetaraEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-cheetara");
    }
    public static final boolean isConnectEntryPointsEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "allow-connect-entry-points");
    }
    public static final boolean isCuttlefishEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-cuttlefish");
    }
    public static final boolean isEuterpeEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-euterpe");
    }
    public static final boolean isExplicitContentEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return (ProductStateUtil.getBooleanValueForKey(p0, "filter-explicit-content") ^ 0x01);
    }
    public static final boolean isLingoAuroraEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-lingo-aurora");
    }
    public static final boolean isMarquesEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-marques");
    }
    public static final boolean isNftEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return (ProductStateUtil.getBooleanValueForKey(p0, "nft-disabled") ^ 0x01);
    }
    public static final boolean isOfflineEnabled(Flags p0){
       co5.o(p0, "flags");
       boolean b = (p0.get(ProductStateFlags.OFFLINE).booleanValue() && !p0.get(ProductStateFlags.LIMITED_OFFLINE).booleanValue())? true: false;
       return b;
    }
    public static final boolean isOfflineEnabled(Map p0){
       co5.o(p0, "productStateMap");
       boolean b = (ProductStateUtil.getBooleanValueForKey(p0, "offline") && !ProductStateUtil.getBooleanValueForKey(p0, "limited-offline"))? true: false;
       return b;
    }
    public static final boolean isOnDemandTrialActivate(Flags p0){
       co5.o(p0, "flags");
       return co5.c("active", p0.get(ProductStateFlags.ON_DEMAND_TRIAL));
    }
    public static final boolean isPigeonEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-pigeon");
    }
    public static final boolean isPodcastsEnabled(Flags p0){
       co5.o(p0, "flags");
       return p0.get(ProductStateFlags.PODCASTS_ENABLED).booleanValue();
    }
    public static final boolean isPodcastsEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "shows-collection");
    }
    public static final boolean isPremium(Flags p0){
       co5.o(p0, "flags");
       return "premium".equals(p0.get(ProductStateFlags.PREMIUM));
    }
    public static final boolean isPremium(Map p0){
       co5.o(p0, "productStateMap");
       return co5.c("premium", p0.get("type"));
    }
    public static final boolean isPuffinEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-puffin");
    }
    public static final boolean isSeadragonEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-seadragon");
    }
    private static final boolean isShuffleRestricted(String p0){
       boolean b = (p0 != null && mo2.b.a.a(p0).b() != 0x72fbee40)? false: true;
       return b;
    }
    public static final boolean isTunaEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return ProductStateUtil.getBooleanValueForKey(p0, "is-tuna");
    }
    public static final boolean isVideoShowsEnabled(Flags p0){
       co5.o(p0, "flags");
       return p0.get(ProductStateFlags.SHOWS_COLLECTION_VIDEO_ENABLED).booleanValue();
    }
    public static final boolean onDemandEnabled(Flags p0){
       co5.o(p0, "flags");
       return (p0.get(ProductStateFlags.SHUFFLE_RESTRICTED).booleanValue() ^ 0x01);
    }
    public static final boolean onDemandEnabled(Map p0){
       co5.o(p0, "productStateMap");
       return (ProductStateUtil.isShuffleRestricted(p0.get("streaming-rules")) ^ 0x01);
    }
    public static final boolean onDemandHasChangedValue(Flags p0,Flags p1){
       co5.o(p1, "newFlags");
       return Flags$Util.INSTANCE.hasChangedValue(ProductStateFlags.SHUFFLE_RESTRICTED, p0, p1);
    }
}
