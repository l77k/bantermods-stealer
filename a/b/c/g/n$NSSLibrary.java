/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.n$SECItem;
import a.b.c.g.s5;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface n$NSSLibrary
extends Library {
    public static final n$NSSLibrary INSTANCE;
    public static final String[] a;
    public static final String[] b;
    public static final long c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static n$NSSLibrary loadNSS() {
        String string;
        String[] stringArray;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        long l2 = c ^ 0x3052B57F3D5L;
        String string2 = null;
        String string3 = System.getenv(n$NSSLibrary.u(-31895, -7242));
        String string4 = System.getenv(n$NSSLibrary.u(-31893, 14165));
        String string5 = System.getenv(n$NSSLibrary.u(-31890, 23350));
        String[] stringArray2 = new String[]{n$NSSLibrary.u(-31892, -26957), n$NSSLibrary.u(-31889, -8068), n$NSSLibrary.u(-31894, 32762)};
        try {
            try {
                ArrayList<String> arrayList3;
                arrayList2 = arrayList3;
                arrayList = arrayList3;
                String[] stringArray3 = new String[3];
                stringArray3[0] = string3;
                stringArray3[1] = string4;
                String[] stringArray4 = stringArray3;
                stringArray = stringArray3;
                int n2 = 2;
                string = string5 != null ? Paths.get(string5, n$NSSLibrary.u(-31896, -30543)).toString() : null;
            }
            catch (RuntimeException runtimeException) {
                throw n$NSSLibrary.a(runtimeException);
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            throw n$NSSLibrary.k(unsatisfiedLinkError);
        }
        stringArray4[n2] = string;
        arrayList2(Arrays.asList(stringArray));
        ArrayList<String> arrayList4 = arrayList;
        arrayList4.removeIf(Objects::isNull);
        for (String string6 : arrayList4) {
            for (String string7 : stringArray2) {
                Path path = Paths.get(string6, string7);
                if (!Files.exists(path, new LinkOption[0])) continue;
                string2 = path.toString();
                break;
            }
            try {
                try {
                    if (string2 == null) continue;
                    break;
                }
                catch (RuntimeException runtimeException) {
                    throw n$NSSLibrary.a(runtimeException);
                }
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                throw n$NSSLibrary.k(unsatisfiedLinkError);
            }
        }
        try {
            if (string2 == null) {
                try {
                    return Native.load(n$NSSLibrary.u(-31891, 26258), n$NSSLibrary.class);
                }
                catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                    // empty catch block
                }
            }
        }
        catch (RuntimeException runtimeException) {
            throw n$NSSLibrary.k(runtimeException);
        }
        try {
            if (string2 == null) return null;
            try {
                return Native.load(string2, n$NSSLibrary.class);
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw n$NSSLibrary.k(runtimeException);
        }
    }

    public int NSS_Init(String var1);

    public int NSS_Shutdown();

    public int PK11SDR_Decrypt(n.SECItem var1, n.SECItem var2, Pointer var3);

    public void SECITEM_FreeItem(n.SECItem var1, int var2);

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block30: {
                block28: {
                    block27: {
                        n$NSSLibrary.c = s5.a(-60600896066324790L, -8560844608669076340L, MethodHandles.lookup().lookupClass()).a(30069396050332L);
                        var9 = n$NSSLibrary.c ^ 43438176473843L;
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
                        var5_5 = "KWje\u00e4\u00ea\u00c1s\u00c8\u0010\u00a7\u008d\u00bd\u009d\u00a88g\u001b\u00a8.Zj\u0087\\[\u00ee\u00dd\u00fcS\u0081\u0093}\u0098\u00fb\u00d7\u00fd\u00f8\n\u00b8\u00cf,\u00ea\u0017\u0013n\u00ee\u00d5c\u00a8\u00ca\u009f\u00c4\u0097\u009e\u0082\u008b\u000b#\u001e\u00c6\u00921T\u0015\u0000\u00af\u00e0.\u00df\u00b8':xn\u001dU\f\u0094\u0017H\u00d9y\u00f0\u008e\u00a2\u008em\u0007(\u00ea\u00ff\u0081{\u00d5\u00925(X\u00e6\u00feC\u009f\u007f@Kk\u008fS=[a\u0019\u00a15\u0011\u00e5d3\u00fc\u00ed\u009b\u008e\u00c7\u00ad\u00ec\u00ea[\u0081\u00b2\u00d9\\\u0097\u00c6\u0082\u00fd\u00c5\u00e3\u0084\u00c8\u00ee=\u0014\u00a0\u00dc\u00f8\u00b6\u00b91M\u00f4\u00c1nV\u00b2\u00ded\u00e5\u00d7\t\u008dg\u000f\u00f8\u00d3\u00ba\u00d3\u0015pJ\u0001\u00ce\u00ad\u0094\u00ba\u00c8\u00f32\u009d\u0002\u00d0\u00e3n\u00a9bA\u0001\u0080l\u00a7\u009e@T\u0090?\u008bJ\u0001\u00a7\u001e\u00de\u00a1\u0018\u0011B\u0014\u0014Fn\u00fd\u00cf\u001a\u00ce\u009bN&\\\u00be";
                        var7_6 = "KWje\u00e4\u00ea\u00c1s\u00c8\u0010\u00a7\u008d\u00bd\u009d\u00a88g\u001b\u00a8.Zj\u0087\\[\u00ee\u00dd\u00fcS\u0081\u0093}\u0098\u00fb\u00d7\u00fd\u00f8\n\u00b8\u00cf,\u00ea\u0017\u0013n\u00ee\u00d5c\u00a8\u00ca\u009f\u00c4\u0097\u009e\u0082\u008b\u000b#\u001e\u00c6\u00921T\u0015\u0000\u00af\u00e0.\u00df\u00b8':xn\u001dU\f\u0094\u0017H\u00d9y\u00f0\u008e\u00a2\u008em\u0007(\u00ea\u00ff\u0081{\u00d5\u00925(X\u00e6\u00feC\u009f\u007f@Kk\u008fS=[a\u0019\u00a15\u0011\u00e5d3\u00fc\u00ed\u009b\u008e\u00c7\u00ad\u00ec\u00ea[\u0081\u00b2\u00d9\\\u0097\u00c6\u0082\u00fd\u00c5\u00e3\u0084\u00c8\u00ee=\u0014\u00a0\u00dc\u00f8\u00b6\u00b91M\u00f4\u00c1nV\u00b2\u00ded\u00e5\u00d7\t\u008dg\u000f\u00f8\u00d3\u00ba\u00d3\u0015pJ\u0001\u00ce\u00ad\u0094\u00ba\u00c8\u00f32\u009d\u0002\u00d0\u00e3n\u00a9bA\u0001\u0080l\u00a7\u009e@T\u0090?\u008bJ\u0001\u00a7\u001e\u00de\u00a1\u0018\u0011B\u0014\u0014Fn\u00fd\u00cf\u001a\u00ce\u009bN&\\\u00be".length();
                        var4_7 = 48;
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
                            var0_3[var6_4++] = n$NSSLibrary.a(var8_9).intern();
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
                    var13_12 = var0_3[1];
                    var15_13 = var13_12.length();
                    var12_14 = 17;
                    var11_15 = -1;
lbl38:
                    // 2 sources

                    while (true) {
                        v4 = 120;
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
                        var12_14 = 4;
                        var11_15 = -1;
lbl53:
                        // 2 sources

                        while (true) {
                            v4 = 120;
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
                    throw n$NSSLibrary.a(v19);
                }
                while (true) {
                    switch (var17_16 % 7) {
                        case 0: {
                            v20 = 70;
                            break;
                        }
                        case 1: {
                            v20 = 102;
                            break;
                        }
                        case 2: {
                            v20 = 39;
                            break;
                        }
                        case 3: {
                            v20 = 87;
                            break;
                        }
                        case 4: {
                            v20 = 18;
                            break;
                        }
                        case 5: {
                            v20 = 57;
                            break;
                        }
                        default: {
                            v20 = 4;
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
                        throw n$NSSLibrary.a(v21);
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
        n$NSSLibrary.a = var16_10;
        n$NSSLibrary.b = new String[8];
        n$NSSLibrary.INSTANCE = n$NSSLibrary.loadNSS();
    }

    private static Throwable k(Throwable throwable) {
        return throwable;
    }

    /*
     * Exception decompiling
     */
    private static String u(int var0, int var1_1) {
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

