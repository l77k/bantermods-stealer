/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.d;
import a.b.c.g.s5;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class h {
    private static final d Y;
    private static final long[] G;
    private static final Integer[] J;

    private h() {
    }

    private static d W() {
        try {
            char[] cArray = new char[h.e(25028, 3754994297149622839L)];
            cArray[0] = h.e(31008, 3225882678383153884L);
            cArray[1] = h.e(8572, 5519120683095444108L);
            cArray[2] = h.e(23522, 8500815605797728256L);
            cArray[3] = h.e(29890, 5710941039890669365L);
            cArray[4] = h.e(6234, 2603339598195815353L);
            cArray[5] = h.e(14627, 2904941477997662934L);
            char[] cArray2 = cArray;
            String string = new String(cArray2);
            d d2 = Native.load(string, d.class, W32APIOptions.UNICODE_OPTIONS);
            return d2;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            try {
                char[] cArray = new char[h.e(27129, 7415741735708295688L)];
                cArray[0] = h.e(11865, 1603580204298323391L);
                cArray[1] = h.e(23929, 8208779674715076237L);
                cArray[2] = h.e(24464, 6121552092190946408L);
                cArray[3] = h.e(12047, 7897381396786234613L);
                cArray[4] = h.e(17627, 2849856190531088166L);
                cArray[5] = h.e(11041, 2442651254697836762L);
                cArray[h.e((int)24375, (long)333646547192198359L)] = h.e(7835, 7881503389173970300L);
                cArray[h.e((int)30087, (long)6242527179444526705L)] = h.e(30787, 6612217666382336945L);
                cArray[h.e((int)6237, (long)7676007144751756195L)] = h.e(27352, 3631750328074371361L);
                cArray[h.e((int)23667, (long)4633772564760704908L)] = h.e(773, 8230885640543037668L);
                char[] cArray3 = cArray;
                String string = new String(cArray3);
                return Native.load(string, d.class);
            }
            catch (Exception exception) {
                throw new RuntimeException();
            }
        }
    }

    static d n() {
        return Y;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block12: {
                block11: {
                    var9 = s5.a(7466138988830337796L, 2748883342227033024L, MethodHandles.lookup().lookupClass()).a(172222848988179L) ^ 137070369610398L;
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
                    var5_5 = "\u0010\t\u00c2~\u0013w!\u0013\u0084\u0015\u00bc\u00e9\u0014\u00a9\u0005\u00a3b\u001f\u00c2\u0097\u00c1l}2\u00f8\u00c4NR\u00fc\u00ab\u0090^%5\u00ec\u0082\u00abO\u00d5\u0090\u00b0\u0013\u0098\u00cd6LkuI_\u001cY\u000f\u00d3\u00a4\u001e\u0000Qv\u008e\u00b6\u009d\u00ba\r\u00cd\u00c6\u00ff(\u0000\u00e7\u00aa\u00ee\u00c7\u00ef:\u00b6\u0014\u00fa\u00ec\u00db\u0007\u00c7W\u00a2\u0004EQ\u00823\u00a0\u00d6S-\u0094hq\u00ca\u00f9 \n\u0081.lg\u008c\u009b%\u00e0\u000fx\u00abU@\u00d4U7\u0006\u00e1\u00b0\u00f4\u00c9\u0093\u00fc`\u00ee\u0017a\u009a\u00d4\u00b8\u00f2\u00ffQX\u0084\u0080\u00ad\u0097\u00d5'\u0014(\u00f4H\u00c2AQ=\u0087Z\u00a4M\u0098qi\u00d9\u00b1OI\u001f:\u00c5\u0087\u00fc\f\u00f2,:\"\u00bb\u0092~k\u00c7\u00d4\u00fdK\u001d\u00bd\u000bw\u00aeE\u0093\u00d8\u00c9\u00c3+\u00ad\u00f3\u00cd3\u00f1\u0011q\u0085^\u00fb \u00e3;\f:\u00bd4\u00a4\u00a74\u00f0\u0094\u00f67\u00ffO\u00a4\u00eb5\u00f0\u00a8\u00ee\u00ef\u00f6\u00c4j\u00db!\u0007\u0000w\u00ffI\u00f8\u000f\u00a5$\u00d8\u00e0\u00ed@44\u00ffpv>\u001dO \u009dn\u00b6\bV\u00d4\u00c6\u00cb\u0091\u000fv\u008fNV\u001d\u00ad\u0015\u00ec\u00baC\u00c5\u0097\u0091U@";
                    var7_6 = "\u0010\t\u00c2~\u0013w!\u0013\u0084\u0015\u00bc\u00e9\u0014\u00a9\u0005\u00a3b\u001f\u00c2\u0097\u00c1l}2\u00f8\u00c4NR\u00fc\u00ab\u0090^%5\u00ec\u0082\u00abO\u00d5\u0090\u00b0\u0013\u0098\u00cd6LkuI_\u001cY\u000f\u00d3\u00a4\u001e\u0000Qv\u008e\u00b6\u009d\u00ba\r\u00cd\u00c6\u00ff(\u0000\u00e7\u00aa\u00ee\u00c7\u00ef:\u00b6\u0014\u00fa\u00ec\u00db\u0007\u00c7W\u00a2\u0004EQ\u00823\u00a0\u00d6S-\u0094hq\u00ca\u00f9 \n\u0081.lg\u008c\u009b%\u00e0\u000fx\u00abU@\u00d4U7\u0006\u00e1\u00b0\u00f4\u00c9\u0093\u00fc`\u00ee\u0017a\u009a\u00d4\u00b8\u00f2\u00ffQX\u0084\u0080\u00ad\u0097\u00d5'\u0014(\u00f4H\u00c2AQ=\u0087Z\u00a4M\u0098qi\u00d9\u00b1OI\u001f:\u00c5\u0087\u00fc\f\u00f2,:\"\u00bb\u0092~k\u00c7\u00d4\u00fdK\u001d\u00bd\u000bw\u00aeE\u0093\u00d8\u00c9\u00c3+\u00ad\u00f3\u00cd3\u00f1\u0011q\u0085^\u00fb \u00e3;\f:\u00bd4\u00a4\u00a74\u00f0\u0094\u00f67\u00ffO\u00a4\u00eb5\u00f0\u00a8\u00ee\u00ef\u00f6\u00c4j\u00db!\u0007\u0000w\u00ffI\u00f8\u000f\u00a5$\u00d8\u00e0\u00ed@44\u00ffpv>\u001dO \u009dn\u00b6\bV\u00d4\u00c6\u00cb\u0091\u000fv\u008fNV\u001d\u00ad\u0015\u00ec\u00baC\u00c5\u0097\u0091U@".length();
                    var4_7 = 24;
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
                        var0_3[var6_4++] = h.a(var8_9).intern();
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
                var11_10 = 2415388977231342676L;
                var17_11 = new long[22];
                var14_12 = 0;
                var15_13 = var0_3[1];
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
                    var15_13 = var0_3[0];
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
        h.G = var17_11;
        h.J = new Integer[22];
        h.Y = h.W();
    }

    private static int e(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x6BF3;
        try {
            if (J[n3] == null) {
                h.J[n3] = (int)(G[n3] ^ l2);
            }
        }
        catch (RuntimeException runtimeException) {
            throw h.a(runtimeException);
        }
        return J[n3];
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

