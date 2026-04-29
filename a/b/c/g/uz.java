/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.g;
import a.b.c.g.s5;
import java.lang.invoke.MethodHandles;

class uz {
    final byte[] V;
    final boolean c;
    private static final long a = s5.a(3220055206068661919L, 3649589997445370837L, MethodHandles.lookup().lookupClass()).a(16830577182554L);

    uz(byte[] byArray, boolean bl) {
        this.V = byArray;
        this.c = bl;
    }

    /*
     * Unable to fully structure code
     */
    boolean B(int var1_1, short var2_2, short var3_3) {
        block18: {
            block16: {
                block17: {
                    block15: {
                        var4_4 = ((long)var1_1 << 32 | (long)var2_2 << 48 >>> 32 | (long)var3_3 << 48 >>> 48) ^ uz.a;
                        var7_5 = g.i();
                        var6_6 = g.R();
                        try {
                            try {
                                try {
                                    v0 = this.V;
                                    if (var6_6 == null || var7_5 != null) break block15;
                                }
                                catch (RuntimeException v1) {
                                    throw uz.b(v1);
                                }
                                if (v0 == null) break block16;
                            }
                            catch (RuntimeException v2) {
                                throw uz.S(v2);
                            }
                            v0 = this.V;
                        }
                        catch (RuntimeException v3) {
                            throw uz.S(v3);
                        }
                    }
                    try {
                        try {
                            try {
                                v4 = v0.length;
                                v5 = var7_5;
                                if (var6_6 != null) {
                                    if (v5 != null) break block17;
                                }
                                ** GOTO lbl43
                            }
                            catch (RuntimeException v6) {
                                throw uz.b(v6);
                            }
                            if (v4 <= 0) break block16;
                        }
                        catch (RuntimeException v7) {
                            throw uz.S(v7);
                        }
                        v4 = (int)this.c;
                    }
                    catch (RuntimeException v8) {
                        throw uz.S(v8);
                    }
                }
                try {
                    v5 = var7_5;
lbl43:
                    // 2 sources

                    if (v5 != null) break block18;
                    if (v4 != 0) break block16;
                }
                catch (RuntimeException v9) {
                    throw uz.S(v9);
                }
                v4 = 1;
                break block18;
            }
            v4 = 0;
        }
        return (boolean)v4;
    }

    private static RuntimeException S(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static RuntimeException b(RuntimeException runtimeException) {
        return runtimeException;
    }
}

