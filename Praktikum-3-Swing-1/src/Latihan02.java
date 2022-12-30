import javax.swing.JOptionPane;
		public class Latihan02 {
			public static void main(String[] args){
				Biodata myBio = new Biodata();
				myBio.setFullname (JOptionPane.showInputDialog(null,"Masukkan nama lengkap Anda:","From nama ",JOptionPane.QUESTION_MESSAGE));
				
				myBio.setAge (JOptionPane.showInputDialog(null,"Masukkan usia Anda:","From Umur",JOptionPane.QUESTION_MESSAGE));
				
				myBio.setAlamat (JOptionPane.showInputDialog(null,"Masukkan alamat Anda","From alamat",JOptionPane.QUESTION_MESSAGE));
				
				JOptionPane.showMessageDialog(null,"nama: " + myBio.getFullname()
				+ "\nUsia anda:  " + myBio.getAge() 
				+ "tahun"+ "\nAlamat anda : " 
				+ myBio.getAlamat()
		);
	}
}
