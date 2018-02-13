package com.stanula;

public class CKsztaltownik {
    private double a, b, g, r, r1;
    private static String norma = "PN-EN 10056-1:2000";
    private String nazwa = "-";

    double pole() {
        return (a * g) + g * (b - g) + (1 - Math.PI / 4) * ((r * r) - (2 * (r * r)));
    }

    public String DajNorme() {
        return norma;
    }

    final public boolean przypisz(double a, double b, double g, double r, double r1) {
        if (a <= 0 || b <= 0 || g <= 0 || r <= 0 || r1 <= 0) {
            return false;
        } else {
            this.a = a;
            this.b = b;
            this.g = g;
            this.r = r;
            this.r1 = r1;
            this.nazwa = "K" + (int)a + "x" + (int)b + "x" + (int)g;
        }
        return true;
    }

    public CKsztaltownik() {
        this.przypisz(a, b, g, r, r1);
    }

    public CKsztaltownik(double a, double b, double g, double r, double r1) {
        this.przypisz(a, b, g, r, r1);
    }

    double dajWynik() {
        return Double.parseDouble(String.format("%.2f", pole()));
    }

    String dajWynik(int prec) {
        String string = String.format("%." + Integer.toString(prec) + "f", pole());
        return String.format("Nazwa = " + nazwa + ", A = " + a + ", B = " + b + ", G = " + g + ", R =" + r + ", R1 = " + r1 +
                ", Pole = " + string);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CKsztaltownik)) return false;

        CKsztaltownik that = (CKsztaltownik) o;

        if (Double.compare(that.a, a) != 0) return false;
        if (Double.compare(that.b, b) != 0) return false;
        if (Double.compare(that.g, g) != 0) return false;
        if (Double.compare(that.r, r) != 0) return false;
        if (Double.compare(that.r1, r1) != 0) return false;
        return nazwa != null ? nazwa.equals(that.nazwa) : that.nazwa == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(g);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r1);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        return result;
    }
}
