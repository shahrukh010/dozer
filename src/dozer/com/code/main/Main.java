package dozer.com.code.main;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.dozer.DozerBeanMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import dozer.com.code.main.mapper.AyetStudioToOfferResponseMapper;
import dozer.com.code.main.mapper.LootablyToOfferResponseMapper;
import dozer.com.code.main.mapper.services.OfferResponseMapper;
import dozer.com.code.main.response.OfferResponse;

public class Main {

	public static void main(String... strings) {

		OfferResponseMapper responseMapper = new OfferResponseMapper();
		DozerBeanMapper dozerMapper = new DozerBeanMapper();

//		LootablyOffer lootablyOffer = new LootablyOffer();

		LootablyToOfferResponseMapper lootablyOffer = new LootablyToOfferResponseMapper();
		lootablyOffer.setId(UUID.randomUUID().toString());
		lootablyOffer.setName("hector");
		lootablyOffer.setIcon("https://image.jpg");

		ObjectMapper objectMapper = new ObjectMapper();
//		AyetStudioOffer ayetStudioOffer = new AyetStudioOffer();

		AyetStudioToOfferResponseMapper ayetStudioOffer = new AyetStudioToOfferResponseMapper();
		ayetStudioOffer.setUid(UUID.randomUUID().toString());
		ayetStudioOffer.setTitle("annie");
		ayetStudioOffer.setThumbnail("https://image.png");

		List<OfferResponse> responses = new ArrayList<>();

		OfferResponse lootablyResponse = dozerMapper.map(lootablyOffer, OfferResponse.class);
		OfferResponse ayetStudioResponse = dozerMapper.map(ayetStudioOffer, OfferResponse.class);

//		OfferResponse lootablyResponse = responseMapper.mapLootablyToOfferResponse(lootablyOffer);
//		responses.add(lootablyResponse);
//		OfferResponse ayetResponse = responseMapper.mapAyetStudioToOfferResponse(ayetStudioOffer);
//		responses.add(ayetStudioResponse);

//		OfferResponse lootably = dozerMapper.map(lootablyOffer, OfferResponse.class);

		for (OfferResponse offer : responses) {

			System.out.println(offer.getId());
			System.out.println(offer.getName());
			System.out.println(offer.getImage());
		}
		String result = null;
		try {
			result = objectMapper.writeValueAsString(responses);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(result);

//		OfferResponse ayetStudioResponse = responseMapper.mapAyetStudioToOfferResponse(ayetStudioOffer);

	}
}
