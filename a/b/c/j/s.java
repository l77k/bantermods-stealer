/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.j;

import a.b.c.g.s5;
import a.b.c.j.i;
import a.b.c.j.o;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class s {
    private static final String l;
    public static final s INSTANCE;
    private String L;
    private String j;
    private static final String[] G;
    private static final String[] s;
    private static final long a;

    /*
     * Unable to fully structure code
     */
    public void extractCredentials() {
        block27: {
            var1_1 = a.b.c.j.s.a ^ 77903978160394L;
            var3_2 = var1_1 ^ 67049533489796L;
            var7_3 = new File(a.b.c.j.s.l);
            var6_4 = o.b();
            var5_5 = o.Z();
            try {
                if (!var7_3.exists()) {
                    return;
                }
            }
            catch (Throwable v0) {
                throw a.b.c.j.s.u(v0);
            }
            try {
                block28: {
                    var8_6 = new BufferedReader(new FileReader(var7_3));
                    var9_8 = null;
                    var10_9 = new StringBuilder();
                    block20: while ((var11_12 = var8_6.readLine()) != null) {
                        try {
                            var10_9.append(var11_12);
                            do {
                                v1 = var6_4;
                                if (var5_5 != null) {
                                    if (v1) break block27;
                                    v1 = var6_4;
                                }
                                if (!v1) continue block20;
                            } while (var5_5 == null);
                            break;
                        }
                        catch (Throwable v2) {
                            throw a.b.c.j.s.u(v2);
                        }
                    }
                    var12_13 = JsonParser.parseString(var10_9.toString()).getAsJsonObject();
                    this.L = var12_13.get(a.b.c.j.s.C(-10087, 7886)).getAsString();
                    var13_14 = var12_13.get(a.b.c.j.s.C(-10084, -15198)).getAsString();
                    this.j = i.AES_ECB_PKCS5.decrypt(var13_14);
                    this.X(var3_2);
                    if (var8_6 == null) break block27;
                    if (var9_8 == null) break block28;
                    try {
                        var8_6.close();
                    }
                    catch (Throwable var10_10) {
                        var9_8.addSuppressed(var10_10);
                    }
                    break block27;
                }
                var8_6.close();
                break block27;
                catch (Throwable var10_11) {
                    try {
                        var9_8 = var10_11;
                        throw var10_11;
                    }
                    catch (Throwable var14_15) {
                        block30: {
                            block29: {
                                try {
                                    if (var8_6 == null) break block29;
                                    if (var9_8 != null) {
                                    }
                                    ** GOTO lbl73
                                }
                                catch (Throwable v3) {
                                    throw a.b.c.j.s.u(v3);
                                }
                                try {
                                    var8_6.close();
                                }
                                catch (Throwable var15_16) {
                                    try {
                                        try {
                                            v4 = var9_8;
                                            if (var5_5 == null) break block30;
                                            v4.addSuppressed(var15_16);
                                            if (!var6_4) break block29;
                                        }
                                        catch (Throwable v5) {
                                            throw a.b.c.j.s.b(v5);
                                        }
lbl73:
                                        // 2 sources

                                        var8_6.close();
                                    }
                                    catch (Throwable v6) {
                                        throw a.b.c.j.s.u(v6);
                                    }
                                }
                            }
                            v4 = var14_15;
                        }
                        throw v4;
                    }
                }
            }
            catch (Exception var8_7) {
                // empty catch block
            }
        }
    }

    private void X(long l2) {
        block8: {
            block7: {
                String string;
                block6: {
                    l2 = a ^ l2;
                    boolean bl = o.c();
                    try {
                        try {
                            string = this.L;
                            if (!bl) break block6;
                            if (string == null) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw a.b.c.j.s.u(runtimeException);
                        }
                        string = this.j;
                    }
                    catch (RuntimeException runtimeException) {
                        throw a.b.c.j.s.u(runtimeException);
                    }
                }
                if (string != null) break block8;
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public String getCredentials() {
        block13: {
            block14: {
                block12: {
                    var1_1 = a.b.c.j.s.a ^ 12970323853324L;
                    var4_2 = o.c();
                    var3_3 = o.Z();
                    try {
                        try {
                            try {
                                v0 = this.L;
                                v1 = var4_2;
                                if (var3_3 != null) {
                                    if (!v1) break block12;
                                }
                                ** GOTO lbl28
                            }
                            catch (RuntimeException v2) {
                                throw a.b.c.j.s.b(v2);
                            }
                            if (v0 != null) {
                            }
                            ** GOTO lbl33
                        }
                        catch (RuntimeException v3) {
                            throw a.b.c.j.s.u(v3);
                        }
                        v0 = this.j;
                    }
                    catch (RuntimeException v4) {
                        throw a.b.c.j.s.u(v4);
                    }
                }
                try {
                    try {
                        v1 = var4_2;
lbl28:
                        // 2 sources

                        if (!v1) break block13;
                        if (v0 != null) break block14;
                    }
                    catch (RuntimeException v5) {
                        throw a.b.c.j.s.u(v5);
                    }
lbl33:
                    // 2 sources

                    return null;
                }
                catch (RuntimeException v6) {
                    throw a.b.c.j.s.u(v6);
                }
            }
            v0 = a.b.c.j.s.C(-10094, -27527) + this.L + ":" + this.j;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    public static void toOutput(ZipOutputStream var0) {
        block14: {
            var1_1 = a.b.c.j.s.a ^ 58623541824617L;
            var4_2 = o.c();
            var3_3 = o.Z();
            try {
                block15: {
                    block13: {
                        try {
                            a.b.c.j.s.INSTANCE.extractCredentials();
                            v0 = a.b.c.j.s.INSTANCE.L;
                            v1 = var4_2;
                            if (var3_3 != null) {
                                if (!v1) break block13;
                            }
                            ** GOTO lbl29
                        }
                        catch (Exception v2) {
                            throw a.b.c.j.s.b(v2);
                        }
                        try {
                            block16: {
                                if (v0 == null) break block14;
                                break block16;
                                catch (Exception v3) {
                                    throw a.b.c.j.s.u(v3);
                                }
                            }
                            v0 = a.b.c.j.s.INSTANCE.j;
                        }
                        catch (Exception v4) {
                            throw a.b.c.j.s.u(v4);
                        }
                    }
                    v1 = var4_2;
lbl29:
                    // 2 sources

                    if (!v1) break block15;
                    try {
                        block17: {
                            if (v0 == null) break block14;
                            break block17;
                            catch (Exception v5) {
                                throw a.b.c.j.s.u(v5);
                            }
                        }
                        var0.putNextEntry(new ZipEntry(a.b.c.j.s.C(-10086, 13592)));
                        v0 = a.b.c.j.s.INSTANCE.L + ":" + a.b.c.j.s.INSTANCE.j;
                    }
                    catch (Exception v6) {
                        throw a.b.c.j.s.u(v6);
                    }
                }
                var5_4 = v0;
                var0.write(var5_4.getBytes(StandardCharsets.UTF_8));
                var0.closeEntry();
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
                        a.b.c.j.s.a = s5.a(7117103812820681491L, -6849635971438958268L, MethodHandles.lookup().lookupClass()).a(46163827660436L);
                        var9 = a.b.c.j.s.a ^ 128268205998845L;
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
                        var5_5 = ":\u00f5\u0085$\u00f3\u0083\u00ac\u0093\u009d]\u0090l\u00de\u0015\u00b8\u008c\u00f1F\u00bd\u009a\u0082\u0082\u001bUY\u00d5\u00fa\u00a3\u00a7\u00e3\u00fe\u00a3\u0088\u00a2k\u00c3<\u0080hE$\u00b0W4\u00b7M\u009a\u001ace\u0002\u00891\u0005\u00d4\u009b\u000bB\u008a\u00bb^\b\u0016\u0093\u00cb\u00cd\u0098,\\i<\u0017\u008d\u0085\u00b4xuL\u00e3\u00833\u00ee\u0084\"\u001aWa#vj\f[v\u0013Y\u00cc\u0010\u00aau\u00e3\u00a0\u0085P\u00a4x2\u00d2`\u00e4\u00f6y\u00a4zw\u0092\u00ff\u00d6\u00bea\u00c5\u0098\u008a\u008c\u00188\u00c0\u00bcU G\u00a2<\u00c2\u00a8\u0098)'\u00cb\u0015\u0087\u00d6\u00a5\u00a4$s\u00b9\u00c7\u0093o\u00f6\u0091\u00bfA\u0001\u0003B\u00a57OIF\u00e2\t\u0082\u0096\u0084mNU";
                        var7_6 = ":\u00f5\u0085$\u00f3\u0083\u00ac\u0093\u009d]\u0090l\u00de\u0015\u00b8\u008c\u00f1F\u00bd\u009a\u0082\u0082\u001bUY\u00d5\u00fa\u00a3\u00a7\u00e3\u00fe\u00a3\u0088\u00a2k\u00c3<\u0080hE$\u00b0W4\u00b7M\u009a\u001ace\u0002\u00891\u0005\u00d4\u009b\u000bB\u008a\u00bb^\b\u0016\u0093\u00cb\u00cd\u0098,\\i<\u0017\u008d\u0085\u00b4xuL\u00e3\u00833\u00ee\u0084\"\u001aWa#vj\f[v\u0013Y\u00cc\u0010\u00aau\u00e3\u00a0\u0085P\u00a4x2\u00d2`\u00e4\u00f6y\u00a4zw\u0092\u00ff\u00d6\u00bea\u00c5\u0098\u008a\u008c\u00188\u00c0\u00bcU G\u00a2<\u00c2\u00a8\u0098)'\u00cb\u0015\u0087\u00d6\u00a5\u00a4$s\u00b9\u00c7\u0093o\u00f6\u0091\u00bfA\u0001\u0003B\u00a57OIF\u00e2\t\u0082\u0096\u0084mNU".length();
                        var4_7 = 32;
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
                            var0_3[var6_4++] = a.b.c.j.s.a(var8_9).intern();
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
                    var16_10 = new String[9];
                    var14_11 = 0;
                    var13_12 = var0_3[1];
                    var15_13 = var13_12.length();
                    var12_14 = 23;
                    var11_15 = -1;
lbl38:
                    // 2 sources

                    while (true) {
                        v4 = 94;
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
                        var13_12 = var0_3[0];
                        var15_13 = var13_12.length();
                        var12_14 = 9;
                        var11_15 = -1;
lbl53:
                        // 2 sources

                        while (true) {
                            v4 = 30;
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
                    throw a.b.c.j.s.b(v19);
                }
                while (true) {
                    switch (var17_16 % 7) {
                        case 0: {
                            v20 = 19;
                            break;
                        }
                        case 1: {
                            v20 = 89;
                            break;
                        }
                        case 2: {
                            v20 = 23;
                            break;
                        }
                        case 3: {
                            v20 = 73;
                            break;
                        }
                        case 4: {
                            v20 = 52;
                            break;
                        }
                        case 5: {
                            v20 = 54;
                            break;
                        }
                        default: {
                            v20 = 60;
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
                        throw a.b.c.j.s.b(v21);
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
        a.b.c.j.s.G = var16_10;
        a.b.c.j.s.s = new String[9];
        a.b.c.j.s.l = System.getProperty(a.b.c.j.s.C(-10083, -865)) + File.separator + a.b.c.j.s.C(-10081, -27829) + File.separator + a.b.c.j.s.C(-10085, 25173) + File.separator + a.b.c.j.s.C(-10082, 30368) + File.separator + a.b.c.j.s.C(-10088, 13929);
        a.b.c.j.s.INSTANCE = new s();
    }

    private static Throwable u(Throwable throwable) {
        return throwable;
    }

    /*
     * Exception decompiling
     */
    private static String C(int var0, int var1_1) {
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

