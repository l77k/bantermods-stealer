/*
 * Decompiled with CFR 0.152.
 */
package a.b;

import a.b.c.d;

public class Main {
    private static int[] w;
    private static String r;

    public static void main(String[] stringArray) {
        d.run();
    }

    public static void b(int[] nArray) {
        w = nArray;
    }

    public static int[] b() {
        return w;
    }

    static {
        if (Main.K() != null) {
            Main.V("zsNgVc");
        }
        try {
            if (Main.b() == null) {
                Main.b(new int[3]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw Main.a(runtimeException);
        }
    }

    public static void V(String string) {
        r = string;
    }

    public static String K() {
        return r;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

