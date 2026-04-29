/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.j;

import a.b.c.f.u;
import a.b.c.g.s5;
import a.b.c.j.o;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandles;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class t {
    private static final String J;
    private static final String P;
    public static final t INSTANCE;
    private static final String[] e;
    private static final String[] L;
    private static final long Z;
    private static final long C;
    private static final long a;

    public static String getSteamProfileWithLevel() {
        block3: {
            String string;
            long l2;
            block2: {
                long l3 = a ^ 0x2802A745C5ADL;
                l2 = l3 ^ 0x450173C0D2D5L;
                String string2 = t.getSteamIdFromFile(P);
                boolean bl = o.b();
                try {
                    string = string2;
                    if (bl) break block2;
                    if (string == null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw t.Q(runtimeException);
                }
                string = string2;
            }
            int n2 = t.E(string, l2);
            return t.S(25927, 25464) + n2 + t.S(25934, -14967);
        }
        return null;
    }

    public static String getSteamProfileInfo() {
        StringBuilder stringBuilder;
        block9: {
            StringBuilder stringBuilder2;
            block10: {
                long l2;
                long l3 = l2 = a ^ 0x618F157B3025L;
                long l4 = l3 ^ 0xC8CC1FE275DL;
                long l5 = l3 ^ 0x2F21C356639FL;
                long l6 = l3 ^ 0x1870E07DDDCL;
                long l7 = l3 ^ 0x4B41E9587FE5L;
                u[] uArray = o.Z();
                List<String> list = t.getSteamIdsFromFile(P);
                boolean bl = o.c();
                try {
                    if (list.isEmpty()) {
                        return null;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw t.Q(runtimeException);
                }
                stringBuilder2 = new StringBuilder();
                block6: for (String string : list) {
                    String string2 = t.Y(l7, string);
                    String string3 = t.S(25923, 3525) + string;
                    String string4 = t.b(string, l6);
                    int n2 = t.c(l5, string);
                    int n3 = t.E(string, l4);
                    try {
                        try {
                            stringBuilder = stringBuilder2.append(t.S(25928, 23230)).append(t.S(25929, -9577)).append(string).append("\n").append(t.S(25921, -22370)).append(string2).append("\n").append(t.S(25932, 22552)).append(string3).append("\n").append(t.S(25938, -15566)).append(string4).append("\n").append(t.S(25965, -20211)).append(n2).append("\n").append(t.S(25939, 26339)).append(n3).append("\n");
                            if (uArray == null) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw t.b(runtimeException);
                        }
                        while (bl) {
                            if (bl) continue block6;
                            if (uArray == null) continue;
                            break block6;
                        }
                        break block10;
                    }
                    catch (RuntimeException runtimeException) {
                        throw t.Q(runtimeException);
                    }
                }
                stringBuilder2.append(t.S(25960, -10110));
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    /*
     * Exception decompiling
     */
    public static String getSteamIdFromFile(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 38[WHILELOOP]
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
     * Exception decompiling
     */
    public static List<String> getSteamIdsFromFile(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 29[DOLOOP]
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int E(String var0, long var1_1) {
        block18: {
            var3_2 = (var1_1 = t.a ^ var1_1) ^ 5551869532791L;
            var6_3 = o.b();
            var5_4 = o.Z();
            try {
                block20: {
                    block19: {
                        block21: {
                            block17: {
                                var7_5 = String.format(t.S(25950, 20861), new Object[]{t.S(25930, -10740), var0});
                                var8_7 = t.A(var3_2, var7_5);
                                try {
                                    try {
                                        v0 = var8_7;
                                        v1 = var6_3;
                                        if (var5_4 != null) {
                                            if (v1 != 0) break block17;
                                        }
                                        ** GOTO lbl31
                                    }
                                    catch (Exception v2) {
                                        throw t.b(v2);
                                    }
                                    if (v0 == null) break block18;
                                }
                                catch (Exception v3) {
                                    throw t.Q(v3);
                                }
                                v0 = var8_7;
                            }
                            try {
                                if (var5_4 == null) break block19;
                                v1 = 25949;
                            }
                            catch (Exception v4) {
                                throw t.b(v4);
                            }
lbl31:
                            // 2 sources

                            v5 = t.S(v1, -13849);
                            if (var6_3 != 0) break block21;
                            try {
                                block22: {
                                    if (!v0.has(v5)) break block18;
                                    break block22;
                                    catch (Exception v6) {
                                        throw t.Q(v6);
                                    }
                                }
                                v7 = var8_7;
                                v5 = t.S(25920, -4785);
                            }
                            catch (Exception v8) {
                                throw t.Q(v8);
                            }
                        }
                        v0 = v7.getAsJsonObject(v5);
                    }
                    var9_8 = v0;
                    v9 = var9_8.has(t.S(25947, -22938));
                    if (var6_3 != 0) break block20;
                    try {
                        block23: {
                            if (v9 == 0) break block18;
                            break block23;
                            catch (Exception v10) {
                                throw t.Q(v10);
                            }
                        }
                        v9 = var9_8.get(t.S(25941, -14559)).getAsInt();
                    }
                    catch (Exception v11) {
                        throw t.Q(v11);
                    }
                }
                return v9;
            }
            catch (Exception var7_6) {
                // empty catch block
            }
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String Y(long var0, String var2_1) {
        block33: {
            var3_2 = (var0 = t.a ^ var0) ^ 73399071163087L;
            var6_3 = o.b();
            var5_4 = o.Z();
            try {
                block38: {
                    block39: {
                        block36: {
                            block37: {
                                block35: {
                                    block42: {
                                        block34: {
                                            block40: {
                                                block32: {
                                                    var7_5 = String.format(t.S(25967, 19384), new Object[]{t.S(25926, -22917), var2_1});
                                                    var8_7 = t.A(var3_2, var7_5);
                                                    try {
                                                        try {
                                                            v0 = var8_7;
                                                            v1 = var6_3;
                                                            if (var5_4 != null) {
                                                                if (v1 != 0) break block32;
                                                            }
                                                            ** GOTO lbl31
                                                        }
                                                        catch (Exception v2) {
                                                            throw t.b(v2);
                                                        }
                                                        if (v0 == null) break block33;
                                                    }
                                                    catch (Exception v3) {
                                                        throw t.Q(v3);
                                                    }
                                                    v0 = var8_7;
                                                }
                                                try {
                                                    if (var5_4 == null) break block34;
                                                    v1 = 25920;
                                                }
                                                catch (Exception v4) {
                                                    throw t.b(v4);
                                                }
lbl31:
                                                // 2 sources

                                                v5 = t.S(v1, -4785);
                                                if (var6_3 != 0) break block40;
                                                try {
                                                    block41: {
                                                        if (!v0.has(v5)) break block33;
                                                        break block41;
                                                        catch (Exception v6) {
                                                            throw t.Q(v6);
                                                        }
                                                    }
                                                    v7 = var8_7;
                                                    v5 = t.S(25920, -4785);
                                                }
                                                catch (Exception v8) {
                                                    throw t.Q(v8);
                                                }
                                            }
                                            v0 = v7.getAsJsonObject(v5);
                                        }
                                        var9_8 = v0;
                                        try {
                                            v9 = var9_8.has(t.S(25962, 27776));
                                            if (var5_4 == null || var6_3 != 0) break block35;
                                        }
                                        catch (Exception v10) {
                                            throw t.b(v10);
                                        }
                                        if (v9 == 0) break block33;
                                        break block42;
                                        catch (Exception v11) {
                                            throw t.Q(v11);
                                        }
                                    }
                                    try {
                                        try {
                                            v12 = var9_8;
                                            if (var5_4 == null) break block36;
                                            v13 = v12.getAsJsonArray(t.S(25946, -24065));
                                            if (var6_3 == 0) {
                                            }
                                            break block37;
                                        }
                                        catch (Exception v14) {
                                            throw t.b(v14);
                                        }
                                        catch (Exception v15) {
                                            throw t.Q(v15);
                                        }
                                        v9 = v13.size();
                                    }
                                    catch (Exception v16) {
                                        throw t.Q(v16);
                                    }
                                }
                                try {
                                    if (v9 <= 0) break block33;
                                    v13 = var9_8.getAsJsonArray(t.S(25946, -24065)).get(0);
                                }
                                catch (Exception v17) {
                                    throw t.Q(v17);
                                }
                            }
                            v12 = v13.getAsJsonObject();
                        }
                        var10_9 = v12;
                        try {
                            v18 = var10_9;
                            if (var5_4 == null) break block38;
                            v19 = t.S(25951, -6282);
                            if (var6_3 != 0) break block39;
                        }
                        catch (Exception v20) {
                            throw t.b(v20);
                        }
                        try {
                            block43: {
                                if (!v18.has(v19)) break block33;
                                break block43;
                                catch (Exception v21) {
                                    throw t.Q(v21);
                                }
                            }
                            v22 = var10_9;
                            v19 = t.S(25933, 7353);
                        }
                        catch (Exception v23) {
                            throw t.Q(v23);
                        }
                    }
                    v18 = v22.get(v19);
                }
                return v18.getAsString();
            }
            catch (Exception var7_6) {
                // empty catch block
            }
        }
        return t.S(25924, 8440);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String b(String var0, long var1_1) {
        block33: {
            var3_2 = (var1_1 = t.a ^ var1_1) ^ 8827949801718L;
            var6_3 = o.b();
            var5_4 = o.Z();
            try {
                block38: {
                    block39: {
                        block36: {
                            block37: {
                                block35: {
                                    block42: {
                                        block34: {
                                            block40: {
                                                block32: {
                                                    var7_5 = String.format(t.S(25925, -31660), new Object[]{t.S(25926, -22917), var0});
                                                    var8_7 = t.A(var3_2, var7_5);
                                                    try {
                                                        try {
                                                            v0 = var8_7;
                                                            v1 = var6_3;
                                                            if (var5_4 != null) {
                                                                if (v1 != 0) break block32;
                                                            }
                                                            ** GOTO lbl31
                                                        }
                                                        catch (Exception v2) {
                                                            throw t.b(v2);
                                                        }
                                                        if (v0 == null) break block33;
                                                    }
                                                    catch (Exception v3) {
                                                        throw t.Q(v3);
                                                    }
                                                    v0 = var8_7;
                                                }
                                                try {
                                                    if (var5_4 == null) break block34;
                                                    v1 = 25920;
                                                }
                                                catch (Exception v4) {
                                                    throw t.b(v4);
                                                }
lbl31:
                                                // 2 sources

                                                v5 = t.S(v1, -4785);
                                                if (var6_3 != 0) break block40;
                                                try {
                                                    block41: {
                                                        if (!v0.has(v5)) break block33;
                                                        break block41;
                                                        catch (Exception v6) {
                                                            throw t.Q(v6);
                                                        }
                                                    }
                                                    v7 = var8_7;
                                                    v5 = t.S(25920, -4785);
                                                }
                                                catch (Exception v8) {
                                                    throw t.Q(v8);
                                                }
                                            }
                                            v0 = v7.getAsJsonObject(v5);
                                        }
                                        var9_8 = v0;
                                        try {
                                            v9 = var9_8.has(t.S(25946, -24065));
                                            if (var5_4 == null || var6_3 != 0) break block35;
                                        }
                                        catch (Exception v10) {
                                            throw t.b(v10);
                                        }
                                        if (v9 == 0) break block33;
                                        break block42;
                                        catch (Exception v11) {
                                            throw t.Q(v11);
                                        }
                                    }
                                    try {
                                        try {
                                            v12 = var9_8;
                                            if (var5_4 == null) break block36;
                                            v13 = v12.getAsJsonArray(t.S(25946, -24065));
                                            if (var6_3 == 0) {
                                            }
                                            break block37;
                                        }
                                        catch (Exception v14) {
                                            throw t.b(v14);
                                        }
                                        catch (Exception v15) {
                                            throw t.Q(v15);
                                        }
                                        v9 = v13.size();
                                    }
                                    catch (Exception v16) {
                                        throw t.Q(v16);
                                    }
                                }
                                try {
                                    if (v9 <= 0) break block33;
                                    v13 = var9_8.getAsJsonArray(t.S(25946, -24065)).get(0);
                                }
                                catch (Exception v17) {
                                    throw t.Q(v17);
                                }
                            }
                            v12 = v13.getAsJsonObject();
                        }
                        var10_9 = v12;
                        try {
                            v18 = var10_9;
                            if (var5_4 == null) break block38;
                            v19 = t.S(25963, 22562);
                            if (var6_3 != 0) break block39;
                        }
                        catch (Exception v20) {
                            throw t.b(v20);
                        }
                        try {
                            block43: {
                                if (!v18.has(v19)) break block33;
                                break block43;
                                catch (Exception v21) {
                                    throw t.Q(v21);
                                }
                            }
                            v22 = var10_9;
                            v19 = t.S(25945, -9395);
                        }
                        catch (Exception v23) {
                            throw t.Q(v23);
                        }
                    }
                    v18 = v22.get(v19);
                }
                var11_10 = v18.getAsLong();
                return new SimpleDateFormat(t.S(25957, -26974)).format(new Date(var11_10 * t.C));
            }
            catch (Exception var7_6) {
                // empty catch block
            }
        }
        return t.S(25940, -17572);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static int c(long var0, String var2_1) {
        block18: {
            var3_2 = (var0 = t.a ^ var0) ^ 42475743764149L;
            var6_3 = o.c();
            var5_4 = o.Z();
            try {
                block20: {
                    block19: {
                        block21: {
                            block17: {
                                var7_5 = String.format(t.S(25935, -25564), new Object[]{t.S(25926, -22917), var2_1});
                                var8_7 = t.A(var3_2, var7_5);
                                try {
                                    try {
                                        v0 = var8_7;
                                        v1 = var6_3;
                                        if (var5_4 != null) {
                                            if (v1 == 0) break block17;
                                        }
                                        ** GOTO lbl31
                                    }
                                    catch (Exception v2) {
                                        throw t.b(v2);
                                    }
                                    if (v0 == null) break block18;
                                }
                                catch (Exception v3) {
                                    throw t.Q(v3);
                                }
                                v0 = var8_7;
                            }
                            try {
                                if (var5_4 == null) break block19;
                                v1 = 25920;
                            }
                            catch (Exception v4) {
                                throw t.b(v4);
                            }
lbl31:
                            // 2 sources

                            v5 = t.S(v1, -4785);
                            if (var6_3 == 0) break block21;
                            try {
                                block22: {
                                    if (!v0.has(v5)) break block18;
                                    break block22;
                                    catch (Exception v6) {
                                        throw t.Q(v6);
                                    }
                                }
                                v7 = var8_7;
                                v5 = t.S(25920, -4785);
                            }
                            catch (Exception v8) {
                                throw t.Q(v8);
                            }
                        }
                        v0 = v7.getAsJsonObject(v5);
                    }
                    var9_8 = v0;
                    v9 = var9_8.has(t.S(25936, -19729));
                    if (var6_3 == 0) break block20;
                    try {
                        block23: {
                            if (v9 == 0) break block18;
                            break block23;
                            catch (Exception v10) {
                                throw t.Q(v10);
                            }
                        }
                        v9 = var9_8.get(t.S(25966, -17131)).getAsInt();
                    }
                    catch (Exception v11) {
                        throw t.Q(v11);
                    }
                }
                return v9;
            }
            catch (Exception var7_6) {
                // empty catch block
            }
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    private static JsonObject A(long var0, String var2_1) {
        block36: {
            block38: {
                block37: {
                    var0 = t.a ^ var0;
                    var4_2 = o.c();
                    var3_3 = o.Z();
                    var5_4 = new URL(var2_1);
                    var6_6 = (HttpURLConnection)var5_4.openConnection();
                    var6_6.setRequestMethod(t.S(25943, -14628));
                    var6_6.setRequestProperty(t.S(25931, -1979), t.S(25964, -3664));
                    var7_7 = var6_6.getResponseCode();
                    if (var7_7 != (int)t.Z) break block36;
                    var8_8 = new BufferedReader(new InputStreamReader(var6_6.getInputStream()));
                    var9_9 = null;
                    var10_10 = new StringBuilder();
                    block29: while ((var11_12 = var8_8.readLine()) != null) {
                        do {
                            v0 = var3_3;
                            do {
                                if (v0 != null) {
                                    try {
                                        v1 = var10_10.append(var11_12);
                                        if (!var4_2) break block37;
                                    }
                                    catch (Throwable v2) {
                                        throw t.b(v2);
                                    }
                                }
                                if (var4_2) continue block29;
                                v0 = var3_3;
                            } while (var0 < 0L);
                        } while (v0 == null);
                        break;
                        catch (Throwable v3) {
                            throw t.Q(v3);
                        }
                    }
                    v1 = var10_10;
                }
                var12_13 = JsonParser.parseString(v1.toString()).getAsJsonObject();
                try {
                    if (var8_8 == null) break block38;
                    if (var9_9 != null) {
                    }
                    ** GOTO lbl57
                }
                catch (Throwable v4) {
                    throw t.Q(v4);
                }
                try {
                    var8_8.close();
                }
                catch (Throwable var13_14) {
                    try {
                        var9_9.addSuppressed(var13_14);
                        if (var3_3 == null) break block38;
                        try {
                            block41: {
                                if (var4_2) break block38;
                                break block41;
                                catch (Throwable v5) {
                                    throw t.b(v5);
                                }
                            }
                            var8_8.close();
                        }
                        catch (Throwable v6) {
                            throw t.b(v6);
                        }
                    }
                    catch (Throwable v7) {
                        throw t.Q(v7);
                    }
                }
            }
            return var12_13;
            catch (Throwable var10_11) {
                try {
                    try {
                        var9_9 = var10_11;
                        throw var10_11;
                    }
                    catch (Throwable var14_15) {
                        block40: {
                            block39: {
                                try {
                                    if (var8_8 == null) break block39;
                                    if (var9_9 != null) {
                                    }
                                    ** GOTO lbl93
                                }
                                catch (Throwable v8) {
                                    throw t.Q(v8);
                                }
                                try {
                                    var8_8.close();
                                }
                                catch (Throwable var15_16) {
                                    try {
                                        try {
                                            if (var0 > 0L) {
                                                v9 = var9_9;
                                                if (var3_3 == null) break block40;
                                                v9.addSuppressed(var15_16);
                                            }
                                            if (var4_2) break block39;
                                        }
                                        catch (Throwable v10) {
                                            throw t.b(v10);
                                        }
lbl93:
                                        // 2 sources

                                        var8_8.close();
                                    }
                                    catch (Throwable v11) {
                                        throw t.Q(v11);
                                    }
                                }
                            }
                            v9 = var14_15;
                        }
                        throw v9;
                    }
                }
                catch (Exception var5_5) {
                    // empty catch block
                }
            }
        }
        return null;
    }

    /*
     * Loose catch block
     */
    public void toOutput(ZipOutputStream zipOutputStream) {
        block7: {
            long l2 = a ^ 0x54997942815L;
            boolean bl = o.c();
            try {
                block6: {
                    String string = t.getSteamProfileInfo();
                    if (!bl) break block6;
                    try {
                        block8: {
                            if (string == null) break block7;
                            break block8;
                            catch (Exception exception) {
                                throw t.Q(exception);
                            }
                        }
                        zipOutputStream.putNextEntry(new ZipEntry(t.S(25944, 13472)));
                        zipOutputStream.write(string.getBytes(StandardCharsets.UTF_8));
                    }
                    catch (Exception exception) {
                        throw t.Q(exception);
                    }
                }
                zipOutputStream.closeEntry();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
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
                            block29: {
                                t.a = s5.a(4608122333020863705L, 6912459456148762959L, MethodHandles.lookup().lookupClass()).a(217239570988909L);
                                var9 = t.a ^ 56785383274637L;
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
                                var5_5 = "G\u00e3\u00f0\u00a2\u0016C\u00a5P\u00cfJ\u0007$\u00be\u0083\u00df\u009dx\u0015\u00e2;\u0086\u0090\u00e2M\u008c:\u00a3\u00a4Y\u0017>M\u0548\u00e5@E&\u00ab\u009a\u00c7d\u00e3\u0006\u00b4\u0094\u00d9\u00e3G\u0088\u001aZ\u001d^\u00fckRq\u0097\n9|\u00e3$\u0092\u00cfMZ\u00049\u00a1\u00e0\u0012$_\u00c9\u001a\u00c7\u008f\u00d2\u00c2\u00ce6\u00ed\u001f\u0011\u0081\u00ffv\u00be\u007f\u009bj\u00fc\u0089\u00cc/+\u0007a\u00e3^I+\u00d1\u009c\u000b\u00b7/\u00f3\u00ed\u00c1\u00f5\u0001\u00c6o\u0083\u00f0\u00e7`n\u00fcZ\u00cc|\u009f\u0083\u00b1\u00bb\u00e2Y\u00ec\rR\u0098\u00d6\u00d1\u00ff\u00b97ah\\\u0097J);\u00d8\u00ce\u000f\u00fd\u0013v\u00f7M\u00c8\u0096)Z\u00d0/\u0011]\u0001||\u0005%U\u00acG\u008a\u0004\u00e4f\u000b\u00ab\u00c2\u001fLV\u00ce\u00ba\u00fc\u00d1\u00d4\u00d7/\u00b3v\b<\u00fd\u00ce\u00e2\u0002\u009cn\u00c2\u00f0\u00fcn_\u0086\u00d9\u00f38\u00c8\u00e1\u00d62\u00c9sq\u000e\u00b6s\u00f6Nys0\u00c6nv\u008a\u0090\u0092\u00a0\u00f7q\u00af+\u00f8\u009f\u00c6<\u00c6\ff\u0012\u00a7t-\u008fw6\u00e3\u0007\u00da\u009b\u00ed\u00a0\u009e\u0007\u00b3\u00e1\u00d3\u00c3q\u00f0nZ\u00e9\u009d<2 \u009c\u0083]O\u00e6\u00a7\u008e\u00ccyFN\u00a9TQV\u0019\u00a0\u00cc?\u00a6\u00cc\u00f7G\u00d0\u0083V\u00ebn\u00ddY\u00f9\u00b6\u008a\u009fs\u001aoV\u00a5\u001e\u001b\u00bb\u00db\u00b9\u00c5\u00b5\u00c4\u009e\u00e8s\u00a6\u00fa\u00117\u0012\u00e1\u00e8\u0085[\u0085\u00b0\u00d0\u00ec\u007f\u00af1k\u00d34\u00e5\u009f\u00af\u00b4\u00e3\u0004\u00dd\u001cr\u0019&\u00c7\u00dewhd\u00ce\u0010\u00fcg\u00e4\u00ea\u00ec2b\u0096\u0019\u00c6\u00f2\u00dc~?\u0090\u0019\u00fa$b\u00d2=:\u00a3\u00d3\u00cb={\u009aZ\u0006x\u00aaZ\r\n\u00e2\u00a5\u00b8\u00c6f\u00d6/\u001f8\u0019\u00cbht\u001a&\u00b0\u00bf\u00df\u0000\u00e9H\u0007#\u0099o\u00fbx\t\u00f5,b\u0089\u008b\u00ef\u0006\u00ca\u001e\u001a\u0006U:h\u00b3\u0089\u0017A\u00be|y\u00dc\u001e+\u00d3\u00ae\u00b0\u00b9\u009dM\u00d4\u00a46\u00dds\u00b8\u00c2\u00a82\u0015\u0012\u0093\u00b0\u00b7T\u00cdCG\u00b7\u00d6\u00d3\b\u00f9\u0089\u0005\u00bb\u00ca\u0094\u00b1>\u0088\u00e1\b\u00dd2\u00d7\u00f1\u00eb\u0007\u0085\u0090\u008c2\u00a8\u00b8a\u008cZj\u0012\u00a2\u00fc\u00d1^~Y\u00a4\u00baEa\u0013%\u00ee\u00f28\u009f\u00c1\u00e5mi/\u0007b\u00ac\u00fd\u00f5\u00e1\u00aaW\u0086g\u0099z\u0085c\u0096\u0088\u0014\u00f8\u00a6m\u00b4\u00cd\u00f0`r\u00bfk\u00d5\u00af\u00e6(\u00d8@Cq0\u00efd\u00fbP\u00cf\u001d\u00e3\u00b10\u00fc3/\u0086P\\v\u0094\u0016=\u0091h\u0088\u0086\u009e\u00df=\\\u001a\u0097\u0081\u00e8jU\u00c4\u00ca\u00bdX\u00abx\u00f8=\u0019\u008c\u001dS\u00bc4\u00f5\u00ff:.\u00d8\u00c2\\\u00dfi\u00abc\u00a4\u00edB\u00c1\u00ea\u009f\u00a7\u00fb\u00f0&d\u00fc\u00d5\u0015\u0095K\u00d5\u0005\u00a2\u00cf0|\u00a9J\u00bb\u0094\u00f0\tv\u00af\u00a7wY\u00af\u00e3\u00bb\u00a5\u00a0+3\u008fM\u00dc\u00b6\u0012\r\u008e\u00d8\u00b3\u001c\u00cf\u00ad\u001d\u00d8\u008a\u000f\u008e\u00ab\u00ad\u00b3\u00d8\u009b\u00dfGs\u00b3|\u00c6\u0002p:\u00068\u00de\u00edE'\u0082\u0084\u000f\u00d20h\u009dm&\u00f1$\u0012}-v\u00da\u00a5H\u00d2oy\u00c3\u00c1\u0010M\u00a6\u0010\u00e8\u00ac\u008f-\u00d4h\u0086\u00c0\u00cb\rx\u00fe\u00cea\u00d3\u00e05r\u0099\u00c4q\u00dc\u0015?\u00e4\u0098g\u00c4K\u00f5$\u00f9\u00db\\E\u00c5\u0019=\u0005\u008agj*\u00c8\u00e5o\u008b\u00d2p\u0000=\u009ce\u0096]\u00f5\u00b6\u00be\u0012|\u00e2\u0080;\u001f\u00dc6\u00fa\u000e\u0015\u00de\u0001\u00a4\u00f10'\u0006(\u00e61e]\u0016\u009f\u00c0\u0006\u007f\u00be\u00e0\u00d1\u00c4\\\u00a7\t\u007f \u00d0\u008b\u0098fg\u00cd\u0007e\u0096Gs\u00ff\u00ceK0Z\u00bd\u00c8\u00bd\u00a4}Q\u008f\u00b6\u001a\u00f6\u00b5\u0003\u0001w\u0004\u0084\u0084\u009cLA4Qwt+~\u00f4r\u00e6n\u00cb\u0083\u00f6?Mx'\u00b9\u00c6{s6\u00c6\u00ba#\n\u00db\u008f-^\u00d1\u009c\u001d\u00ce\u00e7\u00d4{`n[\u0019E&\u0007\u00bc\u0088\u00cf5\u00actL\u00c2\u00fd\u00ecz$Q\u00db\u0010\u00acG\u007f\u0012\u00dc\u0019,\u00c8\u0080\u00d4p\u0083\u00bf\u009d\u00de~:\u0098\u0013SD\u008cx\u00f6\u0091\u00a8\u0080:\u00e4\u009du\u00f9O\u0019\t\u00f8hO8(\u00d23\u00ec|Q\u00a60s\u00d1\u00f3\u009a\u0013{\u000e(rH8)z\u00f82\u000bf\u0015G\u0092YV\u00b8\u00e1L\u00d2\u00b0\u0012\u00cf\u008as\u00e6\u000b\u00bf\u0096\u0088\u00a6\u00a7\u00fe\u00f0\u0080x\u00c0\u00fa\b\u0085\u00ff$\u00b4~\u000e\u0018\u00c3\u00f6\u00d3Iw\u00c1\u0005\u0097\u008a<\u00ed\u00e5\u001e1u\u00b2i\u0001^\u00f5\u00b2\u00d4\u00a1\u00cfB\u009aO\u00bb\u00e6v\u000b\u00d5\u0094\u001e:\b\u00ff\u00c7\u00a9\u00cd\u00ff]er\u00c6\u00ffWH\u00bb>\u0098\u00d1\u00ae\u00a1\u00a0\u00e4Z_2\u00cc^\u00aaA*\u0015\u00a9]\r\u00d2}\u00ed\u00d8\u00a6\u007f\u00b9\u00d5\u0090\u0018\u0093\u00b5>xph\u0016&`\u0001kZ*T\u008e\u0085\u001f\u009c\u00dc8T\u00b6 \u00fe\u00cc\u00f7(\u00de\u0011\u00a9\n\u000b\u00f5\b%3\u00d1\u00fa\u008b5A\u00f6D\u00c4x\u00ba\u00a3S\u0010M\u0019\u001f\u00a8\u001c\u009a\u00d5)2\u0014S\u00ea\u00c5p\u0090\u0017~MI\u00a1H\u0013\u00f3[\u00a4\u00b9~\u0092\u00ef\u00e3\u00fe\u00bd\u00c5\u00ea\u00da2\u00e3\u00ae\u00e0\u00ab\u00c5\u00e0m\u0092XoB\u0094\u00d5\u009c5\u00f4\u0005h03D\u00c8\u0082\u009e\u008a\u0098)y\u0010(\u00e7<|i\u00bf\u00a2\u00ad\u00c7\u00c8\u00ff\u00bb\u00af\u0093\u00d4\u00be\u00f9H\u0017\u008aH\u00f2D\u00c4\u0087\u0095SN?\u00d86\u00e0w\u00c3\u00edl\u0016\u00db\u0017\u00d6oX\u00a5\u00f7\u0010\u000e\u0091\u00c8o*\u0013s\u00d2\u008d\u0013\u00e6;9\u00e6\u00ce.\u0010\u00f0G\u0098\u00adB\u00a1\u00b4\u00b9\b\u000eR\u0004\u0006\u00f6\u00f6\u00c5\u0091\u00e4\u0081[\u00cf\u00a5\u001e\u00f2x\u00a8\u00c5\u0005%\u00ae\u00b7\u00a3k(\u00d7\u00e4\u00f9\u0002\t\u00a4\u00a9h6\u00e5\u00a0\u00a3\u0093.\u00e4\u009a\u00c2\u00a8\u0010o\u00db\u0087\u00d3\u008d>\u001dr)\u0019\u00bbbL\u00a5\u00a7\u00bf\u0090\u00a8\u00a6\u00ff6i\u008f\u00ca)\u0007c\nn\u0085p?B]7\u00be\u00b0\u00bc[+\u00b8S\u0013m\u00a7\u0001\u00c4S\u008e\u00ed\u009a\u001c=Y\u009cK\u00b2\u00a54XE;\u00bd5\n\u008d\u0082:\u00bd\n\u00ba\u00e9\u0091";
                                var7_6 = "G\u00e3\u00f0\u00a2\u0016C\u00a5P\u00cfJ\u0007$\u00be\u0083\u00df\u009dx\u0015\u00e2;\u0086\u0090\u00e2M\u008c:\u00a3\u00a4Y\u0017>M\u0548\u00e5@E&\u00ab\u009a\u00c7d\u00e3\u0006\u00b4\u0094\u00d9\u00e3G\u0088\u001aZ\u001d^\u00fckRq\u0097\n9|\u00e3$\u0092\u00cfMZ\u00049\u00a1\u00e0\u0012$_\u00c9\u001a\u00c7\u008f\u00d2\u00c2\u00ce6\u00ed\u001f\u0011\u0081\u00ffv\u00be\u007f\u009bj\u00fc\u0089\u00cc/+\u0007a\u00e3^I+\u00d1\u009c\u000b\u00b7/\u00f3\u00ed\u00c1\u00f5\u0001\u00c6o\u0083\u00f0\u00e7`n\u00fcZ\u00cc|\u009f\u0083\u00b1\u00bb\u00e2Y\u00ec\rR\u0098\u00d6\u00d1\u00ff\u00b97ah\\\u0097J);\u00d8\u00ce\u000f\u00fd\u0013v\u00f7M\u00c8\u0096)Z\u00d0/\u0011]\u0001||\u0005%U\u00acG\u008a\u0004\u00e4f\u000b\u00ab\u00c2\u001fLV\u00ce\u00ba\u00fc\u00d1\u00d4\u00d7/\u00b3v\b<\u00fd\u00ce\u00e2\u0002\u009cn\u00c2\u00f0\u00fcn_\u0086\u00d9\u00f38\u00c8\u00e1\u00d62\u00c9sq\u000e\u00b6s\u00f6Nys0\u00c6nv\u008a\u0090\u0092\u00a0\u00f7q\u00af+\u00f8\u009f\u00c6<\u00c6\ff\u0012\u00a7t-\u008fw6\u00e3\u0007\u00da\u009b\u00ed\u00a0\u009e\u0007\u00b3\u00e1\u00d3\u00c3q\u00f0nZ\u00e9\u009d<2 \u009c\u0083]O\u00e6\u00a7\u008e\u00ccyFN\u00a9TQV\u0019\u00a0\u00cc?\u00a6\u00cc\u00f7G\u00d0\u0083V\u00ebn\u00ddY\u00f9\u00b6\u008a\u009fs\u001aoV\u00a5\u001e\u001b\u00bb\u00db\u00b9\u00c5\u00b5\u00c4\u009e\u00e8s\u00a6\u00fa\u00117\u0012\u00e1\u00e8\u0085[\u0085\u00b0\u00d0\u00ec\u007f\u00af1k\u00d34\u00e5\u009f\u00af\u00b4\u00e3\u0004\u00dd\u001cr\u0019&\u00c7\u00dewhd\u00ce\u0010\u00fcg\u00e4\u00ea\u00ec2b\u0096\u0019\u00c6\u00f2\u00dc~?\u0090\u0019\u00fa$b\u00d2=:\u00a3\u00d3\u00cb={\u009aZ\u0006x\u00aaZ\r\n\u00e2\u00a5\u00b8\u00c6f\u00d6/\u001f8\u0019\u00cbht\u001a&\u00b0\u00bf\u00df\u0000\u00e9H\u0007#\u0099o\u00fbx\t\u00f5,b\u0089\u008b\u00ef\u0006\u00ca\u001e\u001a\u0006U:h\u00b3\u0089\u0017A\u00be|y\u00dc\u001e+\u00d3\u00ae\u00b0\u00b9\u009dM\u00d4\u00a46\u00dds\u00b8\u00c2\u00a82\u0015\u0012\u0093\u00b0\u00b7T\u00cdCG\u00b7\u00d6\u00d3\b\u00f9\u0089\u0005\u00bb\u00ca\u0094\u00b1>\u0088\u00e1\b\u00dd2\u00d7\u00f1\u00eb\u0007\u0085\u0090\u008c2\u00a8\u00b8a\u008cZj\u0012\u00a2\u00fc\u00d1^~Y\u00a4\u00baEa\u0013%\u00ee\u00f28\u009f\u00c1\u00e5mi/\u0007b\u00ac\u00fd\u00f5\u00e1\u00aaW\u0086g\u0099z\u0085c\u0096\u0088\u0014\u00f8\u00a6m\u00b4\u00cd\u00f0`r\u00bfk\u00d5\u00af\u00e6(\u00d8@Cq0\u00efd\u00fbP\u00cf\u001d\u00e3\u00b10\u00fc3/\u0086P\\v\u0094\u0016=\u0091h\u0088\u0086\u009e\u00df=\\\u001a\u0097\u0081\u00e8jU\u00c4\u00ca\u00bdX\u00abx\u00f8=\u0019\u008c\u001dS\u00bc4\u00f5\u00ff:.\u00d8\u00c2\\\u00dfi\u00abc\u00a4\u00edB\u00c1\u00ea\u009f\u00a7\u00fb\u00f0&d\u00fc\u00d5\u0015\u0095K\u00d5\u0005\u00a2\u00cf0|\u00a9J\u00bb\u0094\u00f0\tv\u00af\u00a7wY\u00af\u00e3\u00bb\u00a5\u00a0+3\u008fM\u00dc\u00b6\u0012\r\u008e\u00d8\u00b3\u001c\u00cf\u00ad\u001d\u00d8\u008a\u000f\u008e\u00ab\u00ad\u00b3\u00d8\u009b\u00dfGs\u00b3|\u00c6\u0002p:\u00068\u00de\u00edE'\u0082\u0084\u000f\u00d20h\u009dm&\u00f1$\u0012}-v\u00da\u00a5H\u00d2oy\u00c3\u00c1\u0010M\u00a6\u0010\u00e8\u00ac\u008f-\u00d4h\u0086\u00c0\u00cb\rx\u00fe\u00cea\u00d3\u00e05r\u0099\u00c4q\u00dc\u0015?\u00e4\u0098g\u00c4K\u00f5$\u00f9\u00db\\E\u00c5\u0019=\u0005\u008agj*\u00c8\u00e5o\u008b\u00d2p\u0000=\u009ce\u0096]\u00f5\u00b6\u00be\u0012|\u00e2\u0080;\u001f\u00dc6\u00fa\u000e\u0015\u00de\u0001\u00a4\u00f10'\u0006(\u00e61e]\u0016\u009f\u00c0\u0006\u007f\u00be\u00e0\u00d1\u00c4\\\u00a7\t\u007f \u00d0\u008b\u0098fg\u00cd\u0007e\u0096Gs\u00ff\u00ceK0Z\u00bd\u00c8\u00bd\u00a4}Q\u008f\u00b6\u001a\u00f6\u00b5\u0003\u0001w\u0004\u0084\u0084\u009cLA4Qwt+~\u00f4r\u00e6n\u00cb\u0083\u00f6?Mx'\u00b9\u00c6{s6\u00c6\u00ba#\n\u00db\u008f-^\u00d1\u009c\u001d\u00ce\u00e7\u00d4{`n[\u0019E&\u0007\u00bc\u0088\u00cf5\u00actL\u00c2\u00fd\u00ecz$Q\u00db\u0010\u00acG\u007f\u0012\u00dc\u0019,\u00c8\u0080\u00d4p\u0083\u00bf\u009d\u00de~:\u0098\u0013SD\u008cx\u00f6\u0091\u00a8\u0080:\u00e4\u009du\u00f9O\u0019\t\u00f8hO8(\u00d23\u00ec|Q\u00a60s\u00d1\u00f3\u009a\u0013{\u000e(rH8)z\u00f82\u000bf\u0015G\u0092YV\u00b8\u00e1L\u00d2\u00b0\u0012\u00cf\u008as\u00e6\u000b\u00bf\u0096\u0088\u00a6\u00a7\u00fe\u00f0\u0080x\u00c0\u00fa\b\u0085\u00ff$\u00b4~\u000e\u0018\u00c3\u00f6\u00d3Iw\u00c1\u0005\u0097\u008a<\u00ed\u00e5\u001e1u\u00b2i\u0001^\u00f5\u00b2\u00d4\u00a1\u00cfB\u009aO\u00bb\u00e6v\u000b\u00d5\u0094\u001e:\b\u00ff\u00c7\u00a9\u00cd\u00ff]er\u00c6\u00ffWH\u00bb>\u0098\u00d1\u00ae\u00a1\u00a0\u00e4Z_2\u00cc^\u00aaA*\u0015\u00a9]\r\u00d2}\u00ed\u00d8\u00a6\u007f\u00b9\u00d5\u0090\u0018\u0093\u00b5>xph\u0016&`\u0001kZ*T\u008e\u0085\u001f\u009c\u00dc8T\u00b6 \u00fe\u00cc\u00f7(\u00de\u0011\u00a9\n\u000b\u00f5\b%3\u00d1\u00fa\u008b5A\u00f6D\u00c4x\u00ba\u00a3S\u0010M\u0019\u001f\u00a8\u001c\u009a\u00d5)2\u0014S\u00ea\u00c5p\u0090\u0017~MI\u00a1H\u0013\u00f3[\u00a4\u00b9~\u0092\u00ef\u00e3\u00fe\u00bd\u00c5\u00ea\u00da2\u00e3\u00ae\u00e0\u00ab\u00c5\u00e0m\u0092XoB\u0094\u00d5\u009c5\u00f4\u0005h03D\u00c8\u0082\u009e\u008a\u0098)y\u0010(\u00e7<|i\u00bf\u00a2\u00ad\u00c7\u00c8\u00ff\u00bb\u00af\u0093\u00d4\u00be\u00f9H\u0017\u008aH\u00f2D\u00c4\u0087\u0095SN?\u00d86\u00e0w\u00c3\u00edl\u0016\u00db\u0017\u00d6oX\u00a5\u00f7\u0010\u000e\u0091\u00c8o*\u0013s\u00d2\u008d\u0013\u00e6;9\u00e6\u00ce.\u0010\u00f0G\u0098\u00adB\u00a1\u00b4\u00b9\b\u000eR\u0004\u0006\u00f6\u00f6\u00c5\u0091\u00e4\u0081[\u00cf\u00a5\u001e\u00f2x\u00a8\u00c5\u0005%\u00ae\u00b7\u00a3k(\u00d7\u00e4\u00f9\u0002\t\u00a4\u00a9h6\u00e5\u00a0\u00a3\u0093.\u00e4\u009a\u00c2\u00a8\u0010o\u00db\u0087\u00d3\u008d>\u001dr)\u0019\u00bbbL\u00a5\u00a7\u00bf\u0090\u00a8\u00a6\u00ff6i\u008f\u00ca)\u0007c\nn\u0085p?B]7\u00be\u00b0\u00bc[+\u00b8S\u0013m\u00a7\u0001\u00c4S\u008e\u00ed\u009a\u001c=Y\u009cK\u00b2\u00a54XE;\u00bd5\n\u008d\u0082:\u00bd\n\u00ba\u00e9\u0091".length();
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
                                    var0_3[var6_4++] = t.a(var8_9).intern();
                                    if ((var3_8 += var4_7) < var7_6) {
                                        var4_7 = var5_5.charAt(var3_8);
                                        ** continue;
                                    }
                                    break block29;
                                    break;
                                }
                                v3 = ++var3_8;
                                var8_9 = var1_1.doFinal(var5_5.substring(v3, v3 + var4_7).getBytes("ISO-8859-1"));
                                ** while (true)
                            }
                            var20_10 = new String[41];
                            var18_11 = 0;
                            var17_12 = var0_3[1];
                            var19_13 = var17_12.length();
                            var16_14 = 11;
                            var15_15 = -1;
lbl38:
                            // 2 sources

                            while (true) {
                                v4 = 8;
                                v5 = ++var15_15;
                                v6 = var17_12.substring(v5, v5 + var16_14);
                                v7 = -1;
                                break block30;
                                break;
                            }
lbl44:
                            // 1 sources

                            while (true) {
                                var20_10[var18_11++] = v8.intern();
                                if ((var15_15 += var16_14) < var19_13) {
                                    var16_14 = var17_12.charAt(var15_15);
                                    ** continue;
                                }
                                var17_12 = var0_3[0];
                                var19_13 = var17_12.length();
                                var16_14 = 7;
                                var15_15 = -1;
lbl53:
                                // 2 sources

                                while (true) {
                                    v4 = 57;
                                    v9 = ++var15_15;
                                    v6 = var17_12.substring(v9, v9 + var16_14);
                                    v7 = 0;
                                    break block30;
                                    break;
                                }
                                break;
                            }
lbl59:
                            // 1 sources

                            while (true) {
                                var20_10[var18_11++] = v8.intern();
                                if ((var15_15 += var16_14) < var19_13) {
                                    var16_14 = var17_12.charAt(var15_15);
                                    ** continue;
                                }
                                break block31;
                                break;
                            }
                        }
                        v10 = v6.toCharArray();
                        v11 = v10.length;
                        var21_16 = 0;
                        try {
                            v12 = v4;
                            v13 = v10;
                            v14 = v11;
                            if (v11 > 1) break block32;
lbl77:
                            // 2 sources

                            while (true) {
                                v15 = v12;
                                v13 = v13;
                                v16 = v13;
                                v17 = v12;
                                v18 = var21_16;
                                break;
                            }
                        }
                        catch (RuntimeException v19) {
                            throw t.b(v19);
                        }
                        while (true) {
                            switch (var21_16 % 7) {
                                case 0: {
                                    v20 = 10;
                                    break;
                                }
                                case 1: {
                                    v20 = 6;
                                    break;
                                }
                                case 2: {
                                    v20 = 16;
                                    break;
                                }
                                case 3: {
                                    v20 = 98;
                                    break;
                                }
                                case 4: {
                                    v20 = 63;
                                    break;
                                }
                                case 5: {
                                    v20 = 81;
                                    break;
                                }
                                default: {
                                    v20 = 47;
                                }
                            }
                            try {
                                v16[v18] = (char)(v16[v18] ^ (v17 ^ v20));
                                ++var21_16;
                                v12 = v15;
                                if (v15 != 0) break;
                                v15 = v12;
                                v13 = v13;
                                v18 = v12;
                                v16 = v13;
                                v17 = v12;
                            }
                            catch (RuntimeException v21) {
                                throw t.b(v21);
                            }
                        }
                    }
                    v22 = v13;
                    v14 = v14;
                    ** while (v14 > var21_16)
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
                t.e = var20_10;
                t.L = new String[41];
                t.J = t.S(25922, -13510);
                break block33;
lbl141:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var13_17 = 2316724999196691098L;
            ** while (true)
            t.Z = 656725688390437458L ^ var13_17;
            break block34;
lbl151:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var11_18 = 6814721155827572398L;
        ** while (true)
        t.C = 6814721155827572038L ^ var11_18;
        t.P = System.getenv(t.S(25937, -29812)) + t.S(25948, -6245);
        t.INSTANCE = new t();
    }

    private static Throwable Q(Throwable throwable) {
        return throwable;
    }

    /*
     * Exception decompiling
     */
    private static String S(int var0, int var1_1) {
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

