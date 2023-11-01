package p.en6;
import java.lang.String;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;
import java.lang.System;
import p.vm0;
import p.p81;
import p.uf;
import p.kf6;
import android.app.Activity;
import android.view.View;
import p.p40;
import p.oh5;
import p.q40;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import p.ej4;

public abstract class en6	// class@0014c1 from classes.dex
{
    public static final int[] a;

    static {
       en6.a = new int[201]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,'!','"','#','$','%','&',39,'(',')','*','+',',','-','.','/','0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?','@','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','[',92,']','^','_','`','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','{','|','}','~',127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201};
    }
    public static int A(int p0){
       if (!p0) {
          throw 0;
       }
       p0--;
       return p0;
    }
    public static String B(int p0){
       if (p0 == 1) {
          return "PRIMARY";
       }
       if (p0 == 2) {
          return "SECONDARY";
       }
       return "null";
    }
    public static String C(int p0){
       if (p0 == 1) {
          return "AUDIO_FOCUS";
       }
       if (p0 == 2) {
          return "AUDIO_FOCUS_AUDIOFOCUS";
       }
       if (p0 == 3) {
          return "AUDIO_FOCUS_COREINTERNAL";
       }
       if (p0 == 4) {
          return "CAMPAIGNS_AUDIOPLAYERIMPL";
       }
       if (p0 == 5) {
          return "FULLSCREENSTORY_FULLSCREENSTORYIMPL";
       }
       if (p0 == 6) {
          return "PREVIEWPLAYER_API";
       }
       if (p0 == 7) {
          return "PREVIEW_PREVIEWAPI";
       }
       if (p0 == 8) {
          return "KIDS_PLAYBACK_NOTIFICATION";
       }
       if (p0 == 9) {
          return "TEST";
       }
       return "null";
    }
    public static String D(int p0){
       if (p0 == 1) {
          return "OK";
       }
       if (p0 == 2) {
          return "TRANSIENT_ERROR";
       }
       if (p0 == 3) {
          return "FATAL_ERROR";
       }
       return "null";
    }
    public static String E(int p0){
       if (p0 == 1) {
          return "CIRCLE";
       }
       if (p0 == 2) {
          return "SQUARE";
       }
       return "null";
    }
    public static int F(String p0){
       if (p0 == null) {
          throw new NullPointerException("Name is null");
       }
       if (p0.equals("PRIMARY")) {
          return 1;
       }
       if (p0.equals("SECONDARY")) {
          return 2;
       }
       throw new IllegalArgumentException("No enum constant com.spotify.allboarding.allboardingdomain.Action.".concat(p0));
    }
    public static int G(String p0){
       if (p0 == null) {
          throw new NullPointerException("Name is null");
       }
       if (p0.equals("AUTO")) {
          return 1;
       }
       if (p0.equals("TEXT")) {
          return 2;
       }
       if (p0.equals("BYTE")) {
          return 3;
       }
       if (p0.equals("NUMERIC")) {
          return 4;
       }
       throw new IllegalArgumentException("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(p0));
    }
    public static int[] H(int p0){
       int[] ointArray = new int[p0];
       System.arraycopy(en6.a, 0, ointArray, 0, p0);
       return ointArray;
    }
    public static int[] _values(){
       return en6.H(25);
    }
    public static int[] _values$1(){
       return en6.H(24);
    }
    public static int[] _values$2(){
       return en6.H(8);
    }
    public static p81 a(vm0 p0){
       p81 op81;
       uf b = p0.b;
       switch (p0.a){
           case 0:
             op81 = new p81(b.b);
             break;
           default:
             op81 = new p81(b);
       }
       return op81;
    }
    public static boolean b(int p0,int p1){
       if (!p0) {
          throw false;
       }
       boolean b = (p0 == p1)? true: false;
       return b;
    }
    public static String c(int p0){
       if (p0 == 1) {
          return "android-audio-focus";
       }
       if (p0 == 2) {
          return "android-audio-focus-audiofocus";
       }
       if (p0 == 3) {
          return "android-audio-focus-coreinternal";
       }
       if (p0 == 4) {
          return "android-campaigns-audioplayerimpl";
       }
       if (p0 == 5) {
          return "android-fullscreenstory-fullscreenstoryimpl";
       }
       if (p0 == 6) {
          return "android-previewplayer-api";
       }
       if (p0 == 7) {
          return "android-preview-previewapi";
       }
       if (p0 == 8) {
          return "android-kids-playback-notification";
       }
       if (p0 == 9) {
          return "test";
       }
       throw null;
    }
    public static int d(int p0){
       if (p0 == 1) {
          return 0x7f0d015d;
       }
       if (p0 == 2) {
          return 0x7f0d015c;
       }
       throw 0;
    }
    public static String e(int p0){
       if (p0 == 1) {
          return "add";
       }
       if (p0 == 2) {
          return "cancel";
       }
       if (p0 == 3) {
          return "clear-cache";
       }
       if (p0 == 4) {
          return "close-dialog";
       }
       if (p0 == 5) {
          return "confirm";
       }
       if (p0 == 6) {
          return "continue-taste-onboarding";
       }
       if (p0 == 7) {
          return "delete";
       }
       if (p0 == 8) {
          return "delete-downloads";
       }
       if (p0 == 9) {
          return "deselect";
       }
       if (p0 == 10) {
          return "edit";
       }
       if (p0 == 11) {
          return "expand-genre";
       }
       if (p0 == 12) {
          return "heart";
       }
       if (p0 == 13) {
          return "install";
       }
       if (p0 == 14) {
          return "item-viewed";
       }
       if (p0 == 15) {
          return "like-disable";
       }
       if (p0 == 16) {
          return "like-enable";
       }
       if (p0 == 17) {
          return "logout";
       }
       if (p0 == 18) {
          return "move";
       }
       if (p0 == 19) {
          return "navigate-forward";
       }
       if (p0 == 20) {
          return "navigate-up";
       }
       if (p0 == 21) {
          return "open-context-menu";
       }
       if (p0 == 22) {
          return "pause";
       }
       if (p0 == 23) {
          return "play";
       }
       if (p0 == 24) {
          return "queue";
       }
       if (p0 == 25) {
          return "reload";
       }
       if (p0 == 26) {
          return "remove-from-playlist";
       }
       if (p0 == 27) {
          return "rename";
       }
       if (p0 == 28) {
          return "repeat-disable";
       }
       if (p0 == 29) {
          return "repeat-enable";
       }
       if (p0 == 30) {
          return "resume";
       }
       if (p0 == 31) {
          return "seek-backward";
       }
       if (p0 == 32) {
          return "seek-forward";
       }
       if (p0 == 33) {
          return "select";
       }
       if (p0 == 34) {
          return "select-storage-location";
       }
       if (p0 == 35) {
          return "share";
       }
       if (p0 == 36) {
          return "shuffle-disable";
       }
       if (p0 == 37) {
          return "shuffle-enable";
       }
       if (p0 == 38) {
          return "skip-language-onboarding";
       }
       if (p0 == 39) {
          return "skip_next";
       }
       if (p0 == 40) {
          return "skip_prev";
       }
       if (p0 == 41) {
          return "skip-taste-onboarding";
       }
       if (p0 == 42) {
          return "sleep-timer";
       }
       if (p0 == 43) {
          return "try-skip-language-onboarding";
       }
       if (p0 == 44) {
          return "upgrade-to-premium";
       }
       throw null;
    }
    public static String f(int p0){
       if (p0 == 1) {
          return "drag";
       }
       if (p0 == 2) {
          return "hit";
       }
       if (p0 == 3) {
          return "scroll";
       }
       throw null;
    }
    public static int g(int p0){
       if (p0 == 1) {
          return 0x7f06006b;
       }
       if (p0 == 2) {
          return 0x7f060069;
       }
       if (p0 == 3) {
          return 0x7f060067;
       }
       throw 0;
    }
    public static String h(int p0){
       if (p0 == 1) {
          return "ADD_TO_CART";
       }
       if (p0 == 2) {
          return "ADD_TO_WISHLIST";
       }
       if (p0 == 3) {
          return "VIEW_CART";
       }
       if (p0 == 4) {
          return "INITIATE_PURCHASE";
       }
       if (p0 == 5) {
          return "ADD_PAYMENT_INFO";
       }
       if (p0 == 6) {
          return "PURCHASE";
       }
       if (p0 == 7) {
          return "SPEND_CREDITS";
       }
       if (p0 == 8) {
          return "SEARCH";
       }
       if (p0 == 9) {
          return "VIEW_ITEM";
       }
       if (p0 == 10) {
          return "VIEW_ITEMS";
       }
       if (p0 == 11) {
          return "RATE";
       }
       if (p0 == 12) {
          return "SHARE";
       }
       if (p0 == 13) {
          return "INITIATE_STREAM";
       }
       if (p0 == 14) {
          return "COMPLETE_STREAM";
       }
       if (p0 == 15) {
          return "COMPLETE_REGISTRATION";
       }
       if (p0 == 16) {
          return "COMPLETE_TUTORIAL";
       }
       if (p0 == 17) {
          return "ACHIEVE_LEVEL";
       }
       if (p0 == 18) {
          return "UNLOCK_ACHIEVEMENT";
       }
       if (p0 == 19) {
          return "INVITE";
       }
       if (p0 == 20) {
          return "LOGIN";
       }
       if (p0 == 21) {
          return "RESERVE";
       }
       if (p0 == 22) {
          return "SUBSCRIBE";
       }
       if (p0 == 23) {
          return "START_TRIAL";
       }
       if (p0 == 24) {
          return "CLICK_AD";
       }
       if (p0 == 25) {
          return "VIEW_AD";
       }
       throw null;
    }
    public static boolean i(int p0){
       int i = 1;
       if (p0 == i) {
          return i;
       }
       if (p0 == 2) {
          return i;
       }
       if (p0 == 3) {
          return false;
       }
       if (p0 == 4) {
          return false;
       }
       throw false;
    }
    public static int j(int p0){
       if (p0 == 1) {
          return 0x7f06006c;
       }
       if (p0 == 2) {
          return 0x7f06006a;
       }
       if (p0 == 3) {
          return 0x7f060068;
       }
       throw 0;
    }
    public static boolean k(int p0){
       int i = 1;
       if (p0 == i) {
          return i;
       }
       if (p0 == 2) {
          return false;
       }
       if (p0 == 3) {
          return i;
       }
       if (p0 == 4) {
          return false;
       }
       throw false;
    }
    public static void l(p40 p0,long p1,int p2,int p3,String p4,String p5,oh5 p6){
       p0.a(p1, p2, p3, p4, p5, null, p6);
    }
    public static String m(RecyclerView p0,StringBuilder p1){
       return p1+p0.B();
    }
    public static String n(String p0,String p1){
       return p0+p1;
    }
    public static String o(StringBuilder p0,int p1,String p2){
       return p0+p1+p2;
    }
    public static String p(StringBuilder p0,String p1,String p2){
       return p0+p1+p2;
    }
    public static String q(StringBuilder p0,boolean p1,String p2){
       return p0+p1+p2;
    }
    public static StringBuilder r(String p0){
       return p0;
    }
    public static StringBuilder s(String p0,String p1){
       return p0+p1;
    }
    public static StringBuilder t(String p0,String p1,String p2){
       return p0+p1+p2;
    }
    public static void u(String p0,ByteBuffer p1,byte p2){
       p1.put(ej4.p(p0));
       p1.put(p2);
    }
    public static String v(int p0){
       if (p0 == 1) {
          return "PRIMARY";
       }
       if (p0 == 2) {
          return "SECONDARY";
       }
       throw null;
    }
    public static String w(int p0){
       if (p0 == 1) {
          return "COMMERCE_AUCTION";
       }
       if (p0 == 2) {
          return "COMMERCE_BUSINESS";
       }
       if (p0 == 3) {
          return "COMMERCE_OTHER";
       }
       if (p0 == 4) {
          return "COMMERCE_PRODUCT";
       }
       if (p0 == 5) {
          return "COMMERCE_RESTAURANT";
       }
       if (p0 == 6) {
          return "COMMERCE_SERVICE";
       }
       if (p0 == 7) {
          return "COMMERCE_TRAVEL_FLIGHT";
       }
       if (p0 == 8) {
          return "COMMERCE_TRAVEL_HOTEL";
       }
       if (p0 == 9) {
          return "COMMERCE_TRAVEL_OTHER";
       }
       if (p0 == 10) {
          return "GAME_STATE";
       }
       if (p0 == 11) {
          return "MEDIA_IMAGE";
       }
       if (p0 == 12) {
          return "MEDIA_MIXED";
       }
       if (p0 == 13) {
          return "MEDIA_MUSIC";
       }
       if (p0 == 14) {
          return "MEDIA_OTHER";
       }
       if (p0 == 15) {
          return "MEDIA_VIDEO";
       }
       if (p0 == 16) {
          return "OTHER";
       }
       if (p0 == 17) {
          return "TEXT_ARTICLE";
       }
       if (p0 == 18) {
          return "TEXT_BLOG";
       }
       if (p0 == 19) {
          return "TEXT_OTHER";
       }
       if (p0 == 20) {
          return "TEXT_RECIPE";
       }
       if (p0 == 21) {
          return "TEXT_REVIEW";
       }
       if (p0 == 22) {
          return "TEXT_SEARCH_RESULTS";
       }
       if (p0 == 23) {
          return "TEXT_STORY";
       }
       if (p0 == 24) {
          return "TEXT_TECHNICAL_DOC";
       }
       throw null;
    }
    public static String x(int p0){
       if (p0 == 1) {
          return "branchKey";
       }
       if (p0 == 2) {
          return "testKey";
       }
       if (p0 == 3) {
          return "liveKey";
       }
       if (p0 == 4) {
          return "useTestInstance";
       }
       if (p0 == 5) {
          return "enableFacebookLinkCheck";
       }
       if (p0 == 6) {
          return "enableLogging";
       }
       throw null;
    }
    public static String y(int p0){
       if (p0 == 1) {
          return "FIXED";
       }
       if (p0 == 2) {
          return "WRAP_CONTENT";
       }
       if (p0 == 3) {
          return "MATCH_CONSTRAINT";
       }
       if (p0 == 4) {
          return "MATCH_PARENT";
       }
       throw null;
    }
    public static String z(int p0){
       if (p0 == 1) {
          return "OTHER";
       }
       if (p0 == 2) {
          return "NEW";
       }
       if (p0 == 3) {
          return "GOOD";
       }
       if (p0 == 4) {
          return "FAIR";
       }
       if (p0 == 5) {
          return "POOR";
       }
       if (p0 == 6) {
          return "USED";
       }
       if (p0 == 7) {
          return "REFURBISHED";
       }
       if (p0 == 8) {
          return "EXCELLENT";
       }
       throw null;
    }
}
