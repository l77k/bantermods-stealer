/*
 * Decompiled with CFR 0.152.
 */
package a.b.c.g;

import a.b.c.g.k;

class ue {
    static final int[] h = new int[k.values().length];

    static {
        try {
            ue.h[k.COOKIES.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ue.h[k.PASSWORDS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ue.h[k.AUTOFILL.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ue.h[k.HISTORY.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

