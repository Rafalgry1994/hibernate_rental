package model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Samochod {

    @Id

    private String nazwa;
    private String marka;
    private LocalDate dataProdukcji;
    @Enumerated(EnumType.STRING)
    private Nadwozie nadwozie;
    private Double miejscaSiedzace;
    private Skrzynia rodzajSkrzyni;
    private Double pojemnoscSilnika;




}
