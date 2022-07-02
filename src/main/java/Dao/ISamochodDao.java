package Dao;

import model.Samochod;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ISamochodDao {

    public void dodajSamochod(Samochod samochod);
    public void usunSamochod(Samochod samochod);
    public Optional<Samochod> zwrocSamochod (Long id);
    public List<Samochod> listaWszystkichSamochodow();
    public void aktualizujSamochod(Samochod samochod);




}
