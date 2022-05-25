package web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "boxOfficeResult")
public class BoxOfficeResult {
	private String boxofficeType;
	private String showRange;
	@XmlElement(name = "dailyBoxOffice")
	private List<DailyBoxOffice> dailyBoxOfficeList = new ArrayList<>();

	public BoxOfficeResult() {
	}

	public BoxOfficeResult(String boxofficeType, String showRange) {
		this.boxofficeType = boxofficeType;
		this.showRange = showRange;
	}

	public String getBoxofficeType() {
		return this.boxofficeType;
	}

	public void setBoxofficeType(String boxofficeType) {
		this.boxofficeType = boxofficeType;
	}

	public String getShowRange() {
		return this.showRange;
	}

	public void setShowRange(String showRange) {
		this.showRange = showRange;
	}

	public List<DailyBoxOffice> getDailyBoxOfficeList() {
		return this.dailyBoxOfficeList;
	}

}
