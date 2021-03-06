package com.aldado.repository.demography.Impl;

import com.aldado.domain.demography.Race;
import com.aldado.factory.demography.RaceFactory;
import com.aldado.repository.demography.RaceRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Collection;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RaceRepositoryImplTest {

    private RaceRepository raceRepository;
    private Race race;

    private Race getSavedRace(){
        Collection<Race> savedRaces = this.raceRepository.getAll();
        return savedRaces.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.raceRepository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRace("Colored");

        raceRepository.create(this.race.getId(), this.race);
    }

    @Test
    public void create() throws Exception {
        Race race = new Race.Builder()
                .id("2222")
                .descr("White")
                .build();
        Race created = this.raceRepository.create(race.getId(), race);
        System.out.println("\n" + "In create, created = " + created);
        d_getAll();
        Assert.assertEquals(created, race);
    }

    @Test
    public void d_getAll() {
        Collection<Race> all = this.raceRepository.getAll();
        System.out.println("\nIn getAll, all = " + all);
    }

    @Test
    public void update() {
        String newDescr = "New race created";
        Race race = new Race.Builder().copy(getSavedRace()).descr(newDescr).build();
        System.out.println("\nIn update, about to be updated = " + race);
        Race updated = this.raceRepository.update(race.getId(), race);
        System.out.println("\nIn update, updated = " + updated);
        Assert.assertSame(newDescr, updated.getDescr());
        d_getAll();

    }

    @Test
    public void delete() {
        Race savedRace = getSavedRace();
        System.out.println("\n" + "In Delete, about to be deleted = " + race);
        this.raceRepository.delete(savedRace.getId());
        System.out.println("\n" + "In Delete, delete: ");
        d_getAll();
        Assert.assertNotNull(savedRace);
    }

    @Test
    public void read() {
        Race savedRace = getSavedRace();
        System.out.println("\nIn read, race id = " + savedRace.getId());
        Race read = this.raceRepository.read(savedRace.getId());
        System.out.println("\nIn read, read = " + read);
        d_getAll();
        Assert.assertNotNull(read);
    }
}