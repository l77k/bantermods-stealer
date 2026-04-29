/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.g;
import a.b.c.g.s5;
import java.lang.invoke.MethodHandles;

class u7 {
    final byte[] C;
    final boolean B;
    private static final long a = s5.a(-253170252741717824L, 5784894186075075727L, MethodHandles.lookup().lookupClass()).a(3138247071877L);

    u7(byte[] byArray, boolean bl) {
        this.C = byArray;
        this.B = bl;
    }

    /*
     * Unable to fully structure code
     */
    boolean m(long var1_1) {
        block18: {
            block16: {
                block17: {
                    block15: {
                        var1_1 = u7.a ^ var1_1;
                        var4_2 = g.i();
                        var3_3 = g.R();
                        try {
                            try {
                                try {
                                    v0 = this.C;
                                    if (var3_3 == null || var4_2 != null) break block15;
                                }
                                catch (RuntimeException v1) {
                                    throw u7.b(v1);
                                }
                                if (v0 == null) break block16;
                            }
                            catch (RuntimeException v2) {
                                throw u7.u(v2);
                            }
                            v0 = this.C;
                        }
                        catch (RuntimeException v3) {
                            throw u7.u(v3);
                        }
                    }
                    try {
                        try {
                            try {
                                v4 = v0.length;
                                v5 = var4_2;
                                if (var3_3 != null) {
                                    if (v5 != null) break block17;
                                }
                                ** GOTO lbl43
                            }
                            catch (RuntimeException v6) {
                                throw u7.b(v6);
                            }
                            if (v4 <= 0) break block16;
                        }
                        catch (RuntimeException v7) {
                            throw u7.u(v7);
                        }
                        v4 = (int)this.B;
                    }
                    catch (RuntimeException v8) {
                        throw u7.u(v8);
                    }
                }
                try {
                    v5 = var4_2;
lbl43:
                    // 2 sources

                    if (v5 != null) break block18;
                    if (v4 != 0) break block16;
                }
                catch (RuntimeException v9) {
                    throw u7.u(v9);
                }
                v4 = 1;
                break block18;
            }
            v4 = 0;
        }
        return (boolean)v4;
    }

    private static RuntimeException u(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static RuntimeException b(RuntimeException runtimeException) {
        return runtimeException;
    }
}

