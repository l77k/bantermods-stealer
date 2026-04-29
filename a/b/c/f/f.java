/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.f;

import a.b.c.g.s5;
import java.lang.invoke.MethodHandles;

public class f {
    private static final String x;
    private static final String[] U;
    private static final String[] h;
    private static final long a;

    /*
     * Exception decompiling
     */
    public static String obtainKey() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
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

    private static Throwable k(Throwable throwable) {
        return throwable;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block18: {
                f.a = s5.a(2446286068506918274L, 758572879741980805L, MethodHandles.lookup().lookupClass()).a(28456370915110L);
                var5 = new String[2];
                var3_1 = 0;
                var2_2 = "~\u00da\u00df\u0086\u00c3}\u00fb\u0016,\u00f1\u00d4a[+\u0001\u0015\u00e6\u00ed\u0092\u00d3\u0014\u00e4i\u008c\u00f0\u00a9\u00b3\u00b6\u00cf\u0085\u00ca\u00e1\u0006\u00fd\u00c7\u00d5\u0088|^\u00c1\u00a5";
                var4_3 = "~\u00da\u00df\u0086\u00c3}\u00fb\u0016,\u00f1\u00d4a[+\u0001\u0015\u00e6\u00ed\u0092\u00d3\u0014\u00e4i\u008c\u00f0\u00a9\u00b3\u00b6\u00cf\u0085\u00ca\u00e1\u0006\u00fd\u00c7\u00d5\u0088|^\u00c1\u00a5".length();
                var1_4 = 20;
                var0_5 = -1;
lbl8:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var5[var3_1++] = new String(v0).intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block17;
                    break;
                }
                v1 = ++var0_5;
                v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
                v3 = v2.length;
                var6_6 = 0;
                try {
                    v4 = 79;
                    v5 = v2;
                    v6 = v3;
                    if (v3 > 1) break block18;
lbl29:
                    // 2 sources

                    while (true) {
                        v7 = v4;
                        v5 = v5;
                        v8 = v5;
                        v9 = v4;
                        v10 = var6_6;
                        break;
                    }
                }
                catch (RuntimeException v11) {
                    throw f.b(v11);
                }
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v12 = 83;
                            break;
                        }
                        case 1: {
                            v12 = 121;
                            break;
                        }
                        case 2: {
                            v12 = 57;
                            break;
                        }
                        case 3: {
                            v12 = 123;
                            break;
                        }
                        case 4: {
                            v12 = 92;
                            break;
                        }
                        case 5: {
                            v12 = 41;
                            break;
                        }
                        default: {
                            v12 = 75;
                        }
                    }
                    try {
                        v8[v10] = (char)(v8[v10] ^ (v9 ^ v12));
                        ++var6_6;
                        v4 = v7;
                        if (v7 != 0) break;
                        v7 = v4;
                        v5 = v5;
                        v10 = v4;
                        v8 = v5;
                        v9 = v4;
                    }
                    catch (RuntimeException v13) {
                        throw f.b(v13);
                    }
                }
            }
            v0 = v5;
            v6 = v6;
            ** while (v6 > var6_6)
lbl80:
            // 1 sources

            ** while (true)
        }
        f.U = var5;
        f.h = new String[2];
        f.x = f.M(18558, -14239);
    }

    /*
     * Exception decompiling
     */
    private static String M(int var0, int var1_1) {
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
}

