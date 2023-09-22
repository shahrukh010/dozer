package dozer.com.code.main.mapper;

import org.dozer.Mapping;

public class AyetStudioToOfferResponseMapper {

	@Mapping("id")
	private String uid;

	@Mapping("name")
	private String title;

	@Mapping("image")
	private String thumbnail;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

}
