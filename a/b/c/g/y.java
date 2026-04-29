/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.s5;
import a.b.c.g.un;
import com.sun.jna.Native;
import com.sun.jna.win32.W32APIOptions;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class y {
    private static final un d;
    private static final String[] f;
    private static final String[] V;

    private y() {
    }

    private static un H() {
        try {
            String string = y.Z(-3285, -16434);
            un un2 = Native.load(string, un.class, W32APIOptions.UNICODE_OPTIONS);
            return un2;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            try {
                String string = y.Z(-3286, -31433);
                return Native.load(string, un.class);
            }
            catch (Exception exception) {
                throw new RuntimeException();
            }
        }
    }

    static un p() {
        return d;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block20: {
                block21: {
                    var4 = s5.a(8844296424737549003L, 4339933193503041734L, MethodHandles.lookup().lookupClass()).a(137590095390465L) ^ 32838978320343L;
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
                var3_4 = var1_1.doFinal("\u00a8\u00f7\u00b8Gw\u00ba+\u009f\u00ael\u00f35\u00c3\u00bdr*\t\u00efk{O\u00d0kz".getBytes("ISO-8859-1"));
                ** while (true)
                var0_3 = y.a(var3_4).intern();
                var11_5 = new String[2];
                var9_6 = 0;
                var8_7 = var0_3;
                var10_8 = var8_7.length();
                var7_9 = 6;
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
                    v7 = 13;
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
                    throw y.a(v14);
                }
                while (true) {
                    switch (var12_11 % 7) {
                        case 0: {
                            v15 = 112;
                            break;
                        }
                        case 1: {
                            v15 = 93;
                            break;
                        }
                        case 2: {
                            v15 = 103;
                            break;
                        }
                        case 3: {
                            v15 = 52;
                            break;
                        }
                        case 4: {
                            v15 = 46;
                            break;
                        }
                        case 5: {
                            v15 = 94;
                            break;
                        }
                        default: {
                            v15 = 12;
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
                        throw y.a(v16);
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
        y.f = var11_5;
        y.V = new String[2];
        y.d = y.H();
    }

    /*
     * Exception decompiling
     */
    private static String Z(int var0, int var1_1) {
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

