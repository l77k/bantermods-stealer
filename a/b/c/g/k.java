/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.s5;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class k
extends Enum<k> {
    public static final /* enum */ k COOKIES;
    public static final /* enum */ k PASSWORDS;
    public static final /* enum */ k AUTOFILL;
    public static final /* enum */ k HISTORY;
    private static final k[] n;

    public static k[] values() {
        return (k[])n.clone();
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block30: {
                block28: {
                    block27: {
                        var9 = s5.a(-2024618426021557434L, -2958006223538975852L, MethodHandles.lookup().lookupClass()).a(87908080367327L) ^ 123981619298807L;
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
                        var5_5 = "\u0010\u00bb\u009b-\u0087bS\u00e4\u00b5&\u00f4\u0090J\u0094U|\u0004r\u00ac\u00de\u00b7e\u00a5\r\u0018\u00dam\u00bfS\u0001f+\u00d4\u00baU\u008eX\u007fGV\u00f0\u00f7\u00ed\u00e56)l\u00a3\u0006";
                        var7_6 = "\u0010\u00bb\u009b-\u0087bS\u00e4\u00b5&\u00f4\u0090J\u0094U|\u0004r\u00ac\u00de\u00b7e\u00a5\r\u0018\u00dam\u00bfS\u0001f+\u00d4\u00baU\u008eX\u007fGV\u00f0\u00f7\u00ed\u00e56)l\u00a3\u0006".length();
                        var4_7 = 24;
                        var3_8 = -1;
lbl18:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl20:
                        // 1 sources

                        while (true) {
                            var0_3[var6_4++] = k.a(var8_9).intern();
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
                    var11_10 = new String[4];
                    var15_11 = 0;
                    var14_12 = var0_3[1];
                    var16_13 = var14_12.length();
                    var13_14 = 7;
                    var12_15 = -1;
lbl37:
                    // 2 sources

                    while (true) {
                        v4 = 94;
                        v5 = ++var12_15;
                        v6 = var14_12.substring(v5, v5 + var13_14);
                        v7 = -1;
                        break block28;
                        break;
                    }
lbl43:
                    // 1 sources

                    while (true) {
                        var11_10[var15_11++] = v8.intern();
                        if ((var12_15 += var13_14) < var16_13) {
                            var13_14 = var14_12.charAt(var12_15);
                            ** continue;
                        }
                        var14_12 = var0_3[0];
                        var16_13 = var14_12.length();
                        var13_14 = 7;
                        var12_15 = -1;
lbl52:
                        // 2 sources

                        while (true) {
                            v4 = 90;
                            v9 = ++var12_15;
                            v6 = var14_12.substring(v9, v9 + var13_14);
                            v7 = 0;
                            break block28;
                            break;
                        }
                        break;
                    }
lbl58:
                    // 1 sources

                    while (true) {
                        var11_10[var15_11++] = v8.intern();
                        if ((var12_15 += var13_14) < var16_13) {
                            var13_14 = var14_12.charAt(var12_15);
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
lbl76:
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
                    throw k.a(v19);
                }
                while (true) {
                    switch (var17_16 % 7) {
                        case 0: {
                            v20 = 54;
                            break;
                        }
                        case 1: {
                            v20 = 91;
                            break;
                        }
                        case 2: {
                            v20 = 108;
                            break;
                        }
                        case 3: {
                            v20 = 4;
                            break;
                        }
                        case 4: {
                            v20 = 6;
                            break;
                        }
                        case 5: {
                            v20 = 78;
                            break;
                        }
                        default: {
                            v20 = 28;
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
                        throw k.a(v21);
                    }
                }
            }
            v22 = v13;
            v14 = v14;
            ** while (v14 > var17_16)
lbl127:
            // 1 sources

            v8 = new String(v22);
            switch (v7) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl134:
                // 1 sources

                ** continue;
            }
        }
        k.COOKIES = new k();
        k.PASSWORDS = new k();
        k.AUTOFILL = new k();
        k.HISTORY = new k();
        k.n = new k[]{k.COOKIES, k.PASSWORDS, k.AUTOFILL, k.HISTORY};
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

