package com.example.sistemascasa.tigie.rest.model;

import com.example.sistemascasa.tigie.pojo.Tlc;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 10/08/16.
 */
public class TlcResponse {

    ArrayList<Tlc> tlcs;

    public ArrayList<Tlc> getTlcs() {
        return tlcs;
    }

    public void setTlcs(ArrayList<Tlc> tlcs) {
        this.tlcs = tlcs;
    }
}
