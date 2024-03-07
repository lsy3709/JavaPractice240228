package ex_240306;

public class Ex_07_interface_main_3 {

	public static void main(String[] args) {
		//public Ex_07_interface_subClass_3
		//(String groupName, String[] groupMembers, String[] groupAlbums) {
		String groupName = "상용 연습생";
		String[] groupMembers = {"상용1", "상용2", "상용3",};
		String[] groupAlbums = {"연습앨범1", "연습앨범2", "연습앨범3",};
		
		Ex_07_interface_subClass_3 lsyIdol = 
				new Ex_07_interface_subClass_3(groupName,groupMembers,groupAlbums);
		lsyIdol.introduceMember();
		lsyIdol.introduceAlbum();
		lsyIdol.introduceActivityArea();
		lsyIdol.song();
		lsyIdol.doSign();
		lsyIdol.dance();
		

	}

}
