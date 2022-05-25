package web;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class DailyBoxOffice {
	private int rank;
	private String movieCd;
	private String movieNm;
	private long salesAmt;
	private long audiAcc;
	private int scrnCnt;

	public DailyBoxOffice() {
	}

	public DailyBoxOffice(int rank, String movieCd, String movieNm, long salesAmt, long audiAcc, int scrnCnt) {
		this.rank = rank;
		this.movieCd = movieCd;
		this.movieNm = movieNm;
		this.salesAmt = salesAmt;
		this.audiAcc = audiAcc;
		this.scrnCnt = scrnCnt;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getMovieCd() {
		return this.movieCd;
	}

	public void setMovieCd(String movieCd) {
		this.movieCd = movieCd;
	}

	public String getMovieNm() {
		return this.movieNm;
	}

	public void setMovieName(String movieNm) {
		this.movieNm = movieNm;
	}

	public long getSalesAmt() {
		return this.salesAmt;
	}

	public void setSalesAmt(long salesAmt) {
		this.salesAmt = salesAmt;
	}

	public long getAudiAcc() {
		return this.audiAcc;
	}

	public void setAudiAcc(long audiAcc) {
		this.audiAcc = audiAcc;
	}

	public int getScrnCnt() {
		return this.scrnCnt;
	}

	public void setScrnCnt(int scrnCnt) {
		this.scrnCnt = scrnCnt;
	}

}
