/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.g;
import a.b.c.g.s5;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.CountDownLatch;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

class u3
extends WebSocketListener {
    final JsonArray[] W;
    final String[] M;
    final CountDownLatch G;
    final g r;
    private static final String[] B;
    private static final String[] F;
    private static final long p;
    private static final long a;

    u3(g g2, JsonArray[] jsonArrayArray, String[] stringArray, CountDownLatch countDownLatch) {
        this.r = g2;
        this.W = jsonArrayArray;
        this.M = stringArray;
        this.G = countDownLatch;
    }

    @Override
    public void onOpen(WebSocket webSocket, Response response) {
        webSocket.send(u3.j(32095, -2032));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void onMessage(WebSocket var1_1, String var2_2) {
        block57: {
            var3_3 = u3.a ^ 82815818511968L;
            var6_4 = g.i();
            var5_5 = g.R();
            try {
                block54: {
                    block56: {
                        block55: {
                            block59: {
                                block58: {
                                    var7_6 = JsonParser.parseString(var2_2).getAsJsonObject();
                                    v0 = var7_6.has(u3.j(32091, 636));
                                    if (var6_4 != null) break block54;
                                    if (v0 == 0) ** GOTO lbl115
                                    break block58;
                                    catch (Exception v1) {
                                        throw u3.J(v1);
                                    }
                                }
                                try {
                                    v0 = var7_6.get(u3.j(32084, -21902)).getAsInt();
                                    if (var5_5 != null && var6_4 == null) {
                                    }
                                    break block54;
                                }
                                catch (Exception v2) {
                                    throw u3.b(v2);
                                }
                                catch (Exception v3) {
                                    throw u3.J(v3);
                                }
                                try {
                                    if (var5_5 == null) break block54;
                                    if (v0 == 1) {
                                    }
                                    ** GOTO lbl115
                                }
                                catch (Exception v4) {
                                    throw u3.b(v4);
                                }
                                catch (Exception v5) {
                                    throw u3.J(v5);
                                }
                                v6 = var7_6.has(u3.j(32081, -29735));
                                if (var6_4 != null) break block55;
                                break block59;
                                catch (Exception v7) {
                                    throw u3.J(v7);
                                }
                            }
                            try {
                                if (var5_5 == null) break block55;
                                if (v6) {
                                }
                                ** GOTO lbl85
                            }
                            catch (Exception v8) {
                                throw u3.b(v8);
                            }
                            catch (Exception v9) {
                                throw u3.J(v9);
                            }
                            try {
                                v6 = var7_6.getAsJsonObject(u3.j(32086, -31214)).has(u3.j(32082, 10034));
                                if (var5_5 != null && var6_4 == null) {
                                }
                                break block55;
                            }
                            catch (Exception v10) {
                                throw u3.b(v10);
                            }
                            catch (Exception v11) {
                                throw u3.J(v11);
                            }
                            try {
                                if (var5_5 == null) break block55;
                                if (v6) {
                                }
                                ** GOTO lbl85
                            }
                            catch (Exception v12) {
                                throw u3.b(v12);
                            }
                            catch (Exception v13) {
                                throw u3.J(v13);
                            }
                            try {
                                try {
                                    this.W[0] = var7_6.getAsJsonObject(u3.j(32086, -31214)).getAsJsonArray(u3.j(32080, -20044));
                                    v14 = var6_4;
                                    if (var5_5 != null) {
                                        if (v14 != null) {
                                        }
                                        break block56;
                                    }
                                    ** GOTO lbl113
                                }
                                catch (Exception v15) {
                                    throw u3.b(v15);
                                }
                                catch (Exception v16) {
                                    throw u3.J(v16);
                                }
lbl85:
                                // 3 sources

                                v6 = var7_6.has(u3.j(32094, -28047));
                            }
                            catch (Exception v17) {
                                throw u3.J(v17);
                            }
                        }
                        if (!v6) ** GOTO lbl105
                        try {
                            try {
                                this.M[0] = var7_6.getAsJsonObject(u3.j(32092, 7630)).get(u3.j(32089, -21443)).getAsString();
                                v14 = var6_4;
                                if (var5_5 != null) {
                                    if (v14 != null) {
                                    }
                                    break block56;
                                }
                                ** GOTO lbl113
                            }
                            catch (Exception v18) {
                                throw u3.b(v18);
                            }
                            catch (Exception v19) {
                                throw u3.J(v19);
                            }
lbl105:
                            // 2 sources

                            this.M[0] = u3.j(32090, -9614);
                        }
                        catch (Exception v20) {
                            throw u3.J(v20);
                        }
                    }
                    try {
                        this.G.countDown();
                        v14 = var6_4;
lbl113:
                        // 3 sources

                        try {
                            if (v14 == null) break block57;
lbl115:
                            // 3 sources

                            v0 = var7_6.has(u3.j(32092, 7630));
                        }
                        catch (Exception v21) {
                            throw u3.b(v21);
                        }
                    }
                    catch (Exception v22) {
                        throw u3.J(v22);
                    }
                }
                try {
                    if (v0 != 0) {
                        this.M[0] = var7_6.getAsJsonObject(u3.j(32092, 7630)).get(u3.j(32083, 28164)).getAsString();
                    }
                }
                catch (Exception v23) {
                    throw u3.J(v23);
                }
            }
            catch (Exception var7_7) {
                this.M[0] = u3.j(32087, -15571) + var7_7.getMessage();
                this.G.countDown();
            }
        }
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable throwable, Response response) {
        this.M[0] = u3.j(32085, -28345) + throwable.getMessage();
        this.G.countDown();
    }

    @Override
    public void onClosing(WebSocket webSocket, int n2, String string) {
        webSocket.close((int)p, u3.j(32093, 30623));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void onClosed(WebSocket var1_1, int var2_2, String var3_3) {
        block12: {
            block13: {
                block14: {
                    block11: {
                        var4_4 = u3.a ^ 127889287926382L;
                        var7_5 = g.i();
                        var6_6 = g.R();
                        try {
                            try {
                                try {
                                    v0 = this;
                                    v1 = var7_5;
                                    if (var6_6 != null) {
                                        if (v1 != null) break block11;
                                    }
                                    ** GOTO lbl27
                                }
                                catch (RuntimeException v2) {
                                    throw u3.b(v2);
                                }
                                if (v0.G.getCount() <= 0L) break block12;
                            }
                            catch (RuntimeException v3) {
                                throw u3.J(v3);
                            }
                            v0 = this;
                        }
                        catch (RuntimeException v4) {
                            throw u3.J(v4);
                        }
                    }
                    try {
                        try {
                            v1 = var7_5;
lbl27:
                            // 2 sources

                            if (v1 != null) break block13;
                            if (v0.M[0] != null) break block14;
                        }
                        catch (RuntimeException v5) {
                            throw u3.J(v5);
                        }
                        this.M[0] = u3.j(32088, -1881);
                    }
                    catch (RuntimeException v6) {
                        throw u3.J(v6);
                    }
                }
                v0 = this;
            }
            v0.G.countDown();
        }
    }

    private static Exception J(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block27: {
            block25: {
                block26: {
                    block24: {
                        u3.a = s5.a(6462087291260763028L, 5973528197881707542L, MethodHandles.lookup().lookupClass()).a(43160614708064L);
                        var7 = new String[16];
                        var5_1 = 0;
                        var4_2 = "\u000e\u00d2\u0088\u0095{T\u0018\u0016\u00b3uSA=\u00ee\u0011N\u00ac\u00day\u0005\u00d3md(\u009f\u00fd\u00a0\u0098j\u00af\u0002\u0097Y!a\u00b7LX&\u0085\u0086\u00f4F\u00faT\u00c6Wx\u009be\u008c{\t\u00b7\u0097\u00e4mQ1S\u00fbz?\u00c1\r\u00bcq\f\u00f8\u00ba\u00a7\u00a6\u00c8\u00f5\u00c5\u00de\fAf\u00d9\u0005\u0014\u0097\u00c3\u00d4 )\u00cf\u00fb~\b\u00bfO\u00ffA6\u0016\u00b0`+\u00c6\u009d\u0084\u009b\u00a1V\u00abf2\u00a5W(\u00ee\u00f8\f\u0019\u00f5O\u00ce]\u00cb\u00b0i\u0001\u00b4bk\u00b0\u0005\u0096'\u0093\u00c2*\u0006\u0017\u0013W\u00ab\u008dF\u0007\"h\u00de\u0091&\u00cd\u00ac\u0007\u00db<2H,\u00ef\u00f2\u0007\u00c1\u0095\u00a2.\u00a9:]\u0013lA\u00a8\u00c7B>\u00feTQ\u0099\u00c3`'r,!\u00c1W\u00c7\u0002\u00b44";
                        var6_3 = "\u000e\u00d2\u0088\u0095{T\u0018\u0016\u00b3uSA=\u00ee\u0011N\u00ac\u00day\u0005\u00d3md(\u009f\u00fd\u00a0\u0098j\u00af\u0002\u0097Y!a\u00b7LX&\u0085\u0086\u00f4F\u00faT\u00c6Wx\u009be\u008c{\t\u00b7\u0097\u00e4mQ1S\u00fbz?\u00c1\r\u00bcq\f\u00f8\u00ba\u00a7\u00a6\u00c8\u00f5\u00c5\u00de\fAf\u00d9\u0005\u0014\u0097\u00c3\u00d4 )\u00cf\u00fb~\b\u00bfO\u00ffA6\u0016\u00b0`+\u00c6\u009d\u0084\u009b\u00a1V\u00abf2\u00a5W(\u00ee\u00f8\f\u0019\u00f5O\u00ce]\u00cb\u00b0i\u0001\u00b4bk\u00b0\u0005\u0096'\u0093\u00c2*\u0006\u0017\u0013W\u00ab\u008dF\u0007\"h\u00de\u0091&\u00cd\u00ac\u0007\u00db<2H,\u00ef\u00f2\u0007\u00c1\u0095\u00a2.\u00a9:]\u0013lA\u00a8\u00c7B>\u00feTQ\u0099\u00c3`'r,!\u00c1W\u00c7\u0002\u00b44".length();
                        var3_4 = 7;
                        var2_5 = -1;
lbl8:
                        // 2 sources

                        while (true) {
                            v0 = 69;
                            v1 = ++var2_5;
                            v2 = var4_2.substring(v1, v1 + var3_4);
                            v3 = -1;
                            break block24;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var7[var5_1++] = v4.intern();
                            if ((var2_5 += var3_4) < var6_3) {
                                var3_4 = var4_2.charAt(var2_5);
                                ** continue;
                            }
                            var4_2 = "\u00b4v+\u00eaE\u00934\u00b2\u00ae\u0090\u0081\u00d3\u00df\u0006\u00b0n\u00cck\u00911";
                            var6_3 = "\u00b4v+\u00eaE\u00934\u00b2\u00ae\u0090\u0081\u00d3\u00df\u0006\u00b0n\u00cck\u00911".length();
                            var3_4 = 13;
                            var2_5 = -1;
lbl23:
                            // 2 sources

                            while (true) {
                                v0 = 111;
                                v5 = ++var2_5;
                                v2 = var4_2.substring(v5, v5 + var3_4);
                                v3 = 0;
                                break block24;
                                break;
                            }
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var7[var5_1++] = v4.intern();
                            if ((var2_5 += var3_4) < var6_3) {
                                var3_4 = var4_2.charAt(var2_5);
                                ** continue;
                            }
                            break block25;
                            break;
                        }
                    }
                    v6 = v2.toCharArray();
                    v7 = v6.length;
                    var8_6 = 0;
                    try {
                        v8 = v0;
                        v9 = v6;
                        v10 = v7;
                        if (v7 > 1) break block26;
lbl47:
                        // 2 sources

                        while (true) {
                            v11 = v8;
                            v9 = v9;
                            v12 = v9;
                            v13 = v8;
                            v14 = var8_6;
                            break;
                        }
                    }
                    catch (RuntimeException v15) {
                        throw u3.b(v15);
                    }
                    while (true) {
                        switch (var8_6 % 7) {
                            case 0: {
                                v16 = 83;
                                break;
                            }
                            case 1: {
                                v16 = 22;
                                break;
                            }
                            case 2: {
                                v16 = 125;
                                break;
                            }
                            case 3: {
                                v16 = 90;
                                break;
                            }
                            case 4: {
                                v16 = 84;
                                break;
                            }
                            case 5: {
                                v16 = 58;
                                break;
                            }
                            default: {
                                v16 = 56;
                            }
                        }
                        try {
                            v12[v14] = (char)(v12[v14] ^ (v13 ^ v16));
                            ++var8_6;
                            v8 = v11;
                            if (v11 != 0) break;
                            v11 = v8;
                            v9 = v9;
                            v14 = v8;
                            v12 = v9;
                            v13 = v8;
                        }
                        catch (RuntimeException v17) {
                            throw u3.b(v17);
                        }
                    }
                }
                v18 = v9;
                v10 = v10;
                ** while (v10 > var8_6)
lbl98:
                // 1 sources

                v4 = new String(v18);
                switch (v3) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl105:
                    // 1 sources

                    ** continue;
                }
            }
            u3.B = var7;
            u3.F = new String[16];
            break block27;
lbl110:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 6620180202906016131L;
        ** while (true)
        u3.p = 2551708638620768875L ^ var0_7;
    }

    /*
     * Unable to fully structure code
     */
    private static String j(int var0, int var1_1) {
        block268: {
            block269: {
                block273: {
                    block274: {
                        block271: {
                            block272: {
                                block270: {
                                    var2_2 = g.R();
                                    var3_3 = (var0 ^ 32089) & 65535;
                                    try {
                                        v0 = u3.F[var3_3];
                                        if (var2_2 == null) break block268;
                                        if (v0 != null) break block269;
                                    }
                                    catch (RuntimeException v1) {
                                        throw u3.b(v1);
                                    }
                                    var4_4 = u3.B[var3_3].toCharArray();
                                    try {
                                        v2 = var4_4[0] & 255;
                                        if (var2_2 == null) break block270;
                                    }
                                    catch (RuntimeException v3) {
                                        throw u3.b(v3);
                                    }
                                    {
                                        ** switch (v2)
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        case 0: {
                                            v2 = 178;
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        case 1: {
                                            v2 = 102;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        case 2: {
                                            v2 = 103;
                                            break;
                                        }
lbl27:
                                        // 1 sources

                                        case 3: {
                                            v2 = 62;
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        case 4: {
                                            v2 = 223;
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        case 5: {
                                            v2 = 31;
                                            break;
                                        }
lbl36:
                                        // 1 sources

                                        case 6: {
                                            v2 = 3;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        case 7: {
                                            v2 = 192;
                                            break;
                                        }
lbl42:
                                        // 1 sources

                                        case 8: {
                                            v2 = 19;
                                            break;
                                        }
lbl45:
                                        // 1 sources

                                        case 9: {
                                            v2 = 59;
                                            break;
                                        }
lbl48:
                                        // 1 sources

                                        case 10: {
                                            v2 = 179;
                                            break;
                                        }
lbl51:
                                        // 1 sources

                                        case 11: {
                                            v2 = 212;
                                            break;
                                        }
lbl54:
                                        // 1 sources

                                        case 12: {
                                            v2 = 146;
                                            break;
                                        }
lbl57:
                                        // 1 sources

                                        case 13: {
                                            v2 = 207;
                                            break;
                                        }
lbl60:
                                        // 1 sources

                                        case 14: {
                                            v2 = 22;
                                            break;
                                        }
lbl63:
                                        // 1 sources

                                        case 15: {
                                            v2 = 70;
                                            break;
                                        }
lbl66:
                                        // 1 sources

                                        case 16: {
                                            v2 = 82;
                                            break;
                                        }
lbl69:
                                        // 1 sources

                                        case 17: {
                                            v2 = 57;
                                            break;
                                        }
lbl72:
                                        // 1 sources

                                        case 18: {
                                            v2 = 7;
                                            break;
                                        }
lbl75:
                                        // 1 sources

                                        case 19: {
                                            v2 = 17;
                                            break;
                                        }
lbl78:
                                        // 1 sources

                                        case 20: {
                                            v2 = 73;
                                            break;
                                        }
lbl81:
                                        // 1 sources

                                        case 21: {
                                            v2 = 145;
                                            break;
                                        }
lbl84:
                                        // 1 sources

                                        case 22: {
                                            v2 = 106;
                                            break;
                                        }
lbl87:
                                        // 1 sources

                                        case 23: {
                                            v2 = 186;
                                            break;
                                        }
lbl90:
                                        // 1 sources

                                        case 24: {
                                            v2 = 200;
                                            break;
                                        }
lbl93:
                                        // 1 sources

                                        case 25: {
                                            v2 = 116;
                                            break;
                                        }
lbl96:
                                        // 1 sources

                                        case 26: {
                                            v2 = 231;
                                            break;
                                        }
lbl99:
                                        // 1 sources

                                        case 27: {
                                            v2 = 197;
                                            break;
                                        }
lbl102:
                                        // 1 sources

                                        case 28: {
                                            v2 = 96;
                                            break;
                                        }
lbl105:
                                        // 1 sources

                                        case 29: {
                                            v2 = 45;
                                            break;
                                        }
lbl108:
                                        // 1 sources

                                        case 30: {
                                            v2 = 173;
                                            break;
                                        }
lbl111:
                                        // 1 sources

                                        case 31: {
                                            v2 = 4;
                                            break;
                                        }
lbl114:
                                        // 1 sources

                                        case 32: {
                                            v2 = 10;
                                            break;
                                        }
lbl117:
                                        // 1 sources

                                        case 33: {
                                            v2 = 237;
                                            break;
                                        }
lbl120:
                                        // 1 sources

                                        case 34: {
                                            v2 = 220;
                                            break;
                                        }
lbl123:
                                        // 1 sources

                                        case 35: {
                                            v2 = 25;
                                            break;
                                        }
lbl126:
                                        // 1 sources

                                        case 36: {
                                            v2 = 123;
                                            break;
                                        }
lbl129:
                                        // 1 sources

                                        case 37: {
                                            v2 = 228;
                                            break;
                                        }
lbl132:
                                        // 1 sources

                                        case 38: {
                                            v2 = 29;
                                            break;
                                        }
lbl135:
                                        // 1 sources

                                        case 39: {
                                            v2 = 170;
                                            break;
                                        }
lbl138:
                                        // 1 sources

                                        case 40: {
                                            v2 = 159;
                                            break;
                                        }
lbl141:
                                        // 1 sources

                                        case 41: {
                                            v2 = 206;
                                            break;
                                        }
lbl144:
                                        // 1 sources

                                        case 42: {
                                            v2 = 54;
                                            break;
                                        }
lbl147:
                                        // 1 sources

                                        case 43: {
                                            v2 = 143;
                                            break;
                                        }
lbl150:
                                        // 1 sources

                                        case 44: {
                                            v2 = 47;
                                            break;
                                        }
lbl153:
                                        // 1 sources

                                        case 45: {
                                            v2 = 95;
                                            break;
                                        }
lbl156:
                                        // 1 sources

                                        case 46: {
                                            v2 = 230;
                                            break;
                                        }
lbl159:
                                        // 1 sources

                                        case 47: {
                                            v2 = 137;
                                            break;
                                        }
lbl162:
                                        // 1 sources

                                        case 48: {
                                            v2 = 30;
                                            break;
                                        }
lbl165:
                                        // 1 sources

                                        case 49: {
                                            v2 = 77;
                                            break;
                                        }
lbl168:
                                        // 1 sources

                                        case 50: {
                                            v2 = 98;
                                            break;
                                        }
lbl171:
                                        // 1 sources

                                        case 51: {
                                            v2 = 183;
                                            break;
                                        }
lbl174:
                                        // 1 sources

                                        case 52: {
                                            v2 = 93;
                                            break;
                                        }
lbl177:
                                        // 1 sources

                                        case 53: {
                                            v2 = 218;
                                            break;
                                        }
lbl180:
                                        // 1 sources

                                        case 54: {
                                            v2 = 217;
                                            break;
                                        }
lbl183:
                                        // 1 sources

                                        case 55: {
                                            v2 = 74;
                                            break;
                                        }
lbl186:
                                        // 1 sources

                                        case 56: {
                                            v2 = 185;
                                            break;
                                        }
lbl189:
                                        // 1 sources

                                        case 57: {
                                            v2 = 188;
                                            break;
                                        }
lbl192:
                                        // 1 sources

                                        case 58: {
                                            v2 = 219;
                                            break;
                                        }
lbl195:
                                        // 1 sources

                                        case 59: {
                                            v2 = 157;
                                            break;
                                        }
lbl198:
                                        // 1 sources

                                        case 60: {
                                            v2 = 125;
                                            break;
                                        }
lbl201:
                                        // 1 sources

                                        case 61: {
                                            v2 = 144;
                                            break;
                                        }
lbl204:
                                        // 1 sources

                                        case 62: {
                                            v2 = 121;
                                            break;
                                        }
lbl207:
                                        // 1 sources

                                        case 63: {
                                            v2 = 56;
                                            break;
                                        }
lbl210:
                                        // 1 sources

                                        case 64: {
                                            v2 = 32;
                                            break;
                                        }
lbl213:
                                        // 1 sources

                                        case 65: {
                                            v2 = 221;
                                            break;
                                        }
lbl216:
                                        // 1 sources

                                        case 66: {
                                            v2 = 108;
                                            break;
                                        }
lbl219:
                                        // 1 sources

                                        case 67: {
                                            v2 = 249;
                                            break;
                                        }
lbl222:
                                        // 1 sources

                                        case 68: {
                                            v2 = 92;
                                            break;
                                        }
lbl225:
                                        // 1 sources

                                        case 69: {
                                            v2 = 245;
                                            break;
                                        }
lbl228:
                                        // 1 sources

                                        case 70: {
                                            v2 = 41;
                                            break;
                                        }
lbl231:
                                        // 1 sources

                                        case 71: {
                                            v2 = 132;
                                            break;
                                        }
lbl234:
                                        // 1 sources

                                        case 72: {
                                            v2 = 175;
                                            break;
                                        }
lbl237:
                                        // 1 sources

                                        case 73: {
                                            v2 = 162;
                                            break;
                                        }
lbl240:
                                        // 1 sources

                                        case 74: {
                                            v2 = 16;
                                            break;
                                        }
lbl243:
                                        // 1 sources

                                        case 75: {
                                            v2 = 246;
                                            break;
                                        }
lbl246:
                                        // 1 sources

                                        case 76: {
                                            v2 = 184;
                                            break;
                                        }
lbl249:
                                        // 1 sources

                                        case 77: {
                                            v2 = 244;
                                            break;
                                        }
lbl252:
                                        // 1 sources

                                        case 78: {
                                            v2 = 99;
                                            break;
                                        }
lbl255:
                                        // 1 sources

                                        case 79: {
                                            v2 = 78;
                                            break;
                                        }
lbl258:
                                        // 1 sources

                                        case 80: {
                                            v2 = 224;
                                            break;
                                        }
lbl261:
                                        // 1 sources

                                        case 81: {
                                            v2 = 139;
                                            break;
                                        }
lbl264:
                                        // 1 sources

                                        case 82: {
                                            v2 = 135;
                                            break;
                                        }
lbl267:
                                        // 1 sources

                                        case 83: {
                                            v2 = 138;
                                            break;
                                        }
lbl270:
                                        // 1 sources

                                        case 84: {
                                            v2 = 113;
                                            break;
                                        }
lbl273:
                                        // 1 sources

                                        case 85: {
                                            v2 = 166;
                                            break;
                                        }
lbl276:
                                        // 1 sources

                                        case 86: {
                                            v2 = 94;
                                            break;
                                        }
lbl279:
                                        // 1 sources

                                        case 87: {
                                            v2 = 155;
                                            break;
                                        }
lbl282:
                                        // 1 sources

                                        case 88: {
                                            v2 = 33;
                                            break;
                                        }
lbl285:
                                        // 1 sources

                                        case 89: {
                                            v2 = 250;
                                            break;
                                        }
lbl288:
                                        // 1 sources

                                        case 90: {
                                            v2 = 55;
                                            break;
                                        }
lbl291:
                                        // 1 sources

                                        case 91: {
                                            v2 = 203;
                                            break;
                                        }
lbl294:
                                        // 1 sources

                                        case 92: {
                                            v2 = 44;
                                            break;
                                        }
lbl297:
                                        // 1 sources

                                        case 93: {
                                            v2 = 177;
                                            break;
                                        }
lbl300:
                                        // 1 sources

                                        case 94: {
                                            v2 = 51;
                                            break;
                                        }
lbl303:
                                        // 1 sources

                                        case 95: {
                                            v2 = 240;
                                            break;
                                        }
lbl306:
                                        // 1 sources

                                        case 96: {
                                            v2 = 168;
                                            break;
                                        }
lbl309:
                                        // 1 sources

                                        case 97: {
                                            v2 = 52;
                                            break;
                                        }
lbl312:
                                        // 1 sources

                                        case 98: {
                                            v2 = 76;
                                            break;
                                        }
lbl315:
                                        // 1 sources

                                        case 99: {
                                            v2 = 67;
                                            break;
                                        }
lbl318:
                                        // 1 sources

                                        case 100: {
                                            v2 = 195;
                                            break;
                                        }
lbl321:
                                        // 1 sources

                                        case 101: {
                                            v2 = 124;
                                            break;
                                        }
lbl324:
                                        // 1 sources

                                        case 102: {
                                            v2 = 248;
                                            break;
                                        }
lbl327:
                                        // 1 sources

                                        case 103: {
                                            v2 = 6;
                                            break;
                                        }
lbl330:
                                        // 1 sources

                                        case 104: {
                                            v2 = 72;
                                            break;
                                        }
lbl333:
                                        // 1 sources

                                        case 105: {
                                            v2 = 180;
                                            break;
                                        }
lbl336:
                                        // 1 sources

                                        case 106: {
                                            v2 = 160;
                                            break;
                                        }
lbl339:
                                        // 1 sources

                                        case 107: {
                                            v2 = 23;
                                            break;
                                        }
lbl342:
                                        // 1 sources

                                        case 108: {
                                            v2 = 253;
                                            break;
                                        }
lbl345:
                                        // 1 sources

                                        case 109: {
                                            v2 = 91;
                                            break;
                                        }
lbl348:
                                        // 1 sources

                                        case 110: {
                                            v2 = 172;
                                            break;
                                        }
lbl351:
                                        // 1 sources

                                        case 111: {
                                            v2 = 150;
                                            break;
                                        }
lbl354:
                                        // 1 sources

                                        case 112: {
                                            v2 = 2;
                                            break;
                                        }
lbl357:
                                        // 1 sources

                                        case 113: {
                                            v2 = 101;
                                            break;
                                        }
lbl360:
                                        // 1 sources

                                        case 114: {
                                            v2 = 234;
                                            break;
                                        }
lbl363:
                                        // 1 sources

                                        case 115: {
                                            v2 = 60;
                                            break;
                                        }
lbl366:
                                        // 1 sources

                                        case 116: {
                                            v2 = 229;
                                            break;
                                        }
lbl369:
                                        // 1 sources

                                        case 117: {
                                            v2 = 9;
                                            break;
                                        }
lbl372:
                                        // 1 sources

                                        case 118: {
                                            v2 = 134;
                                            break;
                                        }
lbl375:
                                        // 1 sources

                                        case 119: {
                                            v2 = 80;
                                            break;
                                        }
lbl378:
                                        // 1 sources

                                        case 120: {
                                            v2 = 154;
                                            break;
                                        }
lbl381:
                                        // 1 sources

                                        case 121: {
                                            v2 = 8;
                                            break;
                                        }
lbl384:
                                        // 1 sources

                                        case 122: {
                                            v2 = 26;
                                            break;
                                        }
lbl387:
                                        // 1 sources

                                        case 123: {
                                            v2 = 205;
                                            break;
                                        }
lbl390:
                                        // 1 sources

                                        case 124: {
                                            v2 = 215;
                                            break;
                                        }
lbl393:
                                        // 1 sources

                                        case 125: {
                                            v2 = 129;
                                            break;
                                        }
lbl396:
                                        // 1 sources

                                        case 126: {
                                            v2 = 152;
                                            break;
                                        }
lbl399:
                                        // 1 sources

                                        case 127: {
                                            v2 = 142;
                                            break;
                                        }
lbl402:
                                        // 1 sources

                                        case 128: {
                                            v2 = 140;
                                            break;
                                        }
lbl405:
                                        // 1 sources

                                        case 129: {
                                            v2 = 148;
                                            break;
                                        }
lbl408:
                                        // 1 sources

                                        case 130: {
                                            v2 = 163;
                                            break;
                                        }
lbl411:
                                        // 1 sources

                                        case 131: {
                                            v2 = 239;
                                            break;
                                        }
lbl414:
                                        // 1 sources

                                        case 132: {
                                            v2 = 90;
                                            break;
                                        }
lbl417:
                                        // 1 sources

                                        case 133: {
                                            v2 = 43;
                                            break;
                                        }
lbl420:
                                        // 1 sources

                                        case 134: {
                                            v2 = 84;
                                            break;
                                        }
lbl423:
                                        // 1 sources

                                        case 135: {
                                            v2 = 190;
                                            break;
                                        }
lbl426:
                                        // 1 sources

                                        case 136: {
                                            v2 = 85;
                                            break;
                                        }
lbl429:
                                        // 1 sources

                                        case 137: {
                                            v2 = 182;
                                            break;
                                        }
lbl432:
                                        // 1 sources

                                        case 138: {
                                            v2 = 14;
                                            break;
                                        }
lbl435:
                                        // 1 sources

                                        case 139: {
                                            v2 = 61;
                                            break;
                                        }
lbl438:
                                        // 1 sources

                                        case 140: {
                                            v2 = 20;
                                            break;
                                        }
lbl441:
                                        // 1 sources

                                        case 141: {
                                            v2 = 65;
                                            break;
                                        }
lbl444:
                                        // 1 sources

                                        case 142: {
                                            v2 = 161;
                                            break;
                                        }
lbl447:
                                        // 1 sources

                                        case 143: {
                                            v2 = 21;
                                            break;
                                        }
lbl450:
                                        // 1 sources

                                        case 144: {
                                            v2 = 28;
                                            break;
                                        }
lbl453:
                                        // 1 sources

                                        case 145: {
                                            v2 = 156;
                                            break;
                                        }
lbl456:
                                        // 1 sources

                                        case 146: {
                                            v2 = 111;
                                            break;
                                        }
lbl459:
                                        // 1 sources

                                        case 147: {
                                            v2 = 222;
                                            break;
                                        }
lbl462:
                                        // 1 sources

                                        case 148: {
                                            v2 = 232;
                                            break;
                                        }
lbl465:
                                        // 1 sources

                                        case 149: {
                                            v2 = 18;
                                            break;
                                        }
lbl468:
                                        // 1 sources

                                        case 150: {
                                            v2 = 151;
                                            break;
                                        }
lbl471:
                                        // 1 sources

                                        case 151: {
                                            v2 = 136;
                                            break;
                                        }
lbl474:
                                        // 1 sources

                                        case 152: {
                                            v2 = 213;
                                            break;
                                        }
lbl477:
                                        // 1 sources

                                        case 153: {
                                            v2 = 243;
                                            break;
                                        }
lbl480:
                                        // 1 sources

                                        case 154: {
                                            v2 = 176;
                                            break;
                                        }
lbl483:
                                        // 1 sources

                                        case 155: {
                                            v2 = 88;
                                            break;
                                        }
lbl486:
                                        // 1 sources

                                        case 156: {
                                            v2 = 79;
                                            break;
                                        }
lbl489:
                                        // 1 sources

                                        case 157: {
                                            v2 = 198;
                                            break;
                                        }
lbl492:
                                        // 1 sources

                                        case 158: {
                                            v2 = 128;
                                            break;
                                        }
lbl495:
                                        // 1 sources

                                        case 159: {
                                            v2 = 171;
                                            break;
                                        }
lbl498:
                                        // 1 sources

                                        case 160: {
                                            v2 = 68;
                                            break;
                                        }
lbl501:
                                        // 1 sources

                                        case 161: {
                                            v2 = 189;
                                            break;
                                        }
lbl504:
                                        // 1 sources

                                        case 162: {
                                            v2 = 167;
                                            break;
                                        }
lbl507:
                                        // 1 sources

                                        case 163: {
                                            v2 = 40;
                                            break;
                                        }
lbl510:
                                        // 1 sources

                                        case 164: {
                                            v2 = 141;
                                            break;
                                        }
lbl513:
                                        // 1 sources

                                        case 165: {
                                            v2 = 181;
                                            break;
                                        }
lbl516:
                                        // 1 sources

                                        case 166: {
                                            v2 = 254;
                                            break;
                                        }
lbl519:
                                        // 1 sources

                                        case 167: {
                                            v2 = 225;
                                            break;
                                        }
lbl522:
                                        // 1 sources

                                        case 168: {
                                            v2 = 11;
                                            break;
                                        }
lbl525:
                                        // 1 sources

                                        case 169: {
                                            v2 = 48;
                                            break;
                                        }
lbl528:
                                        // 1 sources

                                        case 170: {
                                            v2 = 109;
                                            break;
                                        }
lbl531:
                                        // 1 sources

                                        case 171: {
                                            v2 = 112;
                                            break;
                                        }
lbl534:
                                        // 1 sources

                                        case 172: {
                                            v2 = 104;
                                            break;
                                        }
lbl537:
                                        // 1 sources

                                        case 173: {
                                            v2 = 119;
                                            break;
                                        }
lbl540:
                                        // 1 sources

                                        case 174: {
                                            v2 = 118;
                                            break;
                                        }
lbl543:
                                        // 1 sources

                                        case 175: {
                                            v2 = 89;
                                            break;
                                        }
lbl546:
                                        // 1 sources

                                        case 176: {
                                            v2 = 164;
                                            break;
                                        }
lbl549:
                                        // 1 sources

                                        case 177: {
                                            v2 = 238;
                                            break;
                                        }
lbl552:
                                        // 1 sources

                                        case 178: {
                                            v2 = 158;
                                            break;
                                        }
lbl555:
                                        // 1 sources

                                        case 179: {
                                            v2 = 24;
                                            break;
                                        }
lbl558:
                                        // 1 sources

                                        case 180: {
                                            v2 = 50;
                                            break;
                                        }
lbl561:
                                        // 1 sources

                                        case 181: {
                                            v2 = 251;
                                            break;
                                        }
lbl564:
                                        // 1 sources

                                        case 182: {
                                            v2 = 174;
                                            break;
                                        }
lbl567:
                                        // 1 sources

                                        case 183: {
                                            v2 = 117;
                                            break;
                                        }
lbl570:
                                        // 1 sources

                                        case 184: {
                                            v2 = 202;
                                            break;
                                        }
lbl573:
                                        // 1 sources

                                        case 185: {
                                            v2 = 12;
                                            break;
                                        }
lbl576:
                                        // 1 sources

                                        case 186: {
                                            v2 = 149;
                                            break;
                                        }
lbl579:
                                        // 1 sources

                                        case 187: {
                                            v2 = 130;
                                            break;
                                        }
lbl582:
                                        // 1 sources

                                        case 188: {
                                            v2 = 236;
                                            break;
                                        }
lbl585:
                                        // 1 sources

                                        case 189: {
                                            v2 = 194;
                                            break;
                                        }
lbl588:
                                        // 1 sources

                                        case 190: {
                                            v2 = 204;
                                            break;
                                        }
lbl591:
                                        // 1 sources

                                        case 191: {
                                            v2 = 241;
                                            break;
                                        }
lbl594:
                                        // 1 sources

                                        case 192: {
                                            v2 = 83;
                                            break;
                                        }
lbl597:
                                        // 1 sources

                                        case 193: {
                                            v2 = 86;
                                            break;
                                        }
lbl600:
                                        // 1 sources

                                        case 194: {
                                            v2 = 15;
                                            break;
                                        }
lbl603:
                                        // 1 sources

                                        case 195: {
                                            v2 = 5;
                                            break;
                                        }
lbl606:
                                        // 1 sources

                                        case 196: {
                                            v2 = 227;
                                            break;
                                        }
lbl609:
                                        // 1 sources

                                        case 197: {
                                            v2 = 0;
                                            break;
                                        }
lbl612:
                                        // 1 sources

                                        case 198: {
                                            v2 = 71;
                                            break;
                                        }
lbl615:
                                        // 1 sources

                                        case 199: {
                                            v2 = 36;
                                            break;
                                        }
lbl618:
                                        // 1 sources

                                        case 200: {
                                            v2 = 193;
                                            break;
                                        }
lbl621:
                                        // 1 sources

                                        case 201: {
                                            v2 = 105;
                                            break;
                                        }
lbl624:
                                        // 1 sources

                                        case 202: {
                                            v2 = 255;
                                            break;
                                        }
lbl627:
                                        // 1 sources

                                        case 203: {
                                            v2 = 42;
                                            break;
                                        }
lbl630:
                                        // 1 sources

                                        case 204: {
                                            v2 = 114;
                                            break;
                                        }
lbl633:
                                        // 1 sources

                                        case 205: {
                                            v2 = 100;
                                            break;
                                        }
lbl636:
                                        // 1 sources

                                        case 206: {
                                            v2 = 216;
                                            break;
                                        }
lbl639:
                                        // 1 sources

                                        case 207: {
                                            v2 = 37;
                                            break;
                                        }
lbl642:
                                        // 1 sources

                                        case 208: {
                                            v2 = 153;
                                            break;
                                        }
lbl645:
                                        // 1 sources

                                        case 209: {
                                            v2 = 49;
                                            break;
                                        }
lbl648:
                                        // 1 sources

                                        case 210: {
                                            v2 = 115;
                                            break;
                                        }
lbl651:
                                        // 1 sources

                                        case 211: {
                                            v2 = 165;
                                            break;
                                        }
lbl654:
                                        // 1 sources

                                        case 212: {
                                            v2 = 38;
                                            break;
                                        }
lbl657:
                                        // 1 sources

                                        case 213: {
                                            v2 = 201;
                                            break;
                                        }
lbl660:
                                        // 1 sources

                                        case 214: {
                                            v2 = 210;
                                            break;
                                        }
lbl663:
                                        // 1 sources

                                        case 215: {
                                            v2 = 126;
                                            break;
                                        }
lbl666:
                                        // 1 sources

                                        case 216: {
                                            v2 = 39;
                                            break;
                                        }
lbl669:
                                        // 1 sources

                                        case 217: {
                                            v2 = 110;
                                            break;
                                        }
lbl672:
                                        // 1 sources

                                        case 218: {
                                            v2 = 63;
                                            break;
                                        }
lbl675:
                                        // 1 sources

                                        case 219: {
                                            v2 = 66;
                                            break;
                                        }
lbl678:
                                        // 1 sources

                                        case 220: {
                                            v2 = 58;
                                            break;
                                        }
lbl681:
                                        // 1 sources

                                        case 221: {
                                            v2 = 208;
                                            break;
                                        }
lbl684:
                                        // 1 sources

                                        case 222: {
                                            v2 = 226;
                                            break;
                                        }
lbl687:
                                        // 1 sources

                                        case 223: {
                                            v2 = 120;
                                            break;
                                        }
lbl690:
                                        // 1 sources

                                        case 224: {
                                            v2 = 107;
                                            break;
                                        }
lbl693:
                                        // 1 sources

                                        case 225: {
                                            v2 = 196;
                                            break;
                                        }
lbl696:
                                        // 1 sources

                                        case 226: {
                                            v2 = 131;
                                            break;
                                        }
lbl699:
                                        // 1 sources

                                        case 227: {
                                            v2 = 122;
                                            break;
                                        }
lbl702:
                                        // 1 sources

                                        case 228: {
                                            v2 = 75;
                                            break;
                                        }
lbl705:
                                        // 1 sources

                                        case 229: {
                                            v2 = 233;
                                            break;
                                        }
lbl708:
                                        // 1 sources

                                        case 230: {
                                            v2 = 211;
                                            break;
                                        }
lbl711:
                                        // 1 sources

                                        case 231: {
                                            v2 = 69;
                                            break;
                                        }
lbl714:
                                        // 1 sources

                                        case 232: {
                                            v2 = 235;
                                            break;
                                        }
lbl717:
                                        // 1 sources

                                        case 233: {
                                            v2 = 27;
                                            break;
                                        }
lbl720:
                                        // 1 sources

                                        case 234: {
                                            v2 = 247;
                                            break;
                                        }
lbl723:
                                        // 1 sources

                                        case 235: {
                                            v2 = 187;
                                            break;
                                        }
lbl726:
                                        // 1 sources

                                        case 236: {
                                            v2 = 147;
                                            break;
                                        }
lbl729:
                                        // 1 sources

                                        case 237: {
                                            v2 = 87;
                                            break;
                                        }
lbl732:
                                        // 1 sources

                                        case 238: {
                                            v2 = 242;
                                            break;
                                        }
lbl735:
                                        // 1 sources

                                        case 239: {
                                            v2 = 64;
                                            break;
                                        }
lbl738:
                                        // 1 sources

                                        case 240: {
                                            v2 = 97;
                                            break;
                                        }
lbl741:
                                        // 1 sources

                                        case 241: {
                                            v2 = 169;
                                            break;
                                        }
lbl744:
                                        // 1 sources

                                        case 242: {
                                            v2 = 34;
                                            break;
                                        }
lbl747:
                                        // 1 sources

                                        case 243: {
                                            v2 = 35;
                                            break;
                                        }
lbl750:
                                        // 1 sources

                                        case 244: {
                                            v2 = 252;
                                            break;
                                        }
lbl753:
                                        // 1 sources

                                        case 245: {
                                            v2 = 53;
                                            break;
                                        }
lbl756:
                                        // 1 sources

                                        case 246: {
                                            v2 = 133;
                                            break;
                                        }
lbl759:
                                        // 1 sources

                                        case 247: {
                                            v2 = 81;
                                            break;
                                        }
lbl762:
                                        // 1 sources

                                        case 248: {
                                            v2 = 1;
                                            break;
                                        }
lbl765:
                                        // 1 sources

                                        case 249: {
                                            v2 = 191;
                                            break;
                                        }
lbl768:
                                        // 1 sources

                                        case 250: {
                                            v2 = 199;
                                            break;
                                        }
lbl771:
                                        // 1 sources

                                        case 251: {
                                            v2 = 13;
                                            break;
                                        }
lbl774:
                                        // 1 sources

                                        case 252: {
                                            v2 = 127;
                                            break;
                                        }
lbl777:
                                        // 1 sources

                                        case 253: {
                                            v2 = 214;
                                            break;
                                        }
lbl780:
                                        // 1 sources

                                        case 254: {
                                            v2 = 209;
                                            break;
                                        }
lbl783:
                                        // 1 sources

                                        default: {
                                            v2 = 46;
                                        }
                                    }
                                }
                                var5_5 = v2;
                                var6_6 = (var1_1 & 255) - var5_5;
                                try {
                                    v4 = var6_6;
                                    if (var2_2 == null) break block271;
                                    if (v4 >= 0) break block272;
                                }
                                catch (RuntimeException v5) {
                                    throw u3.b(v5);
                                }
                                var6_6 += 256;
                            }
                            v4 = ((var1_1 & 65535) >>> 8) - var5_5;
                        }
                        var7_7 = v4;
                        try {
                            v6 = var7_7;
                            if (var2_2 == null) break block273;
                            if (v6 >= 0) break block274;
                        }
                        catch (RuntimeException v7) {
                            throw u3.b(v7);
                        }
                        var7_7 += 256;
                    }
                    v6 = var8_8 = 0;
                }
                if (var2_2 != null) ** GOTO lbl827
                do {
                    var9_9 = var8_8 % 2;
                    v8 = var8_8;
                    v9 = var4_4;
                    v10 = var4_4[v8];
                    v11 = var9_9;
                    if (var2_2 == null) ** GOTO lbl824
                    if (v11 == 0) {
                        v9[v8] = (char)(v10 ^ var6_6);
                        var6_6 = ((var6_6 >>> 3 | var6_6 << 5) ^ var4_4[var8_8]) & 255;
                    } else {
                        v11 = var7_7;
lbl824:
                        // 2 sources

                        v9[v8] = (char)(v10 ^ v11);
                        var7_7 = ((var7_7 >>> 3 | var7_7 << 5) ^ var4_4[var8_8]) & 255;
                    }
                    ++var8_8;
lbl827:
                    // 2 sources

                } while (var8_8 < var4_4.length);
                u3.F[var3_3] = new String(var4_4).intern();
            }
            v0 = u3.F[var3_3];
        }
        return v0;
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

