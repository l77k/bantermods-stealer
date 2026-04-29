/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.g;
import a.b.c.g.r;
import a.b.c.g.s5;
import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.WinNT;
import java.lang.invoke.MethodHandles;

class l {
    private WinNT.HANDLE w;
    private WinNT.HANDLE r;
    private static final String[] x;
    private static final String[] M;
    private static final long[] K;
    private static final Integer[] t;
    private static final long a;

    private l() {
    }

    /*
     * Exception decompiling
     */
    public void start() throws Exception {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [78[UNCONDITIONALDOLOOP]], but top level block is 79[DOLOOP]
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

    public void close() {
        WinNT.HANDLE hANDLE;
        block9: {
            block10: {
                long l2 = a ^ 0x2A3CAD6B2843L;
                String[] stringArray = g.R();
                String[] stringArray2 = g.i();
                Advapi32.INSTANCE.RevertToSelf();
                String[] stringArray3 = stringArray2;
                String[] stringArray4 = stringArray;
                try {
                    try {
                        try {
                            hANDLE = this.r;
                            if (stringArray4 == null || stringArray3 != null) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw l.b(runtimeException);
                        }
                        if (hANDLE == null) break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw l.L(runtimeException);
                    }
                    Kernel32.INSTANCE.CloseHandle(this.r);
                }
                catch (RuntimeException runtimeException) {
                    throw l.L(runtimeException);
                }
            }
            hANDLE = this.w;
        }
        try {
            if (hANDLE != null) {
                Kernel32.INSTANCE.CloseHandle(this.w);
            }
        }
        catch (RuntimeException runtimeException) {
            throw l.L(runtimeException);
        }
    }

    l(r r2) {
        this();
    }

    private static Exception L(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block34: {
            block33: {
                block31: {
                    block32: {
                        block30: {
                            l.a = s5.a(-5233712547518606207L, 1306685970585251017L, MethodHandles.lookup().lookupClass()).a(240222605538638L);
                            var13 = new String[7];
                            var11_1 = 0;
                            var10_2 = "\u00a0\u0080\u00d8\u00fd\u00b1\u00ce(\u000e\u00c3\u00ad\"&\u0014\u00cd!\u0082\u00a0\u00fa[\u00d5\u00e5\u00dd\u00b9(%\u008e\u00b8\u00a2G\u0002\u00ef!k\u00bb\b\u00e67\u0000\u00bf\u00ed\u00cb\u00e5.\u00e14M\u00d6\u0095\u0099\u0098e7\u00b09\u00dd\u00ec\u0080sz\u0094\u00131\u00c1\u0010\u0083 \u0011\u00c5\u00b0\u00ad\rVB\u00c8\u00dcL\u0003(\u009f\u0017g{\u0081Y\u00a1\u0081T\u00db\u0092\u0010\u00b8P\u008d\u009b\u00e1\u0081MHG\rW\u00a70\u00d9F\u00c2\u00ef> \u0090o\u00f1`<0\u00d2\u0014\u00d1\u0090U\u008fb\u00f0{_\u0094\u0004\u00a8\u008dy\u00be\u00b7A\u0091\u00ba\u00dd\u0094\u0005#\u00ad3\u00d4\u00bd\u00df\u00ees\u00c93d\u00cb\u0019\u0088y\u00f4\u00a9Fc\u00125\u00cd\u00be\u0005\u0002\u0082q\u00d7M\u00d13\u00ba\u0017\u00a1j\nJA\u0092\u00bdX\u00e8'\u000bF\u00df\u0010c\u00b0\u00abeC\u00d4]\u0018\u0014";
                            var12_3 = "\u00a0\u0080\u00d8\u00fd\u00b1\u00ce(\u000e\u00c3\u00ad\"&\u0014\u00cd!\u0082\u00a0\u00fa[\u00d5\u00e5\u00dd\u00b9(%\u008e\u00b8\u00a2G\u0002\u00ef!k\u00bb\b\u00e67\u0000\u00bf\u00ed\u00cb\u00e5.\u00e14M\u00d6\u0095\u0099\u0098e7\u00b09\u00dd\u00ec\u0080sz\u0094\u00131\u00c1\u0010\u0083 \u0011\u00c5\u00b0\u00ad\rVB\u00c8\u00dcL\u0003(\u009f\u0017g{\u0081Y\u00a1\u0081T\u00db\u0092\u0010\u00b8P\u008d\u009b\u00e1\u0081MHG\rW\u00a70\u00d9F\u00c2\u00ef> \u0090o\u00f1`<0\u00d2\u0014\u00d1\u0090U\u008fb\u00f0{_\u0094\u0004\u00a8\u008dy\u00be\u00b7A\u0091\u00ba\u00dd\u0094\u0005#\u00ad3\u00d4\u00bd\u00df\u00ees\u00c93d\u00cb\u0019\u0088y\u00f4\u00a9Fc\u00125\u00cd\u00be\u0005\u0002\u0082q\u00d7M\u00d13\u00ba\u0017\u00a1j\nJA\u0092\u00bdX\u00e8'\u000bF\u00df\u0010c\u00b0\u00abeC\u00d4]\u0018\u0014".length();
                            var9_4 = 31;
                            var8_5 = -1;
lbl8:
                            // 2 sources

                            while (true) {
                                v0 = 49;
                                v1 = ++var8_5;
                                v2 = var10_2.substring(v1, v1 + var9_4);
                                v3 = -1;
                                break block30;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var13[var11_1++] = v4.intern();
                                if ((var8_5 += var9_4) < var12_3) {
                                    var9_4 = var10_2.charAt(var8_5);
                                    ** continue;
                                }
                                var10_2 = "\u0089c\u00d8Y\u00d9\u00aa\u0018\\3\u0019V\u00ac`\u00dei\u00b8C\u00d2\u0013O\u0083\\\u00b0ekX\u00ed\u0095\u0004\u00c3\u00fa\u00c3F\u00e2[";
                                var12_3 = "\u0089c\u00d8Y\u00d9\u00aa\u0018\\3\u0019V\u00ac`\u00dei\u00b8C\u00d2\u0013O\u0083\\\u00b0ekX\u00ed\u0095\u0004\u00c3\u00fa\u00c3F\u00e2[".length();
                                var9_4 = 9;
                                var8_5 = -1;
lbl23:
                                // 2 sources

                                while (true) {
                                    v0 = 31;
                                    v5 = ++var8_5;
                                    v2 = var10_2.substring(v5, v5 + var9_4);
                                    v3 = 0;
                                    break block30;
                                    break;
                                }
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var13[var11_1++] = v4.intern();
                                if ((var8_5 += var9_4) < var12_3) {
                                    var9_4 = var10_2.charAt(var8_5);
                                    ** continue;
                                }
                                break block31;
                                break;
                            }
                        }
                        v6 = v2.toCharArray();
                        v7 = v6.length;
                        var14_6 = 0;
                        try {
                            v8 = v0;
                            v9 = v6;
                            v10 = v7;
                            if (v7 > 1) break block32;
lbl47:
                            // 2 sources

                            while (true) {
                                v11 = v8;
                                v9 = v9;
                                v12 = v9;
                                v13 = v8;
                                v14 = var14_6;
                                break;
                            }
                        }
                        catch (RuntimeException v15) {
                            throw l.b(v15);
                        }
                        while (true) {
                            switch (var14_6 % 7) {
                                case 0: {
                                    v16 = 39;
                                    break;
                                }
                                case 1: {
                                    v16 = 44;
                                    break;
                                }
                                case 2: {
                                    v16 = 113;
                                    break;
                                }
                                case 3: {
                                    v16 = 34;
                                    break;
                                }
                                case 4: {
                                    v16 = 46;
                                    break;
                                }
                                case 5: {
                                    v16 = 10;
                                    break;
                                }
                                default: {
                                    v16 = 98;
                                }
                            }
                            try {
                                v12[v14] = (char)(v12[v14] ^ (v13 ^ v16));
                                ++var14_6;
                                v8 = v11;
                                if (v11 != 0) break;
                                v11 = v8;
                                v9 = v9;
                                v14 = v8;
                                v12 = v9;
                                v13 = v8;
                            }
                            catch (RuntimeException v17) {
                                throw l.b(v17);
                            }
                        }
                    }
                    v18 = v9;
                    v10 = v10;
                    ** while (v10 > var14_6)
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
                l.x = var13;
                l.M = new String[7];
                var0_7 = 7053122273700552131L;
                var6_8 = new long[4];
                var3_9 = 0;
                var4_10 = "\u000f\u00d2\u0019\u008e\u00cdt\u0015\u00bc\u00aa\u00dda\u009fK\u000b\u00ab\u0095";
                var5_11 = "\u000f\u00d2\u0019\u008e\u00cdt\u0015\u00bc\u00aa\u00dda\u009fK\u000b\u00ab\u0095".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v19 = var6_8;
                    v20 = var3_9++;
                    v21 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v22 = -1;
                    break block33;
                    break;
                }
lbl122:
                // 1 sources

                while (true) {
                    v19[v20] = v23;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "!\u009aJ\u00ab\u0006\u008e\u00e0\u0093\u00db\u00dd~@\u00d6\u00ad\u00b4\u00e8";
                    var5_11 = "!\u009aJ\u00ab\u0006\u008e\u00e0\u0093\u00db\u00dd~@\u00d6\u00ad\u00b4\u00e8".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v19 = var6_8;
                        v20 = var3_9++;
                        v21 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v22 = 0;
                        break block33;
                        break;
                    }
                    break;
                }
lbl135:
                // 1 sources

                while (true) {
                    v19[v20] = v23;
                    if (var2_12 < var5_11) ** continue;
                    break block34;
                    break;
                }
            }
            v23 = v21 ^ var0_7;
            switch (v22) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl146:
                // 1 sources

                ** continue;
            }
        }
        l.K = var6_8;
        l.t = new Integer[4];
    }

    /*
     * Unable to fully structure code
     */
    private static String t(int var0, int var1_1) {
        block268: {
            block269: {
                block273: {
                    block274: {
                        block271: {
                            block272: {
                                block270: {
                                    var2_2 = g.R();
                                    var3_3 = (var0 ^ 13554) & 65535;
                                    try {
                                        v0 = l.M[var3_3];
                                        if (var2_2 == null) break block268;
                                        if (v0 != null) break block269;
                                    }
                                    catch (RuntimeException v1) {
                                        throw l.b(v1);
                                    }
                                    var4_4 = l.x[var3_3].toCharArray();
                                    try {
                                        v2 = var4_4[0] & 255;
                                        if (var2_2 == null) break block270;
                                    }
                                    catch (RuntimeException v3) {
                                        throw l.b(v3);
                                    }
                                    {
                                        ** switch (v2)
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        case 0: {
                                            v2 = 197;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        case 1: {
                                            v2 = 66;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        case 2: {
                                            v2 = 15;
                                            break;
                                        }
lbl27:
                                        // 1 sources

                                        case 3: {
                                            v2 = 106;
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        case 4: {
                                            v2 = 125;
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        case 5: {
                                            v2 = 189;
                                            break;
                                        }
lbl36:
                                        // 1 sources

                                        case 6: {
                                            v2 = 12;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        case 7: {
                                            v2 = 195;
                                            break;
                                        }
lbl42:
                                        // 1 sources

                                        case 8: {
                                            v2 = 2;
                                            break;
                                        }
lbl45:
                                        // 1 sources

                                        case 9: {
                                            v2 = 144;
                                            break;
                                        }
lbl48:
                                        // 1 sources

                                        case 10: {
                                            v2 = 135;
                                            break;
                                        }
lbl51:
                                        // 1 sources

                                        case 11: {
                                            v2 = 68;
                                            break;
                                        }
lbl54:
                                        // 1 sources

                                        case 12: {
                                            v2 = 190;
                                            break;
                                        }
lbl57:
                                        // 1 sources

                                        case 13: {
                                            v2 = 13;
                                            break;
                                        }
lbl60:
                                        // 1 sources

                                        case 14: {
                                            v2 = 142;
                                            break;
                                        }
lbl63:
                                        // 1 sources

                                        case 15: {
                                            v2 = 49;
                                            break;
                                        }
lbl66:
                                        // 1 sources

                                        case 16: {
                                            v2 = 251;
                                            break;
                                        }
lbl69:
                                        // 1 sources

                                        case 17: {
                                            v2 = 218;
                                            break;
                                        }
lbl72:
                                        // 1 sources

                                        case 18: {
                                            v2 = 100;
                                            break;
                                        }
lbl75:
                                        // 1 sources

                                        case 19: {
                                            v2 = 184;
                                            break;
                                        }
lbl78:
                                        // 1 sources

                                        case 20: {
                                            v2 = 3;
                                            break;
                                        }
lbl81:
                                        // 1 sources

                                        case 21: {
                                            v2 = 122;
                                            break;
                                        }
lbl84:
                                        // 1 sources

                                        case 22: {
                                            v2 = 67;
                                            break;
                                        }
lbl87:
                                        // 1 sources

                                        case 23: {
                                            v2 = 126;
                                            break;
                                        }
lbl90:
                                        // 1 sources

                                        case 24: {
                                            v2 = 78;
                                            break;
                                        }
lbl93:
                                        // 1 sources

                                        case 25: {
                                            v2 = 75;
                                            break;
                                        }
lbl96:
                                        // 1 sources

                                        case 26: {
                                            v2 = 236;
                                            break;
                                        }
lbl99:
                                        // 1 sources

                                        case 27: {
                                            v2 = 132;
                                            break;
                                        }
lbl102:
                                        // 1 sources

                                        case 28: {
                                            v2 = 219;
                                            break;
                                        }
lbl105:
                                        // 1 sources

                                        case 29: {
                                            v2 = 128;
                                            break;
                                        }
lbl108:
                                        // 1 sources

                                        case 30: {
                                            v2 = 77;
                                            break;
                                        }
lbl111:
                                        // 1 sources

                                        case 31: {
                                            v2 = 32;
                                            break;
                                        }
lbl114:
                                        // 1 sources

                                        case 32: {
                                            v2 = 35;
                                            break;
                                        }
lbl117:
                                        // 1 sources

                                        case 33: {
                                            v2 = 131;
                                            break;
                                        }
lbl120:
                                        // 1 sources

                                        case 34: {
                                            v2 = 39;
                                            break;
                                        }
lbl123:
                                        // 1 sources

                                        case 35: {
                                            v2 = 188;
                                            break;
                                        }
lbl126:
                                        // 1 sources

                                        case 36: {
                                            v2 = 206;
                                            break;
                                        }
lbl129:
                                        // 1 sources

                                        case 37: {
                                            v2 = 103;
                                            break;
                                        }
lbl132:
                                        // 1 sources

                                        case 38: {
                                            v2 = 16;
                                            break;
                                        }
lbl135:
                                        // 1 sources

                                        case 39: {
                                            v2 = 196;
                                            break;
                                        }
lbl138:
                                        // 1 sources

                                        case 40: {
                                            v2 = 247;
                                            break;
                                        }
lbl141:
                                        // 1 sources

                                        case 41: {
                                            v2 = 216;
                                            break;
                                        }
lbl144:
                                        // 1 sources

                                        case 42: {
                                            v2 = 58;
                                            break;
                                        }
lbl147:
                                        // 1 sources

                                        case 43: {
                                            v2 = 71;
                                            break;
                                        }
lbl150:
                                        // 1 sources

                                        case 44: {
                                            v2 = 46;
                                            break;
                                        }
lbl153:
                                        // 1 sources

                                        case 45: {
                                            v2 = 94;
                                            break;
                                        }
lbl156:
                                        // 1 sources

                                        case 46: {
                                            v2 = 237;
                                            break;
                                        }
lbl159:
                                        // 1 sources

                                        case 47: {
                                            v2 = 240;
                                            break;
                                        }
lbl162:
                                        // 1 sources

                                        case 48: {
                                            v2 = 56;
                                            break;
                                        }
lbl165:
                                        // 1 sources

                                        case 49: {
                                            v2 = 153;
                                            break;
                                        }
lbl168:
                                        // 1 sources

                                        case 50: {
                                            v2 = 36;
                                            break;
                                        }
lbl171:
                                        // 1 sources

                                        case 51: {
                                            v2 = 143;
                                            break;
                                        }
lbl174:
                                        // 1 sources

                                        case 52: {
                                            v2 = 112;
                                            break;
                                        }
lbl177:
                                        // 1 sources

                                        case 53: {
                                            v2 = 171;
                                            break;
                                        }
lbl180:
                                        // 1 sources

                                        case 54: {
                                            v2 = 121;
                                            break;
                                        }
lbl183:
                                        // 1 sources

                                        case 55: {
                                            v2 = 8;
                                            break;
                                        }
lbl186:
                                        // 1 sources

                                        case 56: {
                                            v2 = 209;
                                            break;
                                        }
lbl189:
                                        // 1 sources

                                        case 57: {
                                            v2 = 200;
                                            break;
                                        }
lbl192:
                                        // 1 sources

                                        case 58: {
                                            v2 = 152;
                                            break;
                                        }
lbl195:
                                        // 1 sources

                                        case 59: {
                                            v2 = 207;
                                            break;
                                        }
lbl198:
                                        // 1 sources

                                        case 60: {
                                            v2 = 45;
                                            break;
                                        }
lbl201:
                                        // 1 sources

                                        case 61: {
                                            v2 = 239;
                                            break;
                                        }
lbl204:
                                        // 1 sources

                                        case 62: {
                                            v2 = 136;
                                            break;
                                        }
lbl207:
                                        // 1 sources

                                        case 63: {
                                            v2 = 63;
                                            break;
                                        }
lbl210:
                                        // 1 sources

                                        case 64: {
                                            v2 = 108;
                                            break;
                                        }
lbl213:
                                        // 1 sources

                                        case 65: {
                                            v2 = 97;
                                            break;
                                        }
lbl216:
                                        // 1 sources

                                        case 66: {
                                            v2 = 252;
                                            break;
                                        }
lbl219:
                                        // 1 sources

                                        case 67: {
                                            v2 = 255;
                                            break;
                                        }
lbl222:
                                        // 1 sources

                                        case 68: {
                                            v2 = 65;
                                            break;
                                        }
lbl225:
                                        // 1 sources

                                        case 69: {
                                            v2 = 191;
                                            break;
                                        }
lbl228:
                                        // 1 sources

                                        case 70: {
                                            v2 = 141;
                                            break;
                                        }
lbl231:
                                        // 1 sources

                                        case 71: {
                                            v2 = 203;
                                            break;
                                        }
lbl234:
                                        // 1 sources

                                        case 72: {
                                            v2 = 173;
                                            break;
                                        }
lbl237:
                                        // 1 sources

                                        case 73: {
                                            v2 = 172;
                                            break;
                                        }
lbl240:
                                        // 1 sources

                                        case 74: {
                                            v2 = 19;
                                            break;
                                        }
lbl243:
                                        // 1 sources

                                        case 75: {
                                            v2 = 54;
                                            break;
                                        }
lbl246:
                                        // 1 sources

                                        case 76: {
                                            v2 = 1;
                                            break;
                                        }
lbl249:
                                        // 1 sources

                                        case 77: {
                                            v2 = 202;
                                            break;
                                        }
lbl252:
                                        // 1 sources

                                        case 78: {
                                            v2 = 253;
                                            break;
                                        }
lbl255:
                                        // 1 sources

                                        case 79: {
                                            v2 = 228;
                                            break;
                                        }
lbl258:
                                        // 1 sources

                                        case 80: {
                                            v2 = 111;
                                            break;
                                        }
lbl261:
                                        // 1 sources

                                        case 81: {
                                            v2 = 17;
                                            break;
                                        }
lbl264:
                                        // 1 sources

                                        case 82: {
                                            v2 = 186;
                                            break;
                                        }
lbl267:
                                        // 1 sources

                                        case 83: {
                                            v2 = 221;
                                            break;
                                        }
lbl270:
                                        // 1 sources

                                        case 84: {
                                            v2 = 4;
                                            break;
                                        }
lbl273:
                                        // 1 sources

                                        case 85: {
                                            v2 = 185;
                                            break;
                                        }
lbl276:
                                        // 1 sources

                                        case 86: {
                                            v2 = 23;
                                            break;
                                        }
lbl279:
                                        // 1 sources

                                        case 87: {
                                            v2 = 62;
                                            break;
                                        }
lbl282:
                                        // 1 sources

                                        case 88: {
                                            v2 = 140;
                                            break;
                                        }
lbl285:
                                        // 1 sources

                                        case 89: {
                                            v2 = 33;
                                            break;
                                        }
lbl288:
                                        // 1 sources

                                        case 90: {
                                            v2 = 148;
                                            break;
                                        }
lbl291:
                                        // 1 sources

                                        case 91: {
                                            v2 = 156;
                                            break;
                                        }
lbl294:
                                        // 1 sources

                                        case 92: {
                                            v2 = 222;
                                            break;
                                        }
lbl297:
                                        // 1 sources

                                        case 93: {
                                            v2 = 11;
                                            break;
                                        }
lbl300:
                                        // 1 sources

                                        case 94: {
                                            v2 = 205;
                                            break;
                                        }
lbl303:
                                        // 1 sources

                                        case 95: {
                                            v2 = 224;
                                            break;
                                        }
lbl306:
                                        // 1 sources

                                        case 96: {
                                            v2 = 243;
                                            break;
                                        }
lbl309:
                                        // 1 sources

                                        case 97: {
                                            v2 = 83;
                                            break;
                                        }
lbl312:
                                        // 1 sources

                                        case 98: {
                                            v2 = 53;
                                            break;
                                        }
lbl315:
                                        // 1 sources

                                        case 99: {
                                            v2 = 109;
                                            break;
                                        }
lbl318:
                                        // 1 sources

                                        case 100: {
                                            v2 = 82;
                                            break;
                                        }
lbl321:
                                        // 1 sources

                                        case 101: {
                                            v2 = 137;
                                            break;
                                        }
lbl324:
                                        // 1 sources

                                        case 102: {
                                            v2 = 213;
                                            break;
                                        }
lbl327:
                                        // 1 sources

                                        case 103: {
                                            v2 = 169;
                                            break;
                                        }
lbl330:
                                        // 1 sources

                                        case 104: {
                                            v2 = 180;
                                            break;
                                        }
lbl333:
                                        // 1 sources

                                        case 105: {
                                            v2 = 178;
                                            break;
                                        }
lbl336:
                                        // 1 sources

                                        case 106: {
                                            v2 = 177;
                                            break;
                                        }
lbl339:
                                        // 1 sources

                                        case 107: {
                                            v2 = 76;
                                            break;
                                        }
lbl342:
                                        // 1 sources

                                        case 108: {
                                            v2 = 133;
                                            break;
                                        }
lbl345:
                                        // 1 sources

                                        case 109: {
                                            v2 = 30;
                                            break;
                                        }
lbl348:
                                        // 1 sources

                                        case 110: {
                                            v2 = 124;
                                            break;
                                        }
lbl351:
                                        // 1 sources

                                        case 111: {
                                            v2 = 157;
                                            break;
                                        }
lbl354:
                                        // 1 sources

                                        case 112: {
                                            v2 = 211;
                                            break;
                                        }
lbl357:
                                        // 1 sources

                                        case 113: {
                                            v2 = 159;
                                            break;
                                        }
lbl360:
                                        // 1 sources

                                        case 114: {
                                            v2 = 245;
                                            break;
                                        }
lbl363:
                                        // 1 sources

                                        case 115: {
                                            v2 = 217;
                                            break;
                                        }
lbl366:
                                        // 1 sources

                                        case 116: {
                                            v2 = 107;
                                            break;
                                        }
lbl369:
                                        // 1 sources

                                        case 117: {
                                            v2 = 117;
                                            break;
                                        }
lbl372:
                                        // 1 sources

                                        case 118: {
                                            v2 = 254;
                                            break;
                                        }
lbl375:
                                        // 1 sources

                                        case 119: {
                                            v2 = 154;
                                            break;
                                        }
lbl378:
                                        // 1 sources

                                        case 120: {
                                            v2 = 64;
                                            break;
                                        }
lbl381:
                                        // 1 sources

                                        case 121: {
                                            v2 = 120;
                                            break;
                                        }
lbl384:
                                        // 1 sources

                                        case 122: {
                                            v2 = 41;
                                            break;
                                        }
lbl387:
                                        // 1 sources

                                        case 123: {
                                            v2 = 52;
                                            break;
                                        }
lbl390:
                                        // 1 sources

                                        case 124: {
                                            v2 = 241;
                                            break;
                                        }
lbl393:
                                        // 1 sources

                                        case 125: {
                                            v2 = 47;
                                            break;
                                        }
lbl396:
                                        // 1 sources

                                        case 126: {
                                            v2 = 238;
                                            break;
                                        }
lbl399:
                                        // 1 sources

                                        case 127: {
                                            v2 = 89;
                                            break;
                                        }
lbl402:
                                        // 1 sources

                                        case 128: {
                                            v2 = 242;
                                            break;
                                        }
lbl405:
                                        // 1 sources

                                        case 129: {
                                            v2 = 175;
                                            break;
                                        }
lbl408:
                                        // 1 sources

                                        case 130: {
                                            v2 = 10;
                                            break;
                                        }
lbl411:
                                        // 1 sources

                                        case 131: {
                                            v2 = 114;
                                            break;
                                        }
lbl414:
                                        // 1 sources

                                        case 132: {
                                            v2 = 22;
                                            break;
                                        }
lbl417:
                                        // 1 sources

                                        case 133: {
                                            v2 = 25;
                                            break;
                                        }
lbl420:
                                        // 1 sources

                                        case 134: {
                                            v2 = 138;
                                            break;
                                        }
lbl423:
                                        // 1 sources

                                        case 135: {
                                            v2 = 95;
                                            break;
                                        }
lbl426:
                                        // 1 sources

                                        case 136: {
                                            v2 = 146;
                                            break;
                                        }
lbl429:
                                        // 1 sources

                                        case 137: {
                                            v2 = 123;
                                            break;
                                        }
lbl432:
                                        // 1 sources

                                        case 138: {
                                            v2 = 38;
                                            break;
                                        }
lbl435:
                                        // 1 sources

                                        case 139: {
                                            v2 = 208;
                                            break;
                                        }
lbl438:
                                        // 1 sources

                                        case 140: {
                                            v2 = 229;
                                            break;
                                        }
lbl441:
                                        // 1 sources

                                        case 141: {
                                            v2 = 55;
                                            break;
                                        }
lbl444:
                                        // 1 sources

                                        case 142: {
                                            v2 = 139;
                                            break;
                                        }
lbl447:
                                        // 1 sources

                                        case 143: {
                                            v2 = 59;
                                            break;
                                        }
lbl450:
                                        // 1 sources

                                        case 144: {
                                            v2 = 87;
                                            break;
                                        }
lbl453:
                                        // 1 sources

                                        case 145: {
                                            v2 = 168;
                                            break;
                                        }
lbl456:
                                        // 1 sources

                                        case 146: {
                                            v2 = 28;
                                            break;
                                        }
lbl459:
                                        // 1 sources

                                        case 147: {
                                            v2 = 81;
                                            break;
                                        }
lbl462:
                                        // 1 sources

                                        case 148: {
                                            v2 = 149;
                                            break;
                                        }
lbl465:
                                        // 1 sources

                                        case 149: {
                                            v2 = 226;
                                            break;
                                        }
lbl468:
                                        // 1 sources

                                        case 150: {
                                            v2 = 204;
                                            break;
                                        }
lbl471:
                                        // 1 sources

                                        case 151: {
                                            v2 = 104;
                                            break;
                                        }
lbl474:
                                        // 1 sources

                                        case 152: {
                                            v2 = 110;
                                            break;
                                        }
lbl477:
                                        // 1 sources

                                        case 153: {
                                            v2 = 24;
                                            break;
                                        }
lbl480:
                                        // 1 sources

                                        case 154: {
                                            v2 = 79;
                                            break;
                                        }
lbl483:
                                        // 1 sources

                                        case 155: {
                                            v2 = 244;
                                            break;
                                        }
lbl486:
                                        // 1 sources

                                        case 156: {
                                            v2 = 193;
                                            break;
                                        }
lbl489:
                                        // 1 sources

                                        case 157: {
                                            v2 = 48;
                                            break;
                                        }
lbl492:
                                        // 1 sources

                                        case 158: {
                                            v2 = 174;
                                            break;
                                        }
lbl495:
                                        // 1 sources

                                        case 159: {
                                            v2 = 170;
                                            break;
                                        }
lbl498:
                                        // 1 sources

                                        case 160: {
                                            v2 = 9;
                                            break;
                                        }
lbl501:
                                        // 1 sources

                                        case 161: {
                                            v2 = 29;
                                            break;
                                        }
lbl504:
                                        // 1 sources

                                        case 162: {
                                            v2 = 27;
                                            break;
                                        }
lbl507:
                                        // 1 sources

                                        case 163: {
                                            v2 = 210;
                                            break;
                                        }
lbl510:
                                        // 1 sources

                                        case 164: {
                                            v2 = 212;
                                            break;
                                        }
lbl513:
                                        // 1 sources

                                        case 165: {
                                            v2 = 162;
                                            break;
                                        }
lbl516:
                                        // 1 sources

                                        case 166: {
                                            v2 = 91;
                                            break;
                                        }
lbl519:
                                        // 1 sources

                                        case 167: {
                                            v2 = 60;
                                            break;
                                        }
lbl522:
                                        // 1 sources

                                        case 168: {
                                            v2 = 88;
                                            break;
                                        }
lbl525:
                                        // 1 sources

                                        case 169: {
                                            v2 = 84;
                                            break;
                                        }
lbl528:
                                        // 1 sources

                                        case 170: {
                                            v2 = 14;
                                            break;
                                        }
lbl531:
                                        // 1 sources

                                        case 171: {
                                            v2 = 6;
                                            break;
                                        }
lbl534:
                                        // 1 sources

                                        case 172: {
                                            v2 = 250;
                                            break;
                                        }
lbl537:
                                        // 1 sources

                                        case 173: {
                                            v2 = 86;
                                            break;
                                        }
lbl540:
                                        // 1 sources

                                        case 174: {
                                            v2 = 231;
                                            break;
                                        }
lbl543:
                                        // 1 sources

                                        case 175: {
                                            v2 = 61;
                                            break;
                                        }
lbl546:
                                        // 1 sources

                                        case 176: {
                                            v2 = 118;
                                            break;
                                        }
lbl549:
                                        // 1 sources

                                        case 177: {
                                            v2 = 51;
                                            break;
                                        }
lbl552:
                                        // 1 sources

                                        case 178: {
                                            v2 = 101;
                                            break;
                                        }
lbl555:
                                        // 1 sources

                                        case 179: {
                                            v2 = 214;
                                            break;
                                        }
lbl558:
                                        // 1 sources

                                        case 180: {
                                            v2 = 72;
                                            break;
                                        }
lbl561:
                                        // 1 sources

                                        case 181: {
                                            v2 = 220;
                                            break;
                                        }
lbl564:
                                        // 1 sources

                                        case 182: {
                                            v2 = 37;
                                            break;
                                        }
lbl567:
                                        // 1 sources

                                        case 183: {
                                            v2 = 26;
                                            break;
                                        }
lbl570:
                                        // 1 sources

                                        case 184: {
                                            v2 = 73;
                                            break;
                                        }
lbl573:
                                        // 1 sources

                                        case 185: {
                                            v2 = 158;
                                            break;
                                        }
lbl576:
                                        // 1 sources

                                        case 186: {
                                            v2 = 96;
                                            break;
                                        }
lbl579:
                                        // 1 sources

                                        case 187: {
                                            v2 = 248;
                                            break;
                                        }
lbl582:
                                        // 1 sources

                                        case 188: {
                                            v2 = 43;
                                            break;
                                        }
lbl585:
                                        // 1 sources

                                        case 189: {
                                            v2 = 102;
                                            break;
                                        }
lbl588:
                                        // 1 sources

                                        case 190: {
                                            v2 = 130;
                                            break;
                                        }
lbl591:
                                        // 1 sources

                                        case 191: {
                                            v2 = 129;
                                            break;
                                        }
lbl594:
                                        // 1 sources

                                        case 192: {
                                            v2 = 57;
                                            break;
                                        }
lbl597:
                                        // 1 sources

                                        case 193: {
                                            v2 = 20;
                                            break;
                                        }
lbl600:
                                        // 1 sources

                                        case 194: {
                                            v2 = 201;
                                            break;
                                        }
lbl603:
                                        // 1 sources

                                        case 195: {
                                            v2 = 183;
                                            break;
                                        }
lbl606:
                                        // 1 sources

                                        case 196: {
                                            v2 = 161;
                                            break;
                                        }
lbl609:
                                        // 1 sources

                                        case 197: {
                                            v2 = 147;
                                            break;
                                        }
lbl612:
                                        // 1 sources

                                        case 198: {
                                            v2 = 155;
                                            break;
                                        }
lbl615:
                                        // 1 sources

                                        case 199: {
                                            v2 = 74;
                                            break;
                                        }
lbl618:
                                        // 1 sources

                                        case 200: {
                                            v2 = 194;
                                            break;
                                        }
lbl621:
                                        // 1 sources

                                        case 201: {
                                            v2 = 182;
                                            break;
                                        }
lbl624:
                                        // 1 sources

                                        case 202: {
                                            v2 = 7;
                                            break;
                                        }
lbl627:
                                        // 1 sources

                                        case 203: {
                                            v2 = 150;
                                            break;
                                        }
lbl630:
                                        // 1 sources

                                        case 204: {
                                            v2 = 215;
                                            break;
                                        }
lbl633:
                                        // 1 sources

                                        case 205: {
                                            v2 = 92;
                                            break;
                                        }
lbl636:
                                        // 1 sources

                                        case 206: {
                                            v2 = 50;
                                            break;
                                        }
lbl639:
                                        // 1 sources

                                        case 207: {
                                            v2 = 160;
                                            break;
                                        }
lbl642:
                                        // 1 sources

                                        case 208: {
                                            v2 = 199;
                                            break;
                                        }
lbl645:
                                        // 1 sources

                                        case 209: {
                                            v2 = 80;
                                            break;
                                        }
lbl648:
                                        // 1 sources

                                        case 210: {
                                            v2 = 246;
                                            break;
                                        }
lbl651:
                                        // 1 sources

                                        case 211: {
                                            v2 = 249;
                                            break;
                                        }
lbl654:
                                        // 1 sources

                                        case 212: {
                                            v2 = 192;
                                            break;
                                        }
lbl657:
                                        // 1 sources

                                        case 213: {
                                            v2 = 164;
                                            break;
                                        }
lbl660:
                                        // 1 sources

                                        case 214: {
                                            v2 = 187;
                                            break;
                                        }
lbl663:
                                        // 1 sources

                                        case 215: {
                                            v2 = 198;
                                            break;
                                        }
lbl666:
                                        // 1 sources

                                        case 216: {
                                            v2 = 234;
                                            break;
                                        }
lbl669:
                                        // 1 sources

                                        case 217: {
                                            v2 = 176;
                                            break;
                                        }
lbl672:
                                        // 1 sources

                                        case 218: {
                                            v2 = 166;
                                            break;
                                        }
lbl675:
                                        // 1 sources

                                        case 219: {
                                            v2 = 151;
                                            break;
                                        }
lbl678:
                                        // 1 sources

                                        case 220: {
                                            v2 = 179;
                                            break;
                                        }
lbl681:
                                        // 1 sources

                                        case 221: {
                                            v2 = 40;
                                            break;
                                        }
lbl684:
                                        // 1 sources

                                        case 222: {
                                            v2 = 98;
                                            break;
                                        }
lbl687:
                                        // 1 sources

                                        case 223: {
                                            v2 = 223;
                                            break;
                                        }
lbl690:
                                        // 1 sources

                                        case 224: {
                                            v2 = 34;
                                            break;
                                        }
lbl693:
                                        // 1 sources

                                        case 225: {
                                            v2 = 230;
                                            break;
                                        }
lbl696:
                                        // 1 sources

                                        case 226: {
                                            v2 = 181;
                                            break;
                                        }
lbl699:
                                        // 1 sources

                                        case 227: {
                                            v2 = 119;
                                            break;
                                        }
lbl702:
                                        // 1 sources

                                        case 228: {
                                            v2 = 134;
                                            break;
                                        }
lbl705:
                                        // 1 sources

                                        case 229: {
                                            v2 = 115;
                                            break;
                                        }
lbl708:
                                        // 1 sources

                                        case 230: {
                                            v2 = 31;
                                            break;
                                        }
lbl711:
                                        // 1 sources

                                        case 231: {
                                            v2 = 163;
                                            break;
                                        }
lbl714:
                                        // 1 sources

                                        case 232: {
                                            v2 = 165;
                                            break;
                                        }
lbl717:
                                        // 1 sources

                                        case 233: {
                                            v2 = 90;
                                            break;
                                        }
lbl720:
                                        // 1 sources

                                        case 234: {
                                            v2 = 18;
                                            break;
                                        }
lbl723:
                                        // 1 sources

                                        case 235: {
                                            v2 = 5;
                                            break;
                                        }
lbl726:
                                        // 1 sources

                                        case 236: {
                                            v2 = 99;
                                            break;
                                        }
lbl729:
                                        // 1 sources

                                        case 237: {
                                            v2 = 232;
                                            break;
                                        }
lbl732:
                                        // 1 sources

                                        case 238: {
                                            v2 = 21;
                                            break;
                                        }
lbl735:
                                        // 1 sources

                                        case 239: {
                                            v2 = 145;
                                            break;
                                        }
lbl738:
                                        // 1 sources

                                        case 240: {
                                            v2 = 225;
                                            break;
                                        }
lbl741:
                                        // 1 sources

                                        case 241: {
                                            v2 = 127;
                                            break;
                                        }
lbl744:
                                        // 1 sources

                                        case 242: {
                                            v2 = 69;
                                            break;
                                        }
lbl747:
                                        // 1 sources

                                        case 243: {
                                            v2 = 116;
                                            break;
                                        }
lbl750:
                                        // 1 sources

                                        case 244: {
                                            v2 = 105;
                                            break;
                                        }
lbl753:
                                        // 1 sources

                                        case 245: {
                                            v2 = 167;
                                            break;
                                        }
lbl756:
                                        // 1 sources

                                        case 246: {
                                            v2 = 235;
                                            break;
                                        }
lbl759:
                                        // 1 sources

                                        case 247: {
                                            v2 = 227;
                                            break;
                                        }
lbl762:
                                        // 1 sources

                                        case 248: {
                                            v2 = 70;
                                            break;
                                        }
lbl765:
                                        // 1 sources

                                        case 249: {
                                            v2 = 44;
                                            break;
                                        }
lbl768:
                                        // 1 sources

                                        case 250: {
                                            v2 = 0;
                                            break;
                                        }
lbl771:
                                        // 1 sources

                                        case 251: {
                                            v2 = 113;
                                            break;
                                        }
lbl774:
                                        // 1 sources

                                        case 252: {
                                            v2 = 233;
                                            break;
                                        }
lbl777:
                                        // 1 sources

                                        case 253: {
                                            v2 = 93;
                                            break;
                                        }
lbl780:
                                        // 1 sources

                                        case 254: {
                                            v2 = 85;
                                            break;
                                        }
lbl783:
                                        // 1 sources

                                        default: {
                                            v2 = 42;
                                        }
                                    }
                                }
                                var5_5 = v2;
                                var6_6 = (var1_1 & 255) - var5_5;
                                try {
                                    v4 = var6_6;
                                    if (var2_2 == null) break block271;
                                    if (v4 >= 0) break block272;
                                }
                                catch (RuntimeException v5) {
                                    throw l.b(v5);
                                }
                                var6_6 += 256;
                            }
                            v4 = ((var1_1 & 65535) >>> 8) - var5_5;
                        }
                        var7_7 = v4;
                        try {
                            v6 = var7_7;
                            if (var2_2 == null) break block273;
                            if (v6 >= 0) break block274;
                        }
                        catch (RuntimeException v7) {
                            throw l.b(v7);
                        }
                        var7_7 += 256;
                    }
                    v6 = var8_8 = 0;
                }
                if (var2_2 != null) ** GOTO lbl827
                do {
                    var9_9 = var8_8 % 2;
                    v8 = var8_8;
                    v9 = var4_4;
                    v10 = var4_4[v8];
                    v11 = var9_9;
                    if (var2_2 == null) ** GOTO lbl824
                    if (v11 == 0) {
                        v9[v8] = (char)(v10 ^ var6_6);
                        var6_6 = ((var6_6 >>> 3 | var6_6 << 5) ^ var4_4[var8_8]) & 255;
                    } else {
                        v11 = var7_7;
lbl824:
                        // 2 sources

                        v9[v8] = (char)(v10 ^ v11);
                        var7_7 = ((var7_7 >>> 3 | var7_7 << 5) ^ var4_4[var8_8]) & 255;
                    }
                    ++var8_8;
lbl827:
                    // 2 sources

                } while (var8_8 < var4_4.length);
                l.M[var3_3] = new String(var4_4).intern();
            }
            v0 = l.M[var3_3];
        }
        return v0;
    }

    private static int R(int n2, long l2) {
        Integer n3;
        block4: {
            int n4;
            block5: {
                String[] stringArray = g.R();
                n4 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x1EF3;
                try {
                    try {
                        n3 = t[n4];
                        if (stringArray == null) break block4;
                        if (n3 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw l.b(runtimeException);
                    }
                    l.t[n4] = (int)(K[n4] ^ l2);
                }
                catch (RuntimeException runtimeException) {
                    throw l.b(runtimeException);
                }
            }
            n3 = t[n4];
        }
        return n3;
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

