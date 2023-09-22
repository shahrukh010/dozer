package dozer.com.code.main.mapper;

import org.dozer.Mapping;

public class LootablyToOfferResponseMapper {

	@Mapping("id")
	private String id;

	@Mapping("name")
	private String name;

	@Mapping("image")
	private String icon;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
