package vitorf.TugasMod1.no1;

public class Konversi {
    float suhu, c, f, k, r;

    public Konversi(float suhu) {
        this.suhu = suhu;
    }

    public void celcius(Konversi temp) {
        temp.c = temp.suhu;
        temp.f = (temp.suhu * 9/5) + 32;
        temp.k = temp.suhu + 273;
        temp.r = temp.suhu * 4/5;
    }

    public void fahrenheit(Konversi temp) {
        temp.c = (temp.suhu * 9/5) - 32;
        temp.f = temp.suhu;
        temp.k = (temp.suhu * 9/5) - 32 + 273;
        temp.r = (temp.suhu * 9/4) - 32;
    }

    public void kelvin(Konversi temp) {
        temp.c = temp.suhu - 273;
        temp.f = (temp.suhu * 9/5) + 32 - 273;
        temp.k = temp.suhu;
        temp.r = (temp.suhu * 5/4) - 273;
    }

    public void reamur(Konversi temp) {
        temp.c = temp.suhu * 5/4;
        temp.f = (temp.suhu * 9/4) + 32;
        temp.k = (temp.suhu * 5/4) + 273;
        temp.r = temp.suhu;
    }
}
