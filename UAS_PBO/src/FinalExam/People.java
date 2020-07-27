package FinalExam;

public class People {
	private String Name, Birthdate;

	public People() {}
	public People(String name, String Birthdate) {
		this.Name = name;
		this.Birthdate = Birthdate;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getBirthdate() {
		return this.Birthdate;
	}

	public void setBirthdate(String Birthdate) {
		this.Birthdate = Birthdate;
	}
	
	public void cetakDataKaryawan(){
        System.out.println("Nama Lengkap : "+getName()+"\n");
        System.out.println("Tanggal Lahir: "+getBirthdate()+"\n");
    }
}
