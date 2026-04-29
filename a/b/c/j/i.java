/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.j;

import a.b.c.g.s5;
import a.b.c.j.j;
import a.b.c.j.l;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

abstract class i
extends Enum<i> {
    public static final /* enum */ i AES_ECB_PKCS5;
    private static final i[] A;
    private static final String[] u;
    private static final String[] C;

    public static i[] values() {
        return (i[])A.clone();
    }

    public static i valueOf(String string) {
        return Enum.valueOf(i.class, string);
    }

    private i() {
    }

    private static String z(String string) {
        Function<String, String> function = i::lambda$getRiseVers$0;
        return function.andThen(function).andThen(i::S).apply(string);
    }

    private static String S(String string) {
        try {
            byte[] byArray = Base64.getDecoder().decode(string);
            return new String(byArray, StandardCharsets.UTF_8);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public abstract String decrypt(String var1);

    private static String lambda$getRiseVers$0(String string) {
        return i.S(string).replace(i.d(5346, 26759), "").replace(i.d(5347, -4385), "");
    }

    i(j j2) {
        this();
    }

    static String X(String string) {
        return i.z(string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block20: {
                block21: {
                    var4 = s5.a(-1372598232669279410L, 3074442452210342611L, MethodHandles.lookup().lookupClass()).a(143228754572988L) ^ 17966421737250L;
                    var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var4 >>> 56);
                    for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                        v2 = v2;
                        v2[var2_2] = (byte)(var4 << var2_2 * 8 >>> 56);
                    }
                    break block21;
lbl12:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var3_4 = var1_1.doFinal("\u00f9\u00f5\u008a\u00f2O*-A\u00b4r\u0004\u0005+b\u00c5\u00ce\n\u0088\u00a2'\u00df\u00a05\u00e59~\u00c0P\u00c1T\u009a\u001f\u0082\u0098wY6\u009b63\u0080\u00a2\u00b1\u00f3\u009c\f\u001e\u00fc\u0011\u0007\u0083:\u00e3\u00c7\u0010Y\u0001\u00ad\\\u00d4\u0006\u00b1_^\u00a3B\u001c\u0006\u00c8*R\u00d1".getBytes("ISO-8859-1"));
                ** while (true)
                var0_3 = i.a(var3_4).intern();
                var11_5 = new String[3];
                var9_6 = 0;
                var8_7 = var0_3;
                var10_8 = var8_7.length();
                var7_9 = 15;
                var6_10 = -1;
lbl26:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var11_5[var9_6++] = new String(v3).intern();
                    if ((var6_10 += var7_9) < var10_8) {
                        var7_9 = var8_7.charAt(var6_10);
                        ** continue;
                    }
                    break block19;
                    break;
                }
                v4 = ++var6_10;
                v5 = var8_7.substring(v4, v4 + var7_9).toCharArray();
                v6 = v5.length;
                var12_11 = 0;
                try {
                    v7 = 48;
                    v8 = v5;
                    v9 = v6;
                    if (v6 > 1) break block20;
lbl47:
                    // 2 sources

                    while (true) {
                        v10 = v7;
                        v8 = v8;
                        v11 = v8;
                        v12 = v7;
                        v13 = var12_11;
                        break;
                    }
                }
                catch (RuntimeException v14) {
                    throw i.b(v14);
                }
                while (true) {
                    switch (var12_11 % 7) {
                        case 0: {
                            v15 = 5;
                            break;
                        }
                        case 1: {
                            v15 = 111;
                            break;
                        }
                        case 2: {
                            v15 = 62;
                            break;
                        }
                        case 3: {
                            v15 = 54;
                            break;
                        }
                        case 4: {
                            v15 = 110;
                            break;
                        }
                        case 5: {
                            v15 = 14;
                            break;
                        }
                        default: {
                            v15 = 50;
                        }
                    }
                    try {
                        v11[v13] = (char)(v11[v13] ^ (v12 ^ v15));
                        ++var12_11;
                        v7 = v10;
                        if (v10 != 0) break;
                        v10 = v7;
                        v8 = v8;
                        v13 = v7;
                        v11 = v8;
                        v12 = v7;
                    }
                    catch (RuntimeException v16) {
                        throw i.b(v16);
                    }
                }
            }
            v3 = v8;
            v9 = v9;
            ** while (v9 > var12_11)
lbl98:
            // 1 sources

            ** while (true)
        }
        i.u = var11_5;
        i.C = new String[3];
        i.AES_ECB_PKCS5 = new l();
        i.A = new i[]{i.AES_ECB_PKCS5};
    }

    /*
     * Exception decompiling
     */
    private static String d(int var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static RuntimeException b(RuntimeException runtimeException) {
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

