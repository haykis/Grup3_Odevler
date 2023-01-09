package ramazanKombe;

import java.util.ArrayList;
import java.util.List;

import yasarYilmaz.Araba;

public class Odev10CalintiAraclar {


	    private String plaka;
	    private String marka;
	    private String model;
	    private int yil;

	    public Odev10CalintiAraclar(String plaka, String marka, String model, int yil) {
	        this.plaka = plaka;
	        this.marka = marka;
	        this.model = model;
	        this.yil = yil;
	    }

	    public String getPlaka() {
	        return plaka;
	    }

	    public void setPlaka(String plaka) {
	        this.plaka = plaka;
	    }

	    public String getMarka() {
	        return marka;
	    }

	    public void setMake(String marka) {
	        this.marka = marka;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public int getYil() {
	        return yil;
	    }

	    public void setYil(int year) {
	        this.yil = yil;
	    }
	}
