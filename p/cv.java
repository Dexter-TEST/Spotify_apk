package p.cv;
import java.lang.Object;
import p.dv;
import java.lang.String;
import p.kg4;
import com.google.common.collect.d;
import java.lang.IllegalStateException;

public final class cv	// class@001289 from classes.dex
{
    public d a;
    public d b;
    public d c;
    public d d;
    public d e;
    public d f;
    public d g;
    public d h;
    public d i;
    public d j;
    public d k;
    public d l;
    public d m;
    public d n;
    public d o;
    public d p;
    public d q;
    public d r;
    public d s;
    public d t;
    public d u;
    public d v;
    public d w;

    public void cv(){
       super();
    }
    public final dv a(){
       cv uocv = this;
       String str = (uocv.a == null)? " disallowPausingReasons": "";
       if (uocv.b == null) {
          str = str.concat(" disallowResumingReasons");
       }
       if (uocv.c == null) {
          str = kg4.l(str, " disallowSeekingReasons");
       }
       if (uocv.d == null) {
          str = kg4.l(str, " disallowPeekingPrevReasons");
       }
       if (uocv.e == null) {
          str = kg4.l(str, " disallowPeekingNextReasons");
       }
       if (uocv.f == null) {
          str = kg4.l(str, " disallowSkippingPrevReasons");
       }
       if (uocv.g == null) {
          str = kg4.l(str, " disallowSkippingNextReasons");
       }
       if (uocv.h == null) {
          str = kg4.l(str, " disallowTogglingRepeatContextReasons");
       }
       if (uocv.i == null) {
          str = kg4.l(str, " disallowTogglingRepeatTrackReasons");
       }
       if (uocv.j == null) {
          str = kg4.l(str, " disallowTogglingShuffleReasons");
       }
       if (uocv.k == null) {
          str = kg4.l(str, " disallowSetQueueReasons");
       }
       if (uocv.l == null) {
          str = kg4.l(str, " disallowAddToQueueReasons");
       }
       if (uocv.m == null) {
          str = kg4.l(str, " disallowInterruptingPlaybackReasons");
       }
       if (uocv.n == null) {
          str = kg4.l(str, " disallowTransferringPlaybackReasons");
       }
       if (uocv.o == null) {
          str = kg4.l(str, " disallowRemoteControlReasons");
       }
       if (uocv.p == null) {
          str = kg4.l(str, " disallowInsertingIntoNextTracksReasons");
       }
       if (uocv.q == null) {
          str = kg4.l(str, " disallowInsertingIntoContextTracksReasons");
       }
       if (uocv.r == null) {
          str = kg4.l(str, " disallowReorderingInNextTracksReasons");
       }
       if (uocv.s == null) {
          str = kg4.l(str, " disallowReorderingInContextTracksReasons");
       }
       if (uocv.t == null) {
          str = kg4.l(str, " disallowRemovingFromNextTracksReasons");
       }
       if (uocv.u == null) {
          str = kg4.l(str, " disallowRemovingFromContextTracksReasons");
       }
       if (uocv.v == null) {
          str = kg4.l(str, " disallowUpdatingContextReasons");
       }
       if (uocv.w == null) {
          str = kg4.l(str, " disallowSettingPlaybackSpeedReasons");
       }
       if (str.isEmpty()) {
          dv str1 = new dv(uocv.a, uocv.b, uocv.c, uocv.d, uocv.e, uocv.f, uocv.g, uocv.h, uocv.i, uocv.j, uocv.k, uocv.l, uocv.m, uocv.n, uocv.o, uocv.p, uocv.q, uocv.r, uocv.s, uocv.t, uocv.u, uocv.v, uocv.w);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
}
