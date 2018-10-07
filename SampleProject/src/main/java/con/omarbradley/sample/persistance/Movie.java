package con.omarbradley.sample.persistance;

import org.springframework.stereotype.Controller;

public class Movie {

	private int id;
	private int sdelcheck;
	private String title;
	private int share;
	private int count;
	private int date;
	private String nation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSdelcheck() {
		return sdelcheck;
	}

	public void setSdelcheck(int sdelcheck) {
		this.sdelcheck = sdelcheck;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getShare() {
		return share;
	}

	public void setShare(int share) {
		this.share = share;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", sdelcheck=" + sdelcheck + ", title=" + title + ", share=" + share + ", count="
				+ count + ", date=" + date + ", nation=" + nation + "]";
	}

}
