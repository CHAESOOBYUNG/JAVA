package quiz15;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;
	
	@Override
	public void insertList(String song) {
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
		
		for(int i = 0; i < count; i++) {
			System.out.print(list[i]);
		}
		System.out.println();
	}
	@Override
	public int playLength() {
		return count;
	}
	
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */
	
}
