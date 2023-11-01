package p.gx1;
import java.lang.Integer;
import java.lang.String;
import android.util.Log;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.nio.charset.Charset;
import p.dx1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.text.DateFormat;
import java.util.regex.Pattern;
import java.nio.ByteOrder;
import java.io.FileInputStream;
import java.io.FileDescriptor;
import android.system.OsConstants;
import p.ix1;
import java.io.InputStream;
import java.io.Closeable;
import java.lang.NullPointerException;
import p.hx1;
import android.content.res.AssetManager$AssetInputStream;
import p.bx1;
import java.io.IOException;
import java.lang.StringBuilder;
import p.cx1;
import java.io.Serializable;
import p.ex1;
import java.lang.Double;
import p.fx1;
import android.os.Build$VERSION;
import android.media.MediaMetadataRetriever;
import p.ax1;
import android.media.MediaDataSource;
import p.kx1;
import java.lang.UnsupportedOperationException;
import java.util.Objects;
import java.io.BufferedInputStream;
import java.util.zip.CRC32;
import p.ye7;
import java.nio.ByteBuffer;
import p.tp2;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import java.lang.CharSequence;
import java.lang.System;

public final class gx1	// class@001797 from classes.dex
{
    public String a;
    public FileDescriptor b;
    public AssetManager$AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public static final byte[] A;
    public static final byte[] B;
    public static final String[] C;
    public static final int[] D;
    public static final byte[] E;
    public static final dx1 F;
    public static final dx1[][] G;
    public static final dx1[] H;
    public static final HashMap[] I;
    public static final HashMap[] J;
    public static final HashSet K;
    public static final HashMap L;
    public static final Charset M;
    public static final byte[] N;
    public static final byte[] O;
    public static final boolean m;
    public static final int[] n;
    public static final int[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;

    static {
       Integer integer = Integer.valueOf(3);
       gx1.m = Log.isLoggable("ExifInterface", 3);
       Integer[] integerArray = new Integer[4];
       Integer integer1 = Integer.valueOf(1);
       integerArray[0] = integer1;
       integerArray[1] = Integer.valueOf(6);
       Integer integer2 = Integer.valueOf(2);
       integerArray[2] = integer;
       Integer integer3 = Integer.valueOf(8);
       integerArray[3] = integer3;
       Arrays.asList(integerArray);
       integerArray = new Integer[4];
       integerArray[0] = integer2;
       Integer integer4 = Integer.valueOf(7);
       integerArray[1] = integer4;
       integerArray[2] = Integer.valueOf(4);
       Integer integer5 = Integer.valueOf(5);
       integerArray[3] = integer5;
       Arrays.asList(integerArray);
       gx1.n = new int[3]{8,8,8};
       int[] ointArray = new int[]{8};
       gx1.o = ointArray;
       gx1.p = new byte[3]{0xff,0xd8,0xff};
       gx1.q = new byte[4]{'f','t','y','p'};
       gx1.r = new byte[4]{'m','i','f','1'};
       gx1.s = new byte[4]{'h','e','i','c'};
       gx1.t = new byte[6]{'O','L','Y','M','P',0x00};
       gx1.u = new byte[10]{'O','L','Y','M','P','U','S',0x00,'I','I'};
       gx1.v = new byte[8]{0x89,'P','N','G',0x0d,0x0a,0x1a,0x0a};
       gx1.w = new byte[4]{'e','X','I','f'};
       gx1.x = new byte[4]{'I','H','D','R'};
       gx1.y = new byte[4]{'I','E','N','D'};
       gx1.z = new byte[4]{'R','I','F','F'};
       gx1.A = new byte[4]{'W','E','B','P'};
       gx1.B = new byte[4]{'E','X','I','F'};
       "VP8X".getBytes(Charset.defaultCharset());
       "VP8L".getBytes(Charset.defaultCharset());
       "VP8 ".getBytes(Charset.defaultCharset());
       "ANIM".getBytes(Charset.defaultCharset());
       "ANMF".getBytes(Charset.defaultCharset());
       String[] stringArray = new String[]{"","BYTE","STRING","USHORT","ULONG","URATIONAL","SBYTE","UNDEFINED","SSHORT","SLONG","SRATIONAL","SINGLE","DOUBLE","IFD"};
       gx1.C = stringArray;
       gx1.D = new int[14]{0,1,1,2,4,8,1,1,2,4,8,4,8,1};
       gx1.E = new byte[8]{'A','S','C','I','I',0x00,0x00,0x00};
       dx1[] uodx1Array = new dx1[42];
       uodx1Array[0] = new dx1("NewSubfileType", 254, 4);
       uodx1Array[1] = new dx1("SubfileType", 255, 4);
       uodx1Array[2] = new dx1(256, 3, 4, "ImageWidth");
       uodx1Array[3] = new dx1(257, 3, 4, "ImageLength");
       uodx1Array[4] = new dx1("BitsPerSample", 258, 3);
       uodx1Array[5] = new dx1("Compression", 259, 3);
       uodx1Array[6] = new dx1("PhotometricInterpretation", 262, 3);
       uodx1Array[7] = new dx1("ImageDescription", 270, 2);
       uodx1Array[8] = new dx1("Make", 271, 2);
       uodx1Array[9] = new dx1("Model", 272, 2);
       uodx1Array[10] = new dx1(273, 3, 4, "StripOffsets");
       uodx1Array[11] = new dx1("Orientation", 274, 3);
       uodx1Array[12] = new dx1("SamplesPerPixel", 277, 3);
       uodx1Array[13] = new dx1(278, 3, 4, "RowsPerStrip");
       uodx1Array[14] = new dx1(279, 3, 4, "StripByteCounts");
       uodx1Array[15] = new dx1("XResolution", 282, 5);
       uodx1Array[16] = new dx1("YResolution", 283, 5);
       uodx1Array[17] = new dx1("PlanarConfiguration", 284, 3);
       uodx1Array[18] = new dx1("ResolutionUnit", 296, 3);
       uodx1Array[19] = new dx1("TransferFunction", 301, 3);
       uodx1Array[20] = new dx1("Software", 305, 2);
       uodx1Array[21] = new dx1("DateTime", 306, 2);
       uodx1Array[22] = new dx1("Artist", 315, 2);
       uodx1Array[23] = new dx1("WhitePoint", 318, 5);
       uodx1Array[24] = new dx1("PrimaryChromaticities", 319, 5);
       uodx1Array[25] = new dx1("SubIFDPointer", 330, 4);
       uodx1Array[26] = new dx1("JPEGInterchangeFormat", 513, 4);
       uodx1Array[27] = new dx1("JPEGInterchangeFormatLength", 514, 4);
       uodx1Array[28] = new dx1("YCbCrCoefficients", 529, 5);
       uodx1Array[29] = new dx1("YCbCrSubSampling", 530, 3);
       uodx1Array[30] = new dx1("YCbCrPositioning", 531, 3);
       uodx1Array[31] = new dx1("ReferenceBlackWhite", 532, 5);
       uodx1Array[32] = new dx1("Copyright", 0x8298, 2);
       uodx1Array[33] = new dx1("ExifIFDPointer", 0x8769, 4);
       uodx1Array[34] = new dx1("GPSInfoIFDPointer", 0x8825, 4);
       uodx1Array[35] = new dx1("SensorTopBorder", 4, 4);
       uodx1Array[36] = new dx1("SensorLeftBorder", 5, 4);
       uodx1Array[37] = new dx1("SensorBottomBorder", 6, 4);
       uodx1Array[38] = new dx1("SensorRightBorder", 7, 4);
       uodx1Array[39] = new dx1("ISO", 23, 3);
       uodx1Array[40] = new dx1("JpgFromRaw", 46, 7);
       uodx1Array[41] = new dx1("Xmp", 700, 1);
       dx1[] uodx1Array1 = new dx1[74];
       uodx1Array1[0] = new dx1("ExposureTime", 0x829a, 5);
       uodx1Array1[1] = new dx1("FNumber", 0x829d, 5);
       uodx1Array1[2] = new dx1("ExposureProgram", 0x8822, 3);
       uodx1Array1[3] = new dx1("SpectralSensitivity", 0x8824, 2);
       uodx1Array1[4] = new dx1("PhotographicSensitivity", 0x8827, 3);
       uodx1Array1[5] = new dx1("OECF", 0x8828, 7);
       uodx1Array1[6] = new dx1("SensitivityType", 0x8830, 3);
       uodx1Array1[7] = new dx1("StandardOutputSensitivity", 0x8831, 4);
       uodx1Array1[8] = new dx1("RecommendedExposureIndex", 0x8832, 4);
       uodx1Array1[9] = new dx1("ISOSpeed", 0x8833, 4);
       uodx1Array1[10] = new dx1("ISOSpeedLatitudeyyy", 0x8834, 4);
       uodx1Array1[11] = new dx1("ISOSpeedLatitudezzz", 0x8835, 4);
       uodx1Array1[12] = new dx1("ExifVersion", 0x9000, 2);
       uodx1Array1[13] = new dx1("DateTimeOriginal", 0x9003, 2);
       uodx1Array1[14] = new dx1("DateTimeDigitized", 0x9004, 2);
       uodx1Array1[15] = new dx1("OffsetTime", 0x9010, 2);
       uodx1Array1[16] = new dx1("OffsetTimeOriginal", 0x9011, 2);
       uodx1Array1[17] = new dx1("OffsetTimeDigitized", 0x9012, 2);
       uodx1Array1[18] = new dx1("ComponentsConfiguration", 0x9101, 7);
       uodx1Array1[19] = new dx1("CompressedBitsPerPixel", 0x9102, 5);
       uodx1Array1[20] = new dx1("ShutterSpeedValue", 0x9201, 10);
       uodx1Array1[21] = new dx1("ApertureValue", 0x9202, 5);
       uodx1Array1[22] = new dx1("BrightnessValue", 0x9203, 10);
       uodx1Array1[23] = new dx1("ExposureBiasValue", 0x9204, 10);
       uodx1Array1[24] = new dx1("MaxApertureValue", 0x9205, 5);
       uodx1Array1[25] = new dx1("SubjectDistance", 0x9206, 5);
       uodx1Array1[26] = new dx1("MeteringMode", 0x9207, 3);
       uodx1Array1[27] = new dx1("LightSource", 0x9208, 3);
       uodx1Array1[28] = new dx1("Flash", 0x9209, 3);
       uodx1Array1[29] = new dx1("FocalLength", 0x920a, 5);
       uodx1Array1[30] = new dx1("SubjectArea", 0x9214, 3);
       uodx1Array1[31] = new dx1("MakerNote", 0x927c, 7);
       uodx1Array1[32] = new dx1("UserComment", 0x9286, 7);
       uodx1Array1[33] = new dx1("SubSecTime", 0x9290, 2);
       uodx1Array1[34] = new dx1("SubSecTimeOriginal", 0x9291, 2);
       uodx1Array1[35] = new dx1("SubSecTimeDigitized", 0x9292, 2);
       uodx1Array1[36] = new dx1("FlashpixVersion", 0xa000, 7);
       uodx1Array1[37] = new dx1("ColorSpace", 0xa001, 3);
       uodx1Array1[38] = new dx1(0xa002, 3, 4, "PixelXDimension");
       uodx1Array1[39] = new dx1(0xa003, 3, 4, "PixelYDimension");
       uodx1Array1[40] = new dx1("RelatedSoundFile", 0xa004, 2);
       uodx1Array1[41] = new dx1("InteroperabilityIFDPointer", 0xa005, 4);
       uodx1Array1[42] = new dx1("FlashEnergy", 0xa20b, 5);
       uodx1Array1[43] = new dx1("SpatialFrequencyResponse", 0xa20c, 7);
       uodx1Array1[44] = new dx1("FocalPlaneXResolution", 0xa20e, 5);
       uodx1Array1[45] = new dx1("FocalPlaneYResolution", 0xa20f, 5);
       uodx1Array1[46] = new dx1("FocalPlaneResolutionUnit", 0xa210, 3);
       uodx1Array1[47] = new dx1("SubjectLocation", 0xa214, 3);
       uodx1Array1[48] = new dx1("ExposureIndex", 0xa215, 5);
       uodx1Array1[49] = new dx1("SensingMethod", 0xa217, 3);
       uodx1Array1[50] = new dx1("FileSource", 0xa300, 7);
       uodx1Array1[51] = new dx1("SceneType", 0xa301, 7);
       uodx1Array1[52] = new dx1("CFAPattern", 0xa302, 7);
       uodx1Array1[53] = new dx1("CustomRendered", 0xa401, 3);
       uodx1Array1[54] = new dx1("ExposureMode", 0xa402, 3);
       uodx1Array1[55] = new dx1("WhiteBalance", 0xa403, 3);
       uodx1Array1[56] = new dx1("DigitalZoomRatio", 0xa404, 5);
       uodx1Array1[57] = new dx1("FocalLengthIn35mmFilm", 0xa405, 3);
       uodx1Array1[58] = new dx1("SceneCaptureType", 0xa406, 3);
       uodx1Array1[59] = new dx1("GainControl", 0xa407, 3);
       uodx1Array1[60] = new dx1("Contrast", 0xa408, 3);
       uodx1Array1[61] = new dx1("Saturation", 0xa409, 3);
       uodx1Array1[62] = new dx1("Sharpness", 0xa40a, 3);
       uodx1Array1[63] = new dx1("DeviceSettingDescription", 0xa40b, 7);
       uodx1Array1[64] = new dx1("SubjectDistanceRange", 0xa40c, 3);
       uodx1Array1[65] = new dx1("ImageUniqueID", 0xa420, 2);
       uodx1Array1[66] = new dx1("CameraOwnerName", 0xa430, 2);
       uodx1Array1[67] = new dx1("BodySerialNumber", 0xa431, 2);
       uodx1Array1[68] = new dx1("LensSpecification", 0xa432, 5);
       uodx1Array1[69] = new dx1("LensMake", 0xa433, 2);
       uodx1Array1[70] = new dx1("LensModel", 0xa434, 2);
       uodx1Array1[71] = new dx1("Gamma", 0xa500, 5);
       uodx1Array1[72] = new dx1("DNGVersion", 0xc612, 1);
       uodx1Array1[73] = new dx1(0xc620, 3, 4, "DefaultCropSize");
       dx1[] uodx1Array2 = new dx1[32];
       uodx1Array2[0] = new dx1("GPSVersionID", 0, 1);
       uodx1Array2[1] = new dx1("GPSLatitudeRef", 1, 2);
       uodx1Array2[2] = new dx1(2, 5, 10, "GPSLatitude");
       uodx1Array2[3] = new dx1("GPSLongitudeRef", 3, 2);
       uodx1Array2[4] = new dx1(4, 5, 10, "GPSLongitude");
       uodx1Array2[5] = new dx1("GPSAltitudeRef", 5, 1);
       uodx1Array2[6] = new dx1("GPSAltitude", 6, 5);
       uodx1Array2[7] = new dx1("GPSTimeStamp", 7, 5);
       uodx1Array2[8] = new dx1("GPSSatellites", 8, 2);
       uodx1Array2[9] = new dx1("GPSStatus", 9, 2);
       uodx1Array2[10] = new dx1("GPSMeasureMode", 10, 2);
       uodx1Array2[11] = new dx1("GPSDOP", 11, 5);
       uodx1Array2[12] = new dx1("GPSSpeedRef", 12, 2);
       uodx1Array2[13] = new dx1("GPSSpeed", 13, 5);
       uodx1Array2[14] = new dx1("GPSTrackRef", 14, 2);
       uodx1Array2[15] = new dx1("GPSTrack", 15, 5);
       uodx1Array2[16] = new dx1("GPSImgDirectionRef", 16, 2);
       uodx1Array2[17] = new dx1("GPSImgDirection", 17, 5);
       uodx1Array2[18] = new dx1("GPSMapDatum", 18, 2);
       uodx1Array2[19] = new dx1("GPSDestLatitudeRef", 19, 2);
       uodx1Array2[20] = new dx1("GPSDestLatitude", 20, 5);
       uodx1Array2[21] = new dx1("GPSDestLongitudeRef", 21, 2);
       uodx1Array2[22] = new dx1("GPSDestLongitude", 22, 5);
       uodx1Array2[23] = new dx1("GPSDestBearingRef", 23, 2);
       uodx1Array2[24] = new dx1("GPSDestBearing", 24, 5);
       uodx1Array2[25] = new dx1("GPSDestDistanceRef", 25, 2);
       uodx1Array2[26] = new dx1("GPSDestDistance", 26, 5);
       uodx1Array2[27] = new dx1("GPSProcessingMethod", 27, 7);
       uodx1Array2[28] = new dx1("GPSAreaInformation", 28, 7);
       uodx1Array2[29] = new dx1("GPSDateStamp", 29, 2);
       uodx1Array2[30] = new dx1("GPSDifferential", 30, 3);
       uodx1Array2[31] = new dx1("GPSHPositioningError", 31, 5);
       dx1[] uodx1Array3 = new dx1[]{new dx1("InteroperabilityIndex", 1, 2)};
       dx1[] uodx1Array4 = new dx1[38];
       uodx1Array4[0] = new dx1("NewSubfileType", 254, 4);
       uodx1Array4[1] = new dx1("SubfileType", 255, 4);
       uodx1Array4[2] = new dx1(256, 3, 4, "ThumbnailImageWidth");
       uodx1Array4[3] = new dx1(257, 3, 4, "ThumbnailImageLength");
       uodx1Array4[4] = new dx1("BitsPerSample", 258, 3);
       uodx1Array4[5] = new dx1("Compression", 259, 3);
       uodx1Array4[6] = new dx1("PhotometricInterpretation", 262, 3);
       uodx1Array4[7] = new dx1("ImageDescription", 270, 2);
       uodx1Array4[8] = new dx1("Make", 271, 2);
       uodx1Array4[9] = new dx1("Model", 272, 2);
       uodx1Array4[10] = new dx1(273, 3, 4, "StripOffsets");
       uodx1Array4[11] = new dx1("ThumbnailOrientation", 274, 3);
       uodx1Array4[12] = new dx1("SamplesPerPixel", 277, 3);
       uodx1Array4[13] = new dx1(278, 3, 4, "RowsPerStrip");
       uodx1Array4[14] = new dx1(279, 3, 4, "StripByteCounts");
       uodx1Array4[15] = new dx1("XResolution", 282, 5);
       uodx1Array4[16] = new dx1("YResolution", 283, 5);
       uodx1Array4[17] = new dx1("PlanarConfiguration", 284, 3);
       uodx1Array4[18] = new dx1("ResolutionUnit", 296, 3);
       uodx1Array4[19] = new dx1("TransferFunction", 301, 3);
       uodx1Array4[20] = new dx1("Software", 305, 2);
       uodx1Array4[21] = new dx1("DateTime", 306, 2);
       uodx1Array4[22] = new dx1("Artist", 315, 2);
       uodx1Array4[23] = new dx1("WhitePoint", 318, 5);
       uodx1Array4[24] = new dx1("PrimaryChromaticities", 319, 5);
       uodx1Array4[25] = new dx1("SubIFDPointer", 330, 4);
       uodx1Array4[26] = new dx1("JPEGInterchangeFormat", 513, 4);
       uodx1Array4[27] = new dx1("JPEGInterchangeFormatLength", 514, 4);
       uodx1Array4[28] = new dx1("YCbCrCoefficients", 529, 5);
       uodx1Array4[29] = new dx1("YCbCrSubSampling", 530, 3);
       uodx1Array4[30] = new dx1("YCbCrPositioning", 531, 3);
       uodx1Array4[31] = new dx1("ReferenceBlackWhite", 532, 5);
       uodx1Array4[32] = new dx1("Xmp", 700, 1);
       uodx1Array4[33] = new dx1("Copyright", 0x8298, 2);
       uodx1Array4[34] = new dx1("ExifIFDPointer", 0x8769, 4);
       uodx1Array4[35] = new dx1("GPSInfoIFDPointer", 0x8825, 4);
       uodx1Array4[36] = new dx1("DNGVersion", 0xc612, 1);
       uodx1Array4[37] = new dx1(0xc620, 3, 4, "DefaultCropSize");
       gx1.F = new dx1("StripOffsets", 273, 3);
       dx1[] uodx1Array5 = new dx1[]{new dx1("ThumbnailImage", 256, 7),new dx1("CameraSettingsIFDPointer", 8224, 4),new dx1("ImageProcessingIFDPointer", 8256, 4)};
       dx1[] uodx1Array6 = new dx1[]{new dx1("PreviewImageStart", 257, 4),new dx1("PreviewImageLength", 258, 4)};
       Integer integer6 = integer3;
       dx1[] uodx1Array7 = new dx1[]{new dx1("AspectFrame", 4371, 3)};
       Integer integer7 = integer4;
       dx1[] uodx1Array8 = new dx1[]{new dx1("ColorSpace", 55, 3)};
       Integer integer8 = integer;
       dx1[][] uodx1Array9 = new dx1[][10];
       uodx1Array9[0] = uodx1Array;
       uodx1Array9[1] = uodx1Array1;
       uodx1Array9[2] = uodx1Array2;
       uodx1Array9[3] = uodx1Array3;
       uodx1Array9[4] = uodx1Array4;
       uodx1Array9[5] = uodx1Array;
       uodx1Array9[6] = uodx1Array5;
       uodx1Array9[7] = uodx1Array6;
       uodx1Array9[8] = uodx1Array7;
       uodx1Array9[9] = uodx1Array8;
       gx1.G = uodx1Array9;
       uodx1Array5 = new dx1[]{new dx1("SubIFDPointer", 330, 4),new dx1("ExifIFDPointer", 0x8769, 4),new dx1("GPSInfoIFDPointer", 0x8825, 4),new dx1("InteroperabilityIFDPointer", 0xa005, 4),new dx1("CameraSettingsIFDPointer", 8224, 1),new dx1("ImageProcessingIFDPointer", 8256, 1)};
       gx1.H = uodx1Array5;
       HashMap[] hashMapArray = new HashMap[10];
       gx1.I = hashMapArray;
       HashMap[] hashMapArray1 = new HashMap[10];
       gx1.J = hashMapArray1;
       String[] stringArray1 = new String[]{"FNumber","DigitalZoomRatio","ExposureTime","SubjectDistance","GPSTimeStamp"};
       gx1.K = new HashSet(Arrays.asList(stringArray1));
       gx1.L = new HashMap();
       Charset uCharset = Charset.forName("US-ASCII");
       gx1.M = uCharset;
       gx1.N = "Exif\xff\x02\xff\x02\xff\x02\xff\x02".getBytes(uCharset);
       gx1.O = "http://ns.adobe.com/xap/1.0/\xff\x02\xff\x02".getBytes(uCharset);
       Locale uS = Locale.US;
       new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", uS).setTimeZone(TimeZone.getTimeZone("UTC"));
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", uS);
       simpleDateFo.setTimeZone(TimeZone.getTimeZone("UTC"));
       int i = 0;
       while (true) {
          dx1[][] g = gx1.G;
          if (i < g.length) {
             gx1.I[i] = new HashMap();
             gx1.J[i] = new HashMap();
             object oobject = g[i];
             int len = oobject.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                object oobject1 = oobject[i1];
                gx1.I[i].put(Integer.valueOf(oobject1.a), oobject1);
                gx1.J[i].put(oobject1.b, oobject1);
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       HashMap l = gx1.L;
       dx1[] h = gx1.H;
       l.put(Integer.valueOf(h[0].a), integer5);
       l.put(Integer.valueOf(h[1].a), integer1);
       l.put(Integer.valueOf(h[2].a), integer2);
       l.put(Integer.valueOf(h[3].a), integer8);
       l.put(Integer.valueOf(h[4].a), integer7);
       l.put(Integer.valueOf(h[5].a), integer6);
       Pattern.compile(".*[1-9].*");
       Pattern.compile("^\(\\d{2}\):\(\\d{2}\):\(\\d{2}\)$");
       Pattern.compile("^\(\\d{4}\):\(\\d{2}\):\(\\d{2}\)\\s\(\\d{2}\):\(\\d{2}\):\(\\d{2}\)$");
       Pattern.compile("^\(\\d{4}\)-\(\\d{2}\)-\(\\d{2}\)\\s\(\\d{2}\):\(\\d{2}\):\(\\d{2}\)$");
    }
    public void gx1(String p0){
       super();
       dx1[][] g = gx1.G;
       HashMap[] hashMapArray = new HashMap[g.length];
       this.e = hashMapArray;
       this.f = new HashSet(g.length);
       this.g = ByteOrder.BIG_ENDIAN;
       if (p0 == null) {
          throw new NullPointerException("filename cannot be null");
       }
       this.c = null;
       this.a = p0;
       FileInputStream uFileInputSt = new FileInputStream(p0);
       FileDescriptor fD = uFileInputSt.getFD();
       try{
          ix1.c(fD, 0, OsConstants.SEEK_CUR);
          fD = 1;
       }catch(java.lang.Exception e0){
          fD = 0;
       }
       this.b = (fD)? uFileInputSt.getFD(): e0;
       try{
          this.p(uFileInputSt);
          uFileInputSt.close();
          return;
       }catch(java.lang.RuntimeException e6){
          throw e6;
       }catch(java.lang.Exception e0){
       }
    }
    public void gx1(hx1 p0){
       super();
       dx1[][] g = gx1.G;
       HashMap[] hashMapArray = new HashMap[g.length];
       this.e = hashMapArray;
       this.f = new HashSet(g.length);
       this.g = ByteOrder.BIG_ENDIAN;
       String str = null;
       this.a = str;
       if (p0 instanceof AssetManager$AssetInputStream) {
          this.c = p0;
          this.b = str;
       }else if(p0 instanceof FileInputStream){
          FileInputStream uFileInputSt = p0;
          FileDescriptor fD = uFileInputSt.getFD();
          try{
             ix1.c(fD, 0, OsConstants.SEEK_CUR);
             fD = 1;
          }catch(java.lang.Exception e0){
             fD = 0;
          }
          if (fD) {
             this.c = e0;
             this.b = uFileInputSt.getFD();
          }
       }
       this.c = e0;
       this.b = e0;
       this.p(p0);
       return;
    }
    public static ByteOrder s(bx1 p0){
       short s;
       if ((s = p0.readShort()) == 0x4949) {
          return ByteOrder.LITTLE_ENDIAN;
       }
       if (s == 0x4d4d) {
          return ByteOrder.BIG_ENDIAN;
       }
       throw new IOException("Invalid byte order: "+Integer.toHexString(s));
    }
    public final void a(){
       String str = this.b("DateTimeOriginal");
       int i = 0;
       gx1 te = this.e;
       if (str != null) {
          String str1 = "DateTime";
          if (this.b(str1) == null) {
             te[i].put(str1, cx1.a(str));
          }
       }
       str = "ImageWidth";
       if (this.b(str) == null) {
          te[i].put(str, cx1.b(0, this.g));
       }
       str = "ImageLength";
       if (this.b(str) == null) {
          te[i].put(str, cx1.b(0, this.g));
       }
       str = "Orientation";
       if (this.b(str) == null) {
          te[i].put(str, cx1.b(0, this.g));
       }
       if (this.b("LightSource") == null) {
          te[1].put("LightSource", cx1.b(0, this.g));
       }
       return;
    }
    public final String b(String p0){
       cx1 a;
       ex1[] uoex1Array;
       cx1 uocx1 = this.d(p0);
       String str = null;
       if (uocx1 == null) {
          return str;
       }
       if (!gx1.K.contains(p0)) {
          return uocx1.g(this.g);
       }
       if (!p0.equals("GPSTimeStamp")) {
          return Double.toString(uocx1.e(this.g));
       }
       if ((a = uocx1.a) != 5 && a != 10) {
          return str;
       }
       if ((uoex1Array = uocx1.h(this.g)) != null) {
          int i = 3;
          if (uoex1Array.length == i) {
             Object[] objArray = new Object[i];
             object oobject = uoex1Array[0];
             objArray[0] = Integer.valueOf((int)((float)oobject.a / (float)oobject.b));
             oobject = uoex1Array[1];
             objArray[1] = Integer.valueOf((int)((float)oobject.a / (float)oobject.b));
             object oobject1 = uoex1Array[2];
             objArray[2] = Integer.valueOf((int)((float)oobject1.a / (float)oobject1.b));
             return String.format("%02d:%02d:%02d", objArray);
          }
       }
       Arrays.toString(uoex1Array);
       return str;
    }
    public final int c(){
       cx1 uocx1 = this.d("Orientation");
       int i = 1;
       if (uocx1 == null) {
          return i;
       }
       try{
          i = uocx1.f(this.g);
          return i;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public final cx1 d(String p0){
       cx1 uocx1;
       if ("ISOSpeedRatings".equals(p0)) {
          p0 = "PhotographicSensitivity";
       }
       int i = 0;
       while (true) {
          if (i >= gx1.G.length) {
             return null;
          }
          if ((uocx1 = this.e[i].get(p0)) != null) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return uocx1;
    }
    public final void e(fx1 p0){
       String str4;
       int i1;
       int i3;
       String str = "yes";
       if (Build$VERSION.SDK_INT < 28) {
          throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
       }
       try{
          MediaMetadataRetriever mediaMetadat = new MediaMetadataRetriever();
          kx1.a(mediaMetadat, new ax1(p0));
          String str1 = mediaMetadat.extractMetadata(33);
          String str2 = mediaMetadat.extractMetadata(34);
          String str3 = mediaMetadat.extractMetadata(17);
          if (str.equals(mediaMetadat.extractMetadata(26))) {
             str = mediaMetadat.extractMetadata(29);
             str4 = mediaMetadat.extractMetadata(30);
             str3 = mediaMetadat.extractMetadata(31);
          }else if(str.equals(str3)){
             str = mediaMetadat.extractMetadata(18);
             str4 = mediaMetadat.extractMetadata(19);
             str3 = mediaMetadat.extractMetadata(24);
          }else {
             str = null;
             str4 = str;
             str3 = str4;
          }
          gx1 te = this.e;
          if (str != null) {
             te[0].put("ImageWidth", cx1.d(Integer.parseInt(str), this.g));
          }
          if (str4 != null) {
             te[0].put("ImageLength", cx1.d(Integer.parseInt(str4), this.g));
          }
          int i = 6;
          if (str3 != null) {
             if ((i1 = Integer.parseInt(str3)) != 90) {
                if (i1 != 180) {
                   i1 = (i1 != 270)? 1: 8;
                }else {
                   i1 = 3;
                }
             }else {
                i1 = 6;
             }
             te[0].put("Orientation", cx1.d(i1, this.g));
          }
          if (str1 != null && str2 != null) {
             int i2 = Integer.parseInt(str1);
             if ((i3 = Integer.parseInt(str2)) > i) {
                p0.f((long)i2);
                byte[] uobyteArray = new byte[i];
                if (p0.read(uobyteArray) == i) {
                   i2 = i2 + i;
                   i3 = i3 - 6;
                   if (Arrays.equals(uobyteArray, gx1.N)) {
                      byte[] uobyteArray1 = new byte[i3];
                      if (p0.read(uobyteArray1) == i3) {
                         this.i = i2;
                         this.t(uobyteArray1, 0);
                      }else {
                         throw new IOException("Can\'t read exif");
                      }
                   }else {
                      throw new IOException("Invalid identifier");
                   }
                }else {
                   throw new IOException("Can\'t read identifier");
                }
             }else {
                throw new IOException("Invalid exif length");
             }
          }
          mediaMetadat.release();
          return;
       }catch(java.lang.RuntimeException e0){
          throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
       }
    }
    public final void f(bx1 p0,int p1,int p2){
       boolean m;
       int b1;
       int i3;
       byte[] uobyteArray;
       byte[] n;
       String str5;
       gx1 ogx1 = this;
       bx1 uobx1 = p0;
       int i = p2;
       if (m = gx1.m) {
          Objects.toString(p0);
       }
       uobx1.b = ByteOrder.BIG_ENDIAN;
       int b = p0.readByte();
       String str = "Invalid marker: ";
       int i1 = -1;
       if (b == i1) {
          if (p0.readByte() == -40) {
             b = 2;
             int i2 = 2;
             while (true) {
                if ((b1 = p0.readByte()) != i1) {
                   throw new IOException("Invalid marker:"+Integer.toHexString((b1 & 0x00ff)));
                }
                b1 = 1;
                i2 = i2 + b1;
                byte b2 = p0.readByte();
                if (m) {
                   i3 = b2 & 0x00ff;
                   Integer.toHexString(i3);
                }
                i2 = i2 + b1;
                if (b2 != -39 && b2 != -38) {
                   i3 = p0.readUnsignedShort() - b;
                   i2 = i2 + b;
                   if (m) {
                      int i4 = b2 & 0x00ff;
                      Integer.toHexString(i4);
                   }
                   String str1 = "Invalid length";
                   if (i3 >= 0) {
                      int i5 = 0;
                      gx1 e = ogx1.e;
                      if (b2 != -31) {
                         if (b2 != -2) {
                            switch (b2){
                                case 0xffffffc0:
                                case 0xffffffc2:
                                case 0xffffffc3:
                                case 0xffffffc1:
                                  break;
                                default:
                                  switch (b2){
                                      case 0xffffffc5:
                                      case 0xffffffc7:
                                      case 0xffffffc6:
                                        break;
                                      default:
                                        switch (b2){
                                            case 0xffffffc9:
                                            case 0xffffffcb:
                                            case 0xffffffca:
                                              break;
                                            default:
                                              switch (b2){
                                                  case 0xffffffcd:
                                                  case 0xffffffcf:
                                                  case 0xffffffce:
                                                    break;
                                                  default:
                                              }
                                              uobx1.b(b1);
                                              object oobject = e[i];
                                              b2 = 4;
                                              String str2 = (i != b2)? "ImageLength": "ThumbnailImageLength";
                                              oobject.put(str2, cx1.b((long)p0.readUnsignedShort(), ogx1.g));
                                              oobject = e[i];
                                              String str3 = (i != b2)? "ImageWidth": "ThumbnailImageWidth";
                                              oobject.put(str3, cx1.b((long)p0.readUnsignedShort(), ogx1.g));
                                              i3 = i3 - 5;
                                        }
                                  }
                            }
                            if (i3 >= 0) {
                               uobx1.b(i3);
                               i2 = i2 + i3;
                               b = 2;
                               i1 = -1;
                            }else {
                               throw new IOException(str1);
                            }
                         }else {
                            uobyteArray = new byte[i3];
                            if (uobx1.read(uobyteArray) == i3) {
                               String str4 = "UserComment";
                               if (ogx1.b(str4) == null) {
                                  e[b1].put(str4, cx1.a(new String(uobyteArray, gx1.M)));
                               }
                            }else {
                               throw new IOException("Invalid exif");
                            }
                         }
                      }else {
                         uobyteArray = new byte[i3];
                         uobx1.readFully(uobyteArray);
                         int i6 = i2 + i3;
                         if ((n = gx1.N) != null && i3 >= n.length) {
                            int i7 = 0;
                            while (true) {
                               if (i7 < n.length) {
                                  if (uobyteArray[i7] == n[i7]) {
                                     i7 = i7 + 1;
                                     str5 = -1;
                                  }
                               }else {
                                  byte[] uobyteArray1 = 1;
                               label_00ec :
                                  if (b) {
                                     uobyteArray1 = Arrays.copyOfRange(uobyteArray, n.length, i3);
                                     i2 = p1 + i2;
                                     i2 = i2 + n.length;
                                     ogx1.i = i2;
                                     ogx1.t(uobyteArray1, i);
                                     ogx1.w(new bx1(uobyteArray1));
                                  }else if((uobyteArray1 = gx1.O) == null || i3 < uobyteArray1.length){
                                     i1 = 0;
                                     while (i1 < uobyteArray1.length) {
                                        if (uobyteArray[i1] == uobyteArray1[i1]) {
                                           i1 = i1 + 1;
                                        }
                                     }
                                     if (b1) {
                                        i2 = i2 + uobyteArray1.length;
                                        uobyteArray1 = Arrays.copyOfRange(uobyteArray, uobyteArray1.length, i3);
                                        str5 = "Xmp";
                                        if (ogx1.b(str5) == null) {
                                           cx1 uobyteArray2 = new cx1((long)i2, uobyteArray1, 1, uobyteArray1.length);
                                           e[i5].put(str5, uobyteArray);
                                        }
                                     }
                                  }
                                  b1 = 0;
                                  i2 = i6;
                               }
                            }
                            uobx1.b = ogx1.g;
                            return;
                         }
                         b = 0;
                         goto label_00ec ;
                      }
                      i3 = 0;
                   }else {
                      throw new IOException(str1);
                   }
                }else {
                }
             }
          }else {
             throw new IOException(str+Integer.toHexString((b & 0x00ff)));
          }
       }else {
          throw new IOException(str+Integer.toHexString((b & 0x00ff)));
       }
    }
    public final int g(BufferedInputStream p0){
       InputStream inputStream;
       InputStream inputStream1;
       short i4;
       byte[] inputStream1;
       bx1 inputStream11;
       ByteOrder uByteOrder;
       InputStream inputStream2;
       long l1;
       long l2;
       byte[] uobyteArray2;
       long l3;
       int i5;
       BufferedInputStream uBufferedInp = p0;
       int i = 5000;
       uBufferedInp.mark(i);
       byte[] uobyteArray = new byte[i];
       uBufferedInp.read(uobyteArray);
       p0.reset();
       int i1 = 0;
       while (true) {
          byte[] p = gx1.p;
          int i2 = 1;
          if (i1 < p.length) {
             if (uobyteArray[i1] != p[i1]) {
                i1 = 0;
             label_0024 :
                if (i1) {
                   break ;
                }else {
                   byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                   bx1 int i3 = 0;
                   while (true) {
                      if (i3 < bytes.length) {
                         if (uobyteArray[i3] != bytes[i3]) {
                            bytes = 0;
                         label_0042 :
                            if (bytes) {
                               return 9;
                            }
                            bytes = 0;
                            try{
                               try{
                                  i3 = new bx1(uobyteArray);
                                  long l = (long)i3.readInt();
                                  byte[] uobyteArray1 = new byte[4];
                                  i3.read(uobyteArray1);
                                  if (Arrays.equals(uobyteArray1, gx1.q)) {
                                     uobyteArray1 = 8;
                                     if (!(l - 1)) {
                                        l = i3.readLong();
                                        l1 = 16;
                                        if ((l - l1) >= 0) {
                                        }
                                     }else {
                                        l1 = uobyteArray1;
                                     }
                                  }
                               label_00c9 :
                                  inputStream.close();
                               label_00cc :
                                  uBufferedInp = 0;
                               }catch(java.lang.Exception e0){
                               }
                               if (inputStream) {
                                  goto label_00c9 ;
                               }else {
                                  goto label_00cc ;
                               }
                            }catch(java.lang.Exception e0){
                               inputStream = bytes;
                            }
                         }else {
                            i3 = i3 + 1;
                         }
                      }else {
                         inputStream2 = 1;
                         goto label_0042 ;
                      }
                   }
                }
             }else {
                i1 = i1 + 1;
             }
          }else {
             inputStream2 = 1;
             goto label_0024 ;
          }
       }
       return 4;
    }
    public final void h(fx1 p0){
       cx1 uocx1;
       int[] ointArray;
       this.k(p0);
       gx1 te = this.e;
       int i = 1;
       if ((uocx1 = te[i].get("MakerNote")) != null) {
          fx1 uofx1 = new fx1(uocx1.d);
          uofx1.b = this.g;
          byte[] t = gx1.t;
          byte[] uobyteArray = new byte[t.length];
          uofx1.readFully(uobyteArray);
          uofx1.f(0);
          byte[] u = gx1.u;
          byte[] uobyteArray1 = new byte[u.length];
          uofx1.readFully(uobyteArray1);
          if (Arrays.equals(uobyteArray, t)) {
             uofx1.f(8);
          }else if(Arrays.equals(uobyteArray1, u)){
             uofx1.f(12);
          }
          this.u(uofx1, 6);
          cx1 uocx11 = te[7].get("PreviewImageStart");
          uocx1 = te[7].get("PreviewImageLength");
          if (uocx11 != null && uocx1 != null) {
             te[5].put("JPEGInterchangeFormat", uocx11);
             te[5].put("JPEGInterchangeFormatLength", uocx1);
          }
          if ((uocx1 = te[8].get("AspectFrame")) != null) {
             if ((ointArray = uocx1.h(this.g)) != null && ointArray.length == 4) {
                int i1 = ointArray[2];
                int i2 = ointArray[0];
                if (i1 > i2) {
                   int i3 = ointArray[3];
                   int i4 = ointArray[i];
                   if (i3 > i4) {
                      i1 = (i1 - i2) + i;
                      i3 = (i3 - i4) + i;
                      if (i1 < i3) {
                         i1 = i1 + i3;
                         i3 = i1 - i3;
                         i1 = i1 - i3;
                      }
                      te[0].put("ImageWidth", cx1.d(i1, this.g));
                      te[0].put("ImageLength", cx1.d(i3, this.g));
                   }
                }
             }else {
                Arrays.toString(ointArray);
             }
          }
       }
       return;
    }
    public final void i(bx1 p0){
       if (gx1.m) {
          Objects.toString(p0);
       }
       p0.b = ByteOrder.BIG_ENDIAN;
       byte[] v = gx1.v;
       p0.b(v.length);
       int i = 0;
       int i1 = v.length + i;
       try{
          while (true) {
             int i2 = p0.readInt();
             int i3 = 4;
             i1 = i1 + i3;
             byte[] uobyteArray = new byte[i3];
             if (p0.read(uobyteArray) != i3) {
                throw new IOException("Encountered invalid length while parsing PNG chunktype");
             }
             if ((i1 = i1 + i3) == 16 && !Arrays.equals(uobyteArray, gx1.x)) {
                throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
             }else if(Arrays.equals(uobyteArray, gx1.y)){
                if (Arrays.equals(uobyteArray, gx1.w)) {
                   byte[] uobyteArray1 = new byte[i2];
                   if (p0.read(uobyteArray1) == i2) {
                      int i4 = p0.readInt();
                      CRC32 uCRC32 = new CRC32();
                      uCRC32.update(uobyteArray);
                      uCRC32.update(uobyteArray1);
                      if ((int)uCRC32.getValue() == i4) {
                         this.i = i1;
                         this.t(uobyteArray1, i);
                         this.z();
                         this.w(new bx1(uobyteArray1));
                         break ;
                      }else {
                         throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "+i4+", calculated CRC value: "+uCRC32.getValue());
                      }
                   }else {
                      throw new IOException("Failed to read given length for given PNG chunk type: "+ye7.j(uobyteArray));
                   }
                }else {
                   i2 = i2 + 4;
                   p0.b(i2);
                   i1 = i1 + i2;
                }
             }
             break ;
          }
          return;
       }catch(java.io.EOFException e0){
          throw new IOException("Encountered corrupt PNG file.");
       }
    }
    public final void j(bx1 p0){
       if (gx1.m) {
          Objects.toString(p0);
       }
       p0.b(84);
       byte[] uobyteArray = new byte[4];
       byte[] uobyteArray1 = new byte[4];
       byte[] uobyteArray2 = new byte[4];
       p0.read(uobyteArray);
       p0.read(uobyteArray1);
       p0.read(uobyteArray2);
       int intx = ByteBuffer.wrap(uobyteArray).getInt();
       uobyteArray1 = new byte[ByteBuffer.wrap(uobyteArray1).getInt()];
       p0.b((intx - p0.c));
       p0.read(uobyteArray1);
       bx1 uobx1 = new bx1(uobyteArray1);
       this.f(uobx1, intx, 5);
       p0.b((ByteBuffer.wrap(uobyteArray2).getInt() - p0.c));
       p0.b = ByteOrder.BIG_ENDIAN;
       int i = p0.readInt();
       intx = 0;
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return;
          }
          int i2 = p0.readUnsignedShort();
          if (p0.readUnsignedShort() == gx1.F.a) {
             break ;
          }else {
             p0.b(i2);
             i1 = i1 + 1;
          }
       }
       gx1 te = this.e;
       te[intx].put("ImageLength", cx1.d(p0.readShort(), this.g));
       te[intx].put("ImageWidth", cx1.d(p0.readShort(), this.g));
       return;
    }
    public final void k(fx1 p0){
       cx1 uocx1;
       this.q(p0);
       this.u(p0, 0);
       this.y(p0, 0);
       this.y(p0, 5);
       this.y(p0, 4);
       this.z();
       if (this.d == 8) {
          gx1 te = this.e;
          if ((uocx1 = te[1].get("MakerNote")) != null) {
             fx1 uofx1 = new fx1(uocx1.d);
             uofx1.b = this.g;
             uofx1.b(6);
             this.u(uofx1, 9);
             if ((uocx1 = te[9].get("ColorSpace")) != null) {
                te[1].put("ColorSpace", uocx1);
             }
          }
       }
       return;
    }
    public final void l(fx1 p0){
       cx1 uocx1;
       if (gx1.m) {
          Objects.toString(p0);
       }
       this.k(p0);
       gx1 te = this.e;
       int i = 0;
       if ((uocx1 = te[i].get("JpgFromRaw")) != null) {
          this.f(new bx1(uocx1.d), (int)uocx1.c, 5);
       }
       cx1 uocx11 = te[i].get("ISO");
       cx1 uocx12 = te[1].get("PhotographicSensitivity");
       if (uocx11 != null && uocx12 == null) {
          te[1].put("PhotographicSensitivity", uocx11);
       }
       return;
    }
    public final void m(bx1 p0){
       if (gx1.m) {
          Objects.toString(p0);
       }
       p0.b = ByteOrder.LITTLE_ENDIAN;
       p0.b(gx1.z.length);
       int i = p0.readInt() + 8;
       byte[] a = gx1.A;
       p0.b(a.length);
       int i1 = a.length + 8;
       while (true) {
          int i2 = 4;
          break ;
       }
       try{
          byte[] uobyteArray = new byte[i2];
          if (p0.read(uobyteArray) == i2) {
             i1 = i1 + i2;
             int i3 = p0.readInt();
             i1 = i1 + i2;
             if (Arrays.equals(gx1.B, uobyteArray)) {
                byte[] uobyteArray1 = new byte[i3];
                if (p0.read(uobyteArray1) == i3) {
                   this.i = i1;
                   this.t(uobyteArray1, 0);
                   this.w(new bx1(uobyteArray1));
                }else {
                   throw new IOException("Failed to read given length for given PNG chunk type: "+ye7.j(uobyteArray));
                }
             }else if((i2 = i3 % 2) == 1){
                i3 = i3 + 1;
             }
             if ((i1 = i1 + i3) != i) {
                if (i1 <= i) {
                   p0.b(i3);
                }else {
                   throw new IOException("Encountered WebP file with invalid chunk size");
                }
             }
             return;
          }else {
             throw new IOException("Encountered invalid length while parsing WebP chunktype");
          }
       }catch(java.io.EOFException e0){
          throw new IOException("Encountered corrupt WebP file.");
       }
    }
    public final void n(bx1 p0,HashMap p1){
       cx1 uocx1 = p1.get("JPEGInterchangeFormat");
       cx1 uocx11 = p1.get("JPEGInterchangeFormatLength");
       if (uocx1 != null && uocx11 != null) {
          int i = uocx1.f(this.g);
          int i1 = uocx11.f(this.g);
          if (this.d == 7) {
             i = i + this.j;
          }
          if (i > 0 && (i1 > 0 && (this.a == null && (this.c == null && this.b == null)))) {
             byte[] uobyteArray = new byte[i1];
             p0.skip((long)i);
             p0.read(uobyteArray);
          }
       }
       return;
    }
    public final boolean o(HashMap p0){
       cx1 uocx1 = p0.get("ImageLength");
       cx1 uocx11 = p0.get("ImageWidth");
       if (uocx1 != null && uocx11 != null) {
          int i = uocx11.f(this.g);
          if (uocx1.f(this.g) <= 512 && i <= 512) {
             return true;
          }
       }
       return false;
    }
    public final void p(InputStream p0){
       gx1 td;
       gx1 td1;
       boolean m = gx1.m;
       int i = 0;
       try{
          for (int i1 = 0; i1 < gx1.G.length; i1 = i1 + 1) {
             this.e[i1] = new HashMap();
          }
          BufferedInputStream uBufferedInp = new BufferedInputStream(p0, 5000);
          int i2 = this.g(uBufferedInp);
          this.d = i2;
          bx1 uobx1 = (i2 != 4 && (i2 != 9 && (i2 != 13 && i2 != 14)))? 1: 0;
          if (i2) {
             fx1 uofx1 = new fx1(uBufferedInp);
             if ((td = this.d) == 12) {
                this.e(uofx1);
             }else if(td == 7){
                this.h(uofx1);
             }else if(td == 10){
                this.l(uofx1);
             }else {
                this.k(uofx1);
             }
             uofx1.f((long)this.i);
             this.w(uofx1);
          }else {
             uobx1 = new bx1(uBufferedInp);
             if ((td1 = this.d) == 4) {
                this.f(uobx1, i, i);
             }else if(td1 == 13){
                this.i(uobx1);
             }else if(td1 == 9){
                this.j(uobx1);
             }else if(td1 == 14){
                this.m(uobx1);
             }
          }
          this.a();
          if (m) {
          }else {
          label_0099 :
             return;
          }
       }catch(java.io.IOException e0){
          this.a();
          if (!e0) {
             return;
          }
       }catch(java.lang.UnsupportedOperationException e0){
       }
       this.r();
       goto label_0099 ;
    }
    public final void q(bx1 p0){
       gx1 td;
       ByteOrder uByteOrder = gx1.s(p0);
       this.g = uByteOrder;
       p0.b = uByteOrder;
       int i = p0.readUnsignedShort();
       if ((td = this.d) != 7 && (td != 10 && i != 42)) {
          throw new IOException("Invalid start code: "+Integer.toHexString(i));
       }
       if ((i = p0.readInt()) < 8) {
          throw new IOException(tp2.k("Invalid first Ifd offset: ", i));
       }
       if ((i = i - 8) > 0) {
          p0.b(i);
       }
       return;
    }
    public final void r(){
       int i = 0;
       while (true) {
          gx1 te = this.e;
          if (i < te.length) {
             te[i].size();
             Iterator iterator = te[i].entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                cx1 value = uEntry.getValue();
                String key = uEntry.getKey();
                value.toString();
                value.g(this.g);
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final void t(byte[] p0,int p1){
       fx1 uofx1 = new fx1(p0);
       this.q(uofx1);
       this.u(uofx1, p1);
    }
    public final void u(fx1 p0,int p1){
       int s;
       int i2;
       gx1 e;
       dx1 b;
       short s1;
       int i6;
       boolean b1;
       gx1 ogx11;
       long l2;
       long l3;
       int i7;
       int[] d;
       long l4;
       dx1 d1;
       gx1 ogx1 = this;
       bx1 uobx1 = p0;
       int i = p1;
       gx1 f = ogx1.f;
       f.add(Integer.valueOf(uobx1.c));
       if ((s = p0.readShort()) <= 0) {
          return;
       }
       int i1 = 0;
       while (true) {
          int m = gx1.m;
          i2 = 5;
          e = ogx1.e;
          if (i1 < s) {
             int i3 = p0.readUnsignedShort();
             int i4 = p0.readUnsignedShort();
             int i5 = p0.readInt();
             long l = 4;
             long l1 = (long)uobx1.c + l;
             dx1 uodx1 = gx1.I[i].get(Integer.valueOf(i3));
             if (m) {
                Object[] objArray = new Object[i2];
                objArray[0] = Integer.valueOf(p1);
                objArray[1] = Integer.valueOf(i3);
                b = (uodx1 != null)? uodx1.b: null;
                objArray[2] = b;
                objArray[3] = Integer.valueOf(i4);
                objArray[4] = Integer.valueOf(i5);
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArray);
             }
             if (uodx1 != null && i4 > 0) {
                d = gx1.D;
                if (i4 < d.length) {
                   dx1 c = uodx1.c;
                   s1 = s;
                   Integer integer = 7;
                   if (c != integer && (i4 != integer && (c != i4 && (d1 = uodx1.d) != i4))) {
                      i6 = i1;
                      ogx11 = 4;
                      if (c != ogx11 && (d1 != ogx11 || i4 != 3)) {
                         ogx11 = 9;
                         if (c != ogx11 && (d1 != ogx11 || i4 != 8)) {
                            ogx11 = 12;
                            if (c != ogx11 && (d1 != ogx11 || i4 != 11)) {
                               d1 = 0;
                            label_00be :
                               if (!integer) {
                                  if (m) {
                                     object oobject = gx1.C[i4];
                                  }
                                  ogx11 = f;
                                  b1 = m;
                               label_00e7 :
                                  s = 0;
                               label_00e9 :
                                  b = 0;
                               label_00ea :
                                  if (!b) {
                                     uobx1.f(l1);
                                  }else {
                                     String str = "Compression";
                                     if ((s - l) > 0) {
                                        m = p0.readInt();
                                        l = s;
                                        if (ogx1.d == 7) {
                                           if ("MakerNote".equals(uodx1.b)) {
                                              ogx1.j = m;
                                           }else {
                                              s = 6;
                                              if (i == s && "ThumbnailImage".equals(uodx1.b)) {
                                                 ogx1.k = m;
                                                 ogx1.l = i5;
                                                 l2 = l1;
                                                 int i8 = 4;
                                                 e[i8].put(str, cx1.d(s, ogx1.g));
                                                 e[i8].put("JPEGInterchangeFormat", cx1.b((long)ogx1.k, ogx1.g));
                                                 e[i8].put("JPEGInterchangeFormatLength", cx1.b((long)ogx1.l, ogx1.g));
                                              label_0151 :
                                                 uobx1.f((long)m);
                                              }
                                           }
                                        }
                                        l2 = l1;
                                        goto label_0151 ;
                                     }else {
                                        l = s;
                                        l2 = l1;
                                     }
                                     if ((integer = gx1.L.get(Integer.valueOf(i3))) != null) {
                                        if (i4 != 3) {
                                           if (i4 != 4) {
                                              if (i4 != 8) {
                                                 if (i4 != 9 && i4 != 13) {
                                                    l3 = -1;
                                                 label_0198 :
                                                    if (b1) {
                                                       Object[] objArray1 = new Object[]{Long.valueOf(l3),uodx1.b};
                                                       String.format("Offset: %d, tagName: %s", objArray1);
                                                    }
                                                    if ((l3) > 0 && !ogx11.contains(Integer.valueOf((int)l3))) {
                                                       uobx1.f(l3);
                                                       ogx1.u(uobx1, integer.intValue());
                                                    }
                                                    uobx1.f(l2);
                                                 }else {
                                                    i7 = p0.readInt();
                                                 }
                                              }else {
                                                 i7 = p0.readShort();
                                              }
                                           }else {
                                              l3 = (long)p0.readInt() & 0xffffffff;
                                              goto label_0198 ;
                                           }
                                        }else {
                                           i7 = p0.readUnsignedShort();
                                        }
                                        l3 = (long)i7;
                                        goto label_0198 ;
                                     }else {
                                        s = uobx1.c + ogx1.i;
                                        byte[] uobyteArray = new byte[(int)l];
                                        uobx1.readFully(uobyteArray);
                                        cx1 m1 = new cx1((long)s, uobyteArray, i4, i5);
                                        e[i].put(uodx1.b, m);
                                        dx1 b2 = uodx1.b;
                                        if ("DNGVersion".equals(b2)) {
                                           ogx1.d = 3;
                                        }
                                        if ("Make".equals(b2) || ("Model".equals(b2) && (m.g(ogx1.g).contains("PENTAX") || (str.equals(b2) || m.f(ogx1.g) != 0xffff)))) {
                                           ogx1.d = 8;
                                        }
                                        if ((long)uobx1.c - l2) {
                                           uobx1.f(l2);
                                        }
                                     }
                                  }
                                  s = i6 + 1;
                                  f = ogx11;
                                  i1 = (short)s;
                                  s = s1;
                               }else {
                                  ogx11 = f;
                                  if (i4 == 7) {
                                     i4 = c;
                                  }
                                  b1 = m;
                                  l4 = (long)i5 * (long)d[i4];
                                  if ((l4) >= 0 && (l4 - 0x7fffffff) <= 0) {
                                     d = 1;
                                     goto label_00ea ;
                                  }else {
                                     goto label_00e9 ;
                                  }
                               }
                            }
                         }
                      }
                   }else {
                      i6 = i1;
                   }
                   integer = 1;
                   goto label_00be ;
                }
             }
             s1 = s;
             i6 = i1;
             b1 = m;
             ogx11 = f;
             goto label_00e7 ;
          }else {
             break ;
          }
       }
       ogx11 = f;
       i = p0.readInt();
       if (m) {
          Object[] objArray2 = new Object[]{Integer.valueOf(i)};
          String.format("nextIfdOffset: %d", objArray2);
       }
       l4 = (long)i;
       if ((l4) > 0 && !ogx11.contains(Integer.valueOf(i))) {
          uobx1.f(l4);
          i = 4;
          if (e[i].isEmpty()) {
             ogx1.u(uobx1, i);
          }else if(e[i2].isEmpty()){
             ogx1.u(uobx1, i2);
          }
       }
       return;
    }
    public final void v(int p0,String p1,String p2){
       gx1 te = this.e;
       if (!te[p0].isEmpty() && te[p0].get(p1) != null) {
          object oobject = te[p0];
          oobject.put(p2, oobject.get(p1));
          te[p0].remove(p1);
       }
       return;
    }
    public final void w(bx1 p0){
       cx1 uocx1;
       long[] olongArray;
       int i4;
       cx1 uocx12;
       gx1 ogx1 = this;
       InputStream inputStream = p0;
       object oobject = ogx1.e[4];
       if ((uocx1 = oobject.get("Compression")) != null) {
          int i = uocx1.f(ogx1.g);
          int i1 = 6;
          if (i != 1) {
             if (i != i1) {
                if (i == 7) {
                }
             }else {
                ogx1.n(inputStream, oobject);
             }
          }else if((uocx1 = oobject.get("BitsPerSample")) != null){
             int[] ointArray = uocx1.h(ogx1.g);
             int[] n = gx1.n;
             if (Arrays.equals(n, ointArray) || (ogx1.d == 3 && ((uocx12 = oobject.get("PhotometricInterpretation")) != null && ((i4 = uocx12.f(ogx1.g)) == 1 && (Arrays.equals(ointArray, gx1.o) || (i4 == i1 && Arrays.equals(ointArray, n))))))) {
                ointArray = 1;
             label_006f :
                if (ointArray) {
                   uocx1 = oobject.get("StripOffsets");
                   cx1 uocx11 = oobject.get("StripByteCounts");
                   if (uocx1 != null && uocx11 != null) {
                      olongArray = ye7.n(uocx1.h(ogx1.g));
                      long[] olongArray1 = ye7.n(uocx11.h(ogx1.g));
                      if (olongArray != null && (olongArray.length && (olongArray1 != null && (olongArray1.length && olongArray.length == olongArray1.length)))) {
                         i1 = olongArray1.length;
                         long l = 0;
                         for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                            l = l + olongArray1[i2];
                         }
                         byte[] uobyteArray = new byte[(int)l];
                         ogx1.h = true;
                         int i3 = 0;
                         i4 = 0;
                         i2 = 0;
                         while (true) {
                            if (i3 < olongArray.length) {
                               int i5 = (int)olongArray[i3];
                               int i6 = (int)olongArray1[i3];
                               int i7 = olongArray.length - true;
                               if (i3 < i7) {
                                  i7 = i5 + i6;
                                  int i8 = i3 + 1;
                                  if ((long)i7 - olongArray[i8]) {
                                     ogx1.h = false;
                                  }
                               }
                               if ((i5 = i5 - i4) >= 0) {
                                  long l1 = (long)i5;
                                  if (!(inputStream.skip(l1) - l1)) {
                                     i4 = i4 + i5;
                                     byte[] uobyteArray1 = new byte[i6];
                                     if (inputStream.read(uobyteArray1) == i6) {
                                        i4 = i4 + i6;
                                        System.arraycopy(uobyteArray1, false, uobyteArray, i2, i6);
                                        i2 = i2 + i6;
                                        i3 = i3 + 1;
                                     }
                                  }
                               }
                            }else if(ogx1.h != null){
                               long l2 = olongArray[0];
                               break ;
                            }
                         }
                      }
                   }
                }
             }
          }
          olongArray = 0;
          goto label_006f ;
       }else {
          ogx1.n(inputStream, oobject);
       }
       return;
    }
    public final void x(int p0,int p1){
       gx1 te = this.e;
       if (!te[p0].isEmpty() && !te[p1].isEmpty()) {
          cx1 uocx1 = te[p0].get("ImageLength");
          cx1 uocx11 = te[p0].get("ImageWidth");
          cx1 uocx12 = te[p1].get("ImageLength");
          cx1 uocx13 = te[p1].get("ImageWidth");
          if (uocx1 != null && (uocx11 != null && (uocx12 != null && uocx13 != null))) {
             int i = uocx11.f(this.g);
             int i1 = uocx13.f(this.g);
             if (uocx1.f(this.g) < uocx12.f(this.g) && i < i1) {
                object oobject = te[p0];
                te[p0] = te[p1];
                te[p1] = oobject;
             }
          }
       }
       return;
    }
    public final void y(fx1 p0,int p1){
       ex1[] uoex1Array;
       cx1 uocx15;
       int[] ointArray;
       gx1 te = this.e;
       cx1 uocx1 = te[p1].get("DefaultCropSize");
       cx1 uocx11 = te[p1].get("SensorTopBorder");
       cx1 uocx12 = te[p1].get("SensorLeftBorder");
       cx1 uocx13 = te[p1].get("SensorBottomBorder");
       cx1 uocx14 = te[p1].get("SensorRightBorder");
       if (uocx1 != null) {
          if (uocx1.a == 5) {
             if ((uoex1Array = uocx1.h(this.g)) != null && uoex1Array.length == 2) {
                uocx1 = cx1.c(uoex1Array[0], this.g);
                uocx15 = cx1.c(uoex1Array[1], this.g);
             }else {
                Arrays.toString(uoex1Array);
                return;
             }
          }else if((ointArray = uocx1.h(this.g)) != null && ointArray.length == 2){
             uocx1 = cx1.d(ointArray[0], this.g);
             uocx15 = cx1.d(ointArray[1], this.g);
          }else {
             Arrays.toString(ointArray);
             return;
          }
          te[p1].put("ImageWidth", uocx1);
          te[p1].put("ImageLength", uocx15);
       }else if(uocx11 != null && (uocx12 != null && (uocx13 != null && uocx14 != null))){
          int i = uocx11.f(this.g);
          int i1 = uocx13.f(this.g);
          int i2 = uocx14.f(this.g);
          int i3 = uocx12.f(this.g);
          if (i1 > i && i2 > i3) {
             te[p1].put("ImageLength", cx1.d((i1 - i), this.g));
             te[p1].put("ImageWidth", cx1.d((i2 - i3), this.g));
          }
       }else {
          uocx11 = te[p1].get("ImageWidth");
          if (te[p1].get("ImageLength") == null || uocx11 == null) {
             uocx1 = te[p1].get("JPEGInterchangeFormat");
             cx1 uocx16 = te[p1].get("JPEGInterchangeFormatLength");
             if (uocx1 != null && uocx16 != null) {
                int i4 = uocx1.f(this.g);
                p0.f((long)i4);
                byte[] uobyteArray = new byte[uocx1.f(this.g)];
                p0.read(uobyteArray);
                this.f(new bx1(uobyteArray), i4, p1);
             }
          }
       }
       return;
    }
    public final void z(){
       this.x(0, 5);
       this.x(0, 4);
       this.x(5, 4);
       gx1 te = this.e;
       cx1 uocx1 = te[1].get("PixelXDimension");
       cx1 uocx11 = te[1].get("PixelYDimension");
       if (uocx1 != null && uocx11 != null) {
          te[0].put("ImageWidth", uocx1);
          te[0].put("ImageLength", uocx11);
       }
       if (te[4].isEmpty() && this.o(te[5])) {
          te[4] = te[5];
          te[5] = new HashMap();
       }
       this.o(te[4]);
       this.v(0, "ThumbnailOrientation", "Orientation");
       this.v(0, "ThumbnailImageLength", "ImageLength");
       this.v(0, "ThumbnailImageWidth", "ImageWidth");
       this.v(5, "ThumbnailOrientation", "Orientation");
       this.v(5, "ThumbnailImageLength", "ImageLength");
       this.v(5, "ThumbnailImageWidth", "ImageWidth");
       this.v(4, "Orientation", "ThumbnailOrientation");
       this.v(4, "ImageLength", "ThumbnailImageLength");
       this.v(4, "ImageWidth", "ThumbnailImageWidth");
       return;
    }
}
