package dozer.com.code.main.mapper.services;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOption;
import org.dozer.loader.api.FieldsMappingOptions;

import dozer.com.code.main.mapper.AyetStudioToOfferResponseMapper;
import dozer.com.code.main.mapper.LootablyToOfferResponseMapper;
import dozer.com.code.main.model.AyetStudioOffer;
import dozer.com.code.main.model.LootablyOffer;
import dozer.com.code.main.response.OfferResponse;

public class OfferResponseMapper {

	private DozerBeanMapper dozerMapper;

	public OfferResponseMapper() {
		dozerMapper = new DozerBeanMapper();

		// define custom mappings.
		dozerMapper.addMapping(new BeanMappingBuilder() {

			@Override
			protected void configure() {
				mapping(LootablyToOfferResponseMapper.class, OfferResponse.class)
						.fields("id", "uid", FieldsMappingOptions.copyByReference())
						.fields("name", "title", FieldsMappingOptions.copyByReference())
						.fields("image", "icon", FieldsMappingOptions.copyByReference());
//				mapping(AyetStudioToOfferResponseMapper.class, OfferResponse.class);
//				mapping(LootablyOffer.class, OfferResponse.class);
//				mapping(AyetStudioOffer.class, OfferResponse.class);

			}
		});

	}

//	public OfferResponse mapLootablyToOfferResponse(LootablyToOfferResponseMapper lootably) {
//		return dozerMapper.map(lootably, OfferResponse.class);
//	}
//
//	public OfferResponse mapAyetStudioToOfferResponse(AyetStudioToOfferResponseMapper ayetStudio) {
//
//		return dozerMapper.map(ayetStudio, OfferResponse.class);
//	}
}
