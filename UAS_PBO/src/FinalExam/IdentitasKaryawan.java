package FinalExam;
//import java.util.Arrays;

// no 1 subclass
public class IdentitasKaryawan extends People {
//	private char[] nomorHP = new char[12];
	private	String Kendaraan, nomorHP;
	
	// no 4 overloading
	public IdentitasKaryawan(String Name, String Birthdate, String nomorHP,  String kendaraan) {
		super(Name,Birthdate);
		this.nomorHP = nomorHP;
		this.Kendaraan = kendaraan;
	}
	
	public IdentitasKaryawan(String Name, String Birthdate, String nomorHP) {
		super(Name,Birthdate);
		this.nomorHP = nomorHP;
		this.Kendaraan = "belum ada data";
	}
	
	
	public String getNomorHP() {
		return this.nomorHP;
	}

	public void setNomorHP(String nomorHP) {
		this.nomorHP = nomorHP;
	}

	public String getKendaraan() {
		return this.Kendaraan;
	}

	public void setKendaraan(String kendaraan) {
		this.Kendaraan = kendaraan;
	}

	

//	@Override
	public String toString() {
		return "IdentitasKaryawan : " + "\n" 
				+ " Name = " + getName() + 
				"\t\t\t" + "Tanggal Lahir = " + getBirthdate() +
				"\t\t\t" + " nomorHP = " + getNomorHP() + 
				"\t\t\t\t" + " kendaraan = " + getKendaraan() ;
	}	
}