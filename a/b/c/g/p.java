/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.s5;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

interface p
extends Library {
    public static final p INSTANCE;

    public int RtlAdjustPrivilege(int var1, boolean var2, boolean var3, IntByReference var4);

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block18: {
                var4 = s5.a(-4604547495172596850L, -935441629716451121L, MethodHandles.lookup().lookupClass()).a(277235376559802L) ^ 77768791257323L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var4 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var4 << var2_2 * 8 >>> 56);
                }
                break block18;
lbl12:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
            var3_4 = var1_1.doFinal("6\u00a8^\u00eb\u00c9\u00a18D".getBytes("ISO-8859-1"));
            ** while (true)
lbl19:
            // 1 sources

            while (true) {
                continue;
                break;
            }
            var0_3 = p.a(var3_4).intern();
            v3 = var0_3.toCharArray();
            v4 = v3.length;
            var7_6 = 0;
            try {
                v5 = 67;
                v6 = v3;
                v7 = v4;
                if (v4 > 1) break block17;
lbl34:
                // 2 sources

                while (true) {
                    v8 = v5;
                    v6 = v6;
                    v9 = v6;
                    v10 = v5;
                    v11 = var7_6;
                    break;
                }
            }
            catch (RuntimeException v12) {
                throw p.a(v12);
            }
            while (true) {
                switch (var7_6 % 7) {
                    case 0: {
                        v13 = 26;
                        break;
                    }
                    case 1: {
                        v13 = 37;
                        break;
                    }
                    case 2: {
                        v13 = 99;
                        break;
                    }
                    case 3: {
                        v13 = 65;
                        break;
                    }
                    case 4: {
                        v13 = 45;
                        break;
                    }
                    case 5: {
                        v13 = 22;
                        break;
                    }
                    default: {
                        v13 = 111;
                    }
                }
                try {
                    v9[v11] = (char)(v9[v11] ^ (v10 ^ v13));
                    ++var7_6;
                    v5 = v8;
                    if (v8 != 0) break;
                    v8 = v5;
                    v6 = v6;
                    v11 = v5;
                    v9 = v6;
                    v10 = v5;
                }
                catch (RuntimeException v14) {
                    throw p.a(v14);
                }
            }
        }
        v15 = v6;
        v7 = v7;
        ** while (v7 > var7_6)
lbl85:
        // 1 sources

        ** while (true)
        var6_5 = new String(v15).intern();
        p.INSTANCE = Native.load(var6_5, p.class);
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

