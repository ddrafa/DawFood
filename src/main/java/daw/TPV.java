/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author ddrafa
 */
public class TPV {

    private final static String SPECIAL_CHARACTERS
            = "#$%&()*+,-.:;<=>@";
    private final static String MINUSCULAS_CHARACTERS
            = "abcdefghijklmnñopqrstuvwxyz";
    private final static String MAYUSCULAS_CHARACTERS
            = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private final static String NUMBERS_CHARACTERS
            = "0123456789";

    private final String numSerie;
    private String location;
    private LocalDateTime clock = LocalDateTime.now();
    final String password;

    public TPV(String location) {
        RandomStringUtils rsu = new RandomStringUtils();
        final String MAYUSCULAS = RandomStringUtils.random(2, MAYUSCULAS_CHARACTERS);
        final String MINUSCULA = RandomStringUtils.random(1, MINUSCULAS_CHARACTERS);
        final String NUMBERS = RandomStringUtils.random(2, NUMBERS_CHARACTERS);
        final String SPECIAL = RandomStringUtils.random(1, SPECIAL_CHARACTERS);
        this.password = MAYUSCULAS + SPECIAL + MINUSCULA + NUMBERS;
        this.location = location;
        
        String aux = UUID.randomUUID().toString().toUpperCase();
        Stream<Character> digit = aux.chars().mapToObj(i -> (char) i).filter(Character::isDigit).limit(3);
        Stream<Character> alpha = aux.chars().mapToObj(i -> (char) i).filter(Character::isAlphabetic).limit(3);
        List<Character> collect = Stream.concat(digit, alpha).collect(Collectors.toList());
        Collections.shuffle(collect);
        this.numSerie = collect.stream().map(Object::toString).collect(Collectors.joining());
    }
    
    public String getNumSerie() {
        return numSerie;
    }
    
    public String getLocation() {
        return location;
    }

    public LocalDateTime getClock() {
        return clock;
    }

    public String getPassword() {
        return password;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    public void setClock(LocalDateTime clock) {
        this.clock = clock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TPV{");
        sb.append("numSerie=").append(numSerie);
        sb.append(", location=").append(location);
        sb.append(", clock=").append(clock);
        sb.append(", password=").append(password);
        sb.append('}');
        return sb.toString();
    }

    

}
