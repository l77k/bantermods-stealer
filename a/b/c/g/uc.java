/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.b;
import a.b.c.g.s5;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class uc {
    private static final b v;
    private static final long[] m;
    private static final Integer[] V;

    private uc() {
    }

    private static b z() {
        try {
            char[] cArray = new char[uc.h(27370, 6662119140107860172L)];
            cArray[0] = uc.h(32576, 7911048188119788911L);
            cArray[1] = uc.h(9103, 6462682650006548902L);
            cArray[2] = uc.h(17617, 2247660350578464501L);
            cArray[3] = uc.h(29394, 8295841779687629025L);
            cArray[4] = uc.h(18887, 5643811172963523571L);
            cArray[5] = uc.h(29741, 7544825673169905157L);
            char[] cArray2 = cArray;
            String string = new String(cArray2);
            b b2 = Native.load(string, b.class, W32APIOptions.UNICODE_OPTIONS);
            return b2;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            try {
                char[] cArray = new char[uc.h(20723, 8203173203802358467L)];
                cArray[0] = uc.h(24547, 3168397141048626641L);
                cArray[1] = uc.h(22627, 4512388255534385743L);
                cArray[2] = uc.h(14895, 7895875884262385674L);
                cArray[3] = uc.h(28808, 8388078546527953571L);
                cArray[4] = uc.h(8557, 1334120636150604L);
                cArray[5] = uc.h(31052, 8246180696028195709L);
                cArray[uc.h((int)14569, (long)1953621734041152203L)] = uc.h(25720, 1847966858133878349L);
                cArray[uc.h((int)9903, (long)4979938390382146689L)] = uc.h(16536, 5902896327252644539L);
                cArray[uc.h((int)14776, (long)4950197261048408981L)] = uc.h(24313, 667352040713129177L);
                cArray[uc.h((int)17502, (long)1743457856011802233L)] = uc.h(1936, 3926378788279145914L);
                char[] cArray3 = cArray;
                String string = new String(cArray3);
                return Native.load(string, b.class);
            }
            catch (Exception exception) {
                throw new RuntimeException();
            }
        }
    }

    static b o() {
        return v;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block12: {
                block11: {
                    var9 = s5.a(-4508155886768146169L, 4436054378057275989L, MethodHandles.lookup().lookupClass()).a(21213829007076L) ^ 38767401158857L;
                    var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var9 >>> 56);
                    for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                        v2 = v2;
                        v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                    }
                    var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var0_3 = new String[2];
                    var6_4 = 0;
                    var5_5 = "Y\u00ff\u00cal\u0000v\u00b2\u00a3\u00da\u0000\u00ffm\u00dc\"\u00953\u00f6\u0088&\u00fb=#\u001a\u00c1\u001d\u00b9\u00de\u00c7\u00e2\u00b8\u00a2\u00a9\u00ae\u00a7\u00f0\u0098B\u000eT\u00d1\u008eA4\u0010R#\u0094\u00c7\u00a8T\u001d\u000f6\u00ac\u001di\u008c\u0081\u00b0?Z\u00aa\u0001j\u00a0\u00f1\u00fa-K\u00be\u00f2\u00af/ 3\u00ed\u00e1W\u0096\u00fd`E\u00a9R\u008d\u008f\u00dd\u00a1\u00fe\u00ad\u0090\u00ef\u00d4\u00acn\u0017\u00a6\u007f\u00a2J\f\u00bd\u001atJ/\u00cecHIH\u00cc\u009d\u0080<\u00a7\u0085\u008e\u00de\u00e0.S^c=e\b\u007f\u0091\u00c0\u009c\t#\u00d7\u00ac\u0005\u00d4\u00d3v\u0015\u0086\u00aa\u00e7=\u00e5b\u000e\u00f2{>\u00ac\u00e9\u00da\u00fb\u00164\u00d48\u007f^\u00c1\u00da\u00cb\f2\f\u00aa\u00e6\u00f6*\u0091J\u0018JGq\u00e1S\u00b7,\u00dd\u00c9nK%0\u008bx\u00e5\u00c1?\u00a8\u00c7\u0087\u00e4y|\u00d7\r\u00ec\u00ff}/2]m\u00c1\u00a0\u00db\u00daMJ\u00bd\u000e\u00d9\u0012\u00af\u008a\u00b5\u00d4\u00bb\u00bf\u0099\u0087>\u0097AG\u00e6\u00c7<\u00b9\u0093\u0014w\u0011\u00cf\u00f1\u00d9M\u0018\u00c3[So\u00d2\u00cc\u0011Q\u00a8\u0088\u00da\u00d2\u00daS\u00b6\u00170\u00b4\u00ffk6\u00ee-l";
                    var7_6 = "Y\u00ff\u00cal\u0000v\u00b2\u00a3\u00da\u0000\u00ffm\u00dc\"\u00953\u00f6\u0088&\u00fb=#\u001a\u00c1\u001d\u00b9\u00de\u00c7\u00e2\u00b8\u00a2\u00a9\u00ae\u00a7\u00f0\u0098B\u000eT\u00d1\u008eA4\u0010R#\u0094\u00c7\u00a8T\u001d\u000f6\u00ac\u001di\u008c\u0081\u00b0?Z\u00aa\u0001j\u00a0\u00f1\u00fa-K\u00be\u00f2\u00af/ 3\u00ed\u00e1W\u0096\u00fd`E\u00a9R\u008d\u008f\u00dd\u00a1\u00fe\u00ad\u0090\u00ef\u00d4\u00acn\u0017\u00a6\u007f\u00a2J\f\u00bd\u001atJ/\u00cecHIH\u00cc\u009d\u0080<\u00a7\u0085\u008e\u00de\u00e0.S^c=e\b\u007f\u0091\u00c0\u009c\t#\u00d7\u00ac\u0005\u00d4\u00d3v\u0015\u0086\u00aa\u00e7=\u00e5b\u000e\u00f2{>\u00ac\u00e9\u00da\u00fb\u00164\u00d48\u007f^\u00c1\u00da\u00cb\f2\f\u00aa\u00e6\u00f6*\u0091J\u0018JGq\u00e1S\u00b7,\u00dd\u00c9nK%0\u008bx\u00e5\u00c1?\u00a8\u00c7\u0087\u00e4y|\u00d7\r\u00ec\u00ff}/2]m\u00c1\u00a0\u00db\u00daMJ\u00bd\u000e\u00d9\u0012\u00af\u008a\u00b5\u00d4\u00bb\u00bf\u0099\u0087>\u0097AG\u00e6\u00c7<\u00b9\u0093\u0014w\u0011\u00cf\u00f1\u00d9M\u0018\u00c3[So\u00d2\u00cc\u0011Q\u00a8\u0088\u00da\u00d2\u00daS\u00b6\u00170\u00b4\u00ffk6\u00ee-l".length();
                    var4_7 = 240;
                    var3_8 = -1;
lbl18:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl20:
                    // 1 sources

                    while (true) {
                        var0_3[var6_4++] = uc.a(var8_9).intern();
                        if ((var3_8 += var4_7) < var7_6) {
                            var4_7 = var5_5.charAt(var3_8);
                            ** continue;
                        }
                        break block11;
                        break;
                    }
                    v3 = ++var3_8;
                    var8_9 = var1_1.doFinal(var5_5.substring(v3, v3 + var4_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                var11_10 = 2367706817737576068L;
                var17_11 = new long[22];
                var14_12 = 0;
                var15_13 = var0_3[0];
                var16_14 = var15_13.length();
                var13_15 = 0;
                while (true) {
                    var18_16 = var15_13.substring(var13_15, var13_15 += 8).getBytes("ISO-8859-1");
                    v4 = var17_11;
                    v5 = var14_12++;
                    v6 = ((long)var18_16[0] & 255L) << 56 | ((long)var18_16[1] & 255L) << 48 | ((long)var18_16[2] & 255L) << 40 | ((long)var18_16[3] & 255L) << 32 | ((long)var18_16[4] & 255L) << 24 | ((long)var18_16[5] & 255L) << 16 | ((long)var18_16[6] & 255L) << 8 | (long)var18_16[7] & 255L;
                    v7 = -1;
                    break block12;
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var13_15 < var16_14) ** continue;
                    var15_13 = var0_3[1];
                    var16_14 = var15_13.length();
                    var13_15 = 0;
                    while (true) {
                        var18_16 = var15_13.substring(var13_15, var13_15 += 8).getBytes("ISO-8859-1");
                        v4 = var17_11;
                        v5 = var14_12++;
                        v6 = ((long)var18_16[0] & 255L) << 56 | ((long)var18_16[1] & 255L) << 48 | ((long)var18_16[2] & 255L) << 40 | ((long)var18_16[3] & 255L) << 32 | ((long)var18_16[4] & 255L) << 24 | ((long)var18_16[5] & 255L) << 16 | ((long)var18_16[6] & 255L) << 8 | (long)var18_16[7] & 255L;
                        v7 = 0;
                        break block12;
                        break;
                    }
                    break;
                }
lbl57:
                // 1 sources

                while (true) {
                    v4[v5] = v8;
                    if (var13_15 < var16_14) ** continue;
                    break block13;
                    break;
                }
            }
            v8 = v6 ^ var11_10;
            switch (v7) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl68:
                // 1 sources

                ** continue;
            }
        }
        uc.m = var17_11;
        uc.V = new Integer[22];
        uc.v = uc.z();
    }

    private static int h(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x5221;
        try {
            if (V[n3] == null) {
                uc.V[n3] = (int)(m[n3] ^ l2);
            }
        }
        catch (RuntimeException runtimeException) {
            throw uc.a(runtimeException);
        }
        return V[n3];
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static String a(byte[] byArray) {
        int n2 = 0;
        int n3 = byArray.length;
        char[] cArray = new char[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2;
            int n4 = 0xFF & byArray[i2];
            if (n4 < 192) {
                cArray[n2++] = (char)n4;
                continue;
            }
            if (n4 < 224) {
                c2 = (char)((char)(n4 & 0x1F) << 6);
                n4 = byArray[++i2];
                c2 = (char)(c2 | (char)(n4 & 0x3F));
                cArray[n2++] = c2;
                continue;
            }
            if (i2 >= n3 - 2) continue;
            c2 = (char)((char)(n4 & 0xF) << 12);
            n4 = byArray[++i2];
            c2 = (char)(c2 | (char)(n4 & 0x3F) << 6);
            n4 = byArray[++i2];
            c2 = (char)(c2 | (char)(n4 & 0x3F));
            cArray[n2++] = c2;
        }
        return new String(cArray, 0, n2);
    }
}

