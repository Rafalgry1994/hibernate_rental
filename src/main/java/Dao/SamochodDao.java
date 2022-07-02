package Dao;

import model.Samochod;

import java.util.List;
import java.util.Optional;

public class SamochodDao implements ISamochodDao {
    @Override
    public void dodajSamochod(Samochod samochod) {

    }

    @Override
    public void usunSamochod(Samochod samochod) {

    }

    @Override
    public Optional<Samochod> zwrocSamochod(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Samochod> listaWszystkichSamochodow() {
        return null;
    }

    @Override
    public void aktualizujSamochod(Samochod samochod) {

    }
}
