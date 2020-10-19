package com.adam.Nomor1;

public class Konfersi {
    float Suhu, C, F, K, R;

    public Konfersi(float suhu){
        this.Suhu = suhu;
    }
    public void Celcius(Konfersi temp){
        temp.C = temp.Suhu;
        temp.F = (temp.Suhu * 9/5) + 32;
        temp.K = temp.Suhu + 273;
        temp.R = temp.Suhu * 4/5;
    }
    public void Fahrenheit(Konfersi temp){
        temp.C = (temp.Suhu * 9/5) - 32;
        temp.F = temp.Suhu;
        temp.K = (temp.Suhu * 9/5) - 32 + 273;
        temp.R = (temp.Suhu * 9/4) - 32;
    }
    public void Kelvin(Konfersi temp){
        temp.C = temp.Suhu - 273;
        temp.F = (temp.Suhu * 9/5) + 32 - 273;
        temp.K = temp.Suhu;
        temp.R = (temp.Suhu * 5/4) - 273;
    }
    public void Reamur(Konfersi temp) {
        temp.C = temp.Suhu * 5/4;
        temp.F = (temp.Suhu * 9/4) + 32;
        temp.K = (temp.Suhu * 5/4) + 273;
        temp.R = temp.Suhu;
    }
}
