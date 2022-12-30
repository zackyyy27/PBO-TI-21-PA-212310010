import javax.swing.JOptionPane;

public class Latihan04 {
	private static final int Confirm = 0;

	public static void main(String[] args) {
		Biodata myBio = new Biodata();
		JOptionPane jop = new JOptionPane();
		boolean isContinue = true;
		
		while(isContinue) {
			String Fullname = jop.showInputDialog(null, "Masukkan Nama Lengkap");
			myBio.setFullname(Fullname);
			
			String Age = jop.showInputDialog(null, "Masukkan usia Anda");
			myBio.setAge(Age);
			
			String Alamat = jop.showInputDialog(null, "Masukkan alamat Anda");
			myBio.setAlamat(Alamat);
			
			
			if(Fullname.equals("") || Age.equals("") || Alamat.equals("") ) {
				jop.showMessageDialog(null, "Field [fullname/usia/alamat] tidak boleh kosong", "Error Message", jop.ERROR_MESSAGE);
			}else if(Alamat.length() <= 10) {
				jop.showMessageDialog(null, "“Masukkan alamat minimum 10 karakter!", "WARNING!", jop.WARNING_MESSAGE);
			}else {
		        try { 
		          int strAge= Integer.parseInt(Age);
		          jop.showMessageDialog(null, myBio.getFullname() + "\n" + myBio.getAge() + "\n" + myBio.getAlamat());
					

		        } catch(NumberFormatException e) { 
		          JOptionPane.showMessageDialog(null, "Isian Usia harus angka!", "ERROR!", jop.ERROR_MESSAGE);
		        }

				int confirm = jop.showConfirmDialog(null,"Apakah Anda ingin keluar?","Keluar?", jop.YES_NO_OPTION);
						if(confirm == 1) {isContinue = true;
						}else {
					    jop.showMessageDialog(null, "Terima kasih");
			}
		}

	  }
		
	}
}
