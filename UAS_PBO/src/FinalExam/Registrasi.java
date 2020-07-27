package FinalExam;

public class Registrasi {
	
    private String NamaKaryawan, password ;

    public Registrasi(){}
    public Registrasi(String namaKaryawan, String password) {
		this.NamaKaryawan = namaKaryawan;
		this.password = password;
	}
    public void setNamaKaryawan(String NamaKaryawan) {
        this.NamaKaryawan = NamaKaryawan;
    }
    
	public void setPassword(String password) {
        this.password = password;
    }

    public String getNamaKaryawan() {
        return this.NamaKaryawan;
    }

    public String getPassword() {
        return this.password;
    }
	@Override
	public String toString() {
		return "Registrasi : "+ "\n"
				+"NamaKaryawan=" + getNamaKaryawan() + 
				"\t\t\t\t\t" +"Password : " + getPassword();
	}
}