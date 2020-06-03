package com.example.projekt_silownia;

public class Cwiczenie {

    private String nazwa;
    private int opis;
    private int obraz_id;
    private int film_id;

    public static  final  Cwiczenie [] cwiczenia_poziom_1 =
    {
            new Cwiczenie("Przysiad1", R.string.opis_cw_1, R.drawable.squad, R.raw.squad),
            new Cwiczenie("Przysiad2", R.string.opis_cw_2, R.drawable.squad, R.raw.squad),
            new Cwiczenie("Przysiad3", R.string.opis_cw_3, R.drawable.squad, R.raw.squad),
            new Cwiczenie("Przysiad4", R.string.opis_cw_4, R.drawable.squad, R.raw.squad),
            new Cwiczenie("Przysiad5", R.string.opis_cw_5, R.drawable.squad, R.raw.squad),
    };

    public static  final  Cwiczenie [] cwiczenia_poziom_2 =
            {
                    new Cwiczenie("Brzuszki1", R.string.opis_cw_1, R.drawable.squad, R.raw.squad),
                    new Cwiczenie("Brzuszki2", R.string.opis_cw_2, R.drawable.squad, R.raw.squad),
                    new Cwiczenie("Brzuszki3", R.string.opis_cw_3, R.drawable.squad, R.raw.squad),
                    new Cwiczenie("Brzuszki4", R.string.opis_cw_4, R.drawable.squad, R.raw.squad),
                    new Cwiczenie("Brzuszki5", R.string.opis_cw_5, R.drawable.squad, R.raw.squad),
            };

    public static  final  Cwiczenie [] cwiczenia_poziom_3 =
            {
                    new Cwiczenie("Pompka1", R.string.opis_cw_1, R.drawable.squad, R.raw.squad),
                    new Cwiczenie("Pompka2", R.string.opis_cw_2, R.drawable.squad, R.raw.squad),
                    new Cwiczenie("Pompka3", R.string.opis_cw_3, R.drawable.squad, R.raw.squad),
                    new Cwiczenie("Pompka4", R.string.opis_cw_4, R.drawable.squad, R.raw.squad),
                    new Cwiczenie("Pompka5", R.string.opis_cw_5, R.drawable.squad, R.raw.squad),
            };


    Cwiczenie(String nazwa, int opis, int obraz_id, int film_id)
    {
        this.nazwa = nazwa;
        this.opis = opis;
        this.film_id = film_id;
        this.obraz_id = obraz_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getObraz_id() {
        return obraz_id;
    }

    public int getOpis() {
        return opis;
    }

    public String toString()
    {
        return this.nazwa;
    }

}
