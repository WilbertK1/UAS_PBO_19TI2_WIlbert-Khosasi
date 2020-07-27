package FinalExam;

import java.util.ArrayList;
import java.util.Scanner;

// no 5 Menu for entry / input data
// no 6 Init
public class Menus {
	
	public static Scanner Input = new Scanner(System.in);
	public static ArrayList <IdentitasKaryawan> dataIDKaryawan = new ArrayList<IdentitasKaryawan>();
	public static ArrayList <Registrasi> dataRegistrasi = new ArrayList<Registrasi>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PilhanMenu = 0;
        do{
        	try {
	        	PrintMenu();
	            PilhanMenu = Input.nextInt();
	            Input.nextLine();
	            Input = new Scanner(System.in);
	            if(PilhanMenu == 1){
	            	IdentitasKaryawan tmpIdentitasKaryawan = InputdataIDKaryawan();
	                dataIDKaryawan.add(tmpIdentitasKaryawan);
	            }else if(PilhanMenu == 2){
	                Registrasi tmpRegistrasi = InputDataRegistrasi();
	                dataRegistrasi.add(tmpRegistrasi);
	            }else if(PilhanMenu == 3){
	            	TampilkandataIDKaryawan();
	            }else if(PilhanMenu == 4){
	                TampilkandataRegistrasi();
	            }else if(PilhanMenu == 5){
	                TampilkandataIDKaryawansorted();
	            }else if(PilhanMenu == 6){
	            	 TampilkandataRegistrasisorted();
	            }else if(PilhanMenu == 7){
	            	 Init();
	            }
	        }catch(Exception e) {
        		System.out.println("Err:" +e);
        	}
        }while(PilhanMenu!=0);
        Input.close();
	}

	public static void PrintMenu(){
        System.out.println("\n ==========------- Menu -------=========");
        System.out.println("1. Tambah 		Data   Identitas Karyawan");
        System.out.println("2. Tambah 		Data   Registrasi");
        System.out.println("3. Tampilkan		Data   Identitas Karyawan");
        System.out.println("4. Tampilkan		Data   Registrasi");
        System.out.println("5. Tampilkan		Data   Identitas Karyawan (sorted)");
        System.out.println("6. Tampilkan		Data   Registrasi (sorted)");
        System.out.println("7. Inisialisasi Program");
        System.out.println("0. Keluar	");
        System.out.print("Masukkan Pilihan anda:");
    }

	// Init
	public static void Init() {
		dataIDKaryawan.add(new IdentitasKaryawan("Eddie", "32 mei 3030", "532654634654", "Mobil"));
		dataIDKaryawan.add(new IdentitasKaryawan("Adit", "32 mei 3030" , "532154352123", "Kereta"));
		dataIDKaryawan.add(new IdentitasKaryawan("Wendy", "32 mei 3030" , "532158765813", "heli"));
		dataRegistrasi.add(new Registrasi("Eddie", "3dd13"));
		dataRegistrasi.add(new Registrasi("Adit", "3dd"));
		dataRegistrasi.add(new Registrasi("Wendy", "w3ndy"));
		TampilkandataIDKaryawan();
		TampilkandataRegistrasi();
	}
	
	private static IdentitasKaryawan InputdataIDKaryawan() {
		String Name = "" , Birthdate = "" , nomorHP = "", Kendaraan = "" ;
		try {
			System.out.println("Input Nama				: ");
			Name = Input.nextLine();
			System.out.println("Input Tanggal Lahir		: ");
			Birthdate = Input.nextLine();
			System.out.println("Input Nomor HP			: ");
			nomorHP = Input.nextLine();
			System.out.println("Input kendaraan	: ");
			Kendaraan = Input.nextLine();
			}catch(java.util.InputMismatchException el) {
				System.out.println("Error:" + el);
			}
			catch(Exception e) {
				System.out.println("Err :" + e);
			}
		return new IdentitasKaryawan( Name, Birthdate, nomorHP,  Kendaraan);
	}

	
	private static Registrasi InputDataRegistrasi() {
		String NamaKaryawan = "", password = "";
		try {
			System.out.println("Input Nama Karyawan : ");
			NamaKaryawan = Input.nextLine();
			System.out.println("Input Password : ");
			password = Input.nextLine();
			
		}catch(Exception er) {
			System.out.println("Er :" +er);
		}
		return new Registrasi( NamaKaryawan, password);
	}
	
    public static void TampilkandataIDKaryawan(){        
        System.out.print("Data IDKaryawan :\n");
        System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.print("Nama\t\t\tTanggal Lahir\t\t\tNomor HP\t\t\t\tKendaraan\n");
        System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------\n");
        for(int i = 0; i < dataIDKaryawan.size(); i++) {
            System.out.println(dataIDKaryawan.get(i).getName() +
            "\t\t\t" + dataIDKaryawan.get(i).getBirthdate() +
            "\t\t\t" + new String(dataIDKaryawan.get(i).getNomorHP()) + 
            "\t\t\t\t" + dataIDKaryawan.get(i).getKendaraan()); 
        }
    }
    
    public static void TampilkandataRegistrasi(){        
        System.out.print("Data Registrasi :\n");
        System.out.print("---------------------------------------------------------------------------\n");
        System.out.print("Nama Karyawan\t\t\t\tPassword\n");
        System.out.print("---------------------------------------------------------------------------\n");
        for(int i = 0; i < dataRegistrasi.size(); i++) {
            System.out.println(dataRegistrasi.get(i).getNamaKaryawan() +
            "\t\t\t\t\t" + dataRegistrasi.get(i).getPassword()); 
        }
    }
    
    // no 7  bubble sort
    private static  void TampilkandataIDKaryawansorted() {
		// TODO Auto-generated method stub	
        String tmp1, tmp2;
        for (int i = 0; i<dataIDKaryawan.size(); i=i+1){
            for(int j = i+1; j<dataIDKaryawan.size(); j=j+1){
                tmp1 = dataIDKaryawan.get(i).getName();
                tmp2 = dataIDKaryawan.get(j).getName();
                if(tmp1.compareToIgnoreCase(tmp2)>0){
                    IdentitasKaryawan tmp =  dataIDKaryawan.get(i);
                    dataIDKaryawan.set(i, dataIDKaryawan.get(j));
                    dataIDKaryawan.set(j, tmp);
                }
            }
        }System.out.println(dataIDKaryawan);
    }    
    // no 7  bubble sort    
	private static void TampilkandataRegistrasisorted() {
		// TODO Auto-generated method stub
		String tmp3, tmp4;
        for (int i = 0; i<dataRegistrasi.size(); i=i+1){
            for(int j = i+1; j<dataRegistrasi.size(); j=j+1){
                tmp3 = dataRegistrasi.get(i).getNamaKaryawan();
                tmp4 = dataRegistrasi.get(j).getNamaKaryawan();
                if(tmp3.compareToIgnoreCase(tmp4)>0){
                	Registrasi tmp =  dataRegistrasi.get(i);
                    dataRegistrasi.set(i, dataRegistrasi.get(j));
                    dataRegistrasi.set(j, tmp);
                }
            }
        }System.out.println(dataRegistrasi);
    }   
    
}

