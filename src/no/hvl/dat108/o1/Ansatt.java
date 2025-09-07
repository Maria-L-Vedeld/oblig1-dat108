package no.hvl.dat108.o1;

public class Ansatt {

	public String fornavn;
	public String etternavn;
	public Kjonn kjonn;
	public String stilling;
	public int lonn;
	
	public Ansatt(String fornavn, String etternavn, Kjonn kjonn, String stilling, int lonn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kjonn = kjonn;
		this.stilling = stilling;
		this.lonn = lonn;
	}
	
	public String getFornavn() {
		return fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public Kjonn getKjonn() {
		return kjonn;
	}
	public String getStilling() {
		return stilling;
	}
	public int getLonn() {
		return lonn;
	}
	
	
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;

	}
	public void setKjonn(Kjonn kjonn) {
		this.kjonn = kjonn;
	}
	
	public void setStilling(String stilling) {
        this.stilling = stilling;
    }

	public void setLonn(int lonn) {
        this.lonn = lonn;
    }
	
	@Override
	public String toString() {
		return fornavn + " " + etternavn + " (" + kjonn + ") " + stilling + " Lønn: " + lonn;
	}

}
